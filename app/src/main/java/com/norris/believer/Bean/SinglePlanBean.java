package com.norris.believer.Bean;

/**
 * Created by android on 2017/8/29.
 */

public class SinglePlanBean {

    /**
     * code : 200
     * message : ok
     * data : {"bookInfo":{"BookID":61,"TypeID":1,"BookTitle":"销售中的情感共鸣","BookDesc":"什么是情感销售？什么不是情感销售？","ppt":"/uploads/20170822/20170822181443.zip","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170822/20170822181209.jpg","FilePath2":"http://img.laohoulundao.com/video/20170823qinggangongming.mp4","FilePath3":"http://img.laohoulundao.com/music/20170823qinggangongming.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":7941,"SearchIDList":"","MasterID":4,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-08-25 08:07:24","AddDate":"2017-08-22 18:12:23","publish_date":"2017-08-23"}}
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
         * bookInfo : {"BookID":61,"TypeID":1,"BookTitle":"销售中的情感共鸣","BookDesc":"什么是情感销售？什么不是情感销售？","ppt":"/uploads/20170822/20170822181443.zip","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170822/20170822181209.jpg","FilePath2":"http://img.laohoulundao.com/video/20170823qinggangongming.mp4","FilePath3":"http://img.laohoulundao.com/music/20170823qinggangongming.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":7941,"SearchIDList":"","MasterID":4,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-08-25 08:07:24","AddDate":"2017-08-22 18:12:23","publish_date":"2017-08-23"}
         */

        private int type;
        private int isAdmin;


        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getIsAdmin() {
            return isAdmin;
        }

        public void setIsAdmin(int isAdmin) {
            this.isAdmin = isAdmin;
        }

        private BookInfoBean bookInfo;
        private ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean readPlanInfo;

        public ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean getReadPlanInfo() {
            return readPlanInfo;
        }

        public void setReadPlanInfo(ReadPartyDetailBean.DataBeanX.ReadPlanListBean.DataBean readPlanInfo) {
            this.readPlanInfo = readPlanInfo;
        }

        public BookInfoBean getBookInfo() {
            return bookInfo;
        }

        public void setBookInfo(BookInfoBean bookInfo) {
            this.bookInfo = bookInfo;
        }

        public static class BookInfoBean {
            /**
             * BookID : 61
             * TypeID : 1
             * BookTitle : 销售中的情感共鸣
             * BookDesc : 什么是情感销售？什么不是情感销售？
             * ppt : /uploads/20170822/20170822181443.zip
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170822/20170822181209.jpg
             * FilePath2 : http://img.laohoulundao.com/video/20170823qinggangongming.mp4
             * FilePath3 : http://img.laohoulundao.com/music/20170823qinggangongming.mp3
             * SortNumber : 1
             * IsGratis : 1
             * IsShow : 1
             * BookRecommend : 1
             * ReadNumber : 7941
             * SearchIDList :
             * MasterID : 4
             * DeleteMark : 1
             * PageTitle :
             * Keywords :
             * Description :
             * ReleaseDate : 2017-08-25 08:07:24
             * AddDate : 2017-08-22 18:12:23
             * publish_date : 2017-08-23
             */

            private int BookID;
            private int TypeID;
            private String BookTitle;
            private String BookDesc;
            private String ppt;
            private String FilePath1;
            private String FilePath2;
            private String FilePath3;
            private int SortNumber;
            private int IsGratis;
            private int IsShow;
            private int BookRecommend;
            private int ReadNumber;
            private String SearchIDList;
            private int MasterID;
            private int DeleteMark;
            private String PageTitle;
            private String Keywords;
            private String Description;
            private String ReleaseDate;
            private String AddDate;
            private String publish_date;

            public int getBookID() {
                return BookID;
            }

            public void setBookID(int BookID) {
                this.BookID = BookID;
            }

            public int getTypeID() {
                return TypeID;
            }

            public void setTypeID(int TypeID) {
                this.TypeID = TypeID;
            }

            public String getBookTitle() {
                return BookTitle;
            }

            public void setBookTitle(String BookTitle) {
                this.BookTitle = BookTitle;
            }

            public String getBookDesc() {
                return BookDesc;
            }

            public void setBookDesc(String BookDesc) {
                this.BookDesc = BookDesc;
            }

            public String getPpt() {
                return ppt;
            }

            public void setPpt(String ppt) {
                this.ppt = ppt;
            }

            public String getFilePath1() {
                return FilePath1;
            }

            public void setFilePath1(String FilePath1) {
                this.FilePath1 = FilePath1;
            }

            public String getFilePath2() {
                return FilePath2;
            }

            public void setFilePath2(String FilePath2) {
                this.FilePath2 = FilePath2;
            }

            public String getFilePath3() {
                return FilePath3;
            }

            public void setFilePath3(String FilePath3) {
                this.FilePath3 = FilePath3;
            }

            public int getSortNumber() {
                return SortNumber;
            }

            public void setSortNumber(int SortNumber) {
                this.SortNumber = SortNumber;
            }

            public int getIsGratis() {
                return IsGratis;
            }

            public void setIsGratis(int IsGratis) {
                this.IsGratis = IsGratis;
            }

            public int getIsShow() {
                return IsShow;
            }

            public void setIsShow(int IsShow) {
                this.IsShow = IsShow;
            }

            public int getBookRecommend() {
                return BookRecommend;
            }

            public void setBookRecommend(int BookRecommend) {
                this.BookRecommend = BookRecommend;
            }

            public int getReadNumber() {
                return ReadNumber;
            }

            public void setReadNumber(int ReadNumber) {
                this.ReadNumber = ReadNumber;
            }

            public String getSearchIDList() {
                return SearchIDList;
            }

            public void setSearchIDList(String SearchIDList) {
                this.SearchIDList = SearchIDList;
            }

            public int getMasterID() {
                return MasterID;
            }

            public void setMasterID(int MasterID) {
                this.MasterID = MasterID;
            }

            public int getDeleteMark() {
                return DeleteMark;
            }

            public void setDeleteMark(int DeleteMark) {
                this.DeleteMark = DeleteMark;
            }

            public String getPageTitle() {
                return PageTitle;
            }

            public void setPageTitle(String PageTitle) {
                this.PageTitle = PageTitle;
            }

            public String getKeywords() {
                return Keywords;
            }

            public void setKeywords(String Keywords) {
                this.Keywords = Keywords;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }

            public String getReleaseDate() {
                return ReleaseDate;
            }

            public void setReleaseDate(String ReleaseDate) {
                this.ReleaseDate = ReleaseDate;
            }

            public String getAddDate() {
                return AddDate;
            }

            public void setAddDate(String AddDate) {
                this.AddDate = AddDate;
            }

            public String getPublish_date() {
                return publish_date;
            }

            public void setPublish_date(String publish_date) {
                this.publish_date = publish_date;
            }
        }
    }
}
