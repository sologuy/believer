package com.norris.believer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wyj on 2018/4/15.
 */

public class MyRectView extends View {
    public MyRectView(Context context) {
//        super(context);
        this(context,null);
    }

    public MyRectView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
        this(context,null,0);
    }

    public MyRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建画笔
        Paint paint = new Paint();
        //设置实心
        paint.setStyle(Paint.Style.FILL);
        //设置颜色
        paint.setColor(Color.RED);
        //设置锯齿效果
        paint.setAntiAlias(true);
        canvas.drawRect(50,100,300,500,paint);
    }
}
