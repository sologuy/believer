package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/2.
 */

public class ReadImproveBean {

    /**
     * message : ok
     * code : 200
     * sumuplist : [{"BookID":46,"BookTitle":"全新销售","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170509/20170509175351.jpg","AddDate":"2017-05-26 11:19:57","BookReview1":"哈哈","BookReview2":"民意","BookReview3":"哈哈哈哈","BookReview4":"你是外"}]
     */

    private String message;
    private String code;
    private List<SumuplistBean> sumuplist;

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

    public List<SumuplistBean> getSumuplist() {
        return sumuplist;
    }

    public void setSumuplist(List<SumuplistBean> sumuplist) {
        this.sumuplist = sumuplist;
    }

    public static class SumuplistBean {
        /**
         * BookID : 46
         * BookTitle : 全新销售
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170509/20170509175351.jpg
         * AddDate : 2017-05-26 11:19:57
         * BookReview1 : 哈哈
         * BookReview2 : 民意
         * BookReview3 : 哈哈哈哈
         * BookReview4 : 你是外
         */

        private int BookID;
        private String BookTitle;
        private String FilePath1;
        private String AddDate;
        private String BookReview1;
        private String BookReview2;
        private String BookReview3;
        private String BookReview4;

        public int getBookID() {
            return BookID;
        }

        public void setBookID(int BookID) {
            this.BookID = BookID;
        }

        public String getBookTitle() {
            return BookTitle;
        }

        public void setBookTitle(String BookTitle) {
            this.BookTitle = BookTitle;
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

        public String getBookReview1() {
            return BookReview1;
        }

        public void setBookReview1(String BookReview1) {
            this.BookReview1 = BookReview1;
        }

        public String getBookReview2() {
            return BookReview2;
        }

        public void setBookReview2(String BookReview2) {
            this.BookReview2 = BookReview2;
        }

        public String getBookReview3() {
            return BookReview3;
        }

        public void setBookReview3(String BookReview3) {
            this.BookReview3 = BookReview3;
        }

        public String getBookReview4() {
            return BookReview4;
        }

        public void setBookReview4(String BookReview4) {
            this.BookReview4 = BookReview4;
        }

        @Override
        public String toString() {
            return "SumuplistBean{" +
                    "BookID=" + BookID +
                    ", BookTitle='" + BookTitle + '\'' +
                    ", FilePath1='" + FilePath1 + '\'' +
                    ", AddDate='" + AddDate + '\'' +
                    ", BookReview1='" + BookReview1 + '\'' +
                    ", BookReview2='" + BookReview2 + '\'' +
                    ", BookReview3='" + BookReview3 + '\'' +
                    ", BookReview4='" + BookReview4 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ReadImproveBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", sumuplist=" + sumuplist +
                '}';
    }
}
