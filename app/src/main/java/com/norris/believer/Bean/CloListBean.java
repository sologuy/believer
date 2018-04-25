package com.norris.believer.Bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by android on 2017/8/4.
 */

public class CloListBean implements Serializable {

    /**
     * code : 200
     * message : 成功
     * data : {"clo_member_info":[{"clo_id":1,"user_id":214,"flower":444,"introduce":"Molestiae assumenda aut impedit rerum.","title":"Suscipit impedit eos aliquam aut. Ut possimus iste nulla dignissimos. Ab est mollitia omnis incidunt harum vel quasi.","user_img":"http://lorempixel.com/640/480/?27073","name":"吴文女","flower_status":0,"role":"普通会员"},{"clo_id":2,"user_id":563,"flower":152,"introduce":"Autem sunt maiores sed quisquam.","title":"Et autem impedit odit qui. Autem suscipit id est dicta illo reiciendis vel sed. Qui qui repudiandae aut architecto deleniti. Est earum qui vel eum.","user_img":"http://lorempixel.com/640/480/?98043","name":"陈敏","flower_status":0,"role":"普通会员"},{"clo_id":3,"user_id":82,"flower":398,"introduce":"In modi dolor natus ipsum.","title":"Harum rerum repellendus quos. Aut minus ratione ut aliquam eius.","user_img":"http://lorempixel.com/640/480/?52011","name":"张志敏","flower_status":0,"role":"普通会员"},{"clo_id":4,"user_id":51,"flower":627,"introduce":"Eius et quas explicabo sint.","title":"Sit nisi quia nihil dolorem. Veritatis alias et placeat sed ullam magni. Aspernatur eum sed qui totam consequatur eveniet tempore nisi. Beatae a a voluptatum et dolor sequi.","user_img":"http://lorempixel.com/640/480/?52930","name":"郭雪峰","flower_status":0},{"clo_id":5,"user_id":62,"flower":958,"introduce":"Et vero est est ab.","title":"Molestiae explicabo numquam saepe. Necessitatibus et vel quam provident. Qui qui omnis magnam est et.","user_img":"http://lorempixel.com/640/480/?94568","name":"费德苏","flower_status":0,"role":"普通会员"},{"clo_id":6,"user_id":554,"flower":500,"introduce":"Inventore laudantium doloremque dignissimos voluptatem.","title":"Molestiae libero quae blanditiis alias delectus. Et rerum nihil sit eum. Minus aut rerum in accusamus culpa.","user_img":"http://lorempixel.com/640/480/?52251","name":"唐韬","flower_status":0,"role":"普通会员"},{"clo_id":7,"user_id":813,"flower":982,"introduce":"Et ratione delectus consequatur laboriosam omnis ut repellat quos.","title":"Nihil doloremque est accusantium. Ex provident consequatur quam ea. Nobis debitis voluptatem ad amet. Ipsam quod dolorem minus sit voluptate fugit consequatur.","user_img":"http://lorempixel.com/640/480/?27509","name":"马慧瑾","flower_status":0,"role":"普通会员"},{"clo_id":8,"user_id":405,"flower":574,"introduce":"Est quisquam qui id distinctio fugit.","title":"Eveniet in autem ut fugiat quia quidem. Unde quam molestiae ea voluptas laboriosam. Consequatur omnis dolorem veniam sed deserunt. Eum facilis qui nobis recusandae vel ut illum.","user_img":"http://lorempixel.com/640/480/?87611","name":"林煌","flower_status":0,"role":"普通会员"},{"clo_id":9,"user_id":499,"flower":110,"introduce":"Omnis eaque consequatur accusamus.","title":"Aliquid velit nihil libero vitae beatae. Distinctio voluptatum voluptas qui eaque. Aliquid est totam sit quidem accusamus eligendi non. Aspernatur incidunt quam fugit natus dignissimos.","user_img":"http://lorempixel.com/640/480/?25373","name":null,"flower_status":0,"role":"普通会员"},{"clo_id":10,"user_id":280,"flower":781,"introduce":"Est minus nulla voluptas velit aut rerum eligendi.","title":"Inventore eaque quisquam aliquid occaecati. Voluptate quia delectus et sapiente et rem. Earum veritatis veritatis magnam quia delectus.","user_img":"http://lorempixel.com/640/480/?67293","name":"张晓栋","flower_status":0,"role":"学习官"}]}
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

    public static class DataBean implements Serializable {
        private List<CloMemberInfoBean> clo_member_info;

        public List<CloMemberInfoBean> getClo_member_info() {
            return clo_member_info;
        }

        public void setClo_member_info(List<CloMemberInfoBean> clo_member_info) {
            this.clo_member_info = clo_member_info;
        }

        public static class CloMemberInfoBean implements Serializable {
            /**
             * clo_id : 1
             * user_id : 214
             * flower : 444
             * introduce : Molestiae assumenda aut impedit rerum.
             * title : Suscipit impedit eos aliquam aut. Ut possimus iste nulla dignissimos. Ab est mollitia omnis incidunt harum vel quasi.
             * user_img : http://lorempixel.com/640/480/?27073
             * name : 吴文女
             * flower_status : 0
             * role : 普通会员
             */

            private int clo_id;
            private int user_id;
            private int flower;
            private String introduce;
            private String title;
            private String user_img;
            private String name;
            private int flower_status;
            private String role;

            public int getClo_id() {
                return clo_id;
            }

            public void setClo_id(int clo_id) {
                this.clo_id = clo_id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getFlower() {
                return flower;
            }

            public void setFlower(int flower) {
                this.flower = flower;
            }

            public String getIntroduce() {
                return introduce;
            }

            public void setIntroduce(String introduce) {
                this.introduce = introduce;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUser_img() {
                return user_img;
            }

            public void setUser_img(String user_img) {
                this.user_img = user_img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getFlower_status() {
                return flower_status;
            }

            public void setFlower_status(int flower_status) {
                this.flower_status = flower_status;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }
        }
    }
}
