package com.norris.believer.Bean;

/**
 * Created by android on 2017/6/19.
 */

public class SendCommentBean {

    /**
     * error_code : 200
     * error_info : 评论成功
     * data :
     */

    private String error_code;
    private String error_info;
    private String data;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
