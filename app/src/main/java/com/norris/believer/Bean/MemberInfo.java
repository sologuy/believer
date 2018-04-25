package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/13.
 */

public class MemberInfo {


    /**
     * code : 200
     * message : ok
     * data : {"memberInfo":{"UserID":5164,"States":1,"MemNumber":"2017042701956667076","UserName":"15000606942","UserPassWord":"","NickName":"dfdfdsfdsfds","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","WeiXID":"","VipNumber":1,"MemIntegral":0,"MemEndTime":"2018-10-01 00:00:00","RegisterType":"1","CrowdID":".178.","DeleteMark":1,"ReleaseDate":"2017-04-27 16:33:23","AddDate":"2017-04-27 16:33:23","wx_unionid":"","app_openid":"","head_img":"","company_id":1,"sex":"","department_id":0,"job":" ","department_name":"未分组","readedBookNumber":0,"isEmployee":1}}
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
         * memberInfo : {"UserID":5164,"States":1,"MemNumber":"2017042701956667076","UserName":"15000606942","UserPassWord":"","NickName":"dfdfdsfdsfds","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","WeiXID":"","VipNumber":1,"MemIntegral":0,"MemEndTime":"2018-10-01 00:00:00","RegisterType":"1","CrowdID":".178.","DeleteMark":1,"ReleaseDate":"2017-04-27 16:33:23","AddDate":"2017-04-27 16:33:23","wx_unionid":"","app_openid":"","head_img":"","company_id":1,"sex":"","department_id":0,"job":" ","department_name":"未分组","readedBookNumber":0,"isEmployee":1}
         */

        private MemberInfoBean memberInfo;

        public MemberInfoBean getMemberInfo() {
            return memberInfo;
        }

        public void setMemberInfo(MemberInfoBean memberInfo) {
            this.memberInfo = memberInfo;
        }

        public static class MemberInfoBean {
            /**
             * UserID : 5164
             * States : 1
             * MemNumber : 2017042701956667076
             * UserName : 15000606942
             * UserPassWord :
             * NickName : dfdfdsfdsfds
             * YourName : 樵夫
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png
             * WeiXID :
             * VipNumber : 1
             * MemIntegral : 0
             * MemEndTime : 2018-10-01 00:00:00
             * RegisterType : 1
             * CrowdID : .178.
             * DeleteMark : 1
             * ReleaseDate : 2017-04-27 16:33:23
             * AddDate : 2017-04-27 16:33:23
             * wx_unionid :
             * app_openid :
             * head_img :
             * company_id : 1
             * sex :
             * department_id : 0
             * job :
             * department_name : 未分组
             * readedBookNumber : 0
             * isEmployee : 1
             */

            private int UserID;
            private int States;
            private String MemNumber;
            private String UserName;
            private String UserPassWord;
            private String NickName;
            private String YourName;
            private String FilePath1;
            private String WeiXID;
            private int VipNumber;
            private int MemIntegral;
            private String MemEndTime;//
            private String RegisterType;
            private String CrowdID;
            private int DeleteMark;
            private String ReleaseDate;
            private String AddDate;
            private String wx_unionid;
            private String app_openid;
            private String head_img;
            private String sex;
            private AllMembersBean.DataBean.CityBean city;
            private String job;
            private int isAdmin;
            private List<comDepartBean> comDepart;
            private int isEmployee;
            private int rewardRight;
            private int readedBookNumber;
            private int studyMoney;
            private String personal_end_time;
            private String addPartyDate;

            public String getAddPartyDate() {
                return addPartyDate;
            }

            public void setAddPartyDate(String addPartyDate) {
                this.addPartyDate = addPartyDate;
            }

            public String getJob() {
                return job;
            }

            public void setJob(String job) {
                this.job = job;
            }

            public int getUserID() {
                return UserID;
            }

            public void setUserID(int userID) {
                UserID = userID;
            }

            public int getStates() {
                return States;
            }

            public void setStates(int states) {
                States = states;
            }

            public String getMemNumber() {
                return MemNumber;
            }

            public void setMemNumber(String memNumber) {
                MemNumber = memNumber;
            }

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String userName) {
                UserName = userName;
            }

            public String getUserPassWord() {
                return UserPassWord;
            }

            public void setUserPassWord(String userPassWord) {
                UserPassWord = userPassWord;
            }

            public String getNickName() {
                return NickName;
            }

            public void setNickName(String nickName) {
                NickName = nickName;
            }

            public String getYourName() {
                return YourName;
            }

            public void setYourName(String yourName) {
                YourName = yourName;
            }

            public String getFilePath1() {
                return FilePath1;
            }

            public void setFilePath1(String filePath1) {
                FilePath1 = filePath1;
            }

            public String getWeiXID() {
                return WeiXID;
            }

            public void setWeiXID(String weiXID) {
                WeiXID = weiXID;
            }

            public int getVipNumber() {
                return VipNumber;
            }

            public void setVipNumber(int vipNumber) {
                VipNumber = vipNumber;
            }

            public int getMemIntegral() {
                return MemIntegral;
            }

            public void setMemIntegral(int memIntegral) {
                MemIntegral = memIntegral;
            }

            public String getMemEndTime() {
                return MemEndTime;
            }

            public void setMemEndTime(String memEndTime) {
                MemEndTime = memEndTime;
            }

            public String getRegisterType() {
                return RegisterType;
            }

            public void setRegisterType(String registerType) {
                RegisterType = registerType;
            }

            public String getCrowdID() {
                return CrowdID;
            }

            public void setCrowdID(String crowdID) {
                CrowdID = crowdID;
            }

            public int getDeleteMark() {
                return DeleteMark;
            }

            public void setDeleteMark(int deleteMark) {
                DeleteMark = deleteMark;
            }

            public String getReleaseDate() {
                return ReleaseDate;
            }

            public void setReleaseDate(String releaseDate) {
                ReleaseDate = releaseDate;
            }

            public String getAddDate() {
                return AddDate;
            }

            public void setAddDate(String addDate) {
                AddDate = addDate;
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

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public int getReadedBookNumber() {
                return readedBookNumber;
            }

            public void setReadedBookNumber(int readedBookNumber) {
                this.readedBookNumber = readedBookNumber;
            }

            public int getIsEmployee() {
                return isEmployee;
            }

            public void setIsEmployee(int isEmployee) {
                this.isEmployee = isEmployee;
            }

            public int getRewardRight() {
                return rewardRight;
            }

            public void setRewardRight(int rewardRight) {
                this.rewardRight = rewardRight;
            }

            public int getStudyMoney() {
                return studyMoney;
            }

            public void setStudyMoney(int studyMoney) {
                this.studyMoney = studyMoney;
            }

            public List<comDepartBean> getComDepart() {
                return comDepart;
            }

            public void setComDepart(List<comDepartBean> comDepart) {
                this.comDepart = comDepart;
            }

            public String getPersonal_end_time() {
                return personal_end_time;
            }

            public void setPersonal_end_time(String personal_end_time) {
                this.personal_end_time = personal_end_time;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public AllMembersBean.DataBean.CityBean getCity() {
                return city;
            }

            public void setCity(AllMembersBean.DataBean.CityBean city) {
                this.city = city;
            }

            public static class comDepartBean{

               /**
                * company_user_id : 202
                * company_id : 7
                * department_id : 22
                * user_id : 7683
                * job : 哈
                * is_delete : 0
                * resign_time : 0000-00-00 00:00:00
                * release_time : 2017-08-17 14:22:24
                * add_time : 2017-08-17 14:22:24
                * department_name : 科技部
                * isManager : 3
                */

               private int company_user_id;
               private int company_id;
               private int department_id;
               private int user_id;
               private String job;
               private int is_delete;
               private String resign_time;
               private String release_time;
               private String add_time;
               private String department_name;
               private int isManager;

               public int getCompany_user_id() {
                   return company_user_id;
               }

               public void setCompany_user_id(int company_user_id) {
                   this.company_user_id = company_user_id;
               }

               public int getCompany_id() {
                   return company_id;
               }

               public void setCompany_id(int company_id) {
                   this.company_id = company_id;
               }

               public int getDepartment_id() {
                   return department_id;
               }

               public void setDepartment_id(int department_id) {
                   this.department_id = department_id;
               }

               public int getUser_id() {
                   return user_id;
               }

               public void setUser_id(int user_id) {
                   this.user_id = user_id;
               }

               public String getJob() {
                   return job;
               }

               public void setJob(String job) {
                   this.job = job;
               }

               public int getIs_delete() {
                   return is_delete;
               }

               public void setIs_delete(int is_delete) {
                   this.is_delete = is_delete;
               }

               public String getResign_time() {
                   return resign_time;
               }

               public void setResign_time(String resign_time) {
                   this.resign_time = resign_time;
               }

               public String getRelease_time() {
                   return release_time;
               }

               public void setRelease_time(String release_time) {
                   this.release_time = release_time;
               }

               public String getAdd_time() {
                   return add_time;
               }

               public void setAdd_time(String add_time) {
                   this.add_time = add_time;
               }

               public String getDepartment_name() {
                   return department_name;
               }

               public void setDepartment_name(String department_name) {
                   this.department_name = department_name;
               }

               public int getIsManager() {
                   return isManager;
               }

               public void setIsManager(int isManager) {
                   this.isManager = isManager;
               }
           }

        }
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
