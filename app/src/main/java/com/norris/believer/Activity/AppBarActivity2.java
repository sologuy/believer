package com.norris.believer.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Base.BaseActivityForPerms;
import com.norris.believer.Bean.RankMonthBean;
import com.norris.believer.Fragment.Share1TabFragment;
import com.norris.believer.R;
import com.norris.believer.view.FullLinearLayoutManager;
import com.norris.believer.view.VerticalSwipeRefreshLayout;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AppBarActivity2 extends BaseActivityForPerms {

    @Bind(R.id.imageBack)
    ImageView imageBack;
    @Bind(R.id.tvHeaderTitler)
    TextView tvHeaderTitler;
    @Bind(R.id.relativeLayoutHeader)
    RelativeLayout headerLayout;
    @Bind(R.id.tablayout)
    TabLayout tabLayout;
    @Bind(R.id.vpTeacherRank)
    ViewPager answerVp;
    @Bind(R.id.myRefreshLayout)
    VerticalSwipeRefreshLayout refreshLayout;
    @Bind(R.id.appbarlayout)
    AppBarLayout appbarlayout;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.toolbar_layout)
    CollapsingToolbarLayout collapsingToolbarLayout;
//    @Bind(R.id.headerLayout)
//    RelativeLayout headerLayout;
        @Bind(R.id.topTopicRecy)
        RecyclerView topTopicRecy;
    private List<RankMonthBean.MembersBean.DataBean> topList;
    private List<RankMonthBean.MembersBean.DataBean> dataBeanList;
    private CommonRecyAdapter<RankMonthBean.MembersBean.DataBean> topRecyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar2);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }


    public void initView() {
        dataBeanList = new ArrayList<>();
        topList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
            dataBean.setYourName("营销--" + i);
            dataBean.setIntegral("提问问答+++" + i);
            topList.add(dataBean);
        }
        for (int i = 0; i < 20; i++) {
            RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
            dataBean.setYourName("最新提问--" + i);
            dataBean.setIntegral("最新提问+++" + i);
            dataBeanList.add(dataBean);
        }
        appbarlayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset >= 0) {
                    refreshLayout.setEnabled(true);
                } else {
                    refreshLayout.setEnabled(false);
                }
            }
        });

        refreshLayout.setNestedScrollingEnabled(true);
        refreshLayout.setColorSchemeColors(Color.parseColor("#cc0c7b4a"));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                loge("onPullDownToRefresh" + "下拉刷新");
                refreshLayout.setRefreshing(false);

            }
        });


        tabLayout.addTab(tabLayout.newTab().setText("最新"));
        tabLayout.addTab(tabLayout.newTab().setText("已解答"));
        tabLayout.addTab(tabLayout.newTab().setText("我的提问"));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#f5a623"));

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        answerVp.setAdapter(adapter);
        answerVp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                answerVp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        initAppBarlayout();
    }

    private void initAppBarlayout() {
        refreshLayout.setProgressViewOffset(true, -20, 100);
        refreshLayout.setColorSchemeResources(R.color.google_blue, R.color.google_green, R.color.google_red, R.color.google_yellow);
        appbarlayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset <= -headerLayout.getHeight() / 2) {
                    collapsingToolbarLayout.setTitle("王亚军");
                } else {
                    collapsingToolbarLayout.setTitle(" ");
                }
            }
        });
    }


    public void initData() {
//        if (topList != null && topList.size() > 3) {
//            List<RankMonthBean.MembersBean.DataBean> list = new ArrayList<>();
//            list.addAll(topList.subList(0, 3));
//            topList.clear();
//            topList.addAll(list);
//        }
        if (topRecyAdapter == null) {
            topTopicRecy.setHasFixedSize(true);
            topTopicRecy.setLayoutManager(new FullLinearLayoutManager(this) {
                @Override
                public boolean canScrollVertically() {
//                return super.canScrollVertically();
                    return false;
                }
            });
            ((SimpleItemAnimator) topTopicRecy.getItemAnimator()).setSupportsChangeAnimations(false);
            topTopicRecy.setAdapter(topRecyAdapter = new CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>
                    (this, R.layout.activity_sharemind_header_item, topList) {
                @Override
                protected void convert(ViewHolder holder, RankMonthBean.MembersBean.DataBean dataBean, int position) {
                    holder.setText(R.id.tvTitle, dataBean.getYourName());
                    holder.setText(R.id.tvSubTitle, dataBean.getIntegral() + "分");
                }
            });
        } else {
            topRecyAdapter.notifyDataSetChanged();
        }
    }

    public void initViewOper() {
    }

    public class PagerAdapter extends FragmentStatePagerAdapter {
        int nNumOfTabs;

        public PagerAdapter(FragmentManager fm, int nNumOfTabs) {
            super(fm);
            this.nNumOfTabs = nNumOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                dataBeanList.clear();
                for (int i = 0; i < 20; i++) {
                    RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                    dataBean.setYourName("最新提问--" + i);
                    dataBean.setIntegral("最新提问+++" + i);
                    dataBeanList.add(dataBean);
                }
                Share1TabFragment tab = Share1TabFragment.newInstance(dataBeanList);//1是未读, 0 是已读
                return tab;
            } else if (position == 1) {
                dataBeanList.clear();
                for (int i = 0; i < 20; i++) {
                    RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                    dataBean.setYourName("已解答--" + i);
                    dataBean.setIntegral("已解答---" + i);
                    dataBeanList.add(dataBean);
                }
                Share1TabFragment tab = Share1TabFragment.newInstance(dataBeanList);//1是未读, 0 是已读
                return tab;
            } else {
                dataBeanList.clear();
                for (int i = 0; i < 20; i++) {
                    RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                    dataBean.setYourName("我的提问--" + i);
                    dataBean.setIntegral("我的提问===" + i);
                    dataBeanList.add(dataBean);
                }
                Share1TabFragment tab = Share1TabFragment.newInstance(dataBeanList);//1是未读, 0 是已读
                return tab;
            }

        }

        @Override
        public int getCount() {
            return nNumOfTabs;
        }
    }


    @OnClick(R.id.imageBack)
    public void onViewClicked() {
        finish();
    }
}
