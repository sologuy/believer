package com.norris.believer.Base;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;

public class BaseActivityForPerms extends AppCompatActivity {


    private ProgressDialog dialog;
    private static final String tag = "Reading4";
    public BaseActivityForPerms act;

    @Override
    protected void onCreate(Bundle arg0) {
        // TODO Auto-generated method stub
        super.onCreate(arg0);
        act = this;
    }

    public void startAct(Class<?> cls) {
        startActivity(new Intent(act, cls));

    }
    //可以写在此处 也可以写在工具类中

    /**
     * 用来显示进度对话框,
     *
     * @param flag    是否允许用户取消此对话框 默认为true
     * @param message 提示框中的消息内容
     * @param title   提示框标题
     */
    public ProgressDialog dialogShow(boolean flag, CharSequence message, CharSequence title) {

        dialog = new ProgressDialog(this);
        dialog.setCancelable(flag);
        dialog.setMessage(message);
        dialog.setTitle(title);
        dialog.show();
        return dialog;

    }

    /**
     * 用来关闭dialog的方法,前提是调用过dialog.show();
     */
    public void dialogDismiss() {
//		dialog.setCancelable(true);
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }

    }

    /**
     * 获取文本框中的内容  因为EditText和button都是textView的子类,因此两种都可以传入
     *
     * @param et
     * @return
     */
    public String gettvText(TextView et) {
        return et.getText().toString().trim();
    }

    public String getetText(EditText et) {
        return et.getText().toString().trim();
    }

    /**
     * 打印信息
     *
     * @param text
     */
    public void logi(String text) {
        Log.i(tag, "-->>" + text);
    }

    /**
     * 打印错误信息
     *
     * @param text
     */
    public void loge(String text) {
//        if (BuildConfig.DEBUG) {
        Log.e(tag, "-->>" + text);
//        }
    }

    /**
     * 弹出吐司  3秒钟
     *
     * @param text
     */
    public void toast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public void toastl(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    /**
     * 弹出吐司  3秒钟
     * 弹出图片
     */
    public void toastImage(int resId) {
        Toast t = new Toast(act);
        ImageView imag = new ImageView(act);
        imag.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        imag.setBackgroundColor(Color.BLUE);
        imag.setImageResource(resId);
        t.setView(imag);
        t.setGravity(Gravity.TOP, 0, 0);
        t.show();
    }

    /**
     * 查询ImagView 通过id
     *
     * @param id
     * @return
     */
    public ImageView imagById(int id) {
        return (ImageView) findViewById(id);
    }

    /**
     * 查询ImagView 通过id
     *
     * @param id
     * @return
     */
    public TextView tvById(int id) {
        return (TextView) findViewById(id);
    }

    /**
     * 查询Button 通过id
     *
     * @param id
     * @return
     */
    public Button butById(int id) {
        return (Button) findViewById(id);
    }

    /**
     * 查询EditText 通过id
     *
     * @param id
     * @return
     */
    public EditText etById(int id) {
        return (EditText) findViewById(id);
    }

    /**
     * 查询linearLayout 通过id
     *
     * @param id
     * @return
     */
    public LinearLayout linById(int id) {
        return (LinearLayout) findViewById(id);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);

    }

//    /**
//     * Fragment回调接口
//     */
//    public OnFragmentResult mOnFragmentResult;
//
//    public void setOnFragmentResult(OnFragmentResult onFragmentResult) {
//        mOnFragmentResult = onFragmentResult;
//    }

//    @Subscribe(threadMode = ThreadMode.MAIN)
//    public void onNetChanged(String str) {
//        if (str.equals("netchanged")) {
//            showDialog();
//        }
//    }

    private void showDialog() {
        AlertDialog backDialog = null;
        backDialog = new AlertDialog.Builder(this).setMessage("网络不好, 请设置检查")
                .setPositiveButton("好的", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                }).create();
        backDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                Logger.e("写入了摇一摇数字");
            }
        });
        backDialog.setCanceledOnTouchOutside(true);
        backDialog.setCancelable(true);
        backDialog.getWindow().setType((WindowManager.LayoutParams.TYPE_TOAST));
        backDialog.show();
    }


}

















