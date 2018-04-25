package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/16.
 */

public class WechatResponseBean {


    /**
     * code : 200
     * message : 登录成功
     * data : {"memberInfo":{"UserID":6018,"States":0,"MemNumber":"201706161017049873","UserName":"","mobile":"","NickName":"樵夫","YourName":"樵夫","FilePath1":"http://test.api.laohoulundao.com/images/default-images/default-head-img.png","WeiXID":"","VipNumber":1000,"MemIntegral":0,"MemEndTime":"","RegisterType":"IOS","AppKey":"12632c20a23bdef733ed4eaf308a3446ecdf38c25","CrowdID":"","DeleteMark":1,"ReleaseDate":"2017-06-16 10:17:20","AddDate":"2017-06-16 10:17:20","wx_unionid":"123456789","app_openid":"kdkdkskiwiekkdng","head_img":"","company_id":0,"sex":"N","department_id":0,"job":"","city_id":0,"headImg":"http://test.api.laohoulundao.com/images/default-images/default-head-img.png","isValid":false,"alias":""},"tags":["",""],"token":"123456","alias":"","unReadMsgNum":0}
     */

    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * memberInfo : {"UserID":6018,"States":0,"MemNumber":"201706161017049873","UserName":"","mobile":"","NickName":"樵夫","YourName":"樵夫","FilePath1":"http://test.api.laohoulundao.com/images/default-images/default-head-img.png","WeiXID":"","VipNumber":1000,"MemIntegral":0,"MemEndTime":"","RegisterType":"IOS","AppKey":"12632c20a23bdef733ed4eaf308a3446ecdf38c25","CrowdID":"","DeleteMark":1,"ReleaseDate":"2017-06-16 10:17:20","AddDate":"2017-06-16 10:17:20","wx_unionid":"123456789","app_openid":"kdkdkskiwiekkdng","head_img":"","company_id":0,"sex":"N","department_id":0,"job":"","city_id":0,"headImg":"http://test.api.laohoulundao.com/images/default-images/default-head-img.png","isValid":false,"alias":""}
         * tags : ["",""]
         * token : 123456
         * alias :
         * unReadMsgNum : 0
         */

        private MyInfoBean.MemberdetailBean memberInfo;
        private String token;
        private String alias;
        private int unReadMsgNum;
        private List<String> tags;

        public MyInfoBean.MemberdetailBean getMemberInfo() {
            return memberInfo;
        }

        public void setMemberInfo(MyInfoBean.MemberdetailBean memberInfo) {
            this.memberInfo = memberInfo;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public int getUnReadMsgNum() {
            return unReadMsgNum;
        }

        public void setUnReadMsgNum(int unReadMsgNum) {
            this.unReadMsgNum = unReadMsgNum;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "memberInfo=" + memberInfo+
                    ", token='" + token + '\'' +
                    ", alias='" + alias + '\'' +
                    ", unReadMsgNum=" + unReadMsgNum +
                    ", tags=" + tags +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WechatResponseBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
