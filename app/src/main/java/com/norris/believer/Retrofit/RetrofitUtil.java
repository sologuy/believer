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

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.fastjson.FastJsonConverterFactory;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2017/5/18.
 */


/**
 * 使用方法
 * <p>
 * private void getHomeDatas() {
 * //        SubscriberOnNextListener listener = new SubscriberOnNextListener() {
 * //            @Override
 * //            public void onNext(Object o) {
 * //
 * //            }
 * //
 * //            @Override
 * //            public void onError(Throwable e) {
 * //
 * //            }
 * //        }
 * //        RetrofitUtil.getInstance().getDatas(new ProgressSubscriber<FragHomeBean>(listener, getActivity()));
 * }
 */
public class RetrofitUtil {
    public static final int DEFAULT_TIMEOUT = 15;
    public static final int DEFAULT_READ_TIMEOUT = 60;

    private static Retrofit mRetrofit;
    private static GetDataService getDataService;

    private static RetrofitUtil mInstance;

    /**
     * 私有构造方法
     */
    private RetrofitUtil() {
//        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        mRetrofit = new Retrofit.Builder()
//                .client(builder.build())
                .baseUrl(ApiConstant.DomainUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(myClient())
                .build();
        getDataService = mRetrofit.create(GetDataService.class);

    }


    public OkHttpClient myClient() {
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Content-Type", "application/json; charset=UTF-8")
//                                .addHeader("Accept-Encoding", "gzip, deflate")
//                                .addHeader("Connection", "keep-alive")
//                                .addHeader("Accept", "*/*")
//                                .addHeader("Cookie", "add cookies here")
                                .addHeader("Client-type", "android")
                                .build();
                        return chain.proceed(request);
                    }

                })
                .build();
//        Logger.e("设置的超时时间是=="+ TimeUtils.millis2String(httpClient.connectTimeoutMillis()));
        return httpClient;
    }

    public static RetrofitUtil getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitUtil.class) {
                mInstance = new RetrofitUtil();
            }
        }
        return mInstance;
    }

    public static RetrofitUtil getRetrofit(UploadListener uploadListener) {
        UploadInterceptor interceptor = new UploadInterceptor(uploadListener);
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .addInterceptor(interceptor)
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Content-Type", "application/json; charset=UTF-8")
                                .addHeader("Client-type", "android")
                                .build();
                        return chain.proceed(request);
                    }

                })
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(ApiConstant.DomainUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(httpClient)
                .build();


        getDataService = mRetrofit.create(GetDataService.class);

        if (mInstance == null) {
            synchronized (RetrofitUtil.class) {
                mInstance = new RetrofitUtil();
            }
        }
        return mInstance;
    }
    public static RetrofitUtil getDownloadRetrofit(DownloadListener downloadListener) {
        DownloadInterceptor interceptor = new DownloadInterceptor(downloadListener);
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUT, TimeUnit.SECONDS)
                .addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Content-Type", "application/json; charset=UTF-8")
                                .addHeader("Client-type", "android")
                                .addHeader("Accept-Encoding", "identity")
                                .build();
                        return chain.proceed(request);
                    }

                })
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(ApiConstant.DomainUrl)
                .addConverterFactory(FastJsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(httpClient)
                .build();


        getDataService = mRetrofit.create(GetDataService.class);

        if (mInstance == null) {
            synchronized (RetrofitUtil.class) {
                mInstance = new RetrofitUtil();
            }
        }
        return mInstance;
    }


    //上传读书会 或者个人头像
    public Subscription uploadImage(String url, Map<String, RequestBody> params, MultipartBody.Part file, ProgressSubscriber<UploadResponseBean> subscriber) {
        return getDataService.uploadImage(url,params, file)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    //创建读书会的时候上传 读书会头像
    public Subscription uploadPic(String url, Map<String, RequestBody> params, MultipartBody.Part file, ProgressSubscriber<CreateReadPartyBean> subscriber) {
        return getDataService.uploadPic(url,params, file)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求更新数据
     *
     * @param subscriber
     */
    public Subscription getUpdateData(ProgressSubscriber<UpdateAppBean> subscriber) {
        return getDataService.getUpdateData()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
    /**
     * 请求首页数据
     *
     * @param subscriber
     */
    public Subscription getHomeDatas(ProgressSubscriber<BaseModel<HomeBean>> subscriber) {
        return getDataService.postFragHomeDatas()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求代读数据
     *
     * @param subscriber
     */
    public Subscription getBookListDatas(RequestBody body, ProgressSubscriber<BooksBean> subscriber) {
        return getDataService.postBookList(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求某个代读数据
     *
     * @param subscriber
     */
    public Subscription getBookDetails(RequestBody body, ProgressSubscriber<BookDetailsBean> subscriber) {
        return getDataService.postBookDetails(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求某个代读数据
     *
     * @param subscriber
     */
    public Subscription postSugg(ReadPlanBean bean, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postSugg(bean)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求读书会首页数据
     *
     * @param subscriber
     */
    public Subscription getReadPaties(RequestBody body, ProgressSubscriber<ReadPartyBean> subscriber) {
        return getDataService.getReadPaties(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 创建个人读书会
     *
     * @param subscriber
     */
    public Subscription createPersonalParty(RequestBody body, ProgressSubscriber<CreateReadPartyBean> subscriber) {
        return getDataService.createPersonalParty(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取读书会详情
     *
     * @param subscriber
     */
    public Subscription getPartyDetail(RequestBody body, ProgressSubscriber<ReadPartyDetailBean> subscriber) {
        return getDataService.getPartyDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取会员信息
     *
     * @param subscriber
     */
    public Subscription getMemberData(RequestBody body, ProgressSubscriber<MyInfoBean> subscriber) {
        return getDataService.getMemberData(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }


    /**
     * 上传读书会头像
     *
     * @param subscriber
     */
    public Subscription collectBook(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.collectBook(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求读书会成员
     *
     * @param subscriber
     */
    public Subscription getMembers(RequestBody body, ProgressSubscriber<AllMembersBean> subscriber) {
        return getDataService.getMembers(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 检查通讯录成员
     *
     * @param subscriber
     */
    public Subscription checkMember(RequestBody body, ProgressSubscriber<CheckMemberBean> subscriber) {
        return getDataService.checkMember(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加通讯录成员
     *
     * @param subscriber
     */
    public Subscription addMember(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.addMember(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 学习官中心数据加载
     *
     * @param subscriber
     */
    public Subscription getCloDatas(RequestBody body, ProgressSubscriber<CloCenterBean> subscriber) {
        return getDataService.getCloDatas(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 学习官中心海报数据加载
     *
     * @param subscriber
     */
    public Subscription getPosters(RequestBody body, ProgressSubscriber<PosterBean> subscriber) {
        return getDataService.getPosters(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 学习官中心书友数据加载
     *
     * @param subscriber
     */
    public Subscription getBookFriends(RequestBody body, ProgressSubscriber<MyBookFriendBean> subscriber) {
        return getDataService.getBookFriends(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 佣金数据加载
     *
     * @param subscriber
     */
    public Subscription getCommisionList(RequestBody body, ProgressSubscriber<CommisionBean> subscriber) {
        return getDataService.getCommisionList(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取读书改进计划
     *
     * @param subscriber
     */
    public Subscription getReadImprove(RequestBody body, ProgressSubscriber<ReadImproveBean> subscriber) {
        return getDataService.getReadImprove(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交反馈建议
     *
     * @param subscriber
     */
    public Subscription postFeedback(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postFeedback(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取我的收藏书籍
     *
     * @param subscriber
     */
    public Subscription getMyCollections(RequestBody body, ProgressSubscriber<CollectionsBean> subscriber) {
        return getDataService.getMyCollections(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除我收藏书籍
     *
     * @param subscriber
     */
    public Subscription delMyCollections(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.delCollections(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 更新用户个人信息(修改了用户名之类)
     *
     * @param subscriber
     */
    public Subscription updateUserInfo(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.updateUserInfo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交打赏会员
     *
     * @param subscriber
     */
    public Subscription postReward(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postReward(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交扣除会员赏金
     *
     * @param subscriber
     */
    public Subscription postDeleteReward(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postDeleteReward(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交打赏会员
     *
     * @param subscriber
     */
    public Subscription postSingleReward(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postSingleReward(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 提交评论
     *
     * @param subscriber
     */
    public Subscription postReadPlanComment(RequestBody body, ProgressSubscriber<ReadPlanCommentBean> subscriber) {
        return getDataService.postReadPlanComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取下一页读书改进计划
     *
     * @param subscriber
     */
    public Subscription getNextPageDatas(RequestBody body, ProgressSubscriber<MoreReadPlanBean> subscriber) {
        return getDataService.getNextPageDatas(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取某一页读书改进计划
     *
     * @param subscriber
     */
    public Subscription getOneReadPlanData(RequestBody body, ProgressSubscriber<OneReadPlanBean> subscriber) {
        return getDataService.getOneReadPlanData(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取赠礼物情况
     *
     * @param subscriber
     */
    public Subscription getGifts(RequestBody body, ProgressSubscriber<GiftBean> subscriber) {
        return getDataService.getGifts(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 退出个人读书会
     *
     * @param subscriber
     */
    public Subscription quitPersonalParty(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.quitPersonalParty(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改读书会信息
     *
     * @param subscriber
     */
    public Subscription updatePartyInfo(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.updatePartyInfo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取组织架构
     *
     * @param subscriber
     */
    public Subscription getOrganization(RequestBody body, ProgressSubscriber<OrganizationBean> subscriber) {
        return getDataService.getOrganization(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 添加公司部门
     *
     * @param subscriber
     */
    public Subscription addDepartment(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.addDepartment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取公司部门
     *
     * @param subscriber
     */
    public Subscription getAllDepartment(RequestBody body, ProgressSubscriber<AllDepartBean> subscriber) {
        return getDataService.getAllDepartment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取成员详情
     *
     * @param subscriber
     */
    public Subscription getComMemberInfo(RequestBody body, ProgressSubscriber<MemberInfo> subscriber) {
        return getDataService.getComMemberInfo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 修改成员详情
     *
     * @param subscriber
     */
    public Subscription modifyComMemberInfo(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.modifyComMemberInfo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 微信登录
     *
     * @param subscriber
     */
    public Subscription loginByWechat(RequestBody body, ProgressSubscriber<WechatResponseBean> subscriber) {
        return getDataService.loginByWechat(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取验证码
     *
     * @param subscriber
     */
    public Subscription getVerfyCode(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.getVerfyCode(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*
     *  获取验证码
     * @param subscriber
     */
    public Subscription regByPhone(RequestBody body, ProgressSubscriber<WechatResponseBean> subscriber) {
        return getDataService.regByPhone(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*
     *  修改用户个人信息
     * @param subscriber
     */
    public Subscription updateUserInfo2(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.updateUserInfo2(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /*
     *  修改用户个人信息
     * @param subscriber
     */
    public Subscription getVideoWebComments(RequestBody body, ProgressSubscriber<VideoWebCommentBean> subscriber) {
        return getDataService.getVideoWebComments(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 发送评论
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription sendComment(RequestBody body, ProgressSubscriber<SendCommentBean> subscriber) {
        return getDataService.sendComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription likeArticle(RequestBody body, ProgressSubscriber<SendCommentBean> subscriber) {
        return getDataService.likeArticle(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 收藏
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription collectArticle(RequestBody body, ProgressSubscriber<SendCommentBean> subscriber) {
        return getDataService.collectArticle(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 收藏
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription getNotifyMessages(RequestBody body, ProgressSubscriber<NotifyMsgBean> subscriber) {
        return getDataService.getNotifyMessages(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 音频播放次数
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription postAudioPlayTimes(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postAudioPlayTimes(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 下载ppt的接口
     *
     * @param body
     * @param subscriber
     * @return
     */
    public Subscription downloadBookPPT(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.downloadBookPPT(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
//    /**
//     * 检查引导页的接口
//     * @param subscriber
//     * @return
//     */
//    public Subscription getIntroBean( ProgressSubscriber<IntroUpdateBean> subscriber) {
//        return getDataService.getIntroBean()
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);
//    }

    /**
     * 下载文件的接口
     *
     * @param subscriber
     * @return
     */
    public Subscription downloadFile(String url, ProgressSubscriber<ResponseBody> subscriber) {
        return getDataService.downloadFile(url)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取所有地区
     *
     * @param subscriber
     * @return
     */
    public Subscription chooseRegion(ProgressSubscriber<RegionBean> subscriber) {
        return getDataService.chooseRegion()
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官中心数据
     *
     * @param subscriber
     * @return
     */
    public Subscription getCloCenterData(RequestBody body, ProgressSubscriber<CloHomeBean> subscriber) {
        return getDataService.getCloCenterData(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官中心数据
     *
     * @param subscriber
     * @return
     */
    public Subscription getAllClos(RequestBody body, ProgressSubscriber<CloListBean> subscriber) {
        return getDataService.getAllClos(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 给学习官送花
     *
     * @param subscriber
     * @return
     */
    public Subscription likeClo(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.likeClo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官课程和直播数据
     *
     * @param subscriber
     * @return
     */
    public Subscription getClassLive(RequestBody body, ProgressSubscriber<BaseModel<ClassAndLiveBean>> subscriber) {
        return getDataService.getClassLive(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官所有课程
     *
     * @param subscriber
     * @return
     */
    public Subscription getClasses(RequestBody body, ProgressSubscriber<CloClassBean> subscriber) {
        return getDataService.getClasses(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官那点事所有数据
     *
     * @param subscriber
     * @return
     */
    public Subscription getCloThings(RequestBody body, ProgressSubscriber<CloThingBean> subscriber) {
        return getDataService.getCloThings(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官那点事评论
     *
     * @param subscriber
     * @return
     */
    public Subscription getArticleComments(RequestBody body, ProgressSubscriber<CloThingDetailBean> subscriber) {
        return getDataService.getArticleComments(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞学习官那点事
     *
     * @param subscriber
     * @return
     */
    public Subscription likeCloArticle(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.likeCloArticle(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞学习官那点事评论
     *
     * @param subscriber
     * @return
     */
    public Subscription likeCloArticleComment(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.likeCloArticleComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 评论学习官文章
     *
     * @param subscriber
     * @return
     */
    public Subscription commentArticle(RequestBody body, ProgressSubscriber<CloThingCommentResponseBean> subscriber) {
        return getDataService.commentArticle(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官那点事评论
     *
     * @param subscriber
     * @return
     */
    public Subscription delCloArticleComment(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.delCloArticleComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取学习官中心视频详情
     *
     * @param subscriber
     * @return
     */
    public Subscription getCloVideoDetail(RequestBody body, ProgressSubscriber<CloVideoDetailBean> subscriber) {
        return getDataService.getCloVideoDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除读书会评论或者回复
     *
     * @param subscriber
     * @return
     */
    public Subscription delReadPlanComment(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.delReadPlanComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞读书会评论或者回复
     *
     * @param subscriber
     * @return
     */
    public Subscription likeReadPlanComment(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.likeReadPlanComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞读书会评论或者回复
     *
     * @param subscriber
     * @return
     */
    public Subscription postDeviceInfo(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.postDeviceInfo(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除读书会成员
     *
     * @param subscriber
     */
    public Subscription delMember(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.delMember(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 转让管理权限
     *
     * @param subscriber
     */
    public Subscription transferManger(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.transferManger(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 标记所有消息为已读
     *
     * @param subscriber
     */
    public Subscription remarkNotice(RequestBody body, ProgressSubscriber<BaseBean> subscriber) {
        return getDataService.remarkNotice(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 根据书本信息请求单条读书改进计划
     *
     * @param subscriber
     */
    public Subscription getSinglePlan(RequestBody body, ProgressSubscriber<SinglePlanBean> subscriber) {
        return getDataService.getSinglePlan(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 根据获取所有的音频列表
     *
     * @param subscriber
     */
    public Subscription getAllAudios(RequestBody body, ProgressSubscriber<SinglePlanBean> subscriber) {
        return getDataService.getSinglePlan(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 根据获取言图列表
     *
     * @param subscriber
     */
    public Subscription getAllWords(RequestBody body, ProgressSubscriber<BaseModel<WordsBean>> subscriber) {
        return getDataService.getAllWords(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 首页文章下一页
     *
     * @param subscriber
     */
    public Subscription getHomeNextPage(RequestBody body, ProgressSubscriber<BaseModel<HomeBean.MindsharelistBean>> subscriber) {
        return getDataService.getHomeNextPage(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取言图详情
     *
     * @param subscriber
     */
    public Subscription getWordDetail(RequestBody body, ProgressSubscriber<BaseModel<WordDetailBean>> subscriber) {
        return getDataService.getWordDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 获取言图详情
     *
     * @param subscriber
     */
    public Subscription likeWordDetail(RequestBody body, ProgressSubscriber<BaseModel<BaseBean>> subscriber) {
        return getDataService.likeWordDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求更多每日语音
     *
     * @param subscriber
     */
    public Subscription getMoreAudios(RequestBody body, ProgressSubscriber<BaseModel<HomeBean.DayslistBean>> subscriber) {
        return getDataService.getMoreAudios(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求国正书吧首页
     *
     * @param subscriber
     */
    public Subscription getBookBarData(RequestBody body, ProgressSubscriber<BaseModel<GZBookBarBean>> subscriber) {
        return getDataService.getBookBarData(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求国正书吧首页下一页列表
     *
     * @param subscriber
     */
    public Subscription getGZNextPage(RequestBody body, ProgressSubscriber<BaseModel<GZBookBarBean.VideosBean>> subscriber) {
        return getDataService.getGZNextPage(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 请求国正书吧视频详情
     *
     * @param subscriber
     */
    public Subscription getBookBarDetail(RequestBody body, ProgressSubscriber<BaseModel<BookBarVideoDetail>> subscriber) {
        return getDataService.getBookBarDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 评论国正书吧视频
     *
     * @param subscriber
     */
    public Subscription commentBookBarDetail(RequestBody body, ProgressSubscriber<BaseModel<BookBarVideoDetail.CommentsBean>> subscriber) {
        return getDataService.commentBookBarDetail(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 删除国正书吧视频评论
     *
     * @param subscriber
     */
    public Subscription delBookBarComment(RequestBody body, ProgressSubscriber<BaseModel<String>> subscriber) {
        return getDataService.delBookBarComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    /**
     * 点赞国正书吧视频评论
     *
     * @param subscriber
     */
    public Subscription likeBookBarComment(RequestBody body, ProgressSubscriber<BaseModel<String>> subscriber) {
        return getDataService.likeBookBarComment(body)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

}
