package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/8.
 */

public class GiftBean {

    /**
     * code : 200
     * message : ok
     * pagelist : {"per_page":1,"current_page":1,"next_page_url":"http://test.api.laohoulundao.com/api/v2/modifygift?page=2","prev_page_url":null,"from":1,"to":1,"data":[{"SumUpID":3892,"BookID":46,"MemNumber":"2017050501470635234","BookReview1":"哈哈","BookReview2":"民意","BookReview3":"哈哈哈哈","BookReview4":"你是","AddDate":"2017-06-08 20:08:46","YourName":"我是王亚军","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg"}]}
     */

    private String code;
    private String message;
    private PagelistBean pagelist;

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

    public PagelistBean getPagelist() {
        return pagelist;
    }

    public void setPagelist(PagelistBean pagelist) {
        this.pagelist = pagelist;
    }

    public static class PagelistBean {
        /**
         * per_page : 1
         * current_page : 1
         * next_page_url : http://test.api.laohoulundao.com/api/v2/modifygift?page=2
         * prev_page_url : null
         * from : 1
         * to : 1
         * data : [{"SumUpID":3892,"BookID":46,"MemNumber":"2017050501470635234","BookReview1":"哈哈","BookReview2":"民意","BookReview3":"哈哈哈哈","BookReview4":"你是","AddDate":"2017-06-08 20:08:46","YourName":"我是王亚军","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg"}]
         */

        private int per_page;
        private int current_page;
        private String next_page_url;
        private Object prev_page_url;
        private int from;
        private int to;
        private List<DataBean> data;

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public String getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(String next_page_url) {
            this.next_page_url = next_page_url;
        }

        public Object getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(Object prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * SumUpID : 3892
             * BookID : 46
             * MemNumber : 2017050501470635234
             * BookReview1 : 哈哈
             * BookReview2 : 民意
             * BookReview3 : 哈哈哈哈
             * BookReview4 : 你是
             * AddDate : 2017-06-08 20:08:46
             * YourName : 我是王亚军
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/memface/20170603/2017050501470635234181623.jpg
             */

            private int SumUpID;
            private int BookID;
            private String MemNumber;
            private String BookReview1;
            private String BookReview2;
            private String BookReview3;
            private String BookReview4;
            private String AddDate;
            private String YourName;
            private String FilePath1;

            public int getSumUpID() {
                return SumUpID;
            }

            public void setSumUpID(int SumUpID) {
                this.SumUpID = SumUpID;
            }

            public int getBookID() {
                return BookID;
            }

            public void setBookID(int BookID) {
                this.BookID = BookID;
            }

            public String getMemNumber() {
                return MemNumber;
            }

            public void setMemNumber(String MemNumber) {
                this.MemNumber = MemNumber;
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

            public String getAddDate() {
                return AddDate;
            }

            public void setAddDate(String AddDate) {
                this.AddDate = AddDate;
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

            @Override
            public String toString() {
                return "DataBean{" +
                        "SumUpID=" + SumUpID +
                        ", BookID=" + BookID +
                        ", MemNumber='" + MemNumber + '\'' +
                        ", BookReview1='" + BookReview1 + '\'' +
                        ", BookReview2='" + BookReview2 + '\'' +
                        ", BookReview3='" + BookReview3 + '\'' +
                        ", BookReview4='" + BookReview4 + '\'' +
                        ", AddDate='" + AddDate + '\'' +
                        ", YourName='" + YourName + '\'' +
                        ", FilePath1='" + FilePath1 + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "PagelistBean{" +
                    "per_page=" + per_page +
                    ", current_page=" + current_page +
                    ", next_page_url='" + next_page_url + '\'' +
                    ", prev_page_url=" + prev_page_url +
                    ", from=" + from +
                    ", to=" + to +
                    ", data=" + data.toString() +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "GiftBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", pagelist=" + pagelist.toString() +
                '}';
    }
}
