package com.norris.believer.Retrofit;


import com.norris.believer.Bean.AllDepartBean;
import com.norris.believer.Bean.AllMembersBean;
import com.norris.believer.Bean.BaseBean;
import com.norris.believer.Bean.BaseModel;
import com.norris.believer.Bean.BookBarVideoDetail;
import com.norris.believer.Bean.BookDetailsBean;
import com.norris.believer.Bean.BooksBean;
import com.norris.believer.Bean.CheckMemberBean;
import com.norris.believer.Bean.ClassAndLiveBean;
import com.norris.believer.Bean.CloCenterBean;
import com.norris.believer.Bean.CloClassBean;
import com.norris.believer.Bean.CloHomeBean;
import com.norris.believer.Bean.CloListBean;
import com.norris.believer.Bean.CloThingBean;
import com.norris.believer.Bean.CloThingCommentResponseBean;
import com.norris.believer.Bean.CloThingDetailBean;
import com.norris.believer.Bean.CloVideoDetailBean;
import com.norris.believer.Bean.CollectionsBean;
import com.norris.believer.Bean.CommisionBean;
import com.norris.believer.Bean.CreateReadPartyBean;
import com.norris.believer.Bean.GZBookBarBean;
import com.norris.believer.Bean.GiftBean;
import com.norris.believer.Bean.HomeBean;
import com.norris.believer.Bean.MemberInfo;
import com.norris.believer.Bean.MoreReadPlanBean;
import com.norris.believer.Bean.MyBookFriendBean;
import com.norris.believer.Bean.MyInfoBean;
import com.norris.believer.Bean.NotifyMsgBean;
import com.norris.believer.Bean.OneReadPlanBean;
import com.norris.believer.Bean.OrganizationBean;
import com.norris.believer.Bean.PosterBean;
import com.norris.believer.Bean.ReadImproveBean;
import com.norris.believer.Bean.ReadPartyBean;
import com.norris.believer.Bean.ReadPartyDetailBean;
import com.norris.believer.Bean.ReadPlanBean;
import com.norris.believer.Bean.ReadPlanCommentBean;
import com.norris.believer.Bean.RegionBean;
import com.norris.believer.Bean.SendCommentBean;
import com.norris.believer.Bean.SinglePlanBean;
import com.norris.believer.Bean.UpdateAppBean;
import com.norris.believer.Bean.UploadResponseBean;
import com.norris.believer.Bean.VideoWebCommentBean;
import com.norris.believer.Bean.WechatResponseBean;
import com.norris.believer.Bean.WordDetailBean;
import com.norris.believer.Bean.WordsBean;
import com.norris.believer.Constant.ApiConstant;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;
import rx.Observable;

import static com.norris.believer.Constant.ApiConstant.Api_Clo_Like;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_List;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_Things_Comment_Del;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_Things_Comment_Like;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_Things_Like;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_Things_List;
import static com.norris.believer.Constant.ApiConstant.Api_Clo_Video_Detail;
import static com.norris.believer.Constant.ApiConstant.Api_Post_Device_Info;
import static com.norris.believer.Constant.ApiConstant.Api_Read_Plan_Comment_Del;
import static com.norris.believer.Constant.ApiConstant.Api_Read_Plan_Comment_Like;
import static com.norris.believer.Constant.ApiConstant.checkUpdateUrl;


/**
 * Created by admin on 2017/5/15.
 */
public interface GetDataService {


    @Multipart
    @POST
    Observable<UploadResponseBean> uploadImage(
            @Url String url,
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part part);
    @Multipart
    @POST
    Observable<CreateReadPartyBean> uploadPic(
            @Url String url,
            @PartMap() Map<String, RequestBody> partMap,
            @Part MultipartBody.Part part);

    @POST(ApiConstant.Api_Home_Frag)//请求首页的数据
    Observable<BaseModel<HomeBean>> postFragHomeDatas();

    @GET(checkUpdateUrl)//请求更新数据
    Observable<UpdateAppBean> getUpdateData();

    @POST(ApiConstant.Api_Booklist)//请求第二页的书籍列表
    Observable<BooksBean> postBookList(@Body RequestBody body);


    @POST(ApiConstant.Api_BookDetail)//请求书籍详情
    Observable<BookDetailsBean> postBookDetails(@Body RequestBody body);

    @POST(ApiConstant.Api_BookProject)//推送上去读书改进计划表
    Observable<BaseBean> postSugg(@Body ReadPlanBean bean);

    @POST(ApiConstant.Api_ReadParty_Frag)//请求读书会首页
    Observable<ReadPartyBean> getReadPaties(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Create_Party_Personal)//创建个人读书会
    Observable<CreateReadPartyBean> createPersonalParty(@Body RequestBody body);


    @POST(ApiConstant.Api_Read_Party_Detail)//获取读书会详情
    Observable<ReadPartyDetailBean> getPartyDetail(@Body RequestBody body);

    @POST(ApiConstant.Api_Member_Detail)//获取会员个人详情
    Observable<MyInfoBean> getMemberData(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Upload_Party_Head)//上传读书会头像
    @Multipart
    Observable<UploadResponseBean> uploadPartyHead(@Part List<MultipartBody.Part> partList);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_BookCollect)//收藏书籍
    Observable<BaseBean> collectBook(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Read_Party_Members)//获取所有会员
    Observable<AllMembersBean> getMembers(@Body RequestBody body);


    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Member_Contacts)//检查通讯录会员
    Observable<CheckMemberBean> checkMember(@Body RequestBody body);


    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Member_Contact_Add)//添加通讯录会员
    Observable<BaseBean> addMember(@Body RequestBody body);



    @POST(ApiConstant.Api_MemberPartnerDetail)//获取学习官中心数据
    Observable<CloCenterBean> getCloDatas(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_MemberPosterTemplate)//获取推荐海报数据
    Observable<PosterBean> getPosters(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_MemberFriendList)//获取我的书友数据
    Observable<MyBookFriendBean> getBookFriends(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_MemberCommissionList)//获取佣金数据
    Observable<CommisionBean> getCommisionList(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_MemberSUMUP)//获取我的书友数据
    Observable<ReadImproveBean> getReadImprove(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Feedback)//反馈建议
    Observable<BaseBean> postFeedback(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_My_Collections)//获取我收藏的书
    Observable<CollectionsBean> getMyCollections(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Del_Collection)//删除我收藏的书
    Observable<BaseBean> delCollections(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_UserInfo_Update)//更新个人信息
    Observable<BaseBean> updateUserInfo(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Reward_Bulk)//批量打赏
    Observable<BaseBean> postReward(@Body RequestBody body);

    @Headers({"Content-type:application/json;charset=UTF-8"})
    @POST(ApiConstant.Api_Reward_Clear)//全部扣除
    Observable<BaseBean> postDeleteReward(@Body RequestBody body);

    @POST(ApiConstant.Api_Improve_Plan_Reward)//打赏读书改进计划
    Observable<BaseBean> postSingleReward(@Body RequestBody body);

    @POST(ApiConstant.Api_Read_Plan_Comment)//评论读书改进计划
    Observable<ReadPlanCommentBean> postReadPlanComment(@Body RequestBody body);

    @POST(ApiConstant.Api_Read_Plan_Next_Page)//读书改进计划加载更多
    Observable<MoreReadPlanBean> getNextPageDatas(@Body RequestBody body);

    @POST(ApiConstant.Api_Read_Plan_One)//获取读书改进计划某一条数据
    Observable<OneReadPlanBean> getOneReadPlanData(@Body RequestBody body);

    @POST(ApiConstant.Api_Read_Plan_Gift)//获取赠礼物情况
    Observable<GiftBean> getGifts(@Body RequestBody body);

    @POST(ApiConstant.Api_Member_Quit_Group)//退出个人读书会
    Observable<BaseBean> quitPersonalParty(@Body RequestBody body);

    @POST(ApiConstant.Api_Update_PartyInfo)//修改读书会信息
    Observable<BaseBean> updatePartyInfo(@Body RequestBody body);

    @POST(ApiConstant.Api_Company_Orgization)//获取公司架构
    Observable<OrganizationBean> getOrganization(@Body RequestBody body);

    @POST(ApiConstant.Api_Company_Department_Add)//增加公司新部门
    Observable<BaseBean> addDepartment(@Body RequestBody body);
    @POST(ApiConstant.Api_Company_Departs)//增加公司新部门
    Observable<AllDepartBean> getAllDepartment(@Body RequestBody body);


    @POST(ApiConstant.Api_Company_Member_Info)//获取公司成员信息详情
    Observable<MemberInfo> getComMemberInfo(@Body RequestBody body);

    @POST(ApiConstant.Api_Company_Member_Info_Modify)//获取公司成员信息详情
    Observable<BaseBean> modifyComMemberInfo(@Body RequestBody body);

    @POST(ApiConstant.Api_Reg_Log_Wechat)//获取公司成员信息详情
    Observable<WechatResponseBean> loginByWechat(@Body RequestBody body);

    @POST(ApiConstant.Api_AddMobcode)//获取验证码
    Observable<BaseBean> getVerfyCode(@Body RequestBody body);
    @POST(ApiConstant.Api_Reg_By_Phone)//获取验证码
    Observable<WechatResponseBean> regByPhone(@Body RequestBody body);

    @POST(ApiConstant.Api_Update_User_Info)//修改手机号之用户个人信息都是用这个接口
    Observable<BaseBean> updateUserInfo2(@Body RequestBody body);

    @POST(ApiConstant.Api_Hot_Point_Send_Comment)//获取验证码
    Observable<SendCommentBean> sendComment(@Body RequestBody body);

    @POST(ApiConstant.Api_Hot_Point_Send_Like)//点赞
    Observable<SendCommentBean> likeArticle(@Body RequestBody body);

    @POST(ApiConstant.Api_Hot_Sugg_GEt)//获取所有的评论列表
    Observable<VideoWebCommentBean> getVideoWebComments(@Body RequestBody body);

    @POST(ApiConstant.Api_Hot_Point_Send_Collect)//收藏和取消收藏
    Observable<SendCommentBean> collectArticle(@Body RequestBody body);

    @POST(ApiConstant.Api_Notify_Message)//获取系统消息
    Observable<NotifyMsgBean> getNotifyMessages(@Body RequestBody body);


    @POST(ApiConstant.Api_Audio_Play_Times)//获取系统消息
    Observable<BaseBean> postAudioPlayTimes(@Body RequestBody body);


    @POST(ApiConstant.Api_Video_Download_Ppt)//下载ppt到邮箱
    Observable<BaseBean> downloadBookPPT(@Body RequestBody body);
//    @POST(ApiConstant.Api_Introduction_Get)//更新引导页
//    Observable<IntroUpdateBean> getIntroBean();

//    @Streaming
    @GET
    Observable<ResponseBody> downloadFile(@Url String fileUrl);//下载文件

    @GET(ApiConstant.Api_Country_Get)
    Observable<RegionBean> chooseRegion();//下载文件

    @POST(ApiConstant.Api_Clo_Center)//获取学习官中心首页数据
    Observable<CloHomeBean> getCloCenterData(@Body RequestBody body);

    @POST(ApiConstant.Api_Clo_Classes_Lives)//获取学习官课程和直播数据
    Observable<BaseModel<ClassAndLiveBean>> getClassLive(@Body RequestBody body);

    @POST(ApiConstant.Api_Clo_Classes)//获取学习官课程和直播数据
    Observable<CloClassBean> getClasses(@Body RequestBody body);

    @POST(Api_Clo_List)//获取所有学习官
    Observable<CloListBean> getAllClos(@Body RequestBody body);
    @POST(Api_Clo_Like)//给学习官送花
    Observable<BaseBean> likeClo(@Body RequestBody body);

    @POST(Api_Clo_Things_List)//获取学习官那点事
    Observable<CloThingBean> getCloThings(@Body RequestBody body);

    @POST(ApiConstant.Api_Clo_Things_Comments)//获取学习官那点事
    Observable<CloThingDetailBean> getArticleComments(@Body RequestBody body);

    @POST(Api_Clo_Things_Like)//给学习官的文章点赞
    Observable<BaseBean> likeCloArticle(@Body RequestBody body);

    @POST(Api_Clo_Things_Comment_Like)//给学习官的文章评论点赞
    Observable<BaseBean> likeCloArticleComment(@Body RequestBody body);

    @POST(ApiConstant.Api_Clo_Things_Comment)//给文章评论
    Observable<CloThingCommentResponseBean> commentArticle(@Body RequestBody body);

    @POST(Api_Clo_Things_Comment_Del)//删除文章评论
    Observable<BaseBean> delCloArticleComment(@Body RequestBody body);

    @POST(Api_Clo_Video_Detail)//获取视频详情信息
    Observable<CloVideoDetailBean> getCloVideoDetail(@Body RequestBody body);

    @POST(Api_Read_Plan_Comment_Del)//删除读书计划评论
    Observable<BaseBean> delReadPlanComment(@Body RequestBody body);

    @POST(Api_Read_Plan_Comment_Like)//获取视频详情信息
    Observable<BaseBean> likeReadPlanComment(@Body RequestBody body);

    @POST(Api_Post_Device_Info)//推送手机信息
    Observable<BaseBean> postDeviceInfo(@Body RequestBody body);

    @POST(ApiConstant.Api_Member_Contact_Del)//删除通讯录会员
    Observable<BaseBean> delMember(@Body RequestBody body);

    @POST(ApiConstant.Api_Transfer_Manage)//转让管理员
    Observable<BaseBean> transferManger(@Body RequestBody body);

    @POST(ApiConstant.Api_Remark_Message)//标记消息为已读
    Observable<BaseBean> remarkNotice(@Body RequestBody body);

    @POST(ApiConstant.Api_Get_Single_Plan)//获取单条读书计划
    Observable<SinglePlanBean> getSinglePlan(@Body RequestBody body);

    @POST(ApiConstant.Api_Get_Words_List)//获取言图列表
    Observable<BaseModel<WordsBean>> getAllWords(@Body RequestBody body);

    @POST(ApiConstant.Api_Article_Next_Page)//获取首页文章下一页
    Observable<BaseModel<HomeBean.MindsharelistBean>> getHomeNextPage(@Body RequestBody body);

    @POST(ApiConstant.Api_Word_Image)//获取言图详情页
    Observable<BaseModel<WordDetailBean>> getWordDetail(@Body RequestBody body);

    @POST(ApiConstant.Api_Word_Like)//点赞言图详情页
    Observable<BaseModel<BaseBean>> likeWordDetail(@Body RequestBody body);

    @POST(ApiConstant.Api_Audio_More)//请求更多每日语音
    Observable<BaseModel<HomeBean.DayslistBean>> getMoreAudios(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Home)//请求国正书吧首页
    Observable<BaseModel<GZBookBarBean>> getBookBarData(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_List)//获取国正书吧首页文章下一页
    Observable<BaseModel<GZBookBarBean.VideosBean>> getGZNextPage(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Detail)//获取国正书吧视频详情
    Observable<BaseModel<BookBarVideoDetail>> getBookBarDetail(@Body RequestBody body);
    @POST(ApiConstant.Api_GZ_Comment)//评论国正书吧视频
    Observable<BaseModel<BookBarVideoDetail.CommentsBean>> commentBookBarDetail(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Delcomment)//删除评论国正书吧视频
    Observable<BaseModel<String>> delBookBarComment(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Likecomment)//点赞评论国正书吧视频
    Observable<BaseModel<String>> likeBookBarComment(@Body RequestBody body);








}
