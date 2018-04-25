package com.norris.believer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

import com.blankj.utilcode.util.SizeUtils;

/**
 * Created by wyj on 2018/4/15.
 */

public class MyCircleView extends View {

    private int width, height;
    public MyCircleView(Context context) {
//        super(context);
        this(context,null);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
        this(context,null,0);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initCircle( context);
    }

    private void initCircle(Context context){
        WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
//        canvas.drawColor(Color.RED);
        canvas.drawCircle(width/2,height/2,width/3,paint);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(SizeUtils.dp2px(2));
        paint.setColor(Color.RED);
        canvas.drawCircle(width/2,height/2,width/3+SizeUtils.dp2px(2),paint);
    }
}
