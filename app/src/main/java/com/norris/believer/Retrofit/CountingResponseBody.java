package com.norris.believer.Retrofit;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/**
 * Created by android on 2017/9/26.
 */

public class CountingResponseBody extends ResponseBody {
    private ResponseBody mResponseBody;
    private DownloadListener mDownloadListener;
    private BufferedSource bufferedSource;


    public CountingResponseBody(ResponseBody mRequestBody, DownloadListener mUploadListener) {
        this.mResponseBody = mRequestBody;
        this.mDownloadListener = mUploadListener;
    }

    @Override
    public MediaType contentType() {
        return mResponseBody.contentType();
    }


    private Source source(Source source) {
        return new ForwardingSource(source) {
            long totalBytesRead = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                totalBytesRead += bytesRead != -1 ? bytesRead : 0;
                mDownloadListener.onProgress(totalBytesRead, mResponseBody.contentLength(), bytesRead == -1);
                return bytesRead;
            }
        };
    }

    @Override
    public long contentLength() {
        return mResponseBody.contentLength();
    }

    @Override
    public BufferedSource source() {
        if (bufferedSource == null) {
            bufferedSource = Okio.buffer(source(mResponseBody.source()));
        }
        return bufferedSource;
    }
}
