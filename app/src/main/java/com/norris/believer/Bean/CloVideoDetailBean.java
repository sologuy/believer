package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/8/9.
 */

public class CloVideoDetailBean {

    /**
     * code : 200
     * message : 获取信息成功
     * data : {"lessons_detail":{"lessons_comments_data":{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":416,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":"","created_at":"2017-07-25 13:50:06","updated_at":"2017-08-09 14:18:11","video_img":"http://lorempixel.com/640/480/?45696","YourName":"冯丹","has_many_comments":[{"id":3,"user_id":560,"pid":0,"replay_user_id":0,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通s.","up_times":28916,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://wx.qlogo.cn/mmopen/ibIWpzM6Z1o4MDaArnA7QuDib2HVo2392hnS4P1eyuEKOTOqbOE47oMKFnRTmrSbdR0mSibmvO4YSwT4wWS3BVzeicmy5KDBVLiaj/0","YourName":"张亚娅","replay_name":"","sub_comments":[{"id":5,"user_id":230,"pid":3,"replay_user_id":560,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.","up_times":40930,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孙秋红","replay_name":"张亚娅"},{"id":6,"user_id":773,"pid":5,"replay_user_id":230,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通eriam.","up_times":61090,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孔云华","replay_name":"孙秋红"}]}]},"suggest_video":[{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"}],"share_url":{"title":"视频1","share_img":"http://lorempixel.com/640/480/?45696","introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","url":"http://test.wx.laohoulundao.com/web/share/index/1"}}}
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
         * lessons_detail : {"lessons_comments_data":{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":416,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":"","created_at":"2017-07-25 13:50:06","updated_at":"2017-08-09 14:18:11","video_img":"http://lorempixel.com/640/480/?45696","YourName":"冯丹","has_many_comments":[{"id":3,"user_id":560,"pid":0,"replay_user_id":0,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通s.","up_times":28916,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://wx.qlogo.cn/mmopen/ibIWpzM6Z1o4MDaArnA7QuDib2HVo2392hnS4P1eyuEKOTOqbOE47oMKFnRTmrSbdR0mSibmvO4YSwT4wWS3BVzeicmy5KDBVLiaj/0","YourName":"张亚娅","replay_name":"","sub_comments":[{"id":5,"user_id":230,"pid":3,"replay_user_id":560,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.","up_times":40930,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孙秋红","replay_name":"张亚娅"},{"id":6,"user_id":773,"pid":5,"replay_user_id":230,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通eriam.","up_times":61090,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孔云华","replay_name":"孙秋红"}]}]},"suggest_video":[{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"}],"share_url":{"title":"视频1","share_img":"http://lorempixel.com/640/480/?45696","introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","url":"http://test.wx.laohoulundao.com/web/share/index/1"}}
         */

        private LessonsDetailBean lessons_detail;

        public LessonsDetailBean getLessons_detail() {
            return lessons_detail;
        }

        public void setLessons_detail(LessonsDetailBean lessons_detail) {
            this.lessons_detail = lessons_detail;
        }

        public static class LessonsDetailBean {
            /**
             * lessons_comments_data : {"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":416,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":"","created_at":"2017-07-25 13:50:06","updated_at":"2017-08-09 14:18:11","video_img":"http://lorempixel.com/640/480/?45696","YourName":"冯丹","has_many_comments":[{"id":3,"user_id":560,"pid":0,"replay_user_id":0,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通s.","up_times":28916,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://wx.qlogo.cn/mmopen/ibIWpzM6Z1o4MDaArnA7QuDib2HVo2392hnS4P1eyuEKOTOqbOE47oMKFnRTmrSbdR0mSibmvO4YSwT4wWS3BVzeicmy5KDBVLiaj/0","YourName":"张亚娅","replay_name":"","sub_comments":[{"id":5,"user_id":230,"pid":3,"replay_user_id":560,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.","up_times":40930,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孙秋红","replay_name":"张亚娅"},{"id":6,"user_id":773,"pid":5,"replay_user_id":230,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通eriam.","up_times":61090,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孔云华","replay_name":"孙秋红"}]}]}
             * suggest_video : [{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","video_img":"http://lorempixel.com/640/480/?45696"}]
             * share_url : {"title":"视频1","share_img":"http://lorempixel.com/640/480/?45696","introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","url":"http://test.wx.laohoulundao.com/web/share/index/1"}
             */

            private LessonsCommentsDataBean lessons_comments_data;
            private ShareUrlBean share_url;
            private List<SuggestVideoBean> suggest_video;

            public LessonsCommentsDataBean getLessons_comments_data() {
                return lessons_comments_data;
            }

            public void setLessons_comments_data(LessonsCommentsDataBean lessons_comments_data) {
                this.lessons_comments_data = lessons_comments_data;
            }

            public ShareUrlBean getShare_url() {
                return share_url;
            }

            public void setShare_url(ShareUrlBean share_url) {
                this.share_url = share_url;
            }

            public List<SuggestVideoBean> getSuggest_video() {
                return suggest_video;
            }

            public void setSuggest_video(List<SuggestVideoBean> suggest_video) {
                this.suggest_video = suggest_video;
            }

            public static class LessonsCommentsDataBean {
                /**
                 * id : 1
                 * title : 视频1
                 * lessons_category_id : 1
                 * video_url : http://img.laohoulundao.com/video/20170719mimi.mp4
                 * looking_times : 416
                 * user_id : 179
                 * introduce : Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.
                 * deleted_at :
                 * created_at : 2017-07-25 13:50:06
                 * updated_at : 2017-08-09 14:18:11
                 * video_img : http://lorempixel.com/640/480/?45696
                 * YourName : 冯丹
                 * has_many_comments : [{"id":3,"user_id":560,"pid":0,"replay_user_id":0,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通s.","up_times":28916,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://wx.qlogo.cn/mmopen/ibIWpzM6Z1o4MDaArnA7QuDib2HVo2392hnS4P1eyuEKOTOqbOE47oMKFnRTmrSbdR0mSibmvO4YSwT4wWS3BVzeicmy5KDBVLiaj/0","YourName":"张亚娅","replay_name":"","sub_comments":[{"id":5,"user_id":230,"pid":3,"replay_user_id":560,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.","up_times":40930,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孙秋红","replay_name":"张亚娅"},{"id":6,"user_id":773,"pid":5,"replay_user_id":230,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通eriam.","up_times":61090,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孔云华","replay_name":"孙秋红"}]}]
                 */

                private int id;
                private String title;
                private int lessons_category_id;
                private String video_url;
                private int looking_times;
                private int user_id;
                private String introduce;
                private String deleted_at;
                private String created_at;
                private String updated_at;
                private String video_img;
                private String YourName;
                private List<CloThingDetailBean.DataBean.ArticleBean.CommentsBean> has_many_comments;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getLessons_category_id() {
                    return lessons_category_id;
                }

                public void setLessons_category_id(int lessons_category_id) {
                    this.lessons_category_id = lessons_category_id;
                }

                public String getVideo_url() {
                    return video_url;
                }

                public void setVideo_url(String video_url) {
                    this.video_url = video_url;
                }

                public int getLooking_times() {
                    return looking_times;
                }

                public void setLooking_times(int looking_times) {
                    this.looking_times = looking_times;
                }

                public int getUser_id() {
                    return user_id;
                }

                public void setUser_id(int user_id) {
                    this.user_id = user_id;
                }

                public String getIntroduce() {
                    return introduce;
                }

                public void setIntroduce(String introduce) {
                    this.introduce = introduce;
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

                public String getVideo_img() {
                    return video_img;
                }

                public void setVideo_img(String video_img) {
                    this.video_img = video_img;
                }

                public String getYourName() {
                    return YourName;
                }

                public void setYourName(String YourName) {
                    this.YourName = YourName;
                }

                public List<CloThingDetailBean.DataBean.ArticleBean.CommentsBean> getHas_many_comments() {
                    return has_many_comments;
                }

                public void setHas_many_comments(List<CloThingDetailBean.DataBean.ArticleBean.CommentsBean> has_many_comments) {
                    this.has_many_comments = has_many_comments;
                }

//                public static class HasManyCommentsBean {
//                    /**
//                     * id : 3
//                     * user_id : 560
//                     * pid : 0
//                     * replay_user_id : 0
//                     * body : 用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通s.
//                     * up_times : 28916
//                     * lessons_id : 1
//                     * type : 1
//                     * deleted_at :
//                     * created_at : 2017-07-26 10:48:20
//                     * updated_at : 2017-07-26 10:48:20
//                     * up_time_user :
//                     * FilePath1 : http://wx.qlogo.cn/mmopen/ibIWpzM6Z1o4MDaArnA7QuDib2HVo2392hnS4P1eyuEKOTOqbOE47oMKFnRTmrSbdR0mSibmvO4YSwT4wWS3BVzeicmy5KDBVLiaj/0
//                     * YourName : 张亚娅
//                     * replay_name :
//                     * sub_comments : [{"id":5,"user_id":230,"pid":3,"replay_user_id":560,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.","up_times":40930,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孙秋红","replay_name":"张亚娅"},{"id":6,"user_id":773,"pid":5,"replay_user_id":230,"body":"用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通eriam.","up_times":61090,"lessons_id":1,"type":1,"deleted_at":"","created_at":"2017-07-26 10:48:20","updated_at":"2017-07-26 10:48:20","up_time_user":"","FilePath1":"http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg","YourName":"孔云华","replay_name":"孙秋红"}]
//                     */
//
//                    private int id;
//                    private int user_id;
//                    private int pid;
//                    private int replay_user_id;
//                    private String body;
//                    private int up_times;
//                    private int lessons_id;
//                    private int type;
//                    private String deleted_at;
//                    private String created_at;
//                    private String updated_at;
//                    private String up_time_user;
//                    private String FilePath1;
//                    private String YourName;
//                    private String replay_name;
//                    private int isLike ;
//                    private List<SubCommentsBean> sub_comments;
//
//                    public int getIsLike() {
//                        return isLike;
//                    }
//
//                    public void setIsLike(int isLike) {
//                        this.isLike = isLike;
//                    }
//
//                    public int getId() {
//                        return id;
//                    }
//
//                    public void setId(int id) {
//                        this.id = id;
//                    }
//
//                    public int getUser_id() {
//                        return user_id;
//                    }
//
//                    public void setUser_id(int user_id) {
//                        this.user_id = user_id;
//                    }
//
//                    public int getPid() {
//                        return pid;
//                    }
//
//                    public void setPid(int pid) {
//                        this.pid = pid;
//                    }
//
//                    public int getReplay_user_id() {
//                        return replay_user_id;
//                    }
//
//                    public void setReplay_user_id(int replay_user_id) {
//                        this.replay_user_id = replay_user_id;
//                    }
//
//                    public String getBody() {
//                        return body;
//                    }
//
//                    public void setBody(String body) {
//                        this.body = body;
//                    }
//
//                    public int getUp_times() {
//                        return up_times;
//                    }
//
//                    public void setUp_times(int up_times) {
//                        this.up_times = up_times;
//                    }
//
//                    public int getLessons_id() {
//                        return lessons_id;
//                    }
//
//                    public void setLessons_id(int lessons_id) {
//                        this.lessons_id = lessons_id;
//                    }
//
//                    public int getType() {
//                        return type;
//                    }
//
//                    public void setType(int type) {
//                        this.type = type;
//                    }
//
//                    public String getDeleted_at() {
//                        return deleted_at;
//                    }
//
//                    public void setDeleted_at(String deleted_at) {
//                        this.deleted_at = deleted_at;
//                    }
//
//                    public String getCreated_at() {
//                        return created_at;
//                    }
//
//                    public void setCreated_at(String created_at) {
//                        this.created_at = created_at;
//                    }
//
//                    public String getUpdated_at() {
//                        return updated_at;
//                    }
//
//                    public void setUpdated_at(String updated_at) {
//                        this.updated_at = updated_at;
//                    }
//
//                    public String getUp_time_user() {
//                        return up_time_user;
//                    }
//
//                    public void setUp_time_user(String up_time_user) {
//                        this.up_time_user = up_time_user;
//                    }
//
//                    public String getFilePath1() {
//                        return FilePath1;
//                    }
//
//                    public void setFilePath1(String FilePath1) {
//                        this.FilePath1 = FilePath1;
//                    }
//
//                    public String getYourName() {
//                        return YourName;
//                    }
//
//                    public void setYourName(String YourName) {
//                        this.YourName = YourName;
//                    }
//
//                    public String getReplay_name() {
//                        return replay_name;
//                    }
//
//                    public void setReplay_name(String replay_name) {
//                        this.replay_name = replay_name;
//                    }
//
//                    public List<SubCommentsBean> getSub_comments() {
//                        return sub_comments;
//                    }
//
//                    public void setSub_comments(List<SubCommentsBean> sub_comments) {
//                        this.sub_comments = sub_comments;
//                    }
//
//                    public static class SubCommentsBean {
//                        /**
//                         * id : 5
//                         * user_id : 230
//                         * pid : 3
//                         * replay_user_id : 560
//                         * body : 用户通过 HTTP 请求传入了非预期的参数，并借助这些参数更改了数据库中你并不打算要更改的字段，这时就会出现批量赋值（Mass-Assignment）漏洞。例如，恶意用户可能会通tia.
//                         * up_times : 40930
//                         * lessons_id : 1
//                         * type : 1
//                         * deleted_at :
//                         * created_at : 2017-07-26 10:48:20
//                         * updated_at : 2017-07-26 10:48:20
//                         * up_time_user :
//                         * FilePath1 : http://test.wx.laohoulundao.com/images/default-images/default-head-img.jpg
//                         * YourName : 孙秋红
//                         * replay_name : 张亚娅
//                         */
//
//                        private int id;
//                        private int user_id;
//                        private int pid;
//                        private int replay_user_id;
//                        private String body;
//                        private int up_times;
//                        private int lessons_id;
//                        private int type;
//                        private String deleted_at;
//                        private String created_at;
//                        private String updated_at;
//                        private String up_time_user;
//                        private String FilePath1;
//                        private String YourName;
//                        private String replay_name;
//                        private int isLike;
//
//                        public int getIsLike() {
//                            return isLike;
//                        }
//
//                        public void setIsLike(int isLike) {
//                            this.isLike = isLike;
//                        }
//
//                        public int getId() {
//                            return id;
//                        }
//
//                        public void setId(int id) {
//                            this.id = id;
//                        }
//
//                        public int getUser_id() {
//                            return user_id;
//                        }
//
//                        public void setUser_id(int user_id) {
//                            this.user_id = user_id;
//                        }
//
//                        public int getPid() {
//                            return pid;
//                        }
//
//                        public void setPid(int pid) {
//                            this.pid = pid;
//                        }
//
//                        public int getReplay_user_id() {
//                            return replay_user_id;
//                        }
//
//                        public void setReplay_user_id(int replay_user_id) {
//                            this.replay_user_id = replay_user_id;
//                        }
//
//                        public String getBody() {
//                            return body;
//                        }
//
//                        public void setBody(String body) {
//                            this.body = body;
//                        }
//
//                        public int getUp_times() {
//                            return up_times;
//                        }
//
//                        public void setUp_times(int up_times) {
//                            this.up_times = up_times;
//                        }
//
//                        public int getLessons_id() {
//                            return lessons_id;
//                        }
//
//                        public void setLessons_id(int lessons_id) {
//                            this.lessons_id = lessons_id;
//                        }
//
//                        public int getType() {
//                            return type;
//                        }
//
//                        public void setType(int type) {
//                            this.type = type;
//                        }
//
//                        public String getDeleted_at() {
//                            return deleted_at;
//                        }
//
//                        public void setDeleted_at(String deleted_at) {
//                            this.deleted_at = deleted_at;
//                        }
//
//                        public String getCreated_at() {
//                            return created_at;
//                        }
//
//                        public void setCreated_at(String created_at) {
//                            this.created_at = created_at;
//                        }
//
//                        public String getUpdated_at() {
//                            return updated_at;
//                        }
//
//                        public void setUpdated_at(String updated_at) {
//                            this.updated_at = updated_at;
//                        }
//
//                        public String getUp_time_user() {
//                            return up_time_user;
//                        }
//
//                        public void setUp_time_user(String up_time_user) {
//                            this.up_time_user = up_time_user;
//                        }
//
//                        public String getFilePath1() {
//                            return FilePath1;
//                        }
//
//                        public void setFilePath1(String FilePath1) {
//                            this.FilePath1 = FilePath1;
//                        }
//
//                        public String getYourName() {
//                            return YourName;
//                        }
//
//                        public void setYourName(String YourName) {
//                            this.YourName = YourName;
//                        }
//
//                        public String getReplay_name() {
//                            return replay_name;
//                        }
//
//                        public void setReplay_name(String replay_name) {
//                            this.replay_name = replay_name;
//                        }
//                    }
//                }
            }

            public static class ShareUrlBean {
                /**
                 * title : 视频1
                 * share_img : http://lorempixel.com/640/480/?45696
                 * introduce : Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.
                 * url : http://test.wx.laohoulundao.com/web/share/index/1
                 */

                private String title;
                private String share_img;
                private String introduce;
                private String url;

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

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }

            public static class SuggestVideoBean {
                /**
                 * id : 1
                 * title : 视频1
                 * lessons_category_id : 1
                 * video_url : http://img.laohoulundao.com/video/20170719mimi.mp4
                 * video_img : http://lorempixel.com/640/480/?45696
                 */

                private int id;
                private String title;
                private int lessons_category_id;
                private String video_url;
                private String video_img;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getLessons_category_id() {
                    return lessons_category_id;
                }

                public void setLessons_category_id(int lessons_category_id) {
                    this.lessons_category_id = lessons_category_id;
                }

                public String getVideo_url() {
                    return video_url;
                }

                public void setVideo_url(String video_url) {
                    this.video_url = video_url;
                }

                public String getVideo_img() {
                    return video_img;
                }

                public void setVideo_img(String video_img) {
                    this.video_img = video_img;
                }
            }
        }
    }
}
