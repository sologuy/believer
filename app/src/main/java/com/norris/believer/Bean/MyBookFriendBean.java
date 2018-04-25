package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/2.
 */

public class MyBookFriendBean {

    /**
     * message : ok
     * code : 200
     * friendlist : [{"YourName":"王亚军","UserName":"15210232041","FilePath1":"","AddDate":"2017-06-02 14:45:35","DRPLevel":1,"States":1,"TypeName":"学习官"}]
     */

    private String message;
    private String code;
    private List<FriendlistBean> friendlist;

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

    public List<FriendlistBean> getFriendlist() {
        return friendlist;
    }

    public void setFriendlist(List<FriendlistBean> friendlist) {
        this.friendlist = friendlist;
    }

    public static class FriendlistBean {
        /**
         * YourName : 王亚军
         * UserName : 15210232041
         * FilePath1 :
         * AddDate : 2017-06-02 14:45:35
         * DRPLevel : 1
         * States : 1
         * TypeName : 学习官
         */

        private String YourName;
        private String UserName;
        private String FilePath1;
        private String AddDate;
        private int DRPLevel;
        private int States;
        private String TypeName;

        public String getYourName() {
            return YourName;
        }

        public void setYourName(String YourName) {
            this.YourName = YourName;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String UserName) {
            this.UserName = UserName;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getAddDate() {
            return AddDate;
        }

        public void setAddDate(String AddDate) {
            this.AddDate = AddDate;
        }

        public int getDRPLevel() {
            return DRPLevel;
        }

        public void setDRPLevel(int DRPLevel) {
            this.DRPLevel = DRPLevel;
        }

        public int getStates() {
            return States;
        }

        public void setStates(int States) {
            this.States = States;
        }

        public String getTypeName() {
            return TypeName;
        }

        public void setTypeName(String TypeName) {
            this.TypeName = TypeName;
        }

        @Override
        public String toString() {
            return "FriendlistBean{" +
                    "YourName='" + YourName + '\'' +
                    ", UserName='" + UserName + '\'' +
                    ", FilePath1='" + FilePath1 + '\'' +
                    ", AddDate='" + AddDate + '\'' +
                    ", DRPLevel=" + DRPLevel +
                    ", States=" + States +
                    ", TypeName='" + TypeName + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MyBookFriendBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", friendlist=" + friendlist +
                '}';
    }
}
