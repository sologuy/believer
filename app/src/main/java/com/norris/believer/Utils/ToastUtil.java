package com.norris.believer.Utils;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.norris.believer.R;


/**
 * Created by wyj on 17/3/30.
 */

public class ToastUtil {
    private static ToastUtil toastUtil;

    private Toast toast;

    private ToastUtil(){
    }

    public static ToastUtil getToastUtil(){
        if (toastUtil==null) {
            toastUtil = new ToastUtil();
        }
        return toastUtil;
    }

    /**
     * 显示Toast
     * @param context
     * @param tvString
     */

    public void ToastShow(Context context, String tvString){
        View layout = LayoutInflater.from(context).inflate(R.layout.toast_xml,null);
        TextView tv = (TextView) layout.findViewById(R.id.toast_tv);
        if (tvString!=null){
            tv.setText(tvString);
        }
        toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
