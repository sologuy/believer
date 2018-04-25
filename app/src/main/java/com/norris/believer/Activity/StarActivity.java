package com.norris.believer.Activity;

import android.os.Bundle;
import android.widget.RatingBar;

import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;


public class StarActivity extends BaseActivity{

    private RatingBar rb_normal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {
        rb_normal = (RatingBar) findViewById(R.id.rb_normal);
        rb_normal.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                toast("rating:" + String.valueOf(rating));
            }
        });
    }

    public void initData() {

    }

    public void initViewOper() {

    }


}
