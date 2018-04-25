package com.norris.believer.Retrofit;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by android on 2017/9/26.
 */

public class DownloadInterceptor implements Interceptor {

    private DownloadListener mDownloadListener;

    public DownloadInterceptor(DownloadListener downloadListener) {
        mDownloadListener = downloadListener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Response response = chain.proceed(chain.request());

        return response
                .newBuilder()
                .body(new CountingResponseBody(response.body(), mDownloadListener))
                .addHeader("Content-Type", "application/json; charset=UTF-8")
                .addHeader("Client-type", "android")
                .build();
    }
}
