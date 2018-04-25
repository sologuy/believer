package com.norris.believer.Application;


import android.app.Activity;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.Utils;
import com.norris.believer.Bean.DaoMaster;
import com.norris.believer.Bean.DaoSession;
import com.norris.believer.Bean.MyInfoBean;
import com.norris.believer.Bean.ReadPartyDetailBean;
import com.norris.believer.Constant.ConstantSign;
import com.norris.believer.Utils.CommonUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static com.norris.believer.Utils.CommonUtil.MEMBER;
import static com.norris.believer.Utils.CommonUtil.UserInfo_userName_key;


public class MyApp extends Application implements Application.ActivityLifecycleCallbacks {


    private static final String TAG = "MyApp";
    private static MyApp application;
    public static MyInfoBean myInfoBean;
    public static ReadPartyDetailBean partyDetailBean;
    //    public static int msgCount = 0;//要显示的角标 即消息数量
    public static final String APPID_WX = "wx3a198d51ef0d3650";
    public static final String SCRET_WX = "7872eb22554f285b4d04a4455ed2d459";
    public static String deviceId;

    public static String mobile;

    public static Boolean isLogin = false;


    private static DaoMaster.DevOpenHelper mHelper;
    private static SQLiteDatabase db;
    private static DaoMaster mDaoMaster;
    private static DaoSession mDaoSession;
    public String DBName = "reading4.db";


    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        Utils.init(this);//初始化工具类
        getUserInfo();
        MultiDex.install(this);
        isLogin = checkIsLogin();
        registerActivityLifecycleCallbacks(this);
        setDatabase();
    }

    /**
     * 设置greenDao
     */
    private void setDatabase() {
        // 通过DaoMaster 的内部类 DevOpenHelper，你可以得到一个便利的SQLiteOpenHelper 对象。
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为greenDAO 已经帮你做了。
        // 注意：默认的DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        mHelper = new DaoMaster.DevOpenHelper(this, DBName, null);
        db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于DaoMaster，所以多个 Session 指的是相同的数据库连接。
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();

    }

    public static DaoSession getDaoSession() {
        return mDaoSession;
    }


    public static SQLiteDatabase getDb() {
        return db;
    }


    public static String sortMap(Map map1) {
        Map<String, String> map = new TreeMap<String, String>(
                new Comparator<String>() {
                    public int compare(String obj1, String obj2) {
                        // 降序排序
                        return obj1.compareTo(obj2);
                    }
                });
        map.putAll(map1);
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iter.hasNext()) {
            String key = iter.next();
//            Log.e("排序",key + ":" + map.get(key));
            stringBuilder.append(map.get(key));
        }
        stringBuilder.append(ConstantSign.signprefix);
        String sign = CommonUtil.md5(stringBuilder.toString());
        return sign;
    }


    public static void getUserInfo() {
        String str = SPUtils.getInstance().getString("user_info_bean", null);
        if (str != null && str.length() > 0) {
            myInfoBean = com.alibaba.fastjson.JSONObject.parseObject(str, MyInfoBean.class);
        }
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }


    public static MyApp getApplication() {
        return application;
    }



    private static Map<Object, Object> datas = new LinkedHashMap<Object, Object>();

    /**
     * 向全局的数据容器中存放数据,用来多个activity或者fragment进行数据交换
     *
     * @param key   填充的数据key
     * @param value 填充的数据
     * @return 如果此key 已经与其他的值 产生了映射关系,那么本次操作会将旧的数据覆盖,并且会返回旧的数据,否则返回null
     */
    public static Object put(Object key, Object value) {
        return datas.put(key, value);
    }

    /**
     * 从全局的数据容器中获取数据
     *
     * @param key      获取数据的密钥
     * @param isDelete 本次获取数据,是否在数据容器中清除数据
     * @return
     */
    public static Object get(Object key, boolean isDelete) {
        if (isDelete) {
            return datas.remove(key);
        }
        return datas.get(key);

    }

    public static Object remove(Object key) {
        return datas.remove(key);
    }


    /**
     * 将json转换成hashmap
     *
     * @param object
     * @return hashmap
     */
    public static HashMap<String, String> toHashMap(String object) {
        HashMap<String, String> strMap = new HashMap<String, String>();
        // 将json字符串转换成jsonObject
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(object);

            Iterator it = jsonObject.keys();
            // 遍历jsonObject数据，添加到Map对象
            while (it.hasNext()) {
                String key = String.valueOf(it.next());
                String value = jsonObject.getString(key);
                strMap.put(key, value);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return strMap;
    }


    private boolean checkIsLogin() {
        String isLogin = SPUtils.getInstance(MEMBER).getString(UserInfo_userName_key, "0");
        if (isLogin.equals("0")) {
            return false;
        }
        if (isLogin == null || isLogin.length() < 1) {
            return false;
        }
        mobile = isLogin;
        Log.e(TAG, "checkIsLogin: 手机号==" + mobile);
        return true;
    }



    public static void loge(String text) {
//        if (BuildConfig.DEBUG) {
        Log.e(TAG, "-->>" + text);
//        }
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        MyActivityManager.addActivity(activity);
    }


    @Override
    public void onActivityDestroyed(Activity activity) {
        MyActivityManager.removeActivity(activity);
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

}
