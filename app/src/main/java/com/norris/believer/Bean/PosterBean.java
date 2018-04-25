package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/6/2.
 */

public class PosterBean {

    /**
     * message : ok
     * code : 200
     * postertemplist : [{"PoTeID":4,"PosterTitle":"读书会海报01","FilePath1":"http://test.wx.laohoulundao.com/uploads/20161111/20161111134235.png","AddDate":"2016-11-10 11:40:12"},{"PoTeID":1,"PosterTitle":"模板","FilePath1":"http://test.wx.laohoulundao.com/uploads/20161111/20161111134206.png","AddDate":"2016-10-25 16:15:08"},{"PoTeID":2,"PosterTitle":"模板2","FilePath1":"http://test.wx.laohoulundao.com/uploads/20161031/20161031142821.png","AddDate":"2016-10-25 16:34:13"}]
     * tempurl : http://test.wx.laohoulundao.com/uploads/posttemp/2017050501470635234.png
     */

    private String message;
    private String code;
    private String tempurl;
    private List<PostertemplistBean> postertemplist;

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

    public String getTempurl() {
        return tempurl;
    }

    public void setTempurl(String tempurl) {
        this.tempurl = tempurl;
    }

    public List<PostertemplistBean> getPostertemplist() {
        return postertemplist;
    }

    public void setPostertemplist(List<PostertemplistBean> postertemplist) {
        this.postertemplist = postertemplist;
    }

    public static class PostertemplistBean {
        /**
         * PoTeID : 4
         * PosterTitle : 读书会海报01
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/20161111/20161111134235.png
         * AddDate : 2016-11-10 11:40:12
         */

        private int PoTeID;
        private String PosterTitle;
        private String FilePath1;
        private String AddDate;

        public int getPoTeID() {
            return PoTeID;
        }

        public void setPoTeID(int PoTeID) {
            this.PoTeID = PoTeID;
        }

        public String getPosterTitle() {
            return PosterTitle;
        }

        public void setPosterTitle(String PosterTitle) {
            this.PosterTitle = PosterTitle;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getAddDate() {
            return AddDate;
        }

        public void setAddDate(String AddDate) {
            this.AddDate = AddDate;
        }
    }

    @Override
    public String toString() {
        return "PosterBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", tempurl='" + tempurl + '\'' +
                ", postertemplist=" + postertemplist +
                '}';
    }
}
