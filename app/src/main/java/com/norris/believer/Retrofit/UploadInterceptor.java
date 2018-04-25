package com.norris.believer.Retrofit;


import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by android on 2017/9/26.
 */

public class UploadInterceptor implements Interceptor {

    private UploadListener mUploadListener;

    public UploadInterceptor(UploadListener uploadListener) {
        mUploadListener = uploadListener;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if(null == request.body()){
            return chain.proceed(request);
        }

        Request build = request.newBuilder()
                .method(request.method(),
                        new CountingRequestBody(request.body(),
                                mUploadListener))
                .build();
        return chain.proceed(build);
    }
}
