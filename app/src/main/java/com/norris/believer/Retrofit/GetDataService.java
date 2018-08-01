package com.norris.believer.Retrofit;


import com.norris.believer.Bean.AllMembersBean;
import com.norris.believer.Bean.BaseBean;
import com.norris.believer.Bean.BaseModel;
import com.norris.believer.Bean.BookBarVideoDetail;
import com.norris.believer.Bean.BookDetailsBean;
import com.norris.believer.Bean.BooksBean;
import com.norris.believer.Bean.CheckMemberBean;
import com.norris.believer.Bean.CloCenterBean;
import com.norris.believer.Bean.CollectionsBean;
import com.norris.believer.Bean.CommisionBean;
import com.norris.believer.Bean.CreateReadPartyBean;
import com.norris.believer.Bean.HomeBean;
import com.norris.believer.Bean.MyBookFriendBean;
import com.norris.believer.Bean.MyInfoBean;
import com.norris.believer.Bean.PosterBean;
import com.norris.believer.Bean.ReadImproveBean;
import com.norris.believer.Bean.ReadPartyBean;
import com.norris.believer.Bean.ReadPartyDetailBean;
import com.norris.believer.Bean.ReadPlanBean;
import com.norris.believer.Bean.UpdateAppBean;
import com.norris.believer.Bean.UploadResponseBean;
import com.norris.believer.Constant.ApiConstant;

import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;
import rx.Observable;

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
    @POST(ApiConstant.Api_GZ_Comment)//评论国正书吧视频
    Observable<BaseModel<BookBarVideoDetail.CommentsBean>> commentBookBarDetail(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Delcomment)//删除评论国正书吧视频
    Observable<BaseModel<String>> delBookBarComment(@Body RequestBody body);

    @POST(ApiConstant.Api_GZ_Likecomment)//点赞评论国正书吧视频
    Observable<BaseModel<String>> likeBookBarComment(@Body RequestBody body);








}
