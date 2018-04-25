package com.norris.believer.Bean;

/**
 * Created by android on 2017/8/8.
 */

public class CloThingCommentResponseBean {

    /**
     * code : 200
     * message : 添加评论成功
     * data : {"comment":{"id":98,"user_id":7683,"pid":0,"replay_user_id":7683,"body":"傻傻","up_times":0,"lessons_id":3,"type":2,"deleted_at":null,"created_at":"2017-08-09 19:00:17","updated_at":"2017-08-09 19:00:17","up_time_user":"","YourName":"靓仔","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170710/201706281739609846183158.jpg","replayName":"靓仔","sub_comments":[]}}
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
        /**
         * comment : {"id":98,"user_id":7683,"pid":0,"replay_user_id":7683,"body":"傻傻","up_times":0,"lessons_id":3,"type":2,"deleted_at":null,"created_at":"2017-08-09 19:00:17","updated_at":"2017-08-09 19:00:17","up_time_user":"","YourName":"靓仔","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170710/201706281739609846183158.jpg","replayName":"靓仔","sub_comments":[]}
         */

        private CloThingDetailBean.DataBean.ArticleBean.CommentsBean comment;

        public CloThingDetailBean.DataBean.ArticleBean.CommentsBean getComment() {
            return comment;
        }

        public void setComment(CloThingDetailBean.DataBean.ArticleBean.CommentsBean comment) {
            this.comment = comment;
        }
    }

    @Override
    public String toString() {
        return "CloThingCommentResponseBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
