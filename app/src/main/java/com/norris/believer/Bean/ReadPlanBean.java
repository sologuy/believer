package com.norris.believer.Bean;

/**
 * Created by android on 2017/8/11.
 */

public class ReadPlanBean {
    private String mobile;
    private String key;
    private String id;
    private String upid;
    private String bookidea1;
    private String bookidea2;
    private String bookidea3;
    private String bookidea4;
    private String timestamp;
    private String sign;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public String getBookidea1() {
        return bookidea1;
    }

    public void setBookidea1(String bookidea1) {
        this.bookidea1 = bookidea1;
    }

    public String getBookidea2() {
        return bookidea2;
    }

    public void setBookidea2(String bookidea2) {
        this.bookidea2 = bookidea2;
    }

    public String getBookidea3() {
        return bookidea3;
    }

    public void setBookidea3(String bookidea3) {
        this.bookidea3 = bookidea3;
    }

    public String getBookidea4() {
        return bookidea4;
    }

    public void setBookidea4(String bookidea4) {
        this.bookidea4 = bookidea4;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "ReadPlanBean{" +
                "mobile='" + mobile + '\'' +
                ", key='" + key + '\'' +
                ", id='" + id + '\'' +
                ", upid='" + upid + '\'' +
                ", bookidea1='" + bookidea1 + '\'' +
                ", bookidea2='" + bookidea2 + '\'' +
                ", bookidea3='" + bookidea3 + '\'' +
                ", bookidea4='" + bookidea4 + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
