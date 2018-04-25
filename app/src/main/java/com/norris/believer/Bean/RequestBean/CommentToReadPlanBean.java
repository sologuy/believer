package com.norris.believer.Bean.RequestBean;

/**
 * Created by android on 2017/8/18.
 */

public class CommentToReadPlanBean {
    private int CommID;
    private int reply_MemNumber;
    private int ReaParID;
    private int type;
    private int pid;
    private int sumup_user_id;//写读书改进计划的人的userid
    private int comment_user_id;//如果是回复评论 此条评论人的userid,如果是评论那就是 0, 如果是回复别人的回复,就是回复那条回复的人的userid
    private String key;
    private String mobile;
    private String CommContents;

    public int getCommID() {
        return CommID;
    }

    public void setCommID(int commID) {
        CommID = commID;
    }

    public int getReply_MemNumber() {
        return reply_MemNumber;
    }

    public void setReply_MemNumber(int reply_MemNumber) {
        this.reply_MemNumber = reply_MemNumber;
    }

    public int getReaParID() {
        return ReaParID;
    }

    public void setReaParID(int reaParID) {
        ReaParID = reaParID;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSumup_user_id() {
        return sumup_user_id;
    }

    public void setSumup_user_id(int sumup_user_id) {
        this.sumup_user_id = sumup_user_id;
    }

    public int getComment_user_id() {
        return comment_user_id;
    }

    public void setComment_user_id(int comment_user_id) {
        this.comment_user_id = comment_user_id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCommContents() {
        return CommContents;
    }

    public void setCommContents(String commContents) {
        CommContents = commContents;
    }
}
