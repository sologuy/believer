package com.norris.believer.Constant;

public class ApiConstant {


//    public final static String DomainWebUrl = "http://wx.laohoulundao.com/";
        public final static String DomainWebUrl = "http://test.wx.laohoulundao.com/";



    //检查更新的url
    public final static String checkUpdateUrl = DomainWebUrl + "system/version/current_version";
    public final static String DomainUrl = DomainWebUrl + "api/v4/";


    // 首页
//    public final static String Api_Home_Frag = DomainUrl + "homelist";
    public final static String Api_Home_Frag = DomainUrl + "homelist";


    // 所有书籍接口
    public final static String Api_Booklist = DomainUrl + "booklist";

    // 书籍详细接口
    public final static String Api_BookDetail = DomainUrl + "bookdetail";

    // 读书改进计划接口
    public final static String Api_BookProject = DomainUrl + "bookproject";

    // 读书会首页接口
//    public final static String Api_ReadParty_Frag = DomainUrl + "read_party_index";
    public final static String Api_ReadParty_Frag = DomainUrl + "readPartyIndex";
//    public final static String Api_ReadParty_Frag = DomainUrl + "modifyhomegroup";

    // 创建读书会-企业
    public final static String Api_Create_Party_Company = DomainUrl + "add_company_read_party";

    // 创建读书会-个人
//    public final static String Api_Create_Party_Personal = DomainUrl + "modifyindividual";
    public final static String Api_Create_Party_Personal = DomainUrl + "add_personal_read_party";

    // 个人信息详情
    public final static String Api_Member_Detail = DomainUrl + "memberdetail";

    // 查看读书会详情页接口
//    public final static String Api_Read_Party_Detail = DomainUrl + "read_party_detail_v3";//老接口
    // 查看读书会接口
    public final static String Api_Read_Party_Detail = DomainUrl + "getImproveData";//新接口

    //上传读书会头像
    public final static String Api_Upload_Party_Head = DomainUrl + "upgroupface";
    // 书籍收藏接口
    public final static String Api_BookCollect = DomainUrl + "bookcollect";

    //读取读书会所有成员
    public final static String Api_Read_Party_Members = DomainUrl + "getAllPartyMember";
    //    public final static String Api_Read_Party_Members = DomainUrl + "modifygroupmemberAll";
    // 头像上传
    public final static String Api_Member_FaceUpload = DomainUrl + "memimg";

    //检查通讯录的成员信息
    public final static String Api_Member_Contacts = DomainUrl + "mobilelist";
    //添加成员到读书会
    public final static String Api_Member_Contact_Add = DomainUrl + "add_read_party_member";


    // 学习官详细接口
    public final static String Api_MemberPartnerDetail = DomainUrl + "partnerdetail";
    // 分享海报模板接口
    public final static String Api_MemberPosterTemplate = DomainUrl + "defaulttemp";
    // 我推荐的好友接口
    public final static String Api_MemberFriendList = DomainUrl + "friendlist";

    // 合伙人佣金等详细接口
    public final static String Api_MemberCommissionList = DomainUrl + "commissionlist";
    // 读书改进计划接口
    public final static String Api_MemberSUMUP = DomainUrl + "membersumup";

    // 添加意见反馈接口
    public final static String Api_Feedback = DomainUrl + "addmessage";
    // 收藏记录接口
    public final static String Api_My_Collections = DomainUrl + "membercollect";

    // 删除收藏接口
    public final static String Api_Del_Collection = DomainUrl + "memdelcollect";
    // 修改用户信息
    public final static String Api_UserInfo_Update = DomainUrl + "memupdate";

    //对会员进行批量打赏
    public final static String Api_Reward_Bulk = DomainUrl + "multiReward";

    //对会员学习币进行批量清空
    public final static String Api_Reward_Clear = DomainUrl + "resetmoney";
    // 学习币
    public final static String Api_Read_Party_Coin = DomainWebUrl + "membermoneylog/%s-%s-%s.html";

    //d对单个读书改进计划进行打赏
    public final static String Api_Improve_Plan_Reward = DomainUrl + "reward";
    //    public final static String Api_Improve_Plan_Reward = DomainUrl + "singlesan";
    // 添加对改进计划的评论
    public final static String Api_Read_Plan_Comment = DomainUrl + "addComment";
    //    public final static String Api_Read_Plan_Comment = DomainUrl + "addreply";
    // 下一页读书改进计划
    public final static String Api_Read_Plan_Next_Page = DomainUrl + "readPlanListPaginate";
    //    public final static String Api_Read_Plan_Next_Page = DomainUrl + "modifysumuppage";
    // 获取某一条读书改进计划
    public final static String Api_Read_Plan_One = DomainUrl + "getReadPlanInfo";
    //    public final static String Api_Read_Plan_One = DomainUrl + "get_read_plan_info";
    // 获取赠送礼物情况
    public final static String Api_Read_Plan_Gift = DomainUrl + "modifygift";

    // 退出读书会
    public final static String Api_Member_Quit_Group = DomainUrl + "quitgroup";
    // 修改读书会信息
    public final static String Api_Update_PartyInfo = DomainUrl + "update_read_party_info";
    // 修改公司架构
    public final static String Api_Company_Orgization = DomainUrl + "get_company_orgization";

    //获取公司部门
    public final static String Api_Company_Departs = DomainUrl + "get_department";
    // 添加公司部门
    public final static String Api_Company_Department_Add = DomainUrl + "add_department";
    // 请求某个会员详情
    public final static String Api_Company_Member_Info = DomainUrl + "getReadPartyMemberInfo";
    //    public final static String Api_Company_Member_Info = DomainUrl + "read_party_member_detail";
    // 修改某个会员详情
    public final static String Api_Company_Member_Info_Modify = DomainUrl + "updateReadPartMember";
//    public final static String Api_Company_Member_Info_Modify = DomainUrl + "update_read_party_member";

    // 加载会员服务协议
    public final static String Api_Member_Contract = DomainWebUrl + "login-rule";

    //微信登录
    public final static String Api_Reg_Log_Wechat = DomainUrl + "login-v3";
    // 发送短信
    public final static String Api_AddMobcode = DomainUrl + "addmobcode";
    // 手机号码注册
    public final static String Api_Reg_By_Phone = DomainUrl + "register-mobile-v3";
    // 修改用户个人信息
    public final static String Api_Update_User_Info = DomainUrl + "update_member_info";

    // 首页推荐热点点进去之后的webview
    public final static String Api_DefaultResumeHot = "http://wx.laohoulundao.com/hotdetail/%s.html";

    //去评论
    public final static String Api_Hot_Point_Send_Comment = DomainUrl + "setComment";
    //点赞和取消点赞
    public final static String Api_Hot_Point_Send_Like = DomainUrl + "setGood";
    //收藏和取消收藏
    public final static String Api_Hot_Point_Send_Collect = DomainUrl + "setFavorite";
    //获取推荐热点的评论
    public final static String Api_Hot_Sugg_GEt = DomainUrl + "get_video_or_article_comment_share_info";
    //获取消息中心的消息
    public final static String Api_Notify_Message = DomainUrl + "message/get_user_message";
    //记录音频播放的次数
    public final static String Api_Audio_Play_Times = DomainUrl + "audio/record_view_times";
    //下载ppt
    public final static String Api_Video_Download_Ppt = DomainUrl + "sendBookPpt";
    //检查引导页面更新情况
//    public final static String Api_Introduction_Get = DomainUrl + "home/showImages";
//    public final static String Api_Introduction_Get = DomainUrl + "home/showImages";
    //检查所有国家和地区
    public final static String Api_Country_Get = DomainUrl + "get_countries";
    //未登录状态下的背景图片加载
    public final static String Api_Clo_Not_Log_Bg = "http://test.wx.laohoulundao.com/images/other/login-bg.jpg";

    //学习官中心的新接口
    public final static String Api_Clo_Center = DomainUrl + "study/info";
    //所有学习官的信息
    public final static String Api_Clo_List = DomainUrl + "clo/index";
    //给某个学习官送花
    public final static String Api_Clo_Like = DomainUrl + "change/flower";
    //学习官课堂和直播四个视频数据
    public final static String Api_Clo_Classes_Lives = DomainUrl + "lessons/video/info";
    //学习官课堂所有视频列表(包括学习官必修可 和直播回顾)
    public final static String Api_Clo_Classes = DomainUrl + "lessons";
    //学习官中心学习观课堂所有视频
    public final static String Api_Clo_Things_List = DomainUrl + "CategoryIdArticle";
    //    学习官中心学习官那点事的url前部
//    public final static String Api_Clo_Things_Detail = DomainUrl+"lessons/matter/";
    //学习官中心学习官那点事评论
    public final static String Api_Clo_Things_Comments = DomainUrl + "lessonsDetail";
    //学习官中心学习官那点事文章点赞
    public final static String Api_Clo_Things_Like = DomainUrl + "change/article";
    //学习官中心学习官那点事评论
    public final static String Api_Clo_Things_Comment = DomainUrl + "change/addComments";
    //学习官中心学习官那点事评论点赞
    public final static String Api_Clo_Things_Comment_Like = DomainUrl + "change/up_times";
    //删除学习官那点事文章评论
    public final static String Api_Clo_Things_Comment_Del = DomainUrl + "deleteComment";
    //获取某一个视频的详细信息
    public final static String Api_Clo_Video_Detail = DomainUrl + "lesson";
    //删除读书会的评论或者回复
    public final static String Api_Read_Plan_Comment_Del = DomainUrl + "delComment";
    //对个人读书会的读书改进计划点赞
    public final static String Api_Read_Plan_Comment_Like = DomainUrl + "isLikeBookSumup";
    //推过去用户的手机系统和app版本号之类的
    public final static String Api_Post_Device_Info = DomainUrl + "useDeviceInfo";
    //删除读书会成员到
    public final static String Api_Member_Contact_Del = DomainUrl + "delMemberUser";
    //转让转让权
    public final static String Api_Transfer_Manage = DomainUrl + "assignmentAdmin";
    //标记为已读
    public final static String Api_Remark_Message = DomainUrl + "remarkNotice";
    //请求某一条读书改进计划
    public final static String Api_Get_Single_Plan = DomainUrl + "getUserBookReadPlan";
    //请求某一条读书改进计划
    public final static String Api_Get_Audio_List = DomainUrl + "audioDaily";
    //请求言图列表
    public final static String Api_Get_Words_List = DomainUrl + "bookSentence/getSentences";
    //请求首页文章下一页
    public final static String Api_Article_Next_Page = DomainUrl + "mindshare/articles";
    //请求言图详情页
    public final static String Api_Word_Image = DomainUrl + "bookSentence/getSentenceDetail";
    //点赞言图
    public final static String Api_Word_Like = DomainUrl + "bookSentence/addOrCancelLikeSentence";
    //请求更多每日语音
    public final static String Api_Audio_More = DomainUrl + "audioDaily/pageAudio";
    //国正书吧 首页
    public final static String Api_GZ_Home = DomainUrl + "book/getGzIndex";
    //国正书吧 列表
    public final static String Api_GZ_List = DomainUrl + "book/getGzVideos";
    //国正书吧 详情
    public final static String Api_GZ_Detail = DomainUrl + "book/getGzVideoDetail";
    //国正书吧 评论
    public final static String Api_GZ_Comment = DomainUrl + "comment/addComment";
    //国正书吧 删除评论
    public final static String Api_GZ_Delcomment = DomainUrl + "comment/deleteComment";
    //国正书吧 点赞评论
    public final static String Api_GZ_Likecomment = DomainUrl + "comment/addOrCancelZan";


}
