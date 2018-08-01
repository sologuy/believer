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

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
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
