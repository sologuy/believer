package com.norris.believer.Activity;

import android.os.Bundle;

import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;


public class EmptyActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {

    }

    public void initData() {

    }

    public void initViewOper() {

    }


}
