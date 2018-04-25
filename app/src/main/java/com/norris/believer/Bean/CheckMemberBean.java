package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/5/31.
 */

public class CheckMemberBean {


    /**
     * message : ok
     * code : 200
     * memberlist : [{"needInvite":1,"yourName":"xxx","headImg":"sxx","memNumber":"xxxx"},{"needInvite":0,"yourName":"李昞辰","headImg":"http://api.laohoulundao.com/uploads/memface/20170412/2017033002030799324115151.png","memNumber":"2017033002030799324"},{"needInvite":1,"yourName":"杨红","headImg":"","memNumber":"2016100102007800297"}]
     */

    private String message;
    private String code;
    private List<MemberlistBean> memberlist;

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

    public List<MemberlistBean> getMemberlist() {
        return memberlist;
    }

    public void setMemberlist(List<MemberlistBean> memberlist) {
        this.memberlist = memberlist;
    }

    public static class MemberlistBean {
        /**
         * needInvite : 1
         * yourName : xxx
         * headImg : sxx
         * memNumber : xxxx
         */

        private int needInvite;
        private String yourName;
        private String headImg;
        private String memNumber;
        private int isVip;

        public int getNeedInvite() {
            return needInvite;
        }

        public void setNeedInvite(int needInvite) {
            this.needInvite = needInvite;
        }

        public String getYourName() {
            return yourName;
        }

        public void setYourName(String yourName) {
            this.yourName = yourName;
        }

        public String getHeadImg() {
            return headImg;
        }

        public void setHeadImg(String headImg) {
            this.headImg = headImg;
        }

        public String getMemNumber() {
            return memNumber;
        }

        public void setMemNumber(String memNumber) {
            this.memNumber = memNumber;
        }

        public int getIsVip() {
            return isVip;
        }

        public void setIsVip(int isVip) {
            this.isVip = isVip;
        }

        @Override
        public String toString() {
            return "MemberlistBean{" +
                    "needInvite=" + needInvite +
                    ", yourName='" + yourName + '\'' +
                    ", headImg='" + headImg + '\'' +
                    ", memNumber='" + memNumber + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CheckMemberBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", memberlist=" + memberlist.toString() +
                '}';
    }
}
