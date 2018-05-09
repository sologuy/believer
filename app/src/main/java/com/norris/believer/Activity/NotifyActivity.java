package com.norris.believer.Activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.widget.Button;

import com.norris.believer.Application.MyApp;
import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;

import java.util.concurrent.TimeUnit;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class NotifyActivity extends BaseActivity {

    @Bind(R.id.startNotify)
    Button startNotify;
    NotificationManager manager;
    @Bind(R.id.startRxjava)
    Button startRxjava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void initData() {

    }

    public void initViewOper() {

    }



    private void setNotification() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.baidu.com"));
        PendingIntent pi = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(MyApp.getApplication());
        builder.setAutoCancel(true);
        builder.setColor(getResources().getColor(R.color.blue))
                .setContentTitle("I am an notification")
                .setContentText("I am an notification content!")
                .setDefaults(Notification.DEFAULT_ALL)
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setFullScreenIntent(pi, true)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.logo))
                .setPriority(Notification.PRIORITY_MAX)
                .setSmallIcon(R.mipmap.logo);
        manager.notify(1, builder.build());

    }


    @OnClick(R.id.startNotify)
    public void onStartNotifyClicked() {
        setNotification();
    }

    private rx.Observable<Long> observable;
    @OnClick(R.id.startRxjava)
    public void onStartRxjavaClicked() {
        observable = Observable.interval(0,1, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread());
        observable.subscribe(new Subscriber<Long>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Long aLong) {
                logi("时间--"+aLong);
            }
        });
    }

}
