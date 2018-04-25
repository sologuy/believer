package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/8/3.
 */

public class CloHomeBean {

    /**
     * code : 200
     * message : 成功
     * data : {"lessonsCenterData":{"notice":[{"id":7,"type":2,"notice_id":6,"title":"你离宋仲基只有1米","notice_img":"http://lorempixel.com/640/480/?51191","created_at":"2017-08-01 19:45:30","updated_at":"2017-08-01 19:45:33","deleted_at":null}],"article":[{"id":1,"category_name":"Schmidt","deleted_at":null,"created_at":"2017-07-27 14:01:44","updated_at":"2017-07-27 14:01:44","has_many_article":[{"id":1,"lessons_category_id":1,"title":"Et inventore possimus omnis. Laudantium ab quos sunt cumque ipsum qui. Et tempore ea numquam pariatur voluptas. Nisi qui in voluptas.","article_img":"http://lorempixel.com/640/480/?33468","looking_times":33,"comment_times":30,"up_times":0,"auther":"Estelle","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":2,"lessons_category_id":1,"title":"Sed eius aspernatur qui odit deserunt quod. Sit sit repudiandae maiores velit et nobis possimus. Eos non omnis nisi.","article_img":"http://lorempixel.com/640/480/?96071","looking_times":103,"comment_times":23,"up_times":0,"auther":"Assunta","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":4,"lessons_category_id":1,"title":"Voluptatem totam voluptas impedit labore accusamus quia sapiente. Non sunt minima quas quis rem pariatur ut. Ut et aut ab doloribus vel.","article_img":"http://lorempixel.com/640/480/?45278","looking_times":38,"comment_times":1,"up_times":88,"auther":"Zachary","category_name":"Schmidt","created_at":"2017-07-27 14:10:06"}]},{"id":2,"category_name":"Jacobson","deleted_at":null,"created_at":"2017-07-27 14:01:44","updated_at":"2017-07-27 14:01:44","has_many_article":[{"id":3,"lessons_category_id":2,"title":"Dignissimos id earum sunt ut dolorem sed. Nisi modi omnis explicabo aut qui possimus aliquid. Velit voluptatem dicta omnis accusantium sit officiis qui.","article_img":"http://lorempixel.com/640/480/?72231","looking_times":60,"comment_times":34,"up_times":0,"auther":"Randal","category_name":"Jacobson","created_at":"2017-07-27 14:10:05"},{"id":5,"lessons_category_id":2,"title":"Vero assumenda et ipsa incidunt delectus illo exercitationem culpa. Quia voluptatum est aliquam velit in. Doloribus asperiores sunt porro asperiores dolorem doloremque quos.","article_img":"http://lorempixel.com/640/480/?85001","looking_times":47,"comment_times":59,"up_times":88,"auther":"Vergie","category_name":"Jacobson","created_at":"2017-07-27 14:10:06"}]}]}}
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
         * lessonsCenterData : {"notice":[{"id":7,"type":2,"notice_id":6,"title":"你离宋仲基只有1米","notice_img":"http://lorempixel.com/640/480/?51191","created_at":"2017-08-01 19:45:30","updated_at":"2017-08-01 19:45:33","deleted_at":null}],"article":[{"id":1,"category_name":"Schmidt","deleted_at":null,"created_at":"2017-07-27 14:01:44","updated_at":"2017-07-27 14:01:44","has_many_article":[{"id":1,"lessons_category_id":1,"title":"Et inventore possimus omnis. Laudantium ab quos sunt cumque ipsum qui. Et tempore ea numquam pariatur voluptas. Nisi qui in voluptas.","article_img":"http://lorempixel.com/640/480/?33468","looking_times":33,"comment_times":30,"up_times":0,"auther":"Estelle","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":2,"lessons_category_id":1,"title":"Sed eius aspernatur qui odit deserunt quod. Sit sit repudiandae maiores velit et nobis possimus. Eos non omnis nisi.","article_img":"http://lorempixel.com/640/480/?96071","looking_times":103,"comment_times":23,"up_times":0,"auther":"Assunta","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":4,"lessons_category_id":1,"title":"Voluptatem totam voluptas impedit labore accusamus quia sapiente. Non sunt minima quas quis rem pariatur ut. Ut et aut ab doloribus vel.","article_img":"http://lorempixel.com/640/480/?45278","looking_times":38,"comment_times":1,"up_times":88,"auther":"Zachary","category_name":"Schmidt","created_at":"2017-07-27 14:10:06"}]},{"id":2,"category_name":"Jacobson","deleted_at":null,"created_at":"2017-07-27 14:01:44","updated_at":"2017-07-27 14:01:44","has_many_article":[{"id":3,"lessons_category_id":2,"title":"Dignissimos id earum sunt ut dolorem sed. Nisi modi omnis explicabo aut qui possimus aliquid. Velit voluptatem dicta omnis accusantium sit officiis qui.","article_img":"http://lorempixel.com/640/480/?72231","looking_times":60,"comment_times":34,"up_times":0,"auther":"Randal","category_name":"Jacobson","created_at":"2017-07-27 14:10:05"},{"id":5,"lessons_category_id":2,"title":"Vero assumenda et ipsa incidunt delectus illo exercitationem culpa. Quia voluptatum est aliquam velit in. Doloribus asperiores sunt porro asperiores dolorem doloremque quos.","article_img":"http://lorempixel.com/640/480/?85001","looking_times":47,"comment_times":59,"up_times":88,"auther":"Vergie","category_name":"Jacobson","created_at":"2017-07-27 14:10:06"}]}]}
         */

        private LessonsCenterDataBean lessonsCenterData;

        public LessonsCenterDataBean getLessonsCenterData() {
            return lessonsCenterData;
        }

        public void setLessonsCenterData(LessonsCenterDataBean lessonsCenterData) {
            this.lessonsCenterData = lessonsCenterData;
        }

        public static class LessonsCenterDataBean {
            private List<NoticeBean> notice;
            private List<ArticleBean> article;

            public List<NoticeBean> getNotice() {
                return notice;
            }

            public void setNotice(List<NoticeBean> notice) {
                this.notice = notice;
            }

            public List<ArticleBean> getArticle() {
                return article;
            }

            public void setArticle(List<ArticleBean> article) {
                this.article = article;
            }

            public static class NoticeBean {
                /**
                 * id : 7
                 * type : 2
                 * notice_id : 6
                 * title : 你离宋仲基只有1米
                 * notice_img : http://lorempixel.com/640/480/?51191
                 * created_at : 2017-08-01 19:45:30
                 * updated_at : 2017-08-01 19:45:33
                 * deleted_at : null
                 */

                private int id;
                private int type;
                private int notice_id;
                private String title;
                private String notice_img;
                private String created_at;
                private String updated_at;
                private Object deleted_at;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getNotice_id() {
                    return notice_id;
                }

                public void setNotice_id(int notice_id) {
                    this.notice_id = notice_id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getNotice_img() {
                    return notice_img;
                }

                public void setNotice_img(String notice_img) {
                    this.notice_img = notice_img;
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

                public Object getDeleted_at() {
                    return deleted_at;
                }

                public void setDeleted_at(Object deleted_at) {
                    this.deleted_at = deleted_at;
                }
            }

            public static class ArticleBean {
                /**
                 * id : 1
                 * category_name : Schmidt
                 * deleted_at : null
                 * created_at : 2017-07-27 14:01:44
                 * updated_at : 2017-07-27 14:01:44
                 * has_many_article : [{"id":1,"lessons_category_id":1,"title":"Et inventore possimus omnis. Laudantium ab quos sunt cumque ipsum qui. Et tempore ea numquam pariatur voluptas. Nisi qui in voluptas.","article_img":"http://lorempixel.com/640/480/?33468","looking_times":33,"comment_times":30,"up_times":0,"auther":"Estelle","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":2,"lessons_category_id":1,"title":"Sed eius aspernatur qui odit deserunt quod. Sit sit repudiandae maiores velit et nobis possimus. Eos non omnis nisi.","article_img":"http://lorempixel.com/640/480/?96071","looking_times":103,"comment_times":23,"up_times":0,"auther":"Assunta","category_name":"Schmidt","created_at":"2017-07-27 14:10:05"},{"id":4,"lessons_category_id":1,"title":"Voluptatem totam voluptas impedit labore accusamus quia sapiente. Non sunt minima quas quis rem pariatur ut. Ut et aut ab doloribus vel.","article_img":"http://lorempixel.com/640/480/?45278","looking_times":38,"comment_times":1,"up_times":88,"auther":"Zachary","category_name":"Schmidt","created_at":"2017-07-27 14:10:06"}]
                 */

                private int id;
                private String category_name;
                private Object deleted_at;
                private String created_at;
                private String updated_at;
                private List<HasManyArticleBean> has_many_article;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(String category_name) {
                    this.category_name = category_name;
                }

                public Object getDeleted_at() {
                    return deleted_at;
                }

                public void setDeleted_at(Object deleted_at) {
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

                public List<HasManyArticleBean> getHas_many_article() {
                    return has_many_article;
                }

                public void setHas_many_article(List<HasManyArticleBean> has_many_article) {
                    this.has_many_article = has_many_article;
                }

                public static class HasManyArticleBean {
                    /**
                     * id : 1
                     * lessons_category_id : 1
                     * title : Et inventore possimus omnis. Laudantium ab quos sunt cumque ipsum qui. Et tempore ea numquam pariatur voluptas. Nisi qui in voluptas.
                     * article_img : http://lorempixel.com/640/480/?33468
                     * looking_times : 33
                     * comment_times : 30
                     * up_times : 0
                     * auther : Estelle
                     * category_name : Schmidt
                     * created_at : 2017-07-27 14:10:05
                     */

                    private int id;
                    private int lessons_category_id;
                    private String title;
                    private String article_img;
                    private int looking_times;
                    private int comment_times;
                    private int up_times;
                    private String auther;
                    private String category_name;
                    private String created_at;
                    private String contentLink;

                    public String getContentLink() {
                        return contentLink;
                    }

                    public void setContentLink(String contentLink) {
                        this.contentLink = contentLink;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getLessons_category_id() {
                        return lessons_category_id;
                    }

                    public void setLessons_category_id(int lessons_category_id) {
                        this.lessons_category_id = lessons_category_id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getArticle_img() {
                        return article_img;
                    }

                    public void setArticle_img(String article_img) {
                        this.article_img = article_img;
                    }

                    public int getLooking_times() {
                        return looking_times;
                    }

                    public void setLooking_times(int looking_times) {
                        this.looking_times = looking_times;
                    }

                    public int getComment_times() {
                        return comment_times;
                    }

                    public void setComment_times(int comment_times) {
                        this.comment_times = comment_times;
                    }

                    public int getUp_times() {
                        return up_times;
                    }

                    public void setUp_times(int up_times) {
                        this.up_times = up_times;
                    }

                    public String getAuther() {
                        return auther;
                    }

                    public void setAuther(String auther) {
                        this.auther = auther;
                    }

                    public String getCategory_name() {
                        return category_name;
                    }

                    public void setCategory_name(String category_name) {
                        this.category_name = category_name;
                    }

                    public String getCreated_at() {
                        return created_at;
                    }

                    public void setCreated_at(String created_at) {
                        this.created_at = created_at;
                    }
                }
            }
        }
    }
}
