package com.norris.believer.Activity

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SimpleItemAnimator
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import butterknife.Bind
import butterknife.ButterKnife
import butterknife.OnClick
import com.norris.believer.Adapter.CommonRecyAdapter
import com.norris.believer.Base.BaseActivityForPerms
import com.norris.believer.Bean.RankMonthBean
import com.norris.believer.Fragment.Share1TabFragment
import com.norris.believer.R
import com.norris.believer.view.FullLinearLayoutManager
import com.norris.believer.view.VerticalSwipeRefreshLayout
import java.util.*


class AppBarActivity_back : BaseActivityForPerms() {

    @Bind(R.id.imageBack)
    internal var imageBack: ImageView? = null
    @Bind(R.id.tvHeaderTitler)
    internal var tvHeaderTitler: TextView? = null
    @Bind(R.id.relativeLayoutHeader)
    internal var relativeLayoutHeader: RelativeLayout? = null
    @Bind(R.id.tablayout)
    internal var tabLayout: TabLayout? = null
    @Bind(R.id.vpTeacherRank)
    internal var answerVp: ViewPager? = null
    @Bind(R.id.myRefreshLayout)
    internal var refreshLayout: VerticalSwipeRefreshLayout? = null
    @Bind(R.id.appbarlayout)
    internal var appbarlayout: AppBarLayout? = null
    @Bind(R.id.topTopicRecy)
    internal var topTopicRecy: RecyclerView? = null
     var topList: MutableList<RankMonthBean.MembersBean.DataBean>? = null
     var dataBeanList: MutableList<RankMonthBean.MembersBean.DataBean>? = null
    private var topRecyAdapter: CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appbar)
        ButterKnife.bind(this)
        initView()
        initData()
        initViewOper()
    }


    fun initView() {
        dataBeanList = ArrayList<RankMonthBean.MembersBean.DataBean>()
        topList = ArrayList()
        for (i in 0..9) {
            val dataBean = RankMonthBean.MembersBean.DataBean()
            dataBean.yourName = "营销--$i"
            dataBean.integral = "提问问答+++$i"
            topList!!.add(dataBean)
        }
        for (i in 0..19) {
            val dataBean = RankMonthBean.MembersBean.DataBean()
            dataBean.yourName = "最新提问--$i"
            dataBean.integral = "最新提问+++$i"
            dataBeanList!!.add(dataBean)
        }
        appbarlayout!!.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (verticalOffset >= 0) {
                refreshLayout!!.isEnabled = true
            } else {
                refreshLayout!!.isEnabled = false
            }
        }

        refreshLayout!!.isNestedScrollingEnabled = true
        refreshLayout!!.setColorSchemeColors(Color.parseColor("#cc0c7b4a"))
        refreshLayout!!.setOnRefreshListener {
            loge("onPullDownToRefresh" + "下拉刷新")
            //                pageIndex = 1;
            //                isRefreshing = true;
            //                isLoadMoreFinish = false;
            //                getDatas();
            refreshLayout!!.isRefreshing = false
        }


        tabLayout!!.addTab(tabLayout!!.newTab().setText("最新"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("已解答"))
        tabLayout!!.addTab(tabLayout!!.newTab().setText("我的提问"))
        tabLayout!!.setSelectedTabIndicatorColor(Color.parseColor("#f5a623"))

        val adapter = PagerAdapter(supportFragmentManager, tabLayout!!.tabCount)
        answerVp!!.adapter = adapter
        answerVp!!.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                //                if (tab.getPosition() == 0) {
                //                    dataBeanList.clear();
                //                    for (int i = 0; i < 20; i++) {
                //                        RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                //                        dataBean.setYourName("最新提问--" + i);
                //                        dataBean.setIntegral("最新提问+++" + i);
                //                        dataBeanList.add(dataBean);
                //                    }
                //
                //                } else if (tab.getPosition() == 1) {
                //                    dataBeanList.clear();
                //                    for (int i = 0; i < 20; i++) {
                //                        RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                //                        dataBean.setYourName("已解答--" + i);
                //                        dataBean.setIntegral("已解答---" + i);
                //                        dataBeanList.add(dataBean);
                //                    }
                //                } else if (tab.getPosition() == 2) {
                //                    dataBeanList.clear();
                //                    for (int i = 0; i < 20; i++) {
                //                        RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                //                        dataBean.setYourName("我的提问--" + i);
                //                        dataBean.setIntegral("我的提问===" + i);
                //                        dataBeanList.add(dataBean);
                //                    }
                //                }
                //                commonRecyAdapter.notifyDataSetChanged();
                answerVp!!.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

    }


    fun initData() {
        //        if (topList != null && topList.size() > 3) {
        //            List<RankMonthBean.MembersBean.DataBean> list = new ArrayList<>();
        //            list.addAll(topList.subList(0, 3));
        //            topList.clear();
        //            topList.addAll(list);
        //        }
        if (topRecyAdapter == null) {
            topTopicRecy!!.setHasFixedSize(true)
            topTopicRecy!!.layoutManager = object : FullLinearLayoutManager(this) {
                override fun canScrollVertically(): Boolean {
                    //                return super.canScrollVertically();
                    return false
                }
            }
            (topTopicRecy!!.itemAnimator as SimpleItemAnimator).supportsChangeAnimations = false
//            topTopicRecy!!.setAdapter(topRecyAdapter = object : CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>(this, R.layout.activity_sharemind_header_item, topList) {
//                override fun convert(holder: ViewHolder, dataBean: RankMonthBean.MembersBean.DataBean, position: Int) {
//                    holder.setText(R.id.tvTitle, dataBean.yourName)
//                    holder.setText(R.id.tvSubTitle, dataBean.integral + "分")
//                }
//            })
        } else {
            topRecyAdapter!!.notifyDataSetChanged()
        }
    }

    fun initViewOper() {
        //        if (commonRecyAdapter == null) {
        //            belowAnswerRecy.setHasFixedSize(true);
        //            belowAnswerRecy.setLayoutManager(new FullLinearLayoutManager(this) {
        //                @Override
        //                public boolean canScrollVertically() {
        ////                return super.canScrollVertically();
        //                    return false;
        //                }
        //            });
        //            ((SimpleItemAnimator) belowAnswerRecy.getItemAnimator()).setSupportsChangeAnimations(false);
        //            belowAnswerRecy.setAdapter(commonRecyAdapter = new CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>
        //                    (this, R.layout.activity_total_rank_recy_item, dataBeanList) {
        //                @Override
        //                protected void convert(ViewHolder holder, RankMonthBean.MembersBean.DataBean dataBean, int position) {
        //                    holder.setText(R.id.tvName, dataBean.getYourName());
        //                    holder.setText(R.id.tvPoint, dataBean.getIntegral() + "分");
        //
        //                }
        //            });
        //            myScrollView.setScanScrollChangedListener(new MyScrollView.ISmartScrollChangedListener() {
        //                @Override
        //                public void onScrolledToBottom() {
        //
        //                }
        //
        //                @Override
        //                public void onScrolledToTop() {
        //
        //                }
        //            });
        //        } else {
        //            commonRecyAdapter.notifyDataSetChanged();
        //        }
    }

    inner class PagerAdapter(fm: FragmentManager, internal var nNumOfTabs: Int) : FragmentStatePagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            if (position == 0) {
                dataBeanList!!.clear()
                for (i in 0..19) {
                    val dataBean = RankMonthBean.MembersBean.DataBean()
                    dataBean.yourName = "最新提问--$i"
                    dataBean.integral = "最新提问+++$i"
                    dataBeanList!!.add(dataBean)
                }
                val tab = Share1TabFragment.newInstance(dataBeanList)//1是未读, 0 是已读
                return Share1TabFragment.newInstance(dataBeanList)
            } else if (position == 1) {
                dataBeanList!!.clear()
                for (i in 0..19) {
                    val dataBean = RankMonthBean.MembersBean.DataBean()
                    dataBean.yourName = "已解答--$i"
                    dataBean.integral = "已解答---$i"
                    dataBeanList!!.add(dataBean)
                }
                return Share1TabFragment.newInstance(dataBeanList)
            } else {
                dataBeanList!!.clear()
                for (i in 0..19) {
                    val dataBean = RankMonthBean.MembersBean.DataBean()
                    dataBean.yourName = "我的提问--$i"
                    dataBean.integral = "我的提问===$i"
                    dataBeanList!!.add(dataBean)
                }
                return Share1TabFragment.newInstance(dataBeanList)
            }

        }

        override fun getCount(): Int {
            return nNumOfTabs
        }
    }


    @OnClick(R.id.imageBack)
    fun onViewClicked() {
        finish()
    }
}
