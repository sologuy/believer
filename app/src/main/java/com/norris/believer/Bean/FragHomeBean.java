package com.norris.believer.Bean;

import java.util.List;

public class FragHomeBean {




    private String message;
    private String code;
    private int mstate;
    private List<DayslistBean> dayslist;
    private List<HotslistBean> hotslist;
    private List<MindsharelistBean> mindsharelist;

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

    public int getMstate() {
        return mstate;
    }

    public void setMstate(int mstate) {
        this.mstate = mstate;
    }

    public List<DayslistBean> getDayslist() {
        return dayslist;
    }

    public void setDayslist(List<DayslistBean> dayslist) {
        this.dayslist = dayslist;
    }

    public List<HotslistBean> getHotslist() {
        return hotslist;
    }

    public void setHotslist(List<HotslistBean> hotslist) {
        this.hotslist = hotslist;
    }

    public List<MindsharelistBean> getMindsharelist() {
        return mindsharelist;
    }

    public void setMindsharelist(List<MindsharelistBean> mindsharelist) {
        this.mindsharelist = mindsharelist;
    }

    public static class DayslistBean {


        private int AudioID;
        private String AudioTitle;
        private String FilePath1;
        private String ReleaseDate;
        private String PublishDate;
        private int view_times;
        private ShareInfoBean shareInfo;

        public int getAudioID() {
            return AudioID;
        }

        public void setAudioID(int AudioID) {
            this.AudioID = AudioID;
        }

        public String getAudioTitle() {
            return AudioTitle;
        }

        public void setAudioTitle(String AudioTitle) {
            this.AudioTitle = AudioTitle;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getReleaseDate() {
            return ReleaseDate;
        }

        public void setReleaseDate(String ReleaseDate) {
            this.ReleaseDate = ReleaseDate;
        }

        public String getPublishDate() {
            return PublishDate;
        }

        public void setPublishDate(String PublishDate) {
            this.PublishDate = PublishDate;
        }

        public int getView_times() {
            return view_times;
        }

        public void setView_times(int view_times) {
            this.view_times = view_times;
        }

        public ShareInfoBean getShareInfo() {
            return shareInfo;
        }

        public void setShareInfo(ShareInfoBean shareInfo) {
            this.shareInfo = shareInfo;
        }

        public static class ShareInfoBean {


            private String title;
            private String groupTitle;
            private String description;
            private String img;
            private String link;
            private String audio;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getGroupTitle() {
                return groupTitle;
            }

            public void setGroupTitle(String groupTitle) {
                this.groupTitle = groupTitle;
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

            public String getAudio() {
                return audio;
            }

            public void setAudio(String audio) {
                this.audio = audio;
            }
        }
    }

    public static class HotslistBean {
        /**
         * BoHoID : 12
         * LinkUrl : http://img.laohoulundao.com/video/shuitouzoulewodekehu.mp4
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170503/20170503192253.jpg
         * BoHoTitle : 谁偷走了我的客户？
         * SortNumber : 5
         * urlAddress : http://test.wx.laohoulundao.com/hotdetail/12.html
         */

        private int BoHoID;
        private String LinkUrl;
        private String FilePath1;
        private String BoHoTitle;
        private int SortNumber;
        private String urlAddress;

        public int getBoHoID() {
            return BoHoID;
        }

        public void setBoHoID(int BoHoID) {
            this.BoHoID = BoHoID;
        }

        public String getLinkUrl() {
            return LinkUrl;
        }

        public void setLinkUrl(String LinkUrl) {
            this.LinkUrl = LinkUrl;
        }

        public String getFilePath1() {
            return FilePath1;
        }

        public void setFilePath1(String FilePath1) {
            this.FilePath1 = FilePath1;
        }

        public String getBoHoTitle() {
            return BoHoTitle;
        }

        public void setBoHoTitle(String BoHoTitle) {
            this.BoHoTitle = BoHoTitle;
        }

        public int getSortNumber() {
            return SortNumber;
        }

        public void setSortNumber(int SortNumber) {
            this.SortNumber = SortNumber;
        }

        public String getUrlAddress() {
            return urlAddress;
        }

        public void setUrlAddress(String urlAddress) {
            this.urlAddress = urlAddress;
        }
    }

    public static class MindsharelistBean {
        /**
         * MinSgaID : 66
         * MinSgaTitle : 俞敏洪做了一件事，将改变大多数人对教育的认识
         * MinSgaDesc : 在独自读书的岁月里，让他具备了自我生长的力量。
         * FilePath1 : http://test.wx.laohoulundao.com/uploads/20170515/20170515155323.jpg
         * AddDate : 2017-05-15 15:54:45
         * urlAddress : http://test.wx.laohoulundao.com/sharedetail/66.html
         */

        private int MinSgaID;
        private String MinSgaTitle;
        private String MinSgaDesc;
        private String FilePath1;
        private String AddDate;
        private String urlAddress;

        public int getMinSgaID() {
            return MinSgaID;
        }

        public void setMinSgaID(int MinSgaID) {
            this.MinSgaID = MinSgaID;
        }

        public String getMinSgaTitle() {
            return MinSgaTitle;
        }

        public void setMinSgaTitle(String MinSgaTitle) {
            this.MinSgaTitle = MinSgaTitle;
        }

        public String getMinSgaDesc() {
            return MinSgaDesc;
        }

        public void setMinSgaDesc(String MinSgaDesc) {
            this.MinSgaDesc = MinSgaDesc;
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

        public String getUrlAddress() {
            return urlAddress;
        }

        public void setUrlAddress(String urlAddress) {
            this.urlAddress = urlAddress;
        }
    }

    @Override
    public String toString() {
        return "FragHomeBean{" +
                "message='" + message + '\'' +
                ", code='" + code + '\'' +
                ", mstate=" + mstate +
                ", dayslist=" + dayslist +
                ", hotslist=" + hotslist +
                ", mindsharelist=" + mindsharelist +
                '}';
    }
}
