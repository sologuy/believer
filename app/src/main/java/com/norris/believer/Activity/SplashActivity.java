package com.norris.believer.Activity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;

import com.norris.believer.R;

import java.util.ArrayList;
import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

public class SplashActivity extends Activity implements EasyPermissions.PermissionCallbacks {
    private static final String TAG = "SplashActivity";
    private static final String PERMS_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final String PERMS_CAMERA = Manifest.permission.CAMERA;
    private static final String PERMS_PHONE = Manifest.permission.READ_PHONE_STATE;
    private String[] permsList = new String[]{};
    private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initPerms();
    }

    private void initPerms(){
        if (!EasyPermissions.hasPermissions(this,PERMS_LOCATION)){
            permsList[0] = PERMS_LOCATION;
        }
        if (!EasyPermissions.hasPermissions(this,PERMS_CAMERA)){
            permsList[1] = PERMS_CAMERA;
        }
        if (!EasyPermissions.hasPermissions(this,PERMS_PHONE)){
            permsList[2] = PERMS_PHONE;
        }
        if (EasyPermissions.hasPermissions())
    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);

    }

    @Override
    public void onPermissionsGranted(int requestCode, List<String> perms) {

    }

    @Override
    public void onPermissionsDenied(int requestCode, List<String> perms) {
    }

    private void toMainActivity() {
        SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
