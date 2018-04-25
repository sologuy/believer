package com.norris.believer.Utils;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.norris.believer.R;


/**
 * Created by wyj on 16/10/1.
 */
public class DialogUtils {

    public static Dialog proDialog;
    private static Dialog dialog;

    /**
     * 得到自定义的progressDialog
     *
     * @param context
     * @param msg
     * @return
     */
    public static Dialog createProgressDialog(Context context, String msg) {
//        LogUtils.e("创建了dialog, 上下文=="+context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_loading_view, null);// 得到加载view

        // 首先得到整个View
        // 获取整个布局
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.dialog_view);
        // 页面中的Img
        ImageView img = (ImageView) view.findViewById(R.id.img);
        // 页面中显示文本
        TextView tipText = (TextView) view.findViewById(R.id.tipTextView);

        // 加载动画，动画用户使img图片不停的旋转
//        Animation animation = AnimationUtils.loadAnimation(context, R.anim.dialog_load_animation);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.loading_animation);

        // 显示动画
        img.startAnimation(animation);
        if (msg != null) {
            tipText.setVisibility(View.VISIBLE);
            // 显示文本
            tipText.setText(msg);
        } else {
            tipText.setVisibility(View.GONE);
        }
        // 创建自定义样式的Dialog
        proDialog = new Dialog(context, R.style.loading_dialog);
        // 设置返回键无效
//        proDialog.setCancelable(false);
        proDialog.setCanceledOnTouchOutside(false);
        proDialog.setContentView(layout, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        proDialog.show();
        return proDialog;
    }

    /**
     * 得到自定义的progressDialog
     *
     * @param context
     * @return
     */
    public static Dialog listenerDialogShow(Context context, mOnConfirmListener onConfirmListener) {
//        LogUtils.e("创建了dialog, 上下文=="+context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.dialog_loading_view, null);// 得到加载view

        // 首先得到整个View
        // 获取整个布局
        LinearLayout layout = (LinearLayout) view.findViewById(R.id.dialog_view);
        // 页面中的Img
        ImageView img = (ImageView) view.findViewById(R.id.img);
        // 页面中显示文本

        // 加载动画，动画用户使img图片不停的旋转
//        Animation animation = AnimationUtils.loadAnimation(context, R.anim.dialog_load_animation);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.loading_animation);

        // 显示动画
        img.startAnimation(animation);
        // 创建自定义样式的Dialog
        dialog = new Dialog(context, R.style.loading_dialog);
        // 设置返回键无效
//        proDialog.setCancelable(false);
        confirmListener = onConfirmListener;

        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(layout, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        dialog.show();
//        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
//            @Override
//            public void onDismiss(DialogInterface dialog) {
//                confirmListener.onConfirmClick();
//                dialog.dismiss();
//            }
//        });
        return dialog;
    }


    /**
     * 关闭Dialog
     */
    public static void dismissProgressDialog() {
        if (proDialog != null && proDialog.isShowing()) {
            proDialog.dismiss();
            proDialog = null;
        }
    }

    /**
     * 关闭Dialog
     */
    public static void dismissListenerDia() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }


    public static void confirmDialog(Context context, String msg, mOnConfirmListener onConfirmListener) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.dialog_confirm_alert, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.alert_dialog_view);// 加载布局
        TextView tvMsg = (TextView) v.findViewById(R.id.alert_message);// 提示文字
        if (msg != null) {
            tvMsg.setText(msg);
        }
        // main.xml中的ImageView
        TextView tvBut = (TextView) v.findViewById(R.id.alert_button);// 提示文字
        confirmListener = onConfirmListener;
        final Dialog alertDialog = new Dialog(context, R.style.load_dialog);
        alertDialog.setCancelable(true);// 不可以用“返回键”取消

        alertDialog.setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.FILL_PARENT));// 设置布局
        tvBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("read4", "点击了确定");

                confirmListener.onConfirmClick();
                alertDialog.dismiss();
            }
        });
        alertDialog.show();


    }

    public static mOnConfirmListener confirmListener;

    public interface mOnConfirmListener {
        void onConfirmClick();
    }

}
