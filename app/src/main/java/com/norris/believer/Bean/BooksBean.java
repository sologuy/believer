package com.norris.believer.Bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by admin on 2017/5/23.
 */

public class BooksBean {

    /**
     * error_code : 200
     * error_info : 成功
     * data : {"memstate":2,"booklist":[{"BookID":46,"TypeID":3,
     * "BookTitle":"全新销售","BookDesc":"说服他人，从改变自己开始",
     * "FilePath1":"http://test.wx.laohoulundao.a170509175351.jpg",
     * "FilePath2":"http://img.laohoulundao.com/videnxiaoshou.mp4",
     * "FilePath3":"http://img.laohoulundao.com/10quanxihou.mp3",
     * "SortNumber":1,"IsGratis":1,"IsShow":0,"BookRecommend":1,
     * "ReadNumber":6492,"SearchIDList":"","MasterID":0,"DeleteMark":1,
     * "PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-16
     * 18:43:39","AddDate":"2017-05-09 17:57:30","publish_date":"2017-05-18","hasReadPlan":0},
     * {"BookID":45,"TypeID":1,"BookTitle":"谁偷走了我的客户？","BookDesc":"入选哈佛商学院精
     * 选书单","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170503/201705030
     * 02028.jpg","FilePath2":"http://img.laohoulundao.com/video/shuitouzoulewodekehu
     * .mp4","FilePath3":"http://img.laohoulundao.com/music/shuitouzoulewodekehu.mp3"
     * ,"SortNumber":1,"IsGratis":1,"IsShow":0,"BookRecommend":1,"ReadNumber":6090,"S
     * earchIDList":"","MasterID":0,"DeleteMark":1,"PageTitle":"","Keywords":"","Desc
     * ription":"","ReleaseDate":"2017-05-11 08:15:23","AddDate":"2017-05-02 23:36:10
     * ","publish_date":"0000-00-00","hasReadPlan":0}]}
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
         * memstate : 2
         * booklist : [{"BookID":46,"TypeID":3,"BookTitle":"全新销售","BookDesc":"说服他人，从改变自己开始","FilePath1":"http://test.wx.laohoulundao.a170509175351.jpg","FilePath2":"http://img.laohoulundao.com/videnxiaoshou.mp4","FilePath3":"http://img.laohoulundao.com/10quanxihou.mp3","SortNumber":1,"IsGratis":1,"IsShow":0,"BookRecommend":1,"ReadNumber":6492,"SearchIDList":"","MasterID":0,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-16 18:43:39","AddDate":"2017-05-09 17:57:30","publish_date":"2017-05-18","hasReadPlan":0},{"BookID":45,"TypeID":1,"BookTitle":"谁偷走了我的客户？","BookDesc":"入选哈佛商学院精选书单","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg","FilePath2":"http://img.laohoulundao.com/video/shuitouzoulewodekehu.mp4","FilePath3":"http://img.laohoulundao.com/music/shuitouzoulewodekehu.mp3","SortNumber":1,"IsGratis":1,"IsShow":0,"BookRecommend":1,"ReadNumber":6090,"SearchIDList":"","MasterID":0,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-11 08:15:23","AddDate":"2017-05-02 23:36:10","publish_date":"0000-00-00","hasReadPlan":0}]
         */

        private int memstate;
        private List<BooklistBean> booklist;

        public int getMemstate() {
            return memstate;
        }

        public void setMemstate(int memstate) {
            this.memstate = memstate;
        }

        public List<BooklistBean> getBooklist() {
            return booklist;
        }

        public void setBooklist(List<BooklistBean> booklist) {
            this.booklist = booklist;
        }

        public static class BooklistBean implements Parcelable {
            /**
             * BookID : 46
             * TypeID : 3
             * BookTitle : 全新销售
             * BookDesc : 说服他人，从改变自己开始
             * FilePath1 : http://test.wx.laohoulundao.a170509175351.jpg
             * FilePath2 : http://img.laohoulundao.com/videnxiaoshou.mp4
             * FilePath3 : http://img.laohoulundao.com/10quanxihou.mp3
             * SortNumber : 1
             * IsGratis : 1
             * IsShow : 0
             * BookRecommend : 1
             * ReadNumber : 6492
             * SearchIDList :
             * MasterID : 0
             * DeleteMark : 1
             * PageTitle :
             * Keywords :
             * Description :
             * ReleaseDate : 2017-05-16 18:43:39
             * AddDate : 2017-05-09 17:57:30
             * publish_date : 2017-05-18
             * hasReadPlan : 0
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
            private int hasReadPlan;

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

            public int getHasReadPlan() {
                return hasReadPlan;
            }

            public void setHasReadPlan(int hasReadPlan) {
                this.hasReadPlan = hasReadPlan;
            }

            @Override
            public int describeContents() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public void writeToParcel(Parcel arg0, int arg1) {
                // TODO Auto-generated method stub
                // 1.必须按成员变量声明的顺序封装数据，不然会出现获取数据出错
                // 2.序列化对象
                arg0.writeInt(TypeID);
                arg0.writeString(BookTitle);
                arg0.writeString(BookDesc);
                arg0.writeString(FilePath1);
                arg0.writeString(FilePath2);
                arg0.writeString(FilePath3);
                arg0.writeInt(SortNumber);
                arg0.writeInt(IsGratis);
                arg0.writeInt(IsShow);
                arg0.writeInt(BookRecommend);
                arg0.writeInt(ReadNumber);
                arg0.writeString(SearchIDList);
                arg0.writeInt(MasterID);
                arg0.writeInt(DeleteMark);
                arg0.writeString(PageTitle);
                arg0.writeString(Keywords);
                arg0.writeString(Description);
                arg0.writeString(ReleaseDate);
                arg0.writeString(AddDate);
                arg0.writeString(publish_date);
                arg0.writeInt(hasReadPlan);
            }

            // 1.必须实现Parcelable.Creator接口,否则在获取Person数据的时候，会报错，如下：
            // android.os.BadParcelableException:
            // Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class com.um.demo.Person
            // 2.这个接口实现了从Percel容器读取Person数据，并返回Person对象给逻辑层使用
            // 3.实现Parcelable.Creator接口对象名必须为CREATOR，不如同样会报错上面所提到的错；
            // 4.在读取Parcel容器里的数据事，必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
            // 5.反序列化对象
            public static final Parcelable.Creator<BooklistBean> CREATOR = new Creator(){

                @Override
                public BooklistBean createFromParcel(Parcel source) {
                    // TODO Auto-generated method stub
                    // 必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
                    BooklistBean p = new BooklistBean();
                    p.setTypeID(source.readInt());
                    p.setBookTitle(source.readString());
                    p.setBookDesc(source.readString());
                    p.setFilePath1(source.readString());
                    p.setFilePath2(source.readString());
                    p.setFilePath3(source.readString());
                    p.setSortNumber(source.readInt());
                    p.setIsGratis(source.readInt());
                    p.setIsShow(source.readInt());
                    p.setBookRecommend(source.readInt());
                    p.setReadNumber(source.readInt());
                    p.setSearchIDList(source.readString());
                    p.setMasterID(source.readInt());
                    p.setDeleteMark(source.readInt());
                    p.setPageTitle(source.readString());
                    p.setKeywords(source.readString());
                    p.setDescription(source.readString());
                    p.setReleaseDate(source.readString());
                    p.setAddDate(source.readString());
                    p.setPublish_date(source.readString());
                    p.setHasReadPlan(source.readInt());
                    return p;
                }

                @Override
                public BooklistBean[] newArray(int size) {
                    // TODO Auto-generated method stub
                    return new BooklistBean[size];
                }
            };

        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "memstate=" + memstate +
                    ", booklist=" + booklist +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "BooksBean{" +
                "error_code='" + error_code + '\'' +
                ", error_info='" + error_info + '\'' +
                ", data=" + data +
                '}';
    }
}
