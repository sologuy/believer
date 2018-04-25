package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/9/18.
 */

public class GZBookBarBean {

    /**
     * indexImages : [{"gz_img_id":1,"img":"http://test.wx.laohoulundao.com/uploads/guozheng/images/common/gz-face1.png","type":"web","content_id":0,"sort":0,"is_show":1,"link":"http://test.wx.laohoulundao.com/web/gz/videoDetail?videoId=0"},{"gz_img_id":2,"img":"http://test.wx.laohoulundao.com/uploads/guozheng/images/common/gz-face1.png","type":"video","content_id":0,"sort":0,"is_show":1,"link":"http://test.wx.laohoulundao.com/web/gz/videoDetail?videoId=0"},{"gz_img_id":3,"img":"http://test.wx.laohoulundao.com/uploads/guozheng/images/common/gz-face1.png","type":"web","content_id":0,"sort":0,"is_show":1,"link":"http://test.wx.laohoulundao.com/web/gz/videoDetail?videoId=0"}]
     * videos : {"total":3,"per_page":20,"current_page":1,"last_page":1,"next_page_url":" ","prev_page_url":" ","from":1,"to":3,"data":[{"BookID":9,"TypeID":1,"BookTitle":"全新思维","BookDesc":"决胜未来的6大能力","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930104702.jpg","FilePath2":"http://img.laohoulundao.com/video/20160927222346_61.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930104709.mp3","SortNumber":2,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":1377,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2016-10-10 10:50:27","AddDate":"2016-09-30 16:48:38","publish_date":"2017/09/04","author":"侯志奎"},{"BookID":5,"TypeID":1,"BookTitle":"超预测","BookDesc":"预见未来的艺术和科学","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930103522.jpg","FilePath2":"http://img.laohoulundao.com/video/20160830232913_897.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930103536.mp3","SortNumber":996,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":4162,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-04 17:38:33","AddDate":"2016-09-30 16:37:30","publish_date":"2017/08/15","author":"侯志奎"},{"BookID":2,"TypeID":1,"BookTitle":"分享经济改变中国","BookDesc":"最有代表性平台解剖最具想象力新经济形态","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930102306.jpg","FilePath2":"http://img.laohoulundao.com/video/20160809214619_807.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930102320.mp3","SortNumber":999,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":6453,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-04 17:36:00","AddDate":"2016-09-30 16:25:32","publish_date":"2017/09/01","author":"侯志奎"}]}
     */

    private VideosBean videos;
    private List<IndexImagesBean> indexImages;

    public VideosBean getVideos() {
        return videos;
    }

    public void setVideos(VideosBean videos) {
        this.videos = videos;
    }

    public List<IndexImagesBean> getIndexImages() {
        return indexImages;
    }

    public void setIndexImages(List<IndexImagesBean> indexImages) {
        this.indexImages = indexImages;
    }

    public static class VideosBean {
        /**
         * total : 3
         * per_page : 20
         * current_page : 1
         * last_page : 1
         * next_page_url :
         * prev_page_url :
         * from : 1
         * to : 3
         * data : [{"BookID":9,"TypeID":1,"BookTitle":"全新思维","BookDesc":"决胜未来的6大能力","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930104702.jpg","FilePath2":"http://img.laohoulundao.com/video/20160927222346_61.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930104709.mp3","SortNumber":2,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":1377,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2016-10-10 10:50:27","AddDate":"2016-09-30 16:48:38","publish_date":"2017/09/04","author":"侯志奎"},{"BookID":5,"TypeID":1,"BookTitle":"超预测","BookDesc":"预见未来的艺术和科学","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930103522.jpg","FilePath2":"http://img.laohoulundao.com/video/20160830232913_897.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930103536.mp3","SortNumber":996,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":4162,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-04 17:38:33","AddDate":"2016-09-30 16:37:30","publish_date":"2017/08/15","author":"侯志奎"},{"BookID":2,"TypeID":1,"BookTitle":"分享经济改变中国","BookDesc":"最有代表性平台解剖最具想象力新经济形态","ppt":"","FilePath1":"http://test.wx.laohoulundao.com/uploads/20160930/20160930102306.jpg","FilePath2":"http://img.laohoulundao.com/video/20160809214619_807.mp4","FilePath3":"http://img.laohoulundao.com/video/20160930102320.mp3","SortNumber":999,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":6453,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-04 17:36:00","AddDate":"2016-09-30 16:25:32","publish_date":"2017/09/01","author":"侯志奎"}]
         */

        private int total;
        private int per_page;
        private int current_page;
        private int last_page;
        private String next_page_url;
        private String prev_page_url;
        private int from;
        private int to;
        private List<DataBean> data;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPer_page() {
            return per_page;
        }

        public void setPer_page(int per_page) {
            this.per_page = per_page;
        }

        public int getCurrent_page() {
            return current_page;
        }

        public void setCurrent_page(int current_page) {
            this.current_page = current_page;
        }

        public int getLast_page() {
            return last_page;
        }

        public void setLast_page(int last_page) {
            this.last_page = last_page;
        }

        public String getNext_page_url() {
            return next_page_url;
        }

        public void setNext_page_url(String next_page_url) {
            this.next_page_url = next_page_url;
        }

        public String getPrev_page_url() {
            return prev_page_url;
        }

        public void setPrev_page_url(String prev_page_url) {
            this.prev_page_url = prev_page_url;
        }

        public int getFrom() {
            return from;
        }

        public void setFrom(int from) {
            this.from = from;
        }

        public int getTo() {
            return to;
        }

        public void setTo(int to) {
            this.to = to;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * BookID : 9
             * TypeID : 1
             * BookTitle : 全新思维
             * BookDesc : 决胜未来的6大能力
             * ppt :
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/20160930/20160930104702.jpg
             * FilePath2 : http://img.laohoulundao.com/video/20160927222346_61.mp4
             * FilePath3 : http://img.laohoulundao.com/video/20160930104709.mp3
             * SortNumber : 2
             * IsGratis : 1
             * IsShow : 1
             * BookRecommend : 1
             * ReadNumber : 1377
             * SearchIDList :
             * MasterID : 1
             * DeleteMark : 1
             * PageTitle :
             * Keywords :
             * Description :
             * ReleaseDate : 2016-10-10 10:50:27
             * AddDate : 2016-09-30 16:48:38
             * publish_date : 2017/09/04
             * author : 侯志奎
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
            private String author;

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

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }
        }
    }

    public static class IndexImagesBean {
        /**
         * gz_img_id : 1
         * img : http://test.wx.laohoulundao.com/uploads/guozheng/images/common/gz-face1.png
         * type : web
         * content_id : 0
         * sort : 0
         * is_show : 1
         * link : http://test.wx.laohoulundao.com/web/gz/videoDetail?videoId=0
         */

        private int gz_img_id;
        private String img;
        private String type;
        private int content_id;
        private int sort;
        private int is_show;
        private String link;

        public int getGz_img_id() {
            return gz_img_id;
        }

        public void setGz_img_id(int gz_img_id) {
            this.gz_img_id = gz_img_id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getContent_id() {
            return content_id;
        }

        public void setContent_id(int content_id) {
            this.content_id = content_id;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public int getIs_show() {
            return is_show;
        }

        public void setIs_show(int is_show) {
            this.is_show = is_show;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }
    }
}
