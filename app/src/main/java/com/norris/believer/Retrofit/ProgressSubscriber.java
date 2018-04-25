package com.norris.believer.Retrofit;

import android.content.Context;
import android.util.Log;

import rx.Subscriber;

/**
 * Created by admin on 2017/5/18.
 */


/**
 * @author nanchen
 * @fileName RetrofitRxDemoo
 * @packageName com.nanchen.retrofitrxdemoo
 * @date 2016/12/12  14:48
 */

public class ProgressSubscriber<T> extends Subscriber<T> implements ProgressCancelListener {

    private SubscriberOnNextListener<T> mListener;
    private Context mContext;
    private ProgressDialogHandler mHandler;

    public ProgressSubscriber(Context context, SubscriberOnNextListener<T> listener) {
        this.mListener = listener;
        this.mContext = context;
        mHandler = new ProgressDialogHandler(context, this, true);
    }



    /**
     * 订阅开始时调用
     * 显示ProgressDialog
     */
    @Override
    public void onStart() {
        super.onStart();
//        showProgressDialog();
//        Log.e("proSub","请求开始==");
//        Log.e("proSub","请求开始=="+TimeUtils.millis2String(System.currentTimeMillis()));
//        if (!NetworkUtils.isConnected()) {
//            DialogUtils.dismissProgressDialog();
//            DialogUtils.dismissnoCancelDia();
//            Toast.makeText(mContext,mContext.getString(R.string.act_home_badnet),Toast.LENGTH_SHORT).show();
//            return;
//        }
    }

    @Override
    public void onCompleted() {
//        dismissProgressDialog();
//        Log.e("proSub","请求完成");
//        Toast.makeText(MyApplication.getApplication(), "获取数据完成！", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(Throwable e) {
//        if (e instanceof SocketTimeoutException) {
//            Toast.makeText(MyApplication.getApplication(), "网络中断，请检查您的网络状态", Toast.LENGTH_SHORT).show();
//        } else if (e instanceof ConnectException) {
//            Toast.makeText(MyApplication.getApplication(), "网络中断，请检查您的网络状态", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(MyApplication.getApplication(), "error:" + e.getMessage(), Toast.LENGTH_SHORT).show();
//        }
//        dismissProgressDialog();
//        Log.e("proSub","请求出错="+e.getMessage());
//        Log.e("proSub","请求出错="+ TimeUtils.millis2String(System.currentTimeMillis())+e.getMessage());
//        if(e instanceof HttpException) {
//        try {
//            HttpException exception = (HttpException)e;
//            String errorBody= exception.response().errorBody().string();
//            Log.e("proSub","请求出错errorBody==="+errorBody);
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//        }
//        Toast.makeText(mContext,mContext.getString(R.string.act_home_badnet),Toast.LENGTH_SHORT).show();
        if (mListener!=null){
            mListener.onError(e);
        }
    }

    private void showProgressDialog() {
        if (mHandler != null) {
            mHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
        }
    }

    private void dismissProgressDialog() {
        if (mHandler != null) {
            mHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
            mHandler = null;
        }
    }


    @Override
    public void onNext(T t) {
        if (mListener != null) {
//            Log.e("proSub","请求完成="+ TimeUtils.millis2String(System.currentTimeMillis()));
            mListener.onNext(t);
        }
    }


    @Override
    public void onCancelProgress() {
        if (!this.isUnsubscribed()) {
            this.unsubscribe();
            Log.e("prosub","cancel progress");
        }
    }

}
