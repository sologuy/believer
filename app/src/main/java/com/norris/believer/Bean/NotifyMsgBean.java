package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/21.
 */

public class NotifyMsgBean {

    /**
     * error_code : 200
     * error_msg : ok
     * data : [{"userMsgId":1,"msg_id":1,"msg_title":"标题1","msg_content":"消息1","add_time":"2017-05-31 16:33:25","is_readed":0},{"userMsgId":2,"msg_id":2,"msg_title":"标题2","msg_content":"消息2","add_time":"2017-05-23 16:34:20","is_readed":0}]
     */

    private String error_code;
    private String error_msg;
    private List<DataBean> data;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userMsgId : 1
         * msg_id : 1
         * msg_title : 标题1
         * msg_content : 消息1
         * add_time : 2017-05-31 16:33:25
         * is_readed : 0
         */

        private int userMsgId;
        private int msg_id;
        private String msg_title;
        private String msg_content;
        private String add_time;
        private int is_readed;

        public int getUserMsgId() {
            return userMsgId;
        }

        public void setUserMsgId(int userMsgId) {
            this.userMsgId = userMsgId;
        }

        public int getMsg_id() {
            return msg_id;
        }

        public void setMsg_id(int msg_id) {
            this.msg_id = msg_id;
        }

        public String getMsg_title() {
            return msg_title;
        }

        public void setMsg_title(String msg_title) {
            this.msg_title = msg_title;
        }

        public String getMsg_content() {
            return msg_content;
        }

        public void setMsg_content(String msg_content) {
            this.msg_content = msg_content;
        }

        public String getAdd_time() {
            return add_time;
        }

        public void setAdd_time(String add_time) {
            this.add_time = add_time;
        }

        public int getIs_readed() {
            return is_readed;
        }

        public void setIs_readed(int is_readed) {
            this.is_readed = is_readed;
        }
    }
}
