package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/12.
 */

public class OrganizationBean {

    /**
     * code : 200
     * message : ok
     * data : {"companyInfo":{"company_id":3,"company_name":"教导读书会","manager_user_id":0,"vip_port":10,"vip_begin_date":"2017-06-09","vip_end_date":"2018-07-26","company_sn":"98765432","surplus_port":10},"departments":[{"department_id":0,"department_name":"未分组","company_id":3,"totalMember":1,"members":[{"MemNumber":"2017050501470635234","UserID":5492,"FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg","YourName":"我是王亚军","StudyMoney":0,"reward_right":0,"is_employee":0}]}]}
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
         * companyInfo : {"company_id":3,"company_name":"教导读书会","manager_user_id":0,"vip_port":10,"vip_begin_date":"2017-06-09","vip_end_date":"2018-07-26","company_sn":"98765432","surplus_port":10}
         * departments : [{"department_id":0,"department_name":"未分组","company_id":3,"totalMember":1,"members":[{"MemNumber":"2017050501470635234","UserID":5492,"FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg","YourName":"我是王亚军","StudyMoney":0,"reward_right":0,"is_employee":0}]}]
         */

        private CompanyInfoBean companyInfo;
        private List<DepartmentsBean> departments;

        public CompanyInfoBean getCompanyInfo() {
            return companyInfo;
        }

        public void setCompanyInfo(CompanyInfoBean companyInfo) {
            this.companyInfo = companyInfo;
        }

        public List<DepartmentsBean> getDepartments() {
            return departments;
        }

        public void setDepartments(List<DepartmentsBean> departments) {
            this.departments = departments;
        }

        public static class CompanyInfoBean {
            /**
             * company_id : 3
             * company_name : 教导读书会
             * manager_user_id : 0
             * vip_port : 10
             * vip_begin_date : 2017-06-09
             * vip_end_date : 2018-07-26
             * company_sn : 98765432
             * surplus_port : 10
             */

            private int company_id;
            private String company_name;
            private int manager_user_id;
            private int vip_port;
            private String vip_begin_date;
            private String vip_end_date;
            private String company_sn;
            private int surplus_port;

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public String getCompany_name() {
                return company_name;
            }

            public void setCompany_name(String company_name) {
                this.company_name = company_name;
            }

            public int getManager_user_id() {
                return manager_user_id;
            }

            public void setManager_user_id(int manager_user_id) {
                this.manager_user_id = manager_user_id;
            }

            public int getVip_port() {
                return vip_port;
            }

            public void setVip_port(int vip_port) {
                this.vip_port = vip_port;
            }

            public String getVip_begin_date() {
                return vip_begin_date;
            }

            public void setVip_begin_date(String vip_begin_date) {
                this.vip_begin_date = vip_begin_date;
            }

            public String getVip_end_date() {
                return vip_end_date;
            }

            public void setVip_end_date(String vip_end_date) {
                this.vip_end_date = vip_end_date;
            }

            public String getCompany_sn() {
                return company_sn;
            }

            public void setCompany_sn(String company_sn) {
                this.company_sn = company_sn;
            }

            public int getSurplus_port() {
                return surplus_port;
            }

            public void setSurplus_port(int surplus_port) {
                this.surplus_port = surplus_port;
            }
        }

        public static class DepartmentsBean {
            /**
             * department_id : 0
             * department_name : 未分组
             * company_id : 3
             * totalMember : 1
             * members : [{"MemNumber":"2017050501470635234","UserID":5492,"FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg","YourName":"我是王亚军","StudyMoney":0,"reward_right":0,"is_employee":0}]
             */

            private int department_id;
            private String department_name;
            private int company_id;
            private int totalMember;
            private List<MembersBean> members;

            public int getDepartment_id() {
                return department_id;
            }

            public void setDepartment_id(int department_id) {
                this.department_id = department_id;
            }

            public String getDepartment_name() {
                return department_name;
            }

            public void setDepartment_name(String department_name) {
                this.department_name = department_name;
            }

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public int getTotalMember() {
                return totalMember;
            }

            public void setTotalMember(int totalMember) {
                this.totalMember = totalMember;
            }

            public List<MembersBean> getMembers() {
                return members;
            }

            public void setMembers(List<MembersBean> members) {
                this.members = members;
            }

            public static class MembersBean {
                /**
                 * MemNumber : 2017050501470635234
                 * UserID : 5492
                 * FilePath1 : http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg
                 * YourName : 我是王亚军
                 * StudyMoney : 0
                 * reward_right : 0
                 * is_employee : 0
                 */

                private String MemNumber;
                private int UserID;
                private String FilePath1;
                private String YourName;
                private int StudyMoney;
                private int reward_right;
                private int is_employee;

                public String getMemNumber() {
                    return MemNumber;
                }

                public void setMemNumber(String MemNumber) {
                    this.MemNumber = MemNumber;
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
            }
        }
    }

    @Override
    public String toString() {
        return "OrganizationBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
