package com.norris.believer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.blankj.utilcode.util.SizeUtils;
import com.norris.believer.R;

/**
 * Created by android on 2017/12/25.
 */

public class CustomTitleView extends TextView {

    private String mTitleText;//文本
    private int mTitleTextColor;//文本颜色
    private int mTitleTextSize;//文本大小
    private Rect mBound;//绘制文本绘制的范围
    private Paint mPaint;//绘制文本绘制的范围

    public CustomTitleView(Context context) {
        this(context,null);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomTitleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        /**
         * 获得我们所定义的定义样式属性
         */
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomTitleView,defStyleAttr,0);
        int n = array.getIndexCount();//获取下标的数量
        for (int i = 0; i <n ; i++) {
            int attr = array.getIndex(i);
            switch (attr){
                case R.styleable.CustomTitleView_titleText:
                    mTitleText = array.getString(attr);
                    break;
                case R.styleable.CustomTitleView_titleColor:
                    mTitleTextColor = array.getColor(attr, Color.BLACK);
                    break;
                case R.styleable.CustomTitleView_titleSize:
                    mTitleTextSize = array.getDimensionPixelSize(attr, SizeUtils.dp2px(16));
                    break;
            }
        }
        array.recycle();
        /**
         * 获取绘制文本的宽和高
         */
        mPaint = new Paint();
        mPaint.setTextSize(mTitleTextSize);
        mBound = new Rect();
        mPaint.getTextBounds(mTitleText,0,mTitleText.length(),mBound);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(getResources().getColor(R.color.colorPrimary));
        canvas.drawRect(0,0,getMeasuredWidth(),getMeasuredHeight(),mPaint);
        mPaint.setColor(mTitleTextColor);
        canvas.drawText(mTitleText,getWidth()/2-mBound.width()/2,getHeight()/2+mBound.height()/2,mPaint);

    }
}
