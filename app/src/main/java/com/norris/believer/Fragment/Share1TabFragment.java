package com.norris.believer.Fragment;


import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Adapter.RecyclerAdapter;
import com.norris.believer.Base.BaseV4Fragment;
import com.norris.believer.Bean.RankMonthBean;
import com.norris.believer.Loadmore.LoadingFooter;
import com.norris.believer.R;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class Share1TabFragment extends BaseV4Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    public final String tag = "BookTabFragment";
    @Bind(R.id.act_book_recy)
    RecyclerView actBookRecy;
//    @Bind(R.id.loadprobar)
//    ProgressBar fragTabProbar;
//    @Bind(R.id.moreProbar)
//    ProgressBar moreProbar;
//    @Bind(R.id.moreTv)
//    TextView moreTv;

    private View v;
    private CommonRecyAdapter<RankMonthBean.MembersBean.DataBean> commonRecyAdapter;
    private List<RankMonthBean.MembersBean.DataBean> dataList;

    private LoadingFooter mLoadingFooter;
    private RecyclerAdapter recyclerAdapter;


    public Share1TabFragment() {
        // Required empty public constructor
    }

    public static Share1TabFragment newInstance(List<RankMonthBean.MembersBean.DataBean> dataBeanList) {
        Share1TabFragment fragment = new Share1TabFragment();
        Bundle args = new Bundle();
//        args.putParcelableArrayList(ARG_PARAM1, (ArrayList<? extends Parcelable>) mRankList);
//        args.putInt(ARG_PARAM2, param2);
        args.putParcelableArrayList(ARG_PARAM3, (ArrayList<? extends Parcelable>) dataBeanList);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            dataList = getArguments().getParcelableArrayList(ARG_PARAM3);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (v == null) {
            v = inflater.inflate(R.layout.frag_rank_tab1, null, false);
        }
        ButterKnife.bind(this, v);
        initViewOper();
        return v;
    }
//
//    private EndlessRecyclerOnScrollListener mOnScrollListener = new EndlessRecyclerOnScrollListener(2) {
//        @Override
//        public void onLoadMore(View View) {
//            super.onLoadMore(View);
//            loge("获取更多数据");
//            getDataTask(false);
//        }
//    };

    public void initViewOper() {

//        actBookRecy.addOnScrollListener(mOnScrollListener);
        actBookRecy.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        {
//            @Override
//            public boolean canScrollVertically() {
////                return super.canScrollVertically();
//                return false;
//            }
//        };

        actBookRecy.setLayoutManager(linearLayoutManager);
        recyclerAdapter = new RecyclerAdapter(getContext(),dataList);
//        actBookRecy.setAdapter(recyclerAdapter);


        actBookRecy.setAdapter(commonRecyAdapter = new CommonRecyAdapter<RankMonthBean.MembersBean.DataBean>
                (getContext(), R.layout.frag_rank_recy_item, dataList) {
            @Override
            protected void convert(ViewHolder holder, final RankMonthBean.MembersBean.DataBean bean, final int position) {
                TextView rankTv = holder.getView(R.id.frag_rank_item_rank);
                TextView numTv = holder.getView(R.id.frag_rank_item_num_tv);
                TextView nameTv = holder.getView(R.id.frag_rank_item_name);
                rankTv.setText(bean.getIntegral());
                nameTv.setText(bean.getYourName());
                numTv.setText(position+1+"");


            }
        });
//        if (mLoadingFooter == null) {
//            mLoadingFooter = new LoadingFooter(getContext());
//            recyclerAdapter.setFooterView(mLoadingFooter);
//        }
    }
    public void getDataTask(final boolean isClear) {
        if (mLoadingFooter.getState() == LoadingFooter.State.Loading || (!isClear && mLoadingFooter.getState() == LoadingFooter.State.TheEnd)) {
            return;
        }
        mLoadingFooter.setState(LoadingFooter.State.Loading);

        v.postDelayed(new Runnable() {
            @Override
            public void run() {
                recyclerAdapter.setFooterView(mLoadingFooter);
                if (isClear) {
                    recyclerAdapter.clear();
                }
                List<RankMonthBean.MembersBean.DataBean> list = new ArrayList<>();
                for (int i = 0; i < 20; i++) {
                    RankMonthBean.MembersBean.DataBean dataBean = new RankMonthBean.MembersBean.DataBean();
                    dataBean.setYourName("更新的数据--" + i);
                    dataBean.setIntegral("更新数据的副标题+++" + i);
                    list.add(dataBean);
                }
                if (list == null || list.size() < 10) {
                    mLoadingFooter.setState(LoadingFooter.State.TheEnd, false);
                    recyclerAdapter.removeFooterView();
                } else {
                    mLoadingFooter.setState(LoadingFooter.State.Normal);
                }
                if (list != null && list.size() > 0) {
                    recyclerAdapter.addAll(list);
                }
            }
        }, 1000);
    }

}
