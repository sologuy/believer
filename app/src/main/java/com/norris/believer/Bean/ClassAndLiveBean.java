package com.norris.believer.Bean;

import java.util.List;

/**
 * Created by android on 2017/8/4.
 */

public class ClassAndLiveBean {

    /**
     * lessons_category : [{"id":1,"lessons_category_name":"Schumm","created_at":"2017-07-25 13:48:03","updated_at":"2017-07-25 13:48:03","has_many_lessons":[{"id":6,"title":"小香蕉啊啊啊","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":254,"user_id":"56","introduce":"小香蕉啊","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-20 11:40:06","video_img":"http://lorempixel.com/640/480/?45696"},{"id":10,"title":"视频10","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":144,"user_id":"822","introduce":"Nisi molestias sint sit provident deleniti vel exercitationem. Velit aut numquam nihil temporibus omnis accusantium quia.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-20 11:39:25","video_img":"http://lorempixel.com/640/480/?45696"},{"id":16,"title":"视频16","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":38,"user_id":"老师啊","introduce":"Est laboriosam incidunt magnam itaque deleniti quia aut. Reiciendis cumque eligendi impedit quod sed magni. Dolorum necessitatibus consequatur rerum quod qui. Eum omnis eos molestias repellat et non.","deleted_at":null,"created_at":"2017-07-25 13:50:07","updated_at":"2017-09-19 20:24:59","video_img":"http://lorempixel.com/640/480/?45696"},{"id":17,"title":"视频17","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":108,"user_id":"113","introduce":"Sequi aspernatur voluptatem consectetur totam laborum sit. Commodi iure voluptatem quasi ab error quo. Alias enim tempora explicabo alias quam aut quisquam sint. Illum nobis nam eveniet.","deleted_at":null,"created_at":"2017-07-25 13:50:07","updated_at":"2017-09-20 11:38:02","video_img":"http://lorempixel.com/640/480/?45696"}]},{"id":2,"lessons_category_name":"McGlynn","created_at":"2017-07-25 13:48:03","updated_at":"2017-07-25 13:48:03","has_many_lessons":[{"id":7,"title":"视频7","lessons_category_id":2,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":64,"user_id":"294","introduce":" Nostrum et expedita consequatur nam sed odio. A enim officia ut quaerat et neque. Quia rerum consequatur est voluptate inventore enim sint qui.\r\n                \r\n                \r\n                \r\n                ","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-19 19:58:08","video_img":"http://lorempixel.com/640/480/?51191"},{"id":8,"title":"视频8","lessons_category_id":2,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":54,"user_id":"596","introduce":"Velit ratione necessitatibus alias omnis quibusdam. Excepturi similique aut aliquam hic alias ipsa alias. Animi incidunt officiis eum. Sit qui eius quasi omnis repudiandae itaque.\r\n                \r\n                ","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-19 20:24:50","video_img":"http://lorempixel.com/640/480/?17198"},{"id":11,"title":"视频11","lessons_category_id":2,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":41,"user_id":"596","introduce":"Reiciendis vol","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-19 11:21:28","video_img":"http://lorempixel.com/640/480/?45696"},{"id":12,"title":"视频12","lessons_category_id":2,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":74,"user_id":"379","introduce":"Nulla culpa qui eveniet voluptatem eum. Nisi quam accusantium harum dolore porro et quia. Est eum sed molestiae pariatur. Sint sit deserunt excepturi vitae.","deleted_at":" ","created_at":"2017-07-25 13:50:06","updated_at":"2017-09-18 17:28:49","video_img":"http://lorempixel.com/640/480/?51191"}]}]
     * default_img : http://lorempixel.com/640/480/?93617
     */

    private String default_img;
    private List<LessonsCategoryBean> lessons_category;

    public String getDefault_img() {
        return default_img;
    }

    public void setDefault_img(String default_img) {
        this.default_img = default_img;
    }

    public List<LessonsCategoryBean> getLessons_category() {
        return lessons_category;
    }

    public void setLessons_category(List<LessonsCategoryBean> lessons_category) {
        this.lessons_category = lessons_category;
    }

    public static class LessonsCategoryBean {
        /**
         * id : 1
         * lessons_category_name : Schumm
         * created_at : 2017-07-25 13:48:03
         * updated_at : 2017-07-25 13:48:03
         * has_many_lessons : [{"id":6,"title":"小香蕉啊啊啊","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":254,"user_id":"56","introduce":"小香蕉啊","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-20 11:40:06","video_img":"http://lorempixel.com/640/480/?45696"},{"id":10,"title":"视频10","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":144,"user_id":"822","introduce":"Nisi molestias sint sit provident deleniti vel exercitationem. Velit aut numquam nihil temporibus omnis accusantium quia.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-09-20 11:39:25","video_img":"http://lorempixel.com/640/480/?45696"},{"id":16,"title":"视频16","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":38,"user_id":"老师啊","introduce":"Est laboriosam incidunt magnam itaque deleniti quia aut. Reiciendis cumque eligendi impedit quod sed magni. Dolorum necessitatibus consequatur rerum quod qui. Eum omnis eos molestias repellat et non.","deleted_at":null,"created_at":"2017-07-25 13:50:07","updated_at":"2017-09-19 20:24:59","video_img":"http://lorempixel.com/640/480/?45696"},{"id":17,"title":"视频17","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":108,"user_id":"113","introduce":"Sequi aspernatur voluptatem consectetur totam laborum sit. Commodi iure voluptatem quasi ab error quo. Alias enim tempora explicabo alias quam aut quisquam sint. Illum nobis nam eveniet.","deleted_at":null,"created_at":"2017-07-25 13:50:07","updated_at":"2017-09-20 11:38:02","video_img":"http://lorempixel.com/640/480/?45696"}]
         */

        private int id;
        private String lessons_category_name;
        private String created_at;
        private String updated_at;
        private List<HasManyLessonsBean> has_many_lessons;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLessons_category_name() {
            return lessons_category_name;
        }

        public void setLessons_category_name(String lessons_category_name) {
            this.lessons_category_name = lessons_category_name;
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

        public List<HasManyLessonsBean> getHas_many_lessons() {
            return has_many_lessons;
        }

        public void setHas_many_lessons(List<HasManyLessonsBean> has_many_lessons) {
            this.has_many_lessons = has_many_lessons;
        }

        public static class HasManyLessonsBean {
            /**
             * id : 6
             * title : 小香蕉啊啊啊
             * lessons_category_id : 1
             * video_url : http://img.laohoulundao.com/video/20170719mimi.mp4
             * looking_times : 254
             * user_id : 56
             * introduce : 小香蕉啊
             * deleted_at : null
             * created_at : 2017-07-25 13:50:06
             * updated_at : 2017-09-20 11:40:06
             * video_img : http://lorempixel.com/640/480/?45696
             */

            private int id;
            private String title;
            private int lessons_category_id;
            private String video_url;
            private int looking_times;
            private String user_id;
            private String introduce;
            private Object deleted_at;
            private String created_at;
            private String updated_at;
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

            public int getLooking_times() {
                return looking_times;
            }

            public void setLooking_times(int looking_times) {
                this.looking_times = looking_times;
            }

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
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

            public String getVideo_img() {
                return video_img;
            }

            public void setVideo_img(String video_img) {
                this.video_img = video_img;
            }
        }
    }
}
