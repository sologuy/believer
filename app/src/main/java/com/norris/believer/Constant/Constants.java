package com.norris.believer.Constant;


import com.norris.believer.Bean.HomeBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/11.
 */
public  class Constants {
    //关于我们html
    public static String Url_AboutUs ="http://wx.laohoulundao.com/aboutus.html";






    //----------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------


    //eventbus的事件集合
    public static final int onPlayerEoor = 1001;//播放错误
    public static final int onMediaPlaybackEnded = 1002;//播放错误后回调到这儿
    public static final int onPrepared = 1003;//音频准备好
    public static final int onSeekComplete = 1004;//音频拖拉完成
    public static final int onHandler = 1005;//音频handler的调用
    public static final int onStart = 1006;//音频拖拉完成


    //老侯代读音频播放中的常量取数据
    public static  int playIndex = 0 ;//播放下标
    public static int playState = 0; // 0 初始化 1开始 2暂停  3停止    播放状态
    public static final List<HomeBean.DayslistBean.DataBean> audiosList = new ArrayList<>();

    //老侯代读播放模式
    public static final String audio_play_intent_action = "com.reading4.audio.play";
    public static final int audio_play_intent_timer_playing = 121;
    public static final int audio_play_intent_timer_finish = 122;
    public static final int audio_play_intent_timer_error = 123;
    public static final int audio_play_intent_timer_seekcomplete = 124;
    public static final int audio_play_intent_timer_onprepare = 125;
    public static final int audio_play_intent_timer_oncompletion = 126;


    //百度云的ak
    public static Boolean videoIsFullScreen = false;



}
