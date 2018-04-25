package com.norris.believer.Bean;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by admin on 2017/5/24.
 */

public class MyInfoBean implements Serializable {


    /**
     * message : ok
     * code : 200
     * isdrp : 1
     * drpNoticeUrl : http://test.wx.laohoulundao.com/home/drp_notice
     * memberdetail : {"UserID":5492,"States":1,"MemNumber":"2017050501470635234",
     * "UserName":"13167157753","NickName":"","YourName":"王亚军",
     * "FilePath1":"http://api.laohoulundao.com/uploads/memface/20170505/2017050501470635234161438.png",
     * "WeiXID":"","VipNumber":1,"MemIntegral":0,"MemEndTime":"2018-05-08 00:00:00","RegisterType":"3",
     * "AppKey":"863125031184642","CrowdID":".180..181..182.","DeleteMark":1,"ReleaseDate":"2017-05-05
     * 16:12:44","AddDate":"2017-05-05 16:12:44","wx_unionid":"","app_openid":"","head_img":"",
     * "company_id":0,"sex":"","headImg":"http://api.laohoulundao.com/uploads/memface/20170505/2017050501470635234161438.png",
     * "isValid":true,"alias":"13167157753","unReadMsgNum":0,"tags":[]}
     */

    private String message;
    private String code;
    private int isdrp;
    private String drpNoticeUrl;
    private MemberdetailBean memberdetail;

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

    public int getIsdrp() {
        return isdrp;
    }

    public void setIsdrp(int isdrp) {
        this.isdrp = isdrp;
    }

    public String getDrpNoticeUrl() {
        return drpNoticeUrl;
    }

    public void setDrpNoticeUrl(String drpNoticeUrl) {
        this.drpNoticeUrl = drpNoticeUrl;
    }

    public MemberdetailBean getMemberdetail() {
        return memberdetail;
    }

    public void setMemberdetail(MemberdetailBean memberdetail) {
        this.memberdetail = memberdetail;
    }

    public static class MemberdetailBean implements Serializable {
        /**
         * UserID : 5492
         * States : 1
         * MemNumber : 2017050501470635234
         * UserName : 13167157753
         * NickName :
         * YourName : 王亚军
         * FilePath1 : http://api.laohoulundao.com/uploads/memface/20170505/2017050501470635234161438.png
         * WeiXID :
         * VipNumber : 1
         * MemIntegral : 0
         * MemEndTime : 2018-05-08 00:00:00
         * RegisterType : 3
         * AppKey : 863125031184642
         * CrowdID : .180..181..182.
         * DeleteMark : 1
         * ReleaseDate : 2017-05-05 16:12:44
         * AddDate : 2017-05-05 16:12:44
         * wx_unionid :
         * app_openid :
         * head_img :
         * company_id : 0
         * sex :
         * headImg : http://api.laohoulundao.com/uploads/memface/20170505/2017050501470635234161438.png
         * isValid : true
         * alias : 13167157753
         * unReadMsgNum : 0
         * tags : []
         */

        private int UserID;
        private int States;
        private String MemNumber;
        private String UserName;
        private String NickName;
        private String YourName;
        private String FilePath1;
        private String WeiXID;
        private int VipNumber;
        private int MemIntegral;
        private String MemEndTime;
        private String RegisterType;
        private String AppKey;
        private String CrowdID;
        private int DeleteMark;
        private String ReleaseDate;
        private String AddDate;
        private String wx_unionid;
        private String app_openid;
        private String head_img;
        private int company_id;
        private String sex;
        private String headImg;
        private boolean isValid;
        private String alias;
        private int unReadMsgNum;
        private Set<String> tags;
        private int city_id;
        private String mobile;
        private int isdrp;
        private String drpNoticeUrl;

        public int getIsdrp() {
            return isdrp;
        }

        public void setIsdrp(int isdrp) {
            this.isdrp = isdrp;
        }

        public String getDrpNoticeUrl() {
            return drpNoticeUrl;
        }

        public void setDrpNoticeUrl(String drpNoticeUrl) {
            this.drpNoticeUrl = drpNoticeUrl;
        }

        public boolean isValid() {
            return isValid;
        }

        public void setValid(boolean valid) {
            isValid = valid;
        }

        public int getCity_id() {
            return city_id;
        }

        public void setCity_id(int city_id) {
            this.city_id = city_id;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getUserID() {
            return UserID;
        }

        public void setUserID(int UserID) {
            this.UserID = UserID;
        }

        public int getStates() {
            return States;
        }

        public void setStates(int States) {
            this.States = States;
        }

        public String getMemNumber() {
            return MemNumber;
        }

        public void setMemNumber(String MemNumber) {
            this.MemNumber = MemNumber;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getNickName() {
            return NickName;
        }

        public void setNickName(String NickName) {
            this.NickName = NickName;
        }

        public String getYourName() {
            return YourName;
        }

        public void setYourName(String YourName) {
            this.YourName = YourName;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getWeiXID() {
            return WeiXID;
        }

        public void setWeiXID(String WeiXID) {
            this.WeiXID = WeiXID;
        }

        public int getVipNumber() {
            return VipNumber;
        }

        public void setVipNumber(int VipNumber) {
            this.VipNumber = VipNumber;
        }

        public int getMemIntegral() {
            return MemIntegral;
        }

        public void setMemIntegral(int MemIntegral) {
            this.MemIntegral = MemIntegral;
        }

        public String getMemEndTime() {
            return MemEndTime;
        }

        public void setMemEndTime(String MemEndTime) {
            this.MemEndTime = MemEndTime;
        }

        public String getRegisterType() {
            return RegisterType;
        }

        public void setRegisterType(String RegisterType) {
            this.RegisterType = RegisterType;
        }

        public String getAppKey() {
            return AppKey;
        }

        public void setAppKey(String AppKey) {
            this.AppKey = AppKey;
        }

        public String getCrowdID() {
            return CrowdID;
        }

        public void setCrowdID(String CrowdID) {
            this.CrowdID = CrowdID;
        }

        public int getDeleteMark() {
            return DeleteMark;
        }

        public void setDeleteMark(int DeleteMark) {
            this.DeleteMark = DeleteMark;
        }

        public String getReleaseDate() {
            return ReleaseDate;
        }

        public void setReleaseDate(String ReleaseDate) {
            this.ReleaseDate = ReleaseDate;
        }

        public String getAddDate() {
            return AddDate;
        }

        public void setAddDate(String AddDate) {
            this.AddDate = AddDate;
        }

        public String getWx_unionid() {
            return wx_unionid;
        }

        public void setWx_unionid(String wx_unionid) {
            this.wx_unionid = wx_unionid;
        }

        public String getApp_openid() {
            return app_openid;
        }

        public void setApp_openid(String app_openid) {
            this.app_openid = app_openid;
        }

        public String getHead_img() {
            return head_img;
        }

        public void setHead_img(String head_img) {
            this.head_img = head_img;
        }

        public int getCompany_id() {
            return company_id;
        }

        public void setCompany_id(int company_id) {
            this.company_id = company_id;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public boolean isIsValid() {
            return isValid;
        }

        public void setIsValid(boolean isValid) {
            this.isValid = isValid;
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

        public Set<String> getTags() {
            return tags;
        }

        public void setTags(Set<String> tags) {
            this.tags = tags;
        }

        @Override
        public String toString() {
            return "MemberdetailBean{" +
                    "UserID=" + UserID +
                    ", States=" + States +
                    ", MemNumber='" + MemNumber + '\'' +
                    ", UserName='" + UserName + '\'' +
                    ", NickName='" + NickName + '\'' +
                    ", YourName='" + YourName + '\'' +
                    ", FilePath1='" + FilePath1 + '\'' +
                    ", WeiXID='" + WeiXID + '\'' +
                    ", VipNumber=" + VipNumber +
                    ", MemIntegral=" + MemIntegral +
                    ", MemEndTime='" + MemEndTime + '\'' +
                    ", RegisterType='" + RegisterType + '\'' +
                    ", AppKey='" + AppKey + '\'' +
                    ", CrowdID='" + CrowdID + '\'' +
                    ", DeleteMark=" + DeleteMark +
                    ", ReleaseDate='" + ReleaseDate + '\'' +
                    ", AddDate='" + AddDate + '\'' +
                    ", wx_unionid='" + wx_unionid + '\'' +
                    ", app_openid='" + app_openid + '\'' +
                    ", head_img='" + head_img + '\'' +
                    ", company_id=" + company_id +
                    ", sex='" + sex + '\'' +
                    ", headImg='" + headImg + '\'' +
                    ", isValid=" + isValid +
                    ", alias='" + alias + '\'' +
                    ", unReadMsgNum=" + unReadMsgNum +
                    ", tags=" + tags +
                    ", city_id=" + city_id +
                    ", mobile='" + mobile + '\'' +
                    ", isdrp=" + isdrp +
                    ", drpNoticeUrl='" + drpNoticeUrl + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MyInfoBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", isdrp=" + isdrp +
                ", drpNoticeUrl='" + drpNoticeUrl + '\'' +
                ", memberdetail=" + memberdetail +
                '}';
    }
}
