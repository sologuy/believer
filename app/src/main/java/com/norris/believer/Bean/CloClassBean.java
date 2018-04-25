package com.norris.believer.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by android on 2017/7/18.
 */

public class CloClassBean implements Serializable {


    /**
     * code : 200
     * message : 获取信息成功
     * data : {"lessons_all":{"total":12,"per_page":2,"current_page":1,"last_page":6,"next_page_url":"http://test.wx.laohoulundao.com/api/v2/lessons/1?page=2","prev_page_url":null,"from":1,"to":2,"data":[{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":302,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-04 16:28:13","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":108,"user_id":39,"introduce":"Ducimus maiores laboriosam quia accusamus. Et natus voluptatem in ipsum. Ullam quibusdam laborum dolorem tenetur qui tempora. Illum nobis magnam repellendus voluptatem ut voluptatem ut.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-03 17:59:54","video_img":"http://lorempixel.com/640/480/?45696"}]}}
     */

    private int code;
    private String message;
    private DataBeanX data;

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

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * lessons_all : {"total":12,"per_page":2,"current_page":1,"last_page":6,"next_page_url":"http://test.wx.laohoulundao.com/api/v2/lessons/1?page=2","prev_page_url":null,"from":1,"to":2,"data":[{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":302,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-04 16:28:13","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":108,"user_id":39,"introduce":"Ducimus maiores laboriosam quia accusamus. Et natus voluptatem in ipsum. Ullam quibusdam laborum dolorem tenetur qui tempora. Illum nobis magnam repellendus voluptatem ut voluptatem ut.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-03 17:59:54","video_img":"http://lorempixel.com/640/480/?45696"}]}
         */

        private LessonsAllBean lessons_all;

        public LessonsAllBean getLessons_all() {
            return lessons_all;
        }

        public void setLessons_all(LessonsAllBean lessons_all) {
            this.lessons_all = lessons_all;
        }

        public static class LessonsAllBean {
            /**
             * total : 12
             * per_page : 2
             * current_page : 1
             * last_page : 6
             * next_page_url : http://test.wx.laohoulundao.com/api/v2/lessons/1?page=2
             * prev_page_url : null
             * from : 1
             * to : 2
             * data : [{"id":1,"title":"视频1","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":302,"user_id":179,"introduce":"Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-04 16:28:13","video_img":"http://lorempixel.com/640/480/?45696"},{"id":2,"title":"视频2","lessons_category_id":1,"video_url":"http://img.laohoulundao.com/video/20170719mimi.mp4","looking_times":108,"user_id":39,"introduce":"Ducimus maiores laboriosam quia accusamus. Et natus voluptatem in ipsum. Ullam quibusdam laborum dolorem tenetur qui tempora. Illum nobis magnam repellendus voluptatem ut voluptatem ut.","deleted_at":null,"created_at":"2017-07-25 13:50:06","updated_at":"2017-08-03 17:59:54","video_img":"http://lorempixel.com/640/480/?45696"}]
             */

            private int total;
            private int per_page;
            private int current_page;
            private int last_page;
            private String next_page_url;
            private Object prev_page_url;
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

            public Object getPrev_page_url() {
                return prev_page_url;
            }

            public void setPrev_page_url(Object prev_page_url) {
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
                 * id : 1
                 * title : 视频1
                 * lessons_category_id : 1
                 * video_url : http://img.laohoulundao.com/video/20170719mimi.mp4
                 * looking_times : 302
                 * user_id : 179
                 * introduce : Autem expedita quidem aspernatur minus ex odio. Delectus ipsam nihil quis quo nesciunt sint. Eaque facilis quasi accusamus est et sunt.
                 * deleted_at : null
                 * created_at : 2017-07-25 13:50:06
                 * updated_at : 2017-08-04 16:28:13
                 * video_img : http://lorempixel.com/640/480/?45696
                 */

                private int id;
                private String title;
                private int lessons_category_id;
                private String video_url;
                private int looking_times;
                private int user_id;
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
}
