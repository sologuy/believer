package com.norris.believer.Bean;

/**
 * Created by android on 2017/6/8.
 */

public class OneReadPlanBean {
    private String message;
    private String code;
    private ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean getData() {
        return data;
    }

    public void setData(ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OneReadPlanBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", dataBean=" + data +
                '}';
    }
}
