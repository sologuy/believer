package com.norris.believer.Activity;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.Toast;

import com.norris.believer.R;

import java.util.List;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.AppSettingsDialog;
import pub.devrel.easypermissions.EasyPermissions;

public class SplashActivity extends Activity implements EasyPermissions.PermissionCallbacks {
    private static final String TAG = "SplashActivity";
    private static final String PERMS_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    private static final String PERMS_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    private static final String PERMS_PHONE = Manifest.permission.CALL_PHONE;
//     String[] permsList ;
    private String[] locationStorages = new String[]{
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};
     final int RC_STORAGE_AND_LOCATION = 0x12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initPerms();
    }

    @AfterPermissionGranted(RC_STORAGE_AND_LOCATION)
    private void initPerms() {
//        permsList = new String[]{};
//        if (!EasyPermissions.hasPermissions(this, PERMS_LOCATION)) {
//            permsList[0] = PERMS_LOCATION;
//        }
//        if (!EasyPermissions.hasPermissions(this, PERMS_STORAGE)) {
//            permsList[1] = PERMS_STORAGE;
//        }
        if (hasLocationAndStoragePermissions()) {
            //TODO 跳转
            toMainActivity();
        } else {//有一个权限没通过都是false
            EasyPermissions.requestPermissions(this,
                    getString(R.string.rationale_location_storage),
                    RC_STORAGE_AND_LOCATION, locationStorages);
        }
    }

    @Override

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == AppSettingsDialog.DEFAULT_SETTINGS_REQ_CODE) {
            String yes = getString(R.string.yes);
            String no = getString(R.string.no);
            if (!hasLocationAndStoragePermissions()){
                Toast.makeText(this,"没有权限",Toast.LENGTH_LONG).show();
                new AlertDialog.Builder(this)
                        .setTitle("您没有给出权限,应用将不能使用,如要使用请重新打开")
                        .setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).create().show();
            }else {
                Toast.makeText(this,"有权限",Toast.LENGTH_LONG).show();
            }
            // Do something after user returned from app settings screen, like showing a Toast.
//            Toast.makeText(
//                    this,
//                    getString(R.string.returned_from_app_settings_to_activity,
//                            hasCameraPermission() ? yes : no,
//                            hasLocationAndStoragePermissions() ? yes : no,
//                            hasSmsPermission() ? yes : no),
//                    Toast.LENGTH_LONG)
//                    .show();
        }
    }
    private boolean hasCameraPermission() {
        return EasyPermissions.hasPermissions(this, Manifest.permission.CAMERA);
    }

    private boolean hasLocationAndStoragePermissions() {
        return EasyPermissions.hasPermissions(this,locationStorages);
    }

    private boolean hasSmsPermission() {
        return EasyPermissions.hasPermissions(this, Manifest.permission.READ_SMS);
    }

    private boolean hasStoragePermission() {
        return EasyPermissions.hasPermissions(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
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
        Log.d(TAG, "onPermissionsDenied:" + requestCode + ":" + perms.size());

        // (Optional) Check whether the user denied any permissions and checked "NEVER ASK AGAIN."
        // This will display a dialog directing them to enable the permission in app settings.
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new AppSettingsDialog.Builder(this).build().show();
//            for (String str:perms) {
//                Log.d(TAG, "somePermissionPermanentlyDenied: "+str);
//            }
        }else {
            Toast.makeText(this,"用户拒绝了权限",Toast.LENGTH_LONG).show();
            finish();
        }
    }

    private void toMainActivity() {
        SplashActivity.this.startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
