package com.norris.believer.Bean;

/**
 * Created by admin on 2017/5/25.
 */

public class UploadResponseBean {

    /**
     * message : ok
     * code : 200
     * file : xx
     */

    private String message;
    private String code;
    private String file;

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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "UploadResponseBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", file='" + file + '\'' +
                '}';
    }
}
