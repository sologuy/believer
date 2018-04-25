package com.norris.believer.Bean;

/**
 * Created by admin on 2017/5/24.
 */

public class BaseBean {

    /**
     * code : 200
     * message : 读书会添加成功
     * data : {"readPartyId":187}
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
         * readPartyId : 187
         */

        private int readPartyId;

        public int getReadPartyId() {
            return readPartyId;
        }

        public void setReadPartyId(int readPartyId) {
            this.readPartyId = readPartyId;
        }
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
