package com.norris.believer.Retrofit;

/**
 * Created by android on 2017/9/26.
 */

public interface DownloadListener {
    void onProgress(long progress, long total, boolean done);
}
