package com.norris.believer.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Base.BaseActivityForPerms;
import com.norris.believer.Bean.RankMonthBean;
import com.norris.believer.Fragment.Share1TabFragment;
import com.norris.believer.R;
import com.norris.believer.view.VerticalSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AppBarActivity3 extends BaseActivityForPerms {

//    @Bind(R.id.imageBack)
//    ImageView imageBack;
//    @Bind(R.id.tvHeaderTitler)
//    TextView tvHeaderTitler;
//    @Bind(R.id.relativeLayoutHeader)
//    RelativeLayout relativeLayoutHeader;
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
    @Bind(R.id.collapsingToolbarLayout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @Bind(R.id.headerLayout)
    RelativeLayout headerLayout;
    @Bind(R.id.but1)
    Button but1;
    @Bind(R.id.but2)
    Button but2;
    @Bind(R.id.but3)
    Button but3;
    //    @Bind(R.id.topTopicRecy)
//    RecyclerView topTopicRecy;
    private List<RankMonthBean.MembersBean.DataBean> topList;
    private List<RankMonthBean.MembersBean.DataBean> dataBeanList;
    private CommonRecyAdapter<RankMonthBean.MembersBean.DataBean> topRecyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar3);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }


    public void initView() {
        dataBeanList = new ArrayList<>();
        topList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
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
//                pageIndex = 1;
//                isRefreshing = true;
//                isLoadMoreFinish = false;
//                getDatas();
                refreshLayout.setRefreshing(false);

            }
        });


        @ColorInt final int colorOrange = Color.parseColor("#fff39700");
        @ColorInt final int colorWhite = Color.parseColor("#ffffffff");


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
                switch (tab.getPosition()) {
                    case 0:
                        but1.setTextColor(colorWhite);
                        but2.setTextColor(colorOrange);
                        but3.setTextColor(colorOrange);
                        but1.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground01));
                        but2.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground10));
                        but3.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground20));
                        break;
                    case 1:
                        but1.setTextColor(colorOrange);
                        but2.setTextColor(colorWhite);
                        but3.setTextColor(colorOrange);
                        but1.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground00));
                        but2.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground11));
                        but3.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground20));
                        break;
                    case 2:
                        but1.setTextColor(colorOrange);
                        but2.setTextColor(colorOrange);
                        but3.setTextColor(colorWhite);
                        but1.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground00));
                        but2.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground10));
                        but3.setBackground(ContextCompat.getDrawable(act,R.drawable.tabbackground21));
                        break;
                }
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
        collapsingToolbarLayout.setTitleEnabled(true);
//        collapsingToolbarLayout.setContentScrimResource(R.mipmap.imgteacherheader);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        appbarlayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (verticalOffset <= -headerLayout.getHeight() / 2) {
                    collapsingToolbarLayout.setTitle("明师榜");
                } else {
                    collapsingToolbarLayout.setTitle(" ");
                }
            }
        });
    }


    public void initData() {
        if (topList != null && topList.size() > 3) {
            List<RankMonthBean.MembersBean.DataBean> list = new ArrayList<>();
            list.addAll(topList.subList(0, 3));
            topList.clear();
            topList.addAll(list);
        }
//        if (topRecyAdapter == null) {
//            topTopicRecy.setHasFixedSize(true);
//            topTopicRecy.setLayoutManager(new FullLinearLayoutManager(this) {
//                @Override
//                public boolean canScrollVertically() {
////                return super.canScrollVertically();
//                    return false;
//                }
//            });
//            ((SimpleItemAnimator) topTopicRecy.getItemAnimator()).setSupportsChangeAnimations(false);
//            topTopicRecy.setAdapter(topRecyAdapter = new CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>
//                    (this, R.layout.activity_sharemind_header_item, topList) {
//                @Override
//                protected void convert(ViewHolder holder, RankMonthBean.MembersBean.DataBean dataBean, int position) {
//                    holder.setText(R.id.tvTitle, dataBean.getYourName());
//                    holder.setText(R.id.tvSubTitle, dataBean.getIntegral() + "分");
//                }
//            });
//        } else {
//            topRecyAdapter.notifyDataSetChanged();
//        }
    }

    public void initViewOper() {
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

    @OnClick({R.id.but1, R.id.but2, R.id.but3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.but1:
                if (tabLayout.getSelectedTabPosition() != 0 && tabLayout.getTabAt(0) != null) {
                    tabLayout.getTabAt(0).select();
                }
                break;
            case R.id.but2:
                if (tabLayout.getSelectedTabPosition() != 1 && tabLayout.getTabAt(1) != null) {
                    tabLayout.getTabAt(1).select();
                }
                break;
            case R.id.but3:
                if (tabLayout.getSelectedTabPosition() != 2 && tabLayout.getTabAt(2) != null) {
                    tabLayout.getTabAt(2).select();
                }
                break;
        }
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
