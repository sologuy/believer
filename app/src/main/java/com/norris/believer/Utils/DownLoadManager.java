package com.norris.believer.Utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Toast;

import com.norris.believer.Retrofit.ProgressSubscriber;
import com.norris.believer.Retrofit.RetrofitUtil;
import com.norris.believer.Retrofit.RxApiManager;
import com.norris.believer.Retrofit.SubscriberOnNextListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Calendar;

import okhttp3.ResponseBody;
import rx.Subscription;

import static com.norris.believer.Application.MyApp.loge;


/**
 * Created by android on 2017/7/13.
 */

public class DownLoadManager {
    private static final String TAG = "DownLoadManager";

    private static String APK_CONTENTTYPE = "application/vnd.android.package-archive";

    private static String PNG_CONTENTTYPE = "image/png";

    private static String JPG_CONTENTTYPE = "image/jpg";

    private static String fileSuffix = "";
    private static Subscription downloadSub;
    private static Boolean isOk = false;
    public static Boolean downloadFile(final Context context, String url) {
        DialogUtils.createProgressDialog(context, null);
//        downloadSub = RetrofitUtil.getInstance().downloadFile(url,
//                new ProgressSubscriber<ResponseBody>(context, new SubscriberOnNextListener<ResponseBody>() {
//                    @Override
//                    public void onNext(final ResponseBody responseBody) {
//                        isOk = DownLoadManager.writeResBodyToDisk(context, responseBody);
//                        DialogUtils.dismissProgressDialog();
//                        loge("是否下载完成==" + isOk);
//                        if (isOk) {
//                            Toast.makeText(context,"图片已保存到文件夹sdcard/Reading4", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        loge("下载引导页图片错误==" + e.getLocalizedMessage());
//                        Toast.makeText(context,"下载失败,请检查后重试", Toast.LENGTH_SHORT).show();
//                        isOk = false;
//                        DialogUtils.dismissProgressDialog();
//                    }
//                }));
        RxApiManager.get().add(TAG + 1, downloadSub);
        return isOk;
    }
    public static boolean writeResBodyToDisk(final Context context, final ResponseBody body) {
//        DialogUtils.createProgressDialog(context,null);
                Log.e(TAG, "contentType:>>>>" + body.contentType().toString());
                String type = body.contentType().toString();

                if (type.equals(APK_CONTENTTYPE)) {
                    fileSuffix = ".apk";
                } else if (type.equals(PNG_CONTENTTYPE)) {
                    fileSuffix = ".png";
                } else if (type.equals(JPG_CONTENTTYPE)) {
                    fileSuffix = ".jpg";
                } else {
                    fileSuffix = ".png";
                }
                File f = new File(Environment.getExternalStorageDirectory()
                        .getPath() + "/Reading4");
                if (!f.exists()) {
                    f.mkdirs();
                }
                Log.e("reading4", "图片加载4");
                File image = new File(f.getAbsolutePath() + "/" + Calendar.getInstance().getTimeInMillis() + fileSuffix);
                try {
                    if (!image.exists()) {
                        image.createNewFile();
                    }

//        String path = context.getExternalFilesDir(null) + File.separator + System.currentTimeMillis() + fileSuffix;
                    String path = image.getAbsolutePath();
                    Log.e(TAG, "path:>>>>" + path);
                    // todo change the file location/name according to your needs
//            File futureStudioIconFile = new File(path);
//            if (!futureStudioIconFile.exists()) {
//                futureStudioIconFile.mkdirs();
//            }
                    InputStream inputStream = null;
                    OutputStream outputStream = null;

                    try {
                        byte[] fileReader = new byte[4096];
                        long fileSize = body.contentLength();
                        long fileSizeDownloaded = 0;

                        inputStream = body.byteStream();
                        outputStream = new FileOutputStream(image);

                        while (true) {
                            int read = inputStream.read(fileReader);

                            if (read == -1) {
                                break;
                            }
                            outputStream.write(fileReader, 0, read);
                            fileSizeDownloaded += read;
//                    Log.e(TAG, "file download: " + fileSizeDownloaded + " of " + fileSize);
                        }
                        outputStream.flush();
                        try {
                            MediaStore.Images.Media.insertImage(context.getContentResolver(),
                                    image.getAbsolutePath(), image.getName(), null);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                            return false;
                        }
                        // 最后通知图库更新
                        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                        Uri uri = Uri.fromFile(image);
                        intent.setData(uri);
                        context.sendBroadcast(intent);
                        return true;
                    } catch (IOException e) {
                        return false;
                    } finally {
                        if (inputStream != null) {
                            inputStream.close();
                        }

                        if (outputStream != null) {
                            outputStream.close();
                        }

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.e(TAG, "writeResBodyToDisk: " + e.getLocalizedMessage());
                    return false;
                }

    }
}
