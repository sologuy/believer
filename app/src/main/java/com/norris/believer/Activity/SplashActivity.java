package com.norris.believer.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.norris.believer.R;

public class SplashActivity extends Activity {
    private static final String TAG = "SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }

}
