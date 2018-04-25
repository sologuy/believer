package com.norris.believer.Bean.RequestBean;

/**
 * Created by android on 2017/6/13.
 */

public class AddNewMemberBean {
    private String mobile;
    private String key;
    private int id;
    private String userMobile;
    private String userName;
    private String departmentId;
    private String job;
    private String rewardRight;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AddNewMemberBean{" +
                "mobile='" + mobile + '\'' +
                ", key='" + key + '\'' +
                ", id=" + id +
                ", userMobile='" + userMobile + '\'' +
                ", userName='" + userName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", job='" + job + '\'' +
                ", rewardRight='" + rewardRight + '\'' +
                '}';
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getRewardRight() {
        return rewardRight;
    }

    public void setRewardRight(String rewardRight) {
        this.rewardRight = rewardRight;
    }

}
