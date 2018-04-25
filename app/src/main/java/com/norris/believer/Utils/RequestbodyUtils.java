package com.norris.believer.Utils;

import org.json.JSONObject;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Created by admin on 2017/5/26.
 */

public class RequestbodyUtils {
    public static RequestBody getRequestBody(JSONObject json) {
        return RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), json.toString());
    }
    public static RequestBody getFastRequestBody(com.alibaba.fastjson.JSONObject json) {
        return RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), json.toString());
    }
    public static RequestBody convertToRequestBody(String param){
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), param);
        return requestBody;
    }
}
