package com.norris.believer.Retrofit;

/**
 * Created by android on 2017/9/26.
 */

public interface UploadListener {
    void onRequestProgress(long bytesWritten, long contentLength);
}
