package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/6/19.
 */

public class VideoWebCommentBean {

    /**
     * code : 200
     * message : ok
     * data : {"goodNumber":1,"commentNumber":0,"isGood":0,"isFavorite":0,"shareInfo":{"title":"学习官合伙人丨读书会感言","description":"为企业打造一套持续创新、实效精进的学习模式。解决企业学习\u201c落地难、无成果、不持久、无系统\u201d的根本性问题,使企业保持与时俱进的竞争创新能力。","img":"http://test.wx.laohoulundao.com","link":"http://test.wx.laohoulundao.com/home/mind_share_to_weixin?articleId=10","groupTitle":"学习官合伙人丨读书会感言"},"comments":[{"pid":41,"type":"STUDY","description":"是大家都觉得就大男大女都觉得想你想你的耐心耐心耐心","YourName":"李昞辰","FilePath1":"http://api.laohoulun/uploads/m579162712.png"},{"pid":41,"type":"STUDY","description":"教导读书会","YourName":"孙颖","FilePath1":"http://api.laohoulun/uploads/m579162712.png"},{"pid":41,"type":"STUDY","description":"6666","YourName":"李岚","FilePath1":"http://api.la/uploads/m17031001014210768132159.png"}]}
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
         * goodNumber : 1
         * commentNumber : 0
         * isGood : 0
         * isFavorite : 0
         * shareInfo : {"title":"学习官合伙人丨读书会感言","description":"为企业打造一套持续创新、实效精进的学习模式。解决企业学习\u201c落地难、无成果、不持久、无系统\u201d的根本性问题,使企业保持与时俱进的竞争创新能力。","img":"http://test.wx.laohoulundao.com","link":"http://test.wx.laohoulundao.com/home/mind_share_to_weixin?articleId=10","groupTitle":"学习官合伙人丨读书会感言"}
         * comments : [{"pid":41,"type":"STUDY","description":"是大家都觉得就大男大女都觉得想你想你的耐心耐心耐心","YourName":"李昞辰","FilePath1":"http://api.laohoulun/uploads/m579162712.png"},{"pid":41,"type":"STUDY","description":"教导读书会","YourName":"孙颖","FilePath1":"http://api.laohoulun/uploads/m579162712.png"},{"pid":41,"type":"STUDY","description":"6666","YourName":"李岚","FilePath1":"http://api.la/uploads/m17031001014210768132159.png"}]
         */

        private int goodNumber;
        private int commentNumber;
        private int isGood;
        private int isFavorite;
        private ShareInfoBean shareInfo;
        private List<CommentsBean> comments;

        public int getGoodNumber() {
            return goodNumber;
        }

        public void setGoodNumber(int goodNumber) {
            this.goodNumber = goodNumber;
        }

        public int getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(int commentNumber) {
            this.commentNumber = commentNumber;
        }

        public int getIsGood() {
            return isGood;
        }

        public void setIsGood(int isGood) {
            this.isGood = isGood;
        }

        public int getIsFavorite() {
            return isFavorite;
        }

        public void setIsFavorite(int isFavorite) {
            this.isFavorite = isFavorite;
        }

        public ShareInfoBean getShareInfo() {
            return shareInfo;
        }

        public void setShareInfo(ShareInfoBean shareInfo) {
            this.shareInfo = shareInfo;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public static class ShareInfoBean {
            /**
             * title : 学习官合伙人丨读书会感言
             * description : 为企业打造一套持续创新、实效精进的学习模式。解决企业学习“落地难、无成果、不持久、无系统”的根本性问题,使企业保持与时俱进的竞争创新能力。
             * img : http://test.wx.laohoulundao.com
             * link : http://test.wx.laohoulundao.com/home/mind_share_to_weixin?articleId=10
             * groupTitle : 学习官合伙人丨读书会感言
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

        public static class CommentsBean {
            /**
             * pid : 41
             * type : STUDY
             * description : 是大家都觉得就大男大女都觉得想你想你的耐心耐心耐心
             * YourName : 李昞辰
             * FilePath1 : http://api.laohoulun/uploads/m579162712.png
             */

            private int pid;
            private String type;
            private String description;
            private String YourName;
            private String FilePath1;
            private String created_at;

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public int getPid() {
                return pid;
            }

            public void setPid(int pid) {
                this.pid = pid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
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
        }
    }
}
