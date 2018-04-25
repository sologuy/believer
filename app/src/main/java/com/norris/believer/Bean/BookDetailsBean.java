package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by admin on 2017/5/23.
 */

public class BookDetailsBean {

    /**
     * error_code : 200
     * error_info : ok
     * data : {"imglist":[{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190519.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190523.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190527.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190531.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190536.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190540.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190544.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190548.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190553.jpg","SortNumber":1000}],"bookdetail":{"BookID":53,"TypeID":2,"BookTitle":"卧薪尝胆","BookDesc":"提升我们的格局、意志力和承载力","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg","FilePath2":"http://img.laohoulundao.com/video/20170628woxinchangdan.mp4","FilePath3":"http://img.laohoulundao.com/music/20170628woxinchangdan.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":1577,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-06-28 17:38:57","AddDate":"2017-06-27 19:06:00","publish_date":"2017-06-28","isCollect":"1"},"memstate":2,"sumuplist":{"SumUpID":5434,"BookReview1":"读书","BookReview2":"读人","BookReview3":"读事","BookReview4":"赠礼物"},"isCollect":"1","shareInfo":{"title":"改进计划标题","description":"改进计划内容","img":"http://test.wx.laohoulundao.comhttp://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg","link":"http://test.wx.laohoulundao.com/home/hot_book_share_to_weixin?","groupTitle":"朋友圈标题"}}
     */

    private String error_code;
    private String error_info;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * imglist : [{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190519.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190523.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190527.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190531.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190536.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190540.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190544.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190548.jpg","SortNumber":1000},{"FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190553.jpg","SortNumber":1000}]
         * bookdetail : {"BookID":53,"TypeID":2,"BookTitle":"卧薪尝胆","BookDesc":"提升我们的格局、意志力和承载力","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg","FilePath2":"http://img.laohoulundao.com/video/20170628woxinchangdan.mp4","FilePath3":"http://img.laohoulundao.com/music/20170628woxinchangdan.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":1577,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-06-28 17:38:57","AddDate":"2017-06-27 19:06:00","publish_date":"2017-06-28","isCollect":"1"}
         * memstate : 2
         * sumuplist : {"SumUpID":5434,"BookReview1":"读书","BookReview2":"读人","BookReview3":"读事","BookReview4":"赠礼物"}
         * isCollect : 1
         * shareInfo : {"title":"改进计划标题","description":"改进计划内容","img":"http://test.wx.laohoulundao.comhttp://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg","link":"http://test.wx.laohoulundao.com/home/hot_book_share_to_weixin?","groupTitle":"朋友圈标题"}
         */

        private BookdetailBean bookdetail;
        private int memstate;
        private SumuplistBean sumuplist;
        private String isCollect;
        private ShareInfoBean shareInfo;
        private List<ImglistBean> imglist;

        public BookdetailBean getBookdetail() {
            return bookdetail;
        }

        public void setBookdetail(BookdetailBean bookdetail) {
            this.bookdetail = bookdetail;
        }

        public int getMemstate() {
            return memstate;
        }

        public void setMemstate(int memstate) {
            this.memstate = memstate;
        }

        public SumuplistBean getSumuplist() {
            return sumuplist;
        }

        public void setSumuplist(SumuplistBean sumuplist) {
            this.sumuplist = sumuplist;
        }

        public String getIsCollect() {
            return isCollect;
        }

        public void setIsCollect(String isCollect) {
            this.isCollect = isCollect;
        }

        public ShareInfoBean getShareInfo() {
            return shareInfo;
        }

        public void setShareInfo(ShareInfoBean shareInfo) {
            this.shareInfo = shareInfo;
        }

        public List<ImglistBean> getImglist() {
            return imglist;
        }

        public void setImglist(List<ImglistBean> imglist) {
            this.imglist = imglist;
        }

        public static class BookdetailBean {
            /**
             * BookID : 53
             * TypeID : 2
             * BookTitle : 卧薪尝胆
             * BookDesc : 提升我们的格局、意志力和承载力
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg
             * FilePath2 : http://img.laohoulundao.com/video/20170628woxinchangdan.mp4
             * FilePath3 : http://img.laohoulundao.com/music/20170628woxinchangdan.mp3
             * SortNumber : 1
             * IsGratis : 1
             * IsShow : 1
             * BookRecommend : 1
             * ReadNumber : 1577
             * SearchIDList :
             * MasterID : 1
             * DeleteMark : 1
             * PageTitle :
             * Keywords :
             * Description :
             * ReleaseDate : 2017-06-28 17:38:57
             * AddDate : 2017-06-27 19:06:00
             * publish_date : 2017-06-28
             * isCollect : 1
             */

            private int BookID;
            private int TypeID;
            private String BookTitle;
            private String BookDesc;
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
            private String isCollect;

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

            public String getIsCollect() {
                return isCollect;
            }

            public void setIsCollect(String isCollect) {
                this.isCollect = isCollect;
            }
        }

        public static class SumuplistBean {
            /**
             * SumUpID : 5434
             * BookReview1 : 读书
             * BookReview2 : 读人
             * BookReview3 : 读事
             * BookReview4 : 赠礼物
             */

            private int SumUpID;
            private String BookReview1;
            private String BookReview2;
            private String BookReview3;
            private String BookReview4;

            public int getSumUpID() {
                return SumUpID;
            }

            public void setSumUpID(int SumUpID) {
                this.SumUpID = SumUpID;
            }

            public String getBookReview1() {
                return BookReview1;
            }

            public void setBookReview1(String BookReview1) {
                this.BookReview1 = BookReview1;
            }

            public String getBookReview2() {
                return BookReview2;
            }

            public void setBookReview2(String BookReview2) {
                this.BookReview2 = BookReview2;
            }

            public String getBookReview3() {
                return BookReview3;
            }

            public void setBookReview3(String BookReview3) {
                this.BookReview3 = BookReview3;
            }

            public String getBookReview4() {
                return BookReview4;
            }

            public void setBookReview4(String BookReview4) {
                this.BookReview4 = BookReview4;
            }
        }

        public static class ShareInfoBean {
            /**
             * title : 改进计划标题
             * description : 改进计划内容
             * img : http://test.wx.laohoulundao.comhttp://test.wx.laohoulundao.com/uploads/20170627/20170627190236.jpg
             * link : http://test.wx.laohoulundao.com/home/hot_book_share_to_weixin?
             * groupTitle : 朋友圈标题
             */

            private String title;
            private String description;
            private String img;
            private String link;
            private String groupTitle;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getGroupTitle() {
                return groupTitle;
            }

            public void setGroupTitle(String groupTitle) {
                this.groupTitle = groupTitle;
            }
        }

        public static class ImglistBean {
            /**
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170627/20170627190519.jpg
             * SortNumber : 1000
             */

            private String FilePath1;
            private int SortNumber;

            public String getFilePath1() {
                return FilePath1;
            }

            public void setFilePath1(String FilePath1) {
                this.FilePath1 = FilePath1;
            }

            public int getSortNumber() {
                return SortNumber;
            }

            public void setSortNumber(int SortNumber) {
                this.SortNumber = SortNumber;
            }
        }
    }
}
