package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/28.
 */

public class AllDepartBean {

    /**
     * code : 200
     * message : 获取成功
     * data : {"departments":[{"department_id":6,"company_id":2,"department_name":"编辑部","is_delete":0},{"department_id":7,"company_id":2,"department_name":"销售部","is_delete":0},{"department_id":8,"company_id":2,"department_name":"市场部","is_delete":0}]}
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
        private List<DepartmentsBean> departments;

        public List<DepartmentsBean> getDepartments() {
            return departments;
        }

        public void setDepartments(List<DepartmentsBean> departments) {
            this.departments = departments;
        }

        public static class DepartmentsBean {
            /**
             * department_id : 6
             * company_id : 2
             * department_name : 编辑部
             * is_delete : 0
             */

            private int department_id;
            private int company_id;
            private String department_name;
            private int is_delete;

            public int getDepartment_id() {
                return department_id;
            }

            public void setDepartment_id(int department_id) {
                this.department_id = department_id;
            }

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public String getDepartment_name() {
                return department_name;
            }

            public void setDepartment_name(String department_name) {
                this.department_name = department_name;
            }

            public int getIs_delete() {
                return is_delete;
            }

            public void setIs_delete(int is_delete) {
                this.is_delete = is_delete;
            }
        }
    }
}
