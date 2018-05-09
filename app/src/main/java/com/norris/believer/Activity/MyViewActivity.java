package com.norris.believer.Activity;

import android.os.Bundle;
import android.view.View;

import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;
import com.norris.believer.view.MyTriangleView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class MyViewActivity extends BaseActivity {

    @Bind(R.id.myTriangle)
    MyTriangleView myTriangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myview);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {
        myTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loge("点我了");
            }
        });
        myTriangle.setOnViewClick(new MyTriangleView.OnViewClick() {
            @Override
            public void onClick(float sX, float sY) {
                loge("点击后移动了--sX=="+sX+"---sY=="+sY);
            }
        });
    }

    public void initData() {
//        HashMap
    }

    public void initViewOper() {

    }


}
