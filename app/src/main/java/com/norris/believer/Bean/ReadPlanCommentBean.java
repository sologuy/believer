package com.norris.believer.Bean;

/**
 * Created by android on 2017/8/15.
 */

public class ReadPlanCommentBean {
    private int code;
    private String message;
    private ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean.CommentlistBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean.CommentlistBean getData() {
        return data;
    }

    public void setData(ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean.CommentlistBean data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ReadPlanCommentBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
