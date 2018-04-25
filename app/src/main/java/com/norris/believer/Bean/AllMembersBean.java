package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/5/26.
 */

public class AllMembersBean {


    /**
     * code : 200
     * message : 获取通讯录成功
     * data : [{"MemNumber":"201706281739609846","UserName":"15210232041","UserID":7683,"FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170710/201706281739609846183158.jpg","YourName":"亚亚测试","StudyMoney":1,"read_user_id":76,"reward_right":1,"is_employee":1,"add_date":"2017-08-17 14:22:24","isAdmin":2,"department_name":"组织部"},{"MemNumber":"2017042701956667076","UserName":"15000606942","UserID":5164,"FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170628/2017042701956667076173945.png","YourName":"测试短信","StudyMoney":4,"read_user_id":77,"reward_right":0,"is_employee":1,"add_date":"2017-08-17 14:24:43","isAdmin":0,"department_name":"科技部"},{"MemNumber":"2017033002030799324","UserName":"18604074775","UserID":4128,"FilePath1":"http://api.laohoulundao.com/uploads/memface/20170412/2017033002030799324115151.png","YourName":"hiphop man","StudyMoney":8,"read_user_id":78,"reward_right":0,"is_employee":1,"add_date":"2017-08-17 14:25:11","isAdmin":0,"department_name":"技术部"}]
     */

    private String code;
    private String message;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * MemNumber : 201706281739609846
         * UserName : 15210232041
         * UserID : 7683
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/memface/20170710/201706281739609846183158.jpg
         * YourName : 亚亚测试
         * StudyMoney : 1
         * read_user_id : 76
         * reward_right : 1
         * is_employee : 1
         * add_date : 2017-08-17 14:22:24
         * isAdmin : 2
         * department_name : 组织部
         */

        private String MemNumber;
        private String UserName;
        private int UserID;
        private String FilePath1;
        private String YourName;
        private int StudyMoney;
        private int read_user_id;
        private int reward_right;
        private int is_employee;
        private String add_date;
        private int isAdmin;
        private CityBean city;
        private String job;
        private List<DepartmentInfoBean> departmentInfo;

        public List<DepartmentInfoBean> getDepartmentInfo() {
            return departmentInfo;
        }

        public void setDepartmentInfo(List<DepartmentInfoBean> departmentInfo) {
            this.departmentInfo = departmentInfo;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public CityBean getCity() {
            return city;
        }

        public void setCity(CityBean city) {
            this.city = city;
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

        public int getUserID() {
            return UserID;
        }

        public void setUserID(int UserID) {
            this.UserID = UserID;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getYourName() {
            return YourName;
        }

        public void setYourName(String YourName) {
            this.YourName = YourName;
        }

        public int getStudyMoney() {
            return StudyMoney;
        }

        public void setStudyMoney(int StudyMoney) {
            this.StudyMoney = StudyMoney;
        }

        public int getRead_user_id() {
            return read_user_id;
        }

        public void setRead_user_id(int read_user_id) {
            this.read_user_id = read_user_id;
        }

        public int getReward_right() {
            return reward_right;
        }

        public void setReward_right(int reward_right) {
            this.reward_right = reward_right;
        }

        public int getIs_employee() {
            return is_employee;
        }

        public void setIs_employee(int is_employee) {
            this.is_employee = is_employee;
        }

        public String getAdd_date() {
            return add_date;
        }

        public void setAdd_date(String add_date) {
            this.add_date = add_date;
        }

        public int getIsAdmin() {
            return isAdmin;
        }

        public void setIsAdmin(int isAdmin) {
            this.isAdmin = isAdmin;
        }



        public static class CityBean{


            /**
             * city : 衡水市
             * province : 河北省
             * country : 中国
             */

            private String city;
            private String province;
            private String country;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }
        }

        public static class DepartmentInfoBean{

            /**
             * department_name : 科技部
             * department_id : 22
             * job : 哈
             * company_id : 7
             */

            private String department_name;
            private int department_id;
            private String job;
            private int company_id;

            public String getDepartment_name() {
                return department_name;
            }

            public void setDepartment_name(String department_name) {
                this.department_name = department_name;
            }

            public int getDepartment_id() {
                return department_id;
            }

            public void setDepartment_id(int department_id) {
                this.department_id = department_id;
            }

            public String getJob() {
                return job;
            }

            public void setJob(String job) {
                this.job = job;
            }

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }
        }
    }
}
