package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/2.
 */

public class CommisionBean {


    /**
     * message : ok
     * code : 200
     * ispaycard : 0
     * memdrpdetail : {"FinishMoney":"0","SalesMoney":"2000","DRPID":6241,"IsRebate":0,"MemBalances":"0"}
     * withdrawmoneylist : [{"lt":"","ln":"","rt":"","rn":"","rc1":"","rc2":""},{"lt":"","ln":"","rt":"","rn":"","rc1":"","rc2":""}]
     * pushmoneylist : [{"lt":"","ln":"","rt":"","rn":"","rc1":"","rc2":""},{"lt":"","ln":"","rt":"","rn":"","rc1":"","rc2":""}]
     * memmoney : 2000
     * id : 0
     */

    private String message;
    private String code;
    private String ispaycard;
    private MemdrpdetailBean memdrpdetail;
    private String memmoney;
    private int id;
    private List<WithdrawmoneylistBean> withdrawmoneylist;
    private List<PushmoneylistBean> pushmoneylist;

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

    public String getIspaycard() {
        return ispaycard;
    }

    public void setIspaycard(String ispaycard) {
        this.ispaycard = ispaycard;
    }

    public MemdrpdetailBean getMemdrpdetail() {
        return memdrpdetail;
    }

    public void setMemdrpdetail(MemdrpdetailBean memdrpdetail) {
        this.memdrpdetail = memdrpdetail;
    }

    public String getMemmoney() {
        return memmoney;
    }

    public void setMemmoney(String memmoney) {
        this.memmoney = memmoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<WithdrawmoneylistBean> getWithdrawmoneylist() {
        return withdrawmoneylist;
    }

    public void setWithdrawmoneylist(List<WithdrawmoneylistBean> withdrawmoneylist) {
        this.withdrawmoneylist = withdrawmoneylist;
    }

    public List<PushmoneylistBean> getPushmoneylist() {
        return pushmoneylist;
    }

    public void setPushmoneylist(List<PushmoneylistBean> pushmoneylist) {
        this.pushmoneylist = pushmoneylist;
    }

    public static class MemdrpdetailBean {
        /**
         * FinishMoney : 0
         * SalesMoney : 2000
         * DRPID : 6241
         * IsRebate : 0
         * MemBalances : 0
         */

        private String FinishMoney;
        private String SalesMoney;
        private int DRPID;
        private int IsRebate;
        private String MemBalances;

        public String getFinishMoney() {
            return FinishMoney;
        }

        public void setFinishMoney(String FinishMoney) {
            this.FinishMoney = FinishMoney;
        }

        public String getSalesMoney() {
            return SalesMoney;
        }

        public void setSalesMoney(String SalesMoney) {
            this.SalesMoney = SalesMoney;
        }

        public int getDRPID() {
            return DRPID;
        }

        public void setDRPID(int DRPID) {
            this.DRPID = DRPID;
        }

        public int getIsRebate() {
            return IsRebate;
        }

        public void setIsRebate(int IsRebate) {
            this.IsRebate = IsRebate;
        }

        public String getMemBalances() {
            return MemBalances;
        }

        public void setMemBalances(String MemBalances) {
            this.MemBalances = MemBalances;
        }

        @Override
        public String toString() {
            return "MemdrpdetailBean{" +
                    "FinishMoney='" + FinishMoney + '\'' +
                    ", SalesMoney='" + SalesMoney + '\'' +
                    ", DRPID=" + DRPID +
                    ", IsRebate=" + IsRebate +
                    ", MemBalances='" + MemBalances + '\'' +
                    '}';
        }
    }

    public static class WithdrawmoneylistBean {
        /**
         * lt :
         * ln :
         * rt :
         * rn :
         * rc1 :
         * rc2 :
         */

        private String lt;
        private String ln;
        private String rt;
        private String rn;
        private String rc1;
        private String rc2;

        public String getLt() {
            return lt;
        }

        public void setLt(String lt) {
            this.lt = lt;
        }

        public String getLn() {
            return ln;
        }

        public void setLn(String ln) {
            this.ln = ln;
        }

        public String getRt() {
            return rt;
        }

        public void setRt(String rt) {
            this.rt = rt;
        }

        public String getRn() {
            return rn;
        }

        public void setRn(String rn) {
            this.rn = rn;
        }

        public String getRc1() {
            return rc1;
        }

        public void setRc1(String rc1) {
            this.rc1 = rc1;
        }

        public String getRc2() {
            return rc2;
        }

        public void setRc2(String rc2) {
            this.rc2 = rc2;
        }

        @Override
        public String toString() {
            return "WithdrawmoneylistBean{" +
                    "lt='" + lt + '\'' +
                    ", ln='" + ln + '\'' +
                    ", rt='" + rt + '\'' +
                    ", rn='" + rn + '\'' +
                    ", rc1='" + rc1 + '\'' +
                    ", rc2='" + rc2 + '\'' +
                    '}';
        }
    }

    public static class PushmoneylistBean {
        /**
         * lt :
         * ln :
         * rt :
         * rn :
         * rc1 :
         * rc2 :
         */

        private String lt;
        private String ln;
        private String rt;
        private String rn;
        private String rc1;
        private String rc2;

        public String getLt() {
            return lt;
        }

        public void setLt(String lt) {
            this.lt = lt;
        }

        public String getLn() {
            return ln;
        }

        public void setLn(String ln) {
            this.ln = ln;
        }

        public String getRt() {
            return rt;
        }

        public void setRt(String rt) {
            this.rt = rt;
        }

        public String getRn() {
            return rn;
        }

        public void setRn(String rn) {
            this.rn = rn;
        }

        public String getRc1() {
            return rc1;
        }

        public void setRc1(String rc1) {
            this.rc1 = rc1;
        }

        public String getRc2() {
            return rc2;
        }

        public void setRc2(String rc2) {
            this.rc2 = rc2;
        }

        @Override
        public String toString() {
            return "PushmoneylistBean{" +
                    "lt='" + lt + '\'' +
                    ", ln='" + ln + '\'' +
                    ", rt='" + rt + '\'' +
                    ", rn='" + rn + '\'' +
                    ", rc1='" + rc1 + '\'' +
                    ", rc2='" + rc2 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CommisionBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", ispaycard='" + ispaycard + '\'' +
                ", memdrpdetail=" + memdrpdetail +
                ", memmoney='" + memmoney + '\'' +
                ", id=" + id +
                ", withdrawmoneylist=" + withdrawmoneylist.toString() +
                ", pushmoneylist=" + pushmoneylist.toString() +
                '}';
    }
}
