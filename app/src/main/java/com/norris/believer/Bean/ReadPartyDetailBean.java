package com.norris.believer.Bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/5/25.
 */

public class ReadPartyDetailBean {


    /**
     * code : 200
     * message : ok
     * data : {"bookInfo":{"BookID":45,"TypeID":1,"BookTitle":"谁偷走了我的客户？","BookDesc":"入选哈佛商学院精选书单","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg","FilePath2":"http://img.laohoulundao.com/video/shuitouzoulewodekehu.mp4","FilePath3":"http://img.laohoulundao.com/music/shuitouzoulewodekehu.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":6104,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-11 08:15:23","AddDate":"2017-05-02 23:36:10","publish_date":"0000-00-00","bookurl":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg"},"readPartyInfo":{"ReaParID":198,"States":1,"ReaParType":1,"CompanyName":"","Tel":"","Address":"","ReaParName":"张维喜企业读书会","Description":"","Hobbies":"","MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg","FilePath2":"http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg","IsShow":1,"CreaterName":"创建者名称","Regulation":"请遵守读书会规则","AdminRemark":"","MasterID":0,"DeleteMark":1,"ReleaseDate":"2017-06-03 09:13:38","AddDate":"2017-06-03 09:13:38","company_id":1,"isAdmin":1,"outMoney":0,"memberMoney":0},"organization":{"companyInfo":{"company_id":1,"company_name":"上海师道书院","manager_user_id":5164,"vip_port":7,"vip_begin_date":"2017-05-23","vip_end_date":"2018-02-02","company_sn":"14725836"},"deparments":[{"departmentName":"财务部","members":[]},{"departmentName":"技术部","members":[]},{"departmentName":"未分组","members":[{"MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","YourName":"樵夫","StudyMoney":0},{"MemNumber":"2017042701064022787","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王亚军","StudyMoney":0}]}]},"readPlanList":{"per_page":6,"current_page":1,"next_page_url":"","prev_page_url":"","from":1,"to":1,"data":[{"SumUpID":3524,"BookID":45,"MemNumber":"2017042701956667076","BookReview1":"接触点和客户参与设计","BookReview2":"我会竭力成为对公司熟悉的家人，而不仅仅是一个职位的在岗者，在公司外，代表的是公司","BookReview3":"不应该只展现个人的单面，而应该展现多方面，每一个与他人相关的事情都应该表现得更好","BookReview4":"没有","AddDate":"2017-05-04 07:06:38","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","zan":[],"commentlist":[{"CommContents":"cool","YourName":"樵夫"}]}]},"frontMembers":[{"MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","YourName":"樵夫","StudyMoney":0},{"MemNumber":"2017042701064022787","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王亚军","StudyMoney":0}]}
     */

    private String code;
    private String message;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX implements Serializable {
        /**
         * bookInfo : {"BookID":45,"TypeID":1,"BookTitle":"谁偷走了我的客户？","BookDesc":"入选哈佛商学院精选书单","FilePath1":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg","FilePath2":"http://img.laohoulundao.com/video/shuitouzoulewodekehu.mp4","FilePath3":"http://img.laohoulundao.com/music/shuitouzoulewodekehu.mp3","SortNumber":1,"IsGratis":1,"IsShow":1,"BookRecommend":1,"ReadNumber":6104,"SearchIDList":"","MasterID":1,"DeleteMark":1,"PageTitle":"","Keywords":"","Description":"","ReleaseDate":"2017-05-11 08:15:23","AddDate":"2017-05-02 23:36:10","publish_date":"0000-00-00","bookurl":"http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg"}
         * readPartyInfo : {"ReaParID":198,"States":1,"ReaParType":1,"CompanyName":"","Tel":"","Address":"","ReaParName":"张维喜企业读书会","Description":"","Hobbies":"","MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg","FilePath2":"http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg","IsShow":1,"CreaterName":"创建者名称","Regulation":"请遵守读书会规则","AdminRemark":"","MasterID":0,"DeleteMark":1,"ReleaseDate":"2017-06-03 09:13:38","AddDate":"2017-06-03 09:13:38","company_id":1,"isAdmin":1,"outMoney":0,"memberMoney":0}
         * organization : {"companyInfo":{"company_id":1,"company_name":"上海师道书院","manager_user_id":5164,"vip_port":7,"vip_begin_date":"2017-05-23","vip_end_date":"2018-02-02","company_sn":"14725836"},"deparments":[{"departmentName":"财务部","members":[]},{"departmentName":"技术部","members":[]},{"departmentName":"未分组","members":[{"MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","YourName":"樵夫","StudyMoney":0},{"MemNumber":"2017042701064022787","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王亚军","StudyMoney":0}]}]}
         * readPlanList : {"per_page":6,"current_page":1,"next_page_url":"","prev_page_url":"","from":1,"to":1,"data":[{"SumUpID":3524,"BookID":45,"MemNumber":"2017042701956667076","BookReview1":"接触点和客户参与设计","BookReview2":"我会竭力成为对公司熟悉的家人，而不仅仅是一个职位的在岗者，在公司外，代表的是公司","BookReview3":"不应该只展现个人的单面，而应该展现多方面，每一个与他人相关的事情都应该表现得更好","BookReview4":"没有","AddDate":"2017-05-04 07:06:38","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","zan":[],"commentlist":[{"CommContents":"cool","YourName":"樵夫"}]}]}
         * frontMembers : [{"MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","YourName":"樵夫","StudyMoney":0},{"MemNumber":"2017042701064022787","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王亚军","StudyMoney":0}]
         */

        private BookInfoBean bookInfo;
        private ReadPartyInfoBean readPartyInfo;
        private OrganizationBean organization;
        private ReadPlanListBean readPlanList;

        public BookInfoBean getBookInfo() {
            return bookInfo;
        }

        public void setBookInfo(BookInfoBean bookInfo) {
            this.bookInfo = bookInfo;
        }

        public ReadPartyInfoBean getReadPartyInfo() {
            return readPartyInfo;
        }

        public void setReadPartyInfo(ReadPartyInfoBean readPartyInfo) {
            this.readPartyInfo = readPartyInfo;
        }

        public OrganizationBean getOrganization() {
            return organization;
        }

        public void setOrganization(OrganizationBean organization) {
            this.organization = organization;
        }

        public ReadPlanListBean getReadPlanList() {
            return readPlanList;
        }

        public void setReadPlanList(ReadPlanListBean readPlanList) {
            this.readPlanList = readPlanList;
        }


        public static class BookInfoBean implements Serializable {
            /**
             * BookID : 45
             * TypeID : 1
             * BookTitle : 谁偷走了我的客户？
             * BookDesc : 入选哈佛商学院精选书单
             * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg
             * FilePath2 : http://img.laohoulundao.com/video/shuitouzoulewodekehu.mp4
             * FilePath3 : http://img.laohoulundao.com/music/shuitouzoulewodekehu.mp3
             * SortNumber : 1
             * IsGratis : 1
             * IsShow : 1
             * BookRecommend : 1
             * ReadNumber : 6104
             * SearchIDList :
             * MasterID : 1
             * DeleteMark : 1
             * PageTitle :
             * Keywords :
             * Description :
             * ReleaseDate : 2017-05-11 08:15:23
             * AddDate : 2017-05-02 23:36:10
             * publish_date : 0000-00-00
             * bookurl : http://test.wx.laohoulundao.com/uploads/20170503/20170503002028.jpg
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
            private String bookurl;

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

            public String getBookurl() {
                return bookurl;
            }

            public void setBookurl(String bookurl) {
                this.bookurl = bookurl;
            }
        }

        public static class ReadPartyInfoBean implements Serializable {
            /**
             * ReaParID : 198
             * States : 1
             * ReaParType : 1
             * CompanyName :
             * Tel :
             * Address :
             * ReaParName : 张维喜企业读书会
             * Description :
             * Hobbies :
             * MemNumber : 2017042701956667076
             * FilePath1 : http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg
             * FilePath2 : http://test.wx.laohoulundao.com/images/default-images/default-read-party-img.jpg
             * IsShow : 1
             * CreaterName : 创建者名称
             * Regulation : 请遵守读书会规则
             * AdminRemark :
             * MasterID : 0
             * DeleteMark : 1
             * ReleaseDate : 2017-06-03 09:13:38
             * AddDate : 2017-06-03 09:13:38
             * company_id : 1
             * isAdmin : 1
             * outMoney : 0
             * memberMoney : 0
             */

            private int ReaParID;
            private int States;
            private int ReaParType;
            private String CompanyName;
            private String Tel;
            private String Address;
            private String ReaParName;
            private String Description;
            private String Hobbies;
            private String MemNumber;
            private String FilePath1;
            private String FilePath2;
            private int IsShow;
            private String CreaterName;
            private String Regulation;
            private String AdminRemark;
            private int MasterID;
            private int DeleteMark;
            private String ReleaseDate;
            private String AddDate;
            private int company_id;
            private int isAdmin;
            private int outMoney;
            private int memberMoney;
            private int isEmployee;
            private int rewardRight;
            private List<NoticeInfoBean> noticeInfo;

            public List<NoticeInfoBean> getNoticeInfo() {
                return noticeInfo;
            }

            public void setNoticeInfo(List<NoticeInfoBean> noticeInfo) {
                this.noticeInfo = noticeInfo;
            }

            public int getIsEmployee() {
                return isEmployee;
            }

            public void setIsEmployee(int isEmployee) {
                this.isEmployee = isEmployee;
            }

            public int getRewardRight() {
                return rewardRight;
            }

            public void setRewardRight(int rewardRight) {
                this.rewardRight = rewardRight;
            }

            public int getReaParID() {
                return ReaParID;
            }

            public void setReaParID(int ReaParID) {
                this.ReaParID = ReaParID;
            }

            public int getStates() {
                return States;
            }

            public void setStates(int States) {
                this.States = States;
            }

            public int getReaParType() {
                return ReaParType;
            }

            public void setReaParType(int ReaParType) {
                this.ReaParType = ReaParType;
            }

            public String getCompanyName() {
                return CompanyName;
            }

            public void setCompanyName(String CompanyName) {
                this.CompanyName = CompanyName;
            }

            public String getTel() {
                return Tel;
            }

            public void setTel(String Tel) {
                this.Tel = Tel;
            }

            public String getAddress() {
                return Address;
            }

            public void setAddress(String Address) {
                this.Address = Address;
            }

            public String getReaParName() {
                return ReaParName;
            }

            public void setReaParName(String ReaParName) {
                this.ReaParName = ReaParName;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }

            public String getHobbies() {
                return Hobbies;
            }

            public void setHobbies(String Hobbies) {
                this.Hobbies = Hobbies;
            }

            public String getMemNumber() {
                return MemNumber;
            }

            public void setMemNumber(String MemNumber) {
                this.MemNumber = MemNumber;
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

            public int getIsShow() {
                return IsShow;
            }

            public void setIsShow(int IsShow) {
                this.IsShow = IsShow;
            }

            public String getCreaterName() {
                return CreaterName;
            }

            public void setCreaterName(String CreaterName) {
                this.CreaterName = CreaterName;
            }

            public String getRegulation() {
                return Regulation;
            }

            public void setRegulation(String Regulation) {
                this.Regulation = Regulation;
            }

            public String getAdminRemark() {
                return AdminRemark;
            }

            public void setAdminRemark(String AdminRemark) {
                this.AdminRemark = AdminRemark;
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

            public int getCompany_id() {
                return company_id;
            }

            public void setCompany_id(int company_id) {
                this.company_id = company_id;
            }

            public int getIsAdmin() {
                return isAdmin;
            }

            public void setIsAdmin(int isAdmin) {
                this.isAdmin = isAdmin;
            }

            public int getOutMoney() {
                return outMoney;
            }

            public void setOutMoney(int outMoney) {
                this.outMoney = outMoney;
            }

            public int getMemberMoney() {
                return memberMoney;
            }

            public void setMemberMoney(int memberMoney) {
                this.memberMoney = memberMoney;
            }

            public static class NoticeInfoBean implements Parcelable {

                /**
                 * noticeId : 2
                 * avg : http://test.wx.laohoulundao.com/uploads/memface/20170718/2017042701064022787144113.jpg
                 * userName : 王亚军
                 * bookReview : 测试
                 * sum_up_id : 9349
                 * read_party_id : 286
                 * publish_at : 1小时前
                 * content : 王亚军赞了你的读书改进计划
                 */

                private int noticeId;
                private String avg;
                private String userName;
                private String bookReview;
                private int sum_up_id;
                private int read_party_id;
                private String publish_at;
                private String content;
                private int bookId;
                private int firendUserId;

                public int getBookId() {
                    return bookId;
                }

                public void setBookId(int bookId) {
                    this.bookId = bookId;
                }

                public int getFirendUserId() {
                    return firendUserId;
                }

                public void setFirendUserId(int firendUserId) {
                    this.firendUserId = firendUserId;
                }

                public int getNoticeId() {
                    return noticeId;
                }

                public void setNoticeId(int noticeId) {
                    this.noticeId = noticeId;
                }

                public String getAvg() {
                    return avg;
                }

                public void setAvg(String avg) {
                    this.avg = avg;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public String getBookReview() {
                    return bookReview;
                }

                public void setBookReview(String bookReview) {
                    this.bookReview = bookReview;
                }

                public int getSum_up_id() {
                    return sum_up_id;
                }

                public void setSum_up_id(int sum_up_id) {
                    this.sum_up_id = sum_up_id;
                }

                public int getRead_party_id() {
                    return read_party_id;
                }

                public void setRead_party_id(int read_party_id) {
                    this.read_party_id = read_party_id;
                }

                public String getPublish_at() {
                    return publish_at;
                }

                public void setPublish_at(String publish_at) {
                    this.publish_at = publish_at;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
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
                    arg0.writeInt(noticeId);
                    arg0.writeString(avg);
                    arg0.writeString(userName);
                    arg0.writeString(bookReview);
                    arg0.writeInt(sum_up_id);
                    arg0.writeInt(read_party_id);
                    arg0.writeString(publish_at);
                    arg0.writeString(content);
                    arg0.writeInt(bookId);
                    arg0.writeInt(firendUserId);
                }

                // 1.必须实现Parcelable.Creator接口,否则在获取Person数据的时候，会报错，如下：
                // android.os.BadParcelableException:
                // Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class com.um.demo.Person
                // 2.这个接口实现了从Percel容器读取Person数据，并返回Person对象给逻辑层使用
                // 3.实现Parcelable.Creator接口对象名必须为CREATOR，不如同样会报错上面所提到的错；
                // 4.在读取Parcel容器里的数据事，必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
                // 5.反序列化对象
                public static final Parcelable.Creator<NoticeInfoBean> CREATOR = new Creator() {

                    @Override
                    public NoticeInfoBean createFromParcel(Parcel source) {
                        // TODO Auto-generated method stub
                        // 必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
                        NoticeInfoBean p = new NoticeInfoBean();
                        p.setNoticeId(source.readInt());
                        p.setAvg(source.readString());
                        p.setUserName(source.readString());
                        p.setBookReview(source.readString());
                        p.setSum_up_id(source.readInt());
                        p.setRead_party_id(source.readInt());
                        p.setPublish_at(source.readString());
                        p.setContent(source.readString());
                        p.setBookId(source.readInt());
                        p.setFirendUserId(source.readInt());
                        return p;
                    }

                    @Override
                    public NoticeInfoBean[] newArray(int size) {
                        // TODO Auto-generated method stub
                        return new NoticeInfoBean[size];
                    }
                };

                @Override
                public String toString() {
                    return "NoticeInfoBean{" +
                            "noticeId=" + noticeId +
                            ", avg='" + avg + '\'' +
                            ", userName='" + userName + '\'' +
                            ", bookReview='" + bookReview + '\'' +
                            ", sum_up_id=" + sum_up_id +
                            ", read_party_id=" + read_party_id +
                            ", publish_at='" + publish_at + '\'' +
                            ", content='" + content + '\'' +
                            ", bookId=" + bookId +
                            ", firendUserId=" + firendUserId +
                            '}';
                }
            }
        }


        public static class OrganizationBean implements Serializable {
            /**
             * companyInfo : {"company_id":1,"company_name":"上海师道书院","manager_user_id":5164,"vip_port":7,"vip_begin_date":"2017-05-23","vip_end_date":"2018-02-02","company_sn":"14725836"}
             * deparments : [{"departmentName":"财务部","members":[]},{"departmentName":"技术部","members":[]},{"departmentName":"未分组","members":[{"MemNumber":"2017042701956667076","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","YourName":"樵夫","StudyMoney":0},{"MemNumber":"2017042701064022787","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王亚军","StudyMoney":0}]}]
             */

            private CompanyInfoBean companyInfo;
            private List<DeparmentsBean> deparments;

            public CompanyInfoBean getCompanyInfo() {
                return companyInfo;
            }

            public void setCompanyInfo(CompanyInfoBean companyInfo) {
                this.companyInfo = companyInfo;
            }

            public List<DeparmentsBean> getDeparments() {
                return deparments;
            }

            public void setDeparments(List<DeparmentsBean> deparments) {
                this.deparments = deparments;
            }

            public static class CompanyInfoBean implements Serializable {
                /**
                 * company_id : 1
                 * company_name : 上海师道书院
                 * manager_user_id : 5164
                 * vip_port : 7
                 * vip_begin_date : 2017-05-23
                 * vip_end_date : 2018-02-02
                 * company_sn : 14725836
                 */

                private int company_id;
                private String company_name;
                private int manager_user_id;
                private int vip_port;
                private String vip_begin_date;
                private String vip_end_date;
                private String company_sn;

                public int getCompany_id() {
                    return company_id;
                }

                public void setCompany_id(int company_id) {
                    this.company_id = company_id;
                }

                public String getCompany_name() {
                    return company_name;
                }

                public void setCompany_name(String company_name) {
                    this.company_name = company_name;
                }

                public int getManager_user_id() {
                    return manager_user_id;
                }

                public void setManager_user_id(int manager_user_id) {
                    this.manager_user_id = manager_user_id;
                }

                public int getVip_port() {
                    return vip_port;
                }

                public void setVip_port(int vip_port) {
                    this.vip_port = vip_port;
                }

                public String getVip_begin_date() {
                    return vip_begin_date;
                }

                public void setVip_begin_date(String vip_begin_date) {
                    this.vip_begin_date = vip_begin_date;
                }

                public String getVip_end_date() {
                    return vip_end_date;
                }

                public void setVip_end_date(String vip_end_date) {
                    this.vip_end_date = vip_end_date;
                }

                public String getCompany_sn() {
                    return company_sn;
                }

                public void setCompany_sn(String company_sn) {
                    this.company_sn = company_sn;
                }
            }

            public static class DeparmentsBean implements Serializable {
                /**
                 * departmentName : 财务部
                 * members : []
                 */

                private String departmentName;
                private List<?> members;
                private int departmentId;

                public String getDepartmentName() {
                    return departmentName;
                }

                public void setDepartmentName(String departmentName) {
                    this.departmentName = departmentName;
                }

                public List<?> getMembers() {
                    return members;
                }

                public void setMembers(List<?> members) {
                    this.members = members;
                }

                public int getDepartmentId() {
                    return departmentId;
                }

                public void setDepartmentId(int departmentId) {
                    this.departmentId = departmentId;
                }
            }

            @Override
            public String toString() {
                return "OrganizationBean{" +
                        "companyInfo=" + companyInfo +
                        ", deparments=" + deparments +
                        '}';
            }
        }

        public static class ReadPlanListBean implements Serializable {
            /**
             * per_page : 6
             * current_page : 1
             * next_page_url :
             * prev_page_url :
             * from : 1
             * to : 1
             * data : [{"SumUpID":3524,"BookID":45,"MemNumber":"2017042701956667076","BookReview1":"接触点和客户参与设计","BookReview2":"我会竭力成为对公司熟悉的家人，而不仅仅是一个职位的在岗者，在公司外，代表的是公司","BookReview3":"不应该只展现个人的单面，而应该展现多方面，每一个与他人相关的事情都应该表现得更好","BookReview4":"没有","AddDate":"2017-05-04 07:06:38","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","zan":[],"commentlist":[{"CommContents":"cool","YourName":"樵夫"}]}]
             */

            private int per_page;
            private int current_page;
            private String next_page_url;
            private String prev_page_url;
            private int from;
            private int to;
            private List<DataBean> data;

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

            public static class DataBean implements Serializable {
                /**
                 * SumUpID : 3524
                 * BookID : 45
                 * MemNumber : 2017042701956667076
                 * BookReview1 : 接触点和客户参与设计
                 * BookReview2 : 我会竭力成为对公司熟悉的家人，而不仅仅是一个职位的在岗者，在公司外，代表的是公司
                 * BookReview3 : 不应该只展现个人的单面，而应该展现多方面，每一个与他人相关的事情都应该表现得更好
                 * BookReview4 : 没有
                 * AddDate : 2017-05-04 07:06:38
                 * YourName : 樵夫
                 * FilePath1 : http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png
                 * zan : []
                 * commentlist : [{"CommContents":"cool","YourName":"樵夫"}]
                 */

                private int SumUpID;
                private int BookID;
                private String MemNumber;
                private String BookReview1;
                private String BookReview2;
                private String BookReview3;
                private String BookReview4;
                private String AddDate;
                private String YourName;
                private String FilePath1;
                private String is_like_users;
                private List<ZanBean> zan;
                private List<CommentlistBean> commentlist;
                private int isLike;
                private int UserID;


                public int getUserID() {
                    return UserID;
                }

                public void setUserID(int userID) {
                    UserID = userID;
                }

                public int getIsLike() {
                    return isLike;
                }

                public void setIsLike(int isLike) {
                    this.isLike = isLike;
                }

                public int getSumUpID() {
                    return SumUpID;
                }

                public void setSumUpID(int SumUpID) {
                    this.SumUpID = SumUpID;
                }

                public int getBookID() {
                    return BookID;
                }

                public void setBookID(int BookID) {
                    this.BookID = BookID;
                }

                public String getMemNumber() {
                    return MemNumber;
                }

                public void setMemNumber(String MemNumber) {
                    this.MemNumber = MemNumber;
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

                public String getAddDate() {
                    return AddDate;
                }

                public void setAddDate(String AddDate) {
                    this.AddDate = AddDate;
                }

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

                public List<ZanBean> getZan() {
                    return zan;
                }

                public String getIs_like_users() {
                    return is_like_users;
                }

                public void setIs_like_users(String is_like_users) {
                    this.is_like_users = is_like_users;
                }

                public void setZan(List<ZanBean> zan) {
                    this.zan = zan;
                }

                public static class ZanBean implements Serializable {

                    /**
                     * CommContents : cool
                     * YourName : 樵夫
                     */
                    private String YourName;
                    private int money;
                    private int UserID;

                    public int getUserID() {
                        return UserID;
                    }

                    public void setUserID(int userID) {
                        UserID = userID;
                    }

                    public int getMoney() {
                        return money;
                    }

                    public void setMoney(int money) {
                        this.money = money;
                    }

                    public String getYourName() {
                        return YourName;
                    }

                    public void setYourName(String yourName) {
                        YourName = yourName;
                    }

                    @Override
                    public String toString() {
                        return "ZanBean{" +
                                "YourName='" + YourName + '\'' +
                                ", money=" + money +
                                '}';
                    }
                }


                public List<CommentlistBean> getCommentlist() {
                    return commentlist;
                }

                public void setCommentlist(List<CommentlistBean> commentlist) {
                    this.commentlist = commentlist;
                }

                public static class CommentlistBean implements Serializable {
                    /**
                     * RepID : 144
                     * States : 1
                     * Type : 0
                     * ReaParID : 211
                     * CommContents : 鲁诺
                     * CommID : 5434
                     * MemNumber : 201706281739609846
                     * DeleteMark : 1
                     * ReleaseDate : 2017-08-14 18:35:05
                     * AddDate : 2017-08-14 18:35:05
                     * reply_MemNumber : 0
                     * pid : 0
                     * userName : 靓仔
                     * replyName : null
                     */

                    private int RepID;
                    private int States;
                    private int Type;
                    private int ReaParID;
                    private String CommContents;
                    private int CommID;
                    private String MemNumber;
                    private int DeleteMark;
                    private String ReleaseDate;
                    private String AddDate;
                    private String reply_MemNumber;
                    private int pid;
                    private String userName;
                    private String replyName;
                    private int replyUserId;
                    private int UserID;

                    public int getReplyUserId() {
                        return replyUserId;
                    }

                    public void setReplyUserId(int replyUserId) {
                        this.replyUserId = replyUserId;
                    }

                    public int getUserID() {
                        return UserID;
                    }

                    public void setUserID(int userID) {
                        UserID = userID;
                    }

                    public int getRepID() {
                        return RepID;
                    }

                    public void setRepID(int RepID) {
                        this.RepID = RepID;
                    }

                    public int getStates() {
                        return States;
                    }

                    public void setStates(int States) {
                        this.States = States;
                    }

                    public int getType() {
                        return Type;
                    }

                    public void setType(int Type) {
                        this.Type = Type;
                    }

                    public int getReaParID() {
                        return ReaParID;
                    }

                    public void setReaParID(int ReaParID) {
                        this.ReaParID = ReaParID;
                    }

                    public String getCommContents() {
                        return CommContents;
                    }

                    public void setCommContents(String CommContents) {
                        this.CommContents = CommContents;
                    }

                    public int getCommID() {
                        return CommID;
                    }

                    public void setCommID(int CommID) {
                        this.CommID = CommID;
                    }

                    public String getMemNumber() {
                        return MemNumber;
                    }

                    public void setMemNumber(String MemNumber) {
                        this.MemNumber = MemNumber;
                    }

                    public int getDeleteMark() {
                        return DeleteMark;
                    }

                    public void setDeleteMark(int DeleteMark) {
                        this.DeleteMark = DeleteMark;
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

                    public String getReply_MemNumber() {
                        return reply_MemNumber;
                    }

                    public void setReply_MemNumber(String reply_MemNumber) {
                        this.reply_MemNumber = reply_MemNumber;
                    }

                    public int getPid() {
                        return pid;
                    }

                    public void setPid(int pid) {
                        this.pid = pid;
                    }

                    public String getUserName() {
                        return userName;
                    }

                    public void setUserName(String userName) {
                        this.userName = userName;
                    }

                    public String getReplyName() {
                        return replyName;
                    }

                    public void setReplyName(String replyName) {
                        this.replyName = replyName;
                    }
                    /**
                     * CommContents : cool
                     * YourName : 樵夫
                     */


                }

//                @Override
//                public String toString() {
//                    return "DataBean{" +
//                            "SumUpID=" + SumUpID +
//                            ", BookID=" + BookID +
//                            ", MemNumber='" + MemNumber + '\'' +
//                            ", BookReview1='" + BookReview1 + '\'' +
//                            ", BookReview2='" + BookReview2 + '\'' +
//                            ", BookReview3='" + BookReview3 + '\'' +
//                            ", BookReview4='" + BookReview4 + '\'' +
//                            ", AddDate='" + AddDate + '\'' +
//                            ", YourName='" + YourName + '\'' +
//                            ", FilePath1='" + FilePath1 + '\'' +
//                            ", zan=" + zan.toString() +
//                            ", commentlist=" + commentlist +
//                            '}';
//                }
            }


        }

        @Override
        public String toString() {
            return "DataBeanX{" +
                    "bookInfo=" + bookInfo +
                    ", readPartyInfo=" + readPartyInfo +
                    ", organization=" + organization +
                    ", readPlanList=" + readPlanList +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ReadPartyDetailBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

