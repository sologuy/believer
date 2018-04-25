package com.norris.believer.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.norris.believer.Bean.RankMonthBean;
import com.norris.believer.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerLoadMoreAdapater<RankMonthBean.MembersBean.DataBean> {

    private Context context;
    private List<RankMonthBean.MembersBean.DataBean> beanList;

    public RecyclerAdapter(Context context, List<RankMonthBean.MembersBean.DataBean> beanList) {
        this.context = context;
        this.beanList = beanList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolderSuper(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.frag_rank_recy_item, viewGroup, false);
        return new RecyclerItemViewHolder(view);
    }

    @Override
    public void onBindViewHolderSuper(RecyclerView.ViewHolder viewHolder, int position) {
        RecyclerItemViewHolder holder = (RecyclerItemViewHolder) viewHolder;
        holder.nameTv.setText( beanList.get(viewHolder.getLayoutPosition()).getYourName());
        holder.rankTv.setText(beanList.get(viewHolder.getLayoutPosition()).getIntegral() + "分");
        holder.numTv.setText(position + "");
    }

    private class RecyclerItemViewHolder extends RecyclerView.ViewHolder {

        private  TextView rankTv,numTv,nameTv;

        public RecyclerItemViewHolder(View itemView) {
            super(itemView);
            rankTv = (TextView) itemView.findViewById(R.id.frag_rank_item_rank);
            numTv = (TextView) itemView.findViewById(R.id.frag_rank_item_num_tv);
            nameTv = (TextView) itemView.findViewById(R.id.frag_rank_item_name);
        }
    }
}