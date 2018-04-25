package com.norris.believer.Utils;

import android.content.Context;

import com.blankj.utilcode.util.SPUtils;

import static com.norris.believer.Application.MyApp.deviceId;
import static com.norris.believer.Utils.CommonUtil.MEMBER;
import static com.norris.believer.Utils.CommonUtil.UserInfo_userName_key;


public class MemberUtil {


    public static UserModel getUserModel(Context context) {
        UserModel model = new UserModel();
        String mobile = SPUtils.getInstance(MEMBER).getString(UserInfo_userName_key, "");
//        String mobile = SharedPrefrencesMemberUtil.getData(context, SharedPrefrencesMemberUtil.UserInfo_userName_key, "");
        model.mobile = mobile;
        if (deviceId==null){
            deviceId = CommonUtil.getDeviceId(context);
        }
        model.deviceId = deviceId;
//        Log.e("getUserModel-mobile",mobile);
//        Log.e("getUserModel-deviceId",deviceId);
        return model;
    }


    public static class UserModel {

        public String mobile;
        public String deviceId;
    }

}
