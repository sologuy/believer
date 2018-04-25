package com.norris.believer.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by wyj on 2018/4/15.
 */

public class MyTriangleView extends View {
    private OnClickListener onClickListener;
    private OnViewClick onViewClick;
    private int startRawX;
    private int startRawY;

    public MyTriangleView(Context context) {
        this(context, null);
    }

    public MyTriangleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyTriangleView(final Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        this.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ToastUtil.getToastUtil().ToastShow(context,"三角形点击了");
//            }
//        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Path path = new Path();
        path.moveTo(120, 120);
        path.lineTo(20, 293);
        path.lineTo(220, 293);
        path.close();
        canvas.drawPath(path, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        return super.onTouchEvent(event);
        int x = (int) event.getX();
        int y = (int) event.getY();
        int rawX = (int) event.getRawX();
        int rawY = (int) event.getRawY();
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                startRawX = rawX;
                startRawY = rawY;
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                if (x + getLeft() < getRight() && y + getTop() < getBottom()) {
                    onClickListener.onClick(this);
                    onViewClick.onClick(rawX - startRawX, rawY - startRawY);
                }
                break;
                default:
                    break;
        }
        return true;
    }

    @Override
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setOnViewClick(OnViewClick onViewClick) {
        this.onViewClick = onViewClick;
    }

    public interface OnViewClick {
        void onClick(float sX, float sY);
    }
}
