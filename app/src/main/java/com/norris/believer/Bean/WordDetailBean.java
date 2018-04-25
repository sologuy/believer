package com.norris.believer.Bean;

/**
 * Created by android on 2017/9/14.
 */

public class WordDetailBean {

    /**
     * id : 1
     * book_name : 人性的弱点
     * content : 快点快点看闪客快打看看是立刻打开打开看看多麻烦可靠的看看快递
     * bg_img :
     * is_like : 0
     * like_users : 234,89,
     * publish_date : 2017-09-13
     * show_date : 13/Sep
     * share_img : /uploads/guozheng/images/common/sentence.png
     */

    private int id;
    private String book_name;
    private String content;
    private String bg_img;
    private int is_like;
    private String like_users;
    private String publish_date;
    private String show_date;
    private String share_img;
    private int like_times;

    public int getLike_times() {
        return like_times;
    }

    public void setLike_times(int like_times) {
        this.like_times = like_times;
    }

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

    public int getIs_like() {
        return is_like;
    }

    public void setIs_like(int is_like) {
        this.is_like = is_like;
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

    public String getShare_img() {
        return share_img;
    }

    public void setShare_img(String share_img) {
        this.share_img = share_img;
    }
}
