package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/9/14.
 */

public class WordsBean {


    /**
     * total : 2
     * per_page : 20
     * current_page : 1
     * last_page : 1
     * next_page_url :
     * prev_page_url :
     * from : 1
     * to : 2
     * data : [{"id":1,"book_name":"人性的弱点","content":"快点快点看闪客快打看看是立刻打开打开看看多麻烦可靠的看看快递","bg_img":"","like_users":"234,89,","publish_date":"2017/09/13","show_date":"13/Sep"},{"id":2,"book_name":"瓦尔登湖","content":"作者描述了在森林中一个人生活所特有的感受\u2014\u2014寂寞。作者并没有直接描述，而是通过其他一些动物来反衬心中的感觉，\u201c牛蛙呜叫，邀来黑夜，夜莺的乐音乘着吹起涟漪的风从湖上传来。摇曳的赤杨和松柏．激起我的情感，使我几乎不能呼吸了，然而如镜的湖面一样，晚风吹起来的微波是谈不上什么风暴的\u201d。虽然寂寞使作者\u201c几乎不能呼吸\u201d，但他认为这并不是生活中最可怕的，因为\u201c宁静不可能是绝对的\u201d。","bg_img":"","like_users":"56,5164","publish_date":"2017/09/14","show_date":"14/Sep"}]
     */

    private int total;
    private int per_page;
    private int current_page;
    private int last_page;
    private String next_page_url;
    private String prev_page_url;
    private int from;
    private int to;
    private List<DataBean> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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

    public int getLast_page() {
        return last_page;
    }

    public void setLast_page(int last_page) {
        this.last_page = last_page;
    }

    public String getNext_page_url() {
        return next_page_url;
    }

    public void setNext_page_url(String next_page_url) {
        this.next_page_url = next_page_url;
    }

    public String getPrev_page_url() {
        return prev_page_url;
    }

    public void setPrev_page_url(String prev_page_url) {
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
         * id : 1
         * book_name : 人性的弱点
         * content : 快点快点看闪客快打看看是立刻打开打开看看多麻烦可靠的看看快递
         * bg_img :
         * like_users : 234,89,
         * publish_date : 2017/09/13
         * show_date : 13/Sep
         */

        private int id;
        private String book_name;
        private String content;
        private String bg_img;
        private String like_users;
        private String publish_date;
        private String show_date;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBook_name() {
            return book_name;
        }

        public void setBook_name(String book_name) {
            this.book_name = book_name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getBg_img() {
            return bg_img;
        }

        public void setBg_img(String bg_img) {
            this.bg_img = bg_img;
        }

        public String getLike_users() {
            return like_users;
        }

        public void setLike_users(String like_users) {
            this.like_users = like_users;
        }

        public String getPublish_date() {
            return publish_date;
        }

        public void setPublish_date(String publish_date) {
            this.publish_date = publish_date;
        }

        public String getShow_date() {
            return show_date;
        }

        public void setShow_date(String show_date) {
            this.show_date = show_date;
        }
    }
}
