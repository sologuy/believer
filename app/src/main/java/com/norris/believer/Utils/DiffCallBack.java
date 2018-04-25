package com.norris.believer.Utils;

import android.support.v7.util.DiffUtil;

import com.norris.believer.Bean.ReadPartyDetailBean;

import java.util.List;


/**
 * Created by android on 2017/8/25.
 */

public class DiffCallBack extends DiffUtil.Callback {
    List<ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean> oldList;
    List<ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean> newList;

    public DiffCallBack(List<ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean> oldList,
                        List<ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).getClass().equals(newList.get(newItemPosition).getClass());
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean dataBean1 = oldList.get(oldItemPosition);
        ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean dataBean2 = newList.get(oldItemPosition);
        return dataBean1.equals(dataBean2);
    }
}
