package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/3.
 */

public class CollectionsBean {

    /**
     * message : ok
     * code : 200
     * collectlist : [{"BookID":46,"AddDate":"2017-05-26 10:12:22","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170509/20170509175351.jpg"},{"BookID":44,"AddDate":"2017-05-26 10:12:40","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170425/20170425200422.jpg"},{"BookID":45,"AddDate":"2017-05-26 10:12:44","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg"}]
     */

    private String message;
    private String code;
    private List<CollectlistBean> collectlist;

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

    public List<CollectlistBean> getCollectlist() {
        return collectlist;
    }

    public void setCollectlist(List<CollectlistBean> collectlist) {
        this.collectlist = collectlist;
    }

    public static class CollectlistBean {
        /**
         * BookID : 46
         * AddDate : 2017-05-26 10:12:22
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170509/20170509175351.jpg
         */

        private int BookID;
        private String AddDate;
        private String FilePath1;

        public int getBookID() {
            return BookID;
        }

        public void setBookID(int BookID) {
            this.BookID = BookID;
        }

        public String getAddDate() {
            return AddDate;
        }

        public void setAddDate(String AddDate) {
            this.AddDate = AddDate;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        @Override
        public String toString() {
            return "CollectlistBean{" +
                    "BookID=" + BookID +
                    ", AddDate='" + AddDate + '\'' +
                    ", FilePath1='" + FilePath1 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CollectionsBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", collectlist=" + collectlist +
                '}';
    }
}
