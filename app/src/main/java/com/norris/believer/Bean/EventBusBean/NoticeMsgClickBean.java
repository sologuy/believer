package com.norris.believer.Bean.EventBusBean;


import com.norris.believer.Bean.ReadPartyDetailBean;

/**
 * Created by android on 2017/8/29.
 * 消息列表中的消息被点击之后要发送的消息
 */

public class NoticeMsgClickBean {
    private ReadPartyDetailBean.DataBeanX.ReadPartyInfoBean.NoticeInfoBean noticeInfoBean;

    public ReadPartyDetailBean.DataBeanX.ReadPartyInfoBean.NoticeInfoBean getNoticeInfoBean() {
        return noticeInfoBean;
    }

    public void setNoticeInfoBean(ReadPartyDetailBean.DataBeanX.ReadPartyInfoBean.NoticeInfoBean noticeInfoBean) {
        this.noticeInfoBean = noticeInfoBean;
    }
}
