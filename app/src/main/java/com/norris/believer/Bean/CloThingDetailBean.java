package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/8/7.
 */

public class CloThingDetailBean {


    /**
     * code : 200
     * message : success
     * data : {"article":{"comments":[{"id":13,"user_id":66,"pid":0,"replay_user_id":0,"body":"今天天气好热","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:30:32","updated_at":"2017-08-03 11:30:32","up_time_user":",13657449968","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王珏慧","replay_name":"","userPhone":"13657449968","isLike":0,"sub_comments":[{"id":14,"user_id":67,"pid":13,"replay_user_id":66,"body":"今天天气好冷","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:31:30","updated_at":"2017-08-03 11:31:30","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"徐颖","replay_name":"王珏慧","userPhone":"15706188718","isLike":0}]}],"up_times":1,"article_id":3,"isLike":0,"shareInfo":{"title":"在开始之前请一定要记住，先登录公众号后台，找到边栏 \u201c开发\u201d 模块下的 \u201c接口权限\u201d，点击 \u201c网页授权获取用户基本信息\u201d 后面的修改，添加你的网页授权域名","share_img":"http://lorempixel.com/640/480/?72231","introduce":"湖水清澈、透亮，就像一个漂亮的小姑娘，亭亭玉立着，她从未想过，有一天她会遇见他，一阵潇洒的清风。","link":"http://test.wx.laohoulundao.com/api/v2/share/3"}}}
     */

    private int code;
    private String message;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
         * article : {"comments":[{"id":13,"user_id":66,"pid":0,"replay_user_id":0,"body":"今天天气好热","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:30:32","updated_at":"2017-08-03 11:30:32","up_time_user":",13657449968","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王珏慧","replay_name":"","userPhone":"13657449968","isLike":0,"sub_comments":[{"id":14,"user_id":67,"pid":13,"replay_user_id":66,"body":"今天天气好冷","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:31:30","updated_at":"2017-08-03 11:31:30","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"徐颖","replay_name":"王珏慧","userPhone":"15706188718","isLike":0}]}],"up_times":1,"article_id":3,"isLike":0,"shareInfo":{"title":"在开始之前请一定要记住，先登录公众号后台，找到边栏 \u201c开发\u201d 模块下的 \u201c接口权限\u201d，点击 \u201c网页授权获取用户基本信息\u201d 后面的修改，添加你的网页授权域名","share_img":"http://lorempixel.com/640/480/?72231","introduce":"湖水清澈、透亮，就像一个漂亮的小姑娘，亭亭玉立着，她从未想过，有一天她会遇见他，一阵潇洒的清风。","link":"http://test.wx.laohoulundao.com/api/v2/share/3"}}
         */

        private ArticleBean article;

        public ArticleBean getArticle() {
            return article;
        }

        public void setArticle(ArticleBean article) {
            this.article = article;
        }

        public static class ArticleBean {
            /**
             * comments : [{"id":13,"user_id":66,"pid":0,"replay_user_id":0,"body":"今天天气好热","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:30:32","updated_at":"2017-08-03 11:30:32","up_time_user":",13657449968","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"王珏慧","replay_name":"","userPhone":"13657449968","isLike":0,"sub_comments":[{"id":14,"user_id":67,"pid":13,"replay_user_id":66,"body":"今天天气好冷","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:31:30","updated_at":"2017-08-03 11:31:30","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"徐颖","replay_name":"王珏慧","userPhone":"15706188718","isLike":0}]}]
             * up_times : 1
             * article_id : 3
             * isLike : 0
             * shareInfo : {"title":"在开始之前请一定要记住，先登录公众号后台，找到边栏 \u201c开发\u201d 模块下的 \u201c接口权限\u201d，点击 \u201c网页授权获取用户基本信息\u201d 后面的修改，添加你的网页授权域名","share_img":"http://lorempixel.com/640/480/?72231","introduce":"湖水清澈、透亮，就像一个漂亮的小姑娘，亭亭玉立着，她从未想过，有一天她会遇见他，一阵潇洒的清风。","link":"http://test.wx.laohoulundao.com/api/v2/share/3"}
             */

            private int up_times;
            private int article_id;
            private int isLike;
            private ShareInfoBean shareInfo;
            private List<CommentsBean> comments;

            public int getUp_times() {
                return up_times;
            }

            public void setUp_times(int up_times) {
                this.up_times = up_times;
            }

            public int getArticle_id() {
                return article_id;
            }

            public void setArticle_id(int article_id) {
                this.article_id = article_id;
            }

            public int getIsLike() {
                return isLike;
            }

            public void setIsLike(int isLike) {
                this.isLike = isLike;
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
                 * title : 在开始之前请一定要记住，先登录公众号后台，找到边栏 “开发” 模块下的 “接口权限”，点击 “网页授权获取用户基本信息” 后面的修改，添加你的网页授权域名
                 * share_img : http://lorempixel.com/640/480/?72231
                 * introduce : 湖水清澈、透亮，就像一个漂亮的小姑娘，亭亭玉立着，她从未想过，有一天她会遇见他，一阵潇洒的清风。
                 * link : http://test.wx.laohoulundao.com/api/v2/share/3
                 */

                private String title;
                private String share_img;
                private String introduce;
                private String link;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getShare_img() {
                    return share_img;
                }

                public void setShare_img(String share_img) {
                    this.share_img = share_img;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }

            public static class CommentsBean {
                /**
                 * id : 13
                 * user_id : 66
                 * pid : 0
                 * replay_user_id : 0
                 * body : 今天天气好热
                 * up_times : 0
                 * lessons_id : 3
                 * type : 2
                 * deleted_at :
                 * created_at : 2017-08-03 11:30:32
                 * updated_at : 2017-08-03 11:30:32
                 * up_time_user : ,13657449968
                 * FilePath1 : http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg
                 * YourName : 王珏慧
                 * replay_name :
                 * userPhone : 13657449968
                 * isLike : 0
                 * sub_comments : [{"id":14,"user_id":67,"pid":13,"replay_user_id":66,"body":"今天天气好冷","up_times":0,"lessons_id":3,"type":2,"deleted_at":"","created_at":"2017-08-03 11:31:30","updated_at":"2017-08-03 11:31:30","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"徐颖","replay_name":"王珏慧","userPhone":"15706188718","isLike":0}]
                 */

                private int id;
                private int user_id;
                private int pid;
                private int replay_user_id;
                private String body;
                private int up_times;
                private int lessons_id;
                private int type;
                private String deleted_at;
                private String created_at;
                private String updated_at;
                private String up_time_user;
                private String FilePath1;
                private String YourName;
                private String replyName;
                private String userPhone;
                private int isLike;
                private List<SubCommentsBean> sub_comments;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public int getPid() {
                    return pid;
                }

                public void setPid(int pid) {
                    this.pid = pid;
                }

                public int getReplay_user_id() {
                    return replay_user_id;
                }

                public void setReplay_user_id(int replay_user_id) {
                    this.replay_user_id = replay_user_id;
                }

                public String getBody() {
                    return body;
                }

                public void setBody(String body) {
                    this.body = body;
                }

                public int getUp_times() {
                    return up_times;
                }

                public void setUp_times(int up_times) {
                    this.up_times = up_times;
                }

                public int getLessons_id() {
                    return lessons_id;
                }

                public void setLessons_id(int lessons_id) {
                    this.lessons_id = lessons_id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getDeleted_at() {
                    return deleted_at;
                }

                public void setDeleted_at(String deleted_at) {
                    this.deleted_at = deleted_at;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public String getUp_time_user() {
                    return up_time_user;
                }

                public void setUp_time_user(String up_time_user) {
                    this.up_time_user = up_time_user;
                }

                public String getFilePath1() {
                    return FilePath1;
                }

                public void setFilePath1(String FilePath1) {
                    this.FilePath1 = FilePath1;
                }

                public String getYourName() {
                    return YourName;
                }

                public void setYourName(String YourName) {
                    this.YourName = YourName;
                }

                public String getReplyName() {
                    return replyName;
                }

                public void setReplyName(String replyName) {
                    this.replyName = replyName;
                }

                public String getUserPhone() {
                    return userPhone;
                }

                public void setUserPhone(String userPhone) {
                    this.userPhone = userPhone;
                }

                public int getIsLike() {
                    return isLike;
                }

                public void setIsLike(int isLike) {
                    this.isLike = isLike;
                }

                public List<SubCommentsBean> getSub_comments() {
                    return sub_comments;
                }

                public void setSub_comments(List<SubCommentsBean> sub_comments) {
                    this.sub_comments = sub_comments;
                }

                public static class SubCommentsBean {
                    /**
                     * id : 14
                     * user_id : 67
                     * pid : 13
                     * replay_user_id : 66
                     * body : 今天天气好冷
                     * up_times : 0
                     * lessons_id : 3
                     * type : 2
                     * deleted_at :
                     * created_at : 2017-08-03 11:31:30
                     * updated_at : 2017-08-03 11:31:30
                     * up_time_user :
                     * FilePath1 : http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg
                     * YourName : 徐颖
                     * replay_name : 王珏慧
                     * userPhone : 15706188718
                     * isLike : 0
                     */

                    private int id;
                    private int user_id;
                    private int pid;
                    private int replay_user_id;
                    private String body;
                    private int up_times;
                    private int lessons_id;
                    private int type;
                    private String deleted_at;
                    private String created_at;
                    private String updated_at;
                    private String up_time_user;
                    private String FilePath1;
                    private String YourName;
                    private String replyName;
                    private String userPhone;
                    private int isLike;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(int user_id) {
                        this.user_id = user_id;
                    }

                    public int getPid() {
                        return pid;
                    }

                    public void setPid(int pid) {
                        this.pid = pid;
                    }

                    public int getReplay_user_id() {
                        return replay_user_id;
                    }

                    public void setReplay_user_id(int replay_user_id) {
                        this.replay_user_id = replay_user_id;
                    }

                    public String getBody() {
                        return body;
                    }

                    public void setBody(String body) {
                        this.body = body;
                    }

                    public int getUp_times() {
                        return up_times;
                    }

                    public void setUp_times(int up_times) {
                        this.up_times = up_times;
                    }

                    public int getLessons_id() {
                        return lessons_id;
                    }

                    public void setLessons_id(int lessons_id) {
                        this.lessons_id = lessons_id;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getDeleted_at() {
                        return deleted_at;
                    }

                    public void setDeleted_at(String deleted_at) {
                        this.deleted_at = deleted_at;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }

                    public String getUpdated_at() {
                        return updated_at;
                    }

                    public void setUpdated_at(String updated_at) {
                        this.updated_at = updated_at;
                    }

                    public String getUp_time_user() {
                        return up_time_user;
                    }

                    public void setUp_time_user(String up_time_user) {
                        this.up_time_user = up_time_user;
                    }

                    public String getFilePath1() {
                        return FilePath1;
                    }

                    public void setFilePath1(String FilePath1) {
                        this.FilePath1 = FilePath1;
                    }

                    public String getYourName() {
                        return YourName;
                    }

                    public void setYourName(String YourName) {
                        this.YourName = YourName;
                    }

                    public String getReplyName() {
                        return replyName;
                    }

                    public void setReplyName(String replyName) {
                        this.replyName = replyName;
                    }

                    public String getUserPhone() {
                        return userPhone;
                    }

                    public void setUserPhone(String userPhone) {
                        this.userPhone = userPhone;
                    }

                    public int getIsLike() {
                        return isLike;
                    }

                    public void setIsLike(int isLike) {
                        this.isLike = isLike;
                    }
                }
            }
        }
    }
}
