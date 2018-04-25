package com.norris.believer.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/5/17.
 */

public class UpdateAppBean implements Serializable {

    /**
     * versionCode : 20170516
     * versionName : 1.0.13
     * updateUrl : http://wx.laohoulundao.com/apk/Reading4-v2.apk
     * updateList : [{"content":"1.取消了限制0"},{"content":"1.取消了限制1"},{"content":"1.取消了限制2"},{"content":"1.取消了限制3"}]
     */

    private int versionCode;
    private String versionName;
    private String updateUrl;
    private List<UpdateListBean> updateList;

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public List<UpdateListBean> getUpdateList() {
        return updateList;
    }

    public void setUpdateList(List<UpdateListBean> updateList) {
        this.updateList = updateList;
    }

    public static class UpdateListBean {
        /**
         * content : 1.取消了限制0
         */

        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }


    @Override
    public String toString() {
        return "UpdateAppBean{" +
                "versionCode=" + versionCode +
                ", versionName='" + versionName + '\'' +
                ", updateUrl='" + updateUrl + '\'' +
                ", updateList=" + updateList +
                '}';
    }
}
