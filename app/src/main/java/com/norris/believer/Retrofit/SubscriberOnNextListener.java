package com.norris.believer.Retrofit;

/**
 * Created by admin on 2017/5/18.
 */
public interface SubscriberOnNextListener<T> {
    void onNext(T t);
    void onError(Throwable e);
}
