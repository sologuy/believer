package com.norris.believer.Bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by android on 2017/10/12.
 */

public class RankMonthBean {

    /**
     * members : {"total":14,"per_page":10,"current_page":2,"last_page":2,"next_page_url":"","prev_page_url":"http://test1.wx.laohoulundao.ct?page=1","from":11,"to":14,"data":[{"integral":"25","YourName":"hiphop man","UserID":4128,"isSendedGift":0,"giftNum":0,"prevRank":0,"rankUp":5},{"integral":"5","YourName":"章海涛","UserID":526,"isSendedGift":0,"giftNum":0,"prevRank":0,"rankUp":5}]}
     */

    private MembersBean members;

    public MembersBean getMembers() {
        return members;
    }

    public void setMembers(MembersBean members) {
        this.members = members;
    }

    public static class MembersBean {
        /**
         * total : 14
         * per_page : 10
         * current_page : 2
         * last_page : 2
         * next_page_url :
         * prev_page_url : http://test1.wx.laohoulundao.ct?page=1
         * from : 11
         * to : 14
         * data : [{"integral":"25","YourName":"hiphop man","UserID":4128,"isSendedGift":0,"giftNum":0,"prevRank":0,"rankUp":5},{"integral":"5","YourName":"章海涛","UserID":526,"isSendedGift":0,"giftNum":0,"prevRank":0,"rankUp":5}]
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

        public static class DataBean implements Parcelable {
            /**
             * integral : 25
             * YourName : hiphop man
             * UserID : 4128
             * isSendedGift : 0
             * giftNum : 0
             * prevRank : 0
             * rankUp : 5
             */

            private String integral;
            private String YourName;
            private String FilePath1;
            private int UserID;
            private int isSendedGift;
            private int giftNum;
            private int prevRank;
            private int rankUp;


            public String getFilePath1() {
                return FilePath1;
            }

            public void setFilePath1(String filePath1) {
                FilePath1 = filePath1;
            }

            public String getIntegral() {
                return integral;
            }

            public void setIntegral(String integral) {
                this.integral = integral;
            }

            public String getYourName() {
                return YourName;
            }

            public void setYourName(String YourName) {
                this.YourName = YourName;
            }

            public int getUserID() {
                return UserID;
            }

            public void setUserID(int UserID) {
                this.UserID = UserID;
            }

            public int getIsSendedGift() {
                return isSendedGift;
            }

            public void setIsSendedGift(int isSendedGift) {
                this.isSendedGift = isSendedGift;
            }

            public int getGiftNum() {
                return giftNum;
            }

            public void setGiftNum(int giftNum) {
                this.giftNum = giftNum;
            }

            public int getPrevRank() {
                return prevRank;
            }

            public void setPrevRank(int prevRank) {
                this.prevRank = prevRank;
            }

            public int getRankUp() {
                return rankUp;
            }

            public void setRankUp(int rankUp) {
                this.rankUp = rankUp;
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
                arg0.writeString(integral);
                arg0.writeString(YourName);
                arg0.writeString(FilePath1);
                arg0.writeInt(UserID);
                arg0.writeInt(isSendedGift);
                arg0.writeInt(giftNum);
                arg0.writeInt(prevRank);
                arg0.writeInt(rankUp);
            }

            // 1.必须实现Parcelable.Creator接口,否则在获取Person数据的时候，会报错，如下：
            // android.os.BadParcelableException:
            // Parcelable protocol requires a Parcelable.Creator object called  CREATOR on class com.um.demo.Person
            // 2.这个接口实现了从Percel容器读取Person数据，并返回Person对象给逻辑层使用
            // 3.实现Parcelable.Creator接口对象名必须为CREATOR，不如同样会报错上面所提到的错；
            // 4.在读取Parcel容器里的数据事，必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
            // 5.反序列化对象
            public static final Parcelable.Creator<DataBean> CREATOR = new Creator(){

                @Override
                public DataBean createFromParcel(Parcel source) {
                    // TODO Auto-generated method stub
                    // 必须按成员变量声明的顺序读取数据，不然会出现获取数据出错
                    DataBean p = new DataBean();
                    p.setIntegral(source.readString());
                    p.setYourName(source.readString());
                    p.setFilePath1(source.readString());
                    p.setUserID(source.readInt());
                    p.setIsSendedGift(source.readInt());
                    p.setGiftNum(source.readInt());
                    p.setPrevRank(source.readInt());
                    p.setRankUp(source.readInt());
                    return p;
                }

                @Override
                public DataBean[] newArray(int size) {
                    // TODO Auto-generated method stub
                    return new DataBean[size];
                }
            };
        }
    }
}
