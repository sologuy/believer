package com.norris.believer.Utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

/**
 * 保存文件到本地的工具类, 第一个方法用来保存字符串到本地
 * 第二个方法用来保存bitmap 为图片到本地
 * Created by wyj on 16/10/10.
 */
public class SaveAndDeleFileUtils {


    public static void saveFile(String toSaveString) {
        File temp = new File(Environment.getExternalStorageDirectory()
                .getPath() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
        File saveFile = new File(temp.getAbsolutePath() + "/"
                + Calendar.getInstance().getTimeInMillis() + ".txt");
        try {
//            File saveFile = new File(filePath);
            if (!saveFile.exists()) {
                File dir = new File(saveFile.getParent());
                dir.mkdirs();
                saveFile.createNewFile();
            }
            FileOutputStream outStream = new FileOutputStream(saveFile);
            outStream.write(toSaveString.getBytes());
            outStream.close();
            Log.e("Timeory", "保存文件成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSig(Context context, Bitmap bm) {
        File temp = new File(context.getCacheDir().getPath() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
        File saveFile = new File(temp.getAbsolutePath() + "/"
                + "signature.png");
        try {
//            File saveFile = new File(filePath);
            if (!saveFile.exists()) {
                File dir = new File(saveFile.getParent());
                dir.mkdirs();
                saveFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(saveFile);
            bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
            Log.e("reading4", "保存图片成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSigSDcard(Context context, Bitmap bm) {
        File temp = new File(Environment.getExternalStorageDirectory() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
        File saveFile = new File(temp.getAbsolutePath() + "/"
                + "signature.png");
        try {
//            File saveFile = new File(filePath);
            if (!saveFile.exists()) {
                File dir = new File(saveFile.getParent());
                dir.mkdirs();
                saveFile.createNewFile();
            }
            FileOutputStream out = new FileOutputStream(saveFile);
            bm.compress(Bitmap.CompressFormat.PNG, 100, out);
            out.flush();
            out.close();
            Log.e("reading4", "保存图片成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 保存方法
     */
    public static Boolean saveBitmap(Context context, String url) {
        DialogUtils.createProgressDialog(context,null);
        URL myFileUrl;
        Bitmap bm = null;
        HttpURLConnection conn;
        try {
            myFileUrl = new URL(url);
            conn = (HttpURLConnection) myFileUrl.openConnection();
            conn.setDoInput(true);
//            conn.connect();
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            Log.e("reading4", "图片加载1"+conn.getResponseCode());
            InputStream is = conn.getInputStream();
            Log.e("reading4", "图片加载2");
            bm = BitmapFactory.decodeStream(is);
            Log.e("reading4", "图片加载3");
            File f = new File(Environment.getExternalStorageDirectory()
                    .getPath() + "/Reading4", Calendar.getInstance().getTimeInMillis() + ".png");
            if (!f.exists()) {
                f.mkdirs();
            }
            Log.e("reading4", "图片加载4");
            f.createNewFile();
            Log.e("reading4", "图片加载6="+f.getAbsolutePath());
            FileOutputStream out = new FileOutputStream(f);
            bm.compress(Bitmap.CompressFormat.PNG, 100, out);
            out.flush();
            out.close();
            // 其次把文件插入到系统图库
            try {
                MediaStore.Images.Media.insertImage(context.getContentResolver(),
                        f.getAbsolutePath(), f.getName(), null);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return false;
            }
            // 最后通知图库更新
            Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
            Uri uri = Uri.fromFile(f);
            intent.setData(uri);
            context.sendBroadcast(intent);
            Log.e("reading4", "图片已经保存");
            bm.recycle();
            Toast.makeText(context,"保存成功"+f.getAbsolutePath(), Toast.LENGTH_SHORT).show();
            return true;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            Log.e("reading4", "图片保存异常=="+e.getLocalizedMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }finally {
            DialogUtils.dismissProgressDialog();
        }
    }

    private Bitmap returnBitMap(String url) {
        URL myFileUrl;
        Bitmap bitmap = null;
        try {
            myFileUrl = new URL(url);
            HttpURLConnection conn;
            conn = (HttpURLConnection) myFileUrl.openConnection();
            conn.setDoInput(true);
            conn.connect();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }


    /**
     * 保存方法
     */
    public static String saveBitmap2sdCard(Bitmap bm, String bitName) {
        File temp = new File(Environment.getExternalStorageDirectory()
                .getPath() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
//         bitName = Calendar.getInstance().getTimeInMillis()+".jpeg";
        File saveFile = new File(temp.getAbsolutePath() + "/" + bitName);
        if (!saveFile.exists()) {
            File dir = new File(saveFile.getParent());
            dir.mkdirs();
        }
        try {
            FileOutputStream out = new FileOutputStream(saveFile);
            bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
            Log.i("reading4", "bitmap已经保存");
            bm.recycle();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";

        }
        return saveFile.getAbsolutePath();

    }

    /**
     * 保存方法
     */
    public static String saveBit2CardNoRecycle(Bitmap bm, String bitName) {
        File temp = new File(Environment.getExternalStorageDirectory()
                .getPath() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
//         bitName = Calendar.getInstance().getTimeInMillis()+".jpeg";
        File saveFile = new File(temp.getAbsolutePath() + "/" + bitName);
        if (!saveFile.exists()) {
            File dir = new File(saveFile.getParent());
            dir.mkdirs();
        }
        try {
            FileOutputStream out = new FileOutputStream(saveFile);
            bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
            Log.i("reading4", "bitmap已经保存");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";

        }
        return saveFile.getAbsolutePath();

    }

    /**
     * 保存方法
     */
    public static String saveBit2CacheNoRecycle(Context context, Bitmap bm, String bitName) {

        File temp = new File(context.getCacheDir() + "/reading4");// 自已缓存文件夹
        if (!temp.exists()) {
            temp.mkdirs();
        }
//         bitName = Calendar.getInstance().getTimeInMillis()+".jpeg";
        File saveFile = new File(temp.getAbsolutePath() + "/" + bitName);
        if (!saveFile.exists()) {
            File dir = new File(saveFile.getParent());
            dir.mkdirs();
        }
        try {
            FileOutputStream out = new FileOutputStream(saveFile);
            bm.compress(Bitmap.CompressFormat.JPEG, 90, out);
            out.flush();
            out.close();
            Log.i("reading4", "bitmap已经保存");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "reading4";

        }
        return saveFile.getAbsolutePath();

    }


    //删除指定文件夹的所有文件
    public static boolean delAllFile(String path) {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
            } else {
                temp = new File(path + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);// 先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);// 再删除空文件夹
                flag = true;
            }
        }
        return flag;
    }

    //删除文件夹
    public static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath); // 删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete(); // 删除空文件夹
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
