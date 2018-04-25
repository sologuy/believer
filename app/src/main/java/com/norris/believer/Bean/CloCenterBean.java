package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/2.
 */

public class CloCenterBean {

    /**
     * message : ok
     * code : 200
     * drpdetail : {"YourName":"王亚军","FilePath1":"http://test.api.laohoulundao.com/uploads/memface/20170527/2017050501470635234084157.jpg","MemMoney":"2000"}
     * time : ["2017-05-27","2017-05-28","2017-05-29","2017-05-30","2017-05-31","2017-06-01","2017-06-02"]
     * number : [0,0,0,0,0,0,0]
     */

    private String message;
    private String code;
    private DrpdetailBean drpdetail;
    private List<String> time;
    private List<Integer> number;

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

    public DrpdetailBean getDrpdetail() {
        return drpdetail;
    }

    public void setDrpdetail(DrpdetailBean drpdetail) {
        this.drpdetail = drpdetail;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(List<Integer> number) {
        this.number = number;
    }

    public static class DrpdetailBean {
        /**
         * YourName : 王亚军
         * FilePath1 : http://test.api.laohoulundao.com/uploads/memface/20170527/2017050501470635234084157.jpg
         * MemMoney : 2000
         */

        private String YourName;
        private String FilePath1;
        private String MemMoney;

        public String getYourName() {
            return YourName;
        }

        public void setYourName(String YourName) {
            this.YourName = YourName;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getMemMoney() {
            return MemMoney;
        }

        public void setMemMoney(String MemMoney) {
            this.MemMoney = MemMoney;
        }
    }

    @Override
    public String toString() {
        return "CloCenterBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", drpdetail=" + drpdetail +
                ", time=" + time +
                ", number=" + number +
                '}';
    }
}
