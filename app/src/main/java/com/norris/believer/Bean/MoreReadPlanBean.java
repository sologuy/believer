package com.norris.believer.Bean;

/**
 * Created by android on 2017/6/7.
 */

public class MoreReadPlanBean {

    /**
     * code : 200
     * message : ok
     * pagelist : {"per_page":1,"current_page":1,"next_page_url":"http://test1.wx.laohoulundao.com/api/v2/modifysumuppage?page=2","prev_page_url":null,"from":1,"to":1,"data":[{"SumUpID":3894,"BookID":46,"MemNumber":"2017042701956667076","BookReview1":"v聊聊我哈哈哈哈哈哈哈！绝对不是普通","BookReview2":"就读的名校毕业的大学生助学贷款利率市场化进程","BookReview3":"绝对服从和谐号","BookReview4":"就业有限公司的产品都可以做很多自己","AddDate":"2017-06-06 19:54:39","YourName":"樵夫","FilePath1":"http://test.wx.laohoulundao.com/uploads/memface/20170518/2017042701956667076090310.png","zan":[{"YourName":"李昞辰","money":1}],"commentlist":[{"CommContents":"good","YourName":"樵夫"},{"CommContents":"捉襟见肘","YourName":"樵夫"}]}]}
     */

    private String code;
    private String message;
    private ReadPartyDetailBean.DataBeanX.ReadPlanListBean readPlanList;

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

    public ReadPartyDetailBean.DataBeanX.ReadPlanListBean getReadPlanList() {
        return readPlanList;
    }

    public void setReadPlanList(ReadPartyDetailBean.DataBeanX.ReadPlanListBean readPlanList) {
        this.readPlanList = readPlanList;
    }
}
