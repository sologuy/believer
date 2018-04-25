/**
 * 
 */
package com.norris.believer.Base;

import android.Manifest;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.norris.believer.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

/**
 * 继承了Activity，实现Android6.0的运行时权限检测
 * 需要进行运行时权限检测的Activity可以继承这个类
 * 
 * @创建时间：2016年5月27日 下午3:01:31 
 * @项目名称： AMapLocationDemo
 * @author hongming.wang
 * @文件名称：PermissionsChecker.java
 * @类型名称：PermissionsChecker
 * @since 2.5.0
 */
public class CheckPermissionsActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {

	private ProgressDialog dialog;
	private static final String tag = "Timeory";
	public CheckPermissionsActivity act;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		act = this;
	}

	public void startAct(Class<?> cls) {
		startActivity(new Intent(act, cls));

	}
	//可以写在此处 也可以写在工具类中

	/**
	 * 用来显示进度对话框,
	 *
	 * @param flag    是否允许用户取消此对话框 默认为true
	 * @param message 提示框中的消息内容
	 * @param title   提示框标题
	 */
	public ProgressDialog dialogShow(boolean flag, CharSequence message, CharSequence title) {

		dialog = new ProgressDialog(this);
		dialog.setCancelable(flag);
		dialog.setMessage(message);
		dialog.setTitle(title);
		dialog.show();
		return dialog;

	}

	/**
	 * 用来关闭dialog的方法,前提是调用过dialog.show();
	 */
	public void dialogDismiss() {
//		dialog.setCancelable(true);
		if (dialog != null && dialog.isShowing()) {
			dialog.dismiss();
		}

	}

	/**
	 * 获取文本框中的内容  因为EditText和button都是textView的子类,因此两种都可以传入
	 *
	 * @param et
	 * @return
	 */
	public String gettvText(TextView et) {
		return et.getText().toString().trim();
	}

	public String getetText(EditText et) {
		return et.getText().toString().trim();
	}

	/**
	 * 打印信息
	 *
	 * @param text
	 */
	public void logi(String text) {
		Log.i(tag, "-->>"+text);
	}

	/**
	 * 打印错误信息
	 *
	 * @param text
	 */
	public void loge(String text) {
//		if (BuildConfig.DEBUG)
		Log.e(tag, "-->>"+text);
	}

	/**
	 * 弹出吐司  3秒钟
	 *
	 * @param text
	 */
	public void toast(String text) {

		Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
	}
	public void toastl(String text) {

		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}

	/**
	 * 弹出吐司  3秒钟
	 * 弹出图片
	 */
	public void toast(int resId) {
		Toast t = new Toast(act);
		ImageView imag = new ImageView(act);
		imag.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
		imag.setBackgroundColor(Color.BLUE);
		imag.setImageResource(resId);
		t.setView(imag);
		t.setGravity(Gravity.TOP, 0, 0);
		t.show();
	}

	/**
	 * 查询ImagView 通过id
	 *
	 * @param id
	 * @return
	 */
	public ImageView imagById(int id) {
		return (ImageView) findViewById(id);
	}

	/**
	 * 查询ImagView 通过id
	 *
	 * @param id
	 * @return
	 */
	public TextView tvById(int id) {
		return (TextView) findViewById(id);
	}

	/**
	 * 查询Button 通过id
	 *
	 * @param id
	 * @return
	 */
	public Button butById(int id) {
		return (Button) findViewById(id);
	}

	/**
	 * 查询EditText 通过id
	 *
	 * @param id
	 * @return
	 */
	public EditText etById(int id) {
		return (EditText) findViewById(id);
	}

	/**
	 * 查询linearLayout 通过id
	 *
	 * @param id
	 * @return
	 */
	public LinearLayout linById(int id) {
		return (LinearLayout) findViewById(id);
	}


	@Override
	protected void onDestroy() {
		super.onDestroy();
		ButterKnife.unbind(this);
	}

//    /**
//     * Fragment回调接口
//     */
//    public OnFragmentResult mOnFragmentResult;
//
//    public void setOnFragmentResult(OnFragmentResult onFragmentResult) {
//        mOnFragmentResult = onFragmentResult;
//    }




	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------

	/**
	 * 需要进行检测的权限数组
	 */
	protected String[] needPermissions = {
			Manifest.permission.WRITE_EXTERNAL_STORAGE,
			Manifest.permission.READ_EXTERNAL_STORAGE,
			Manifest.permission.READ_PHONE_STATE
			};
	
	private static final int PERMISSON_REQUESTCODE = 0;
	
	/**
	 * 判断是否需要检测，防止不停的弹框
	 */
	private boolean isNeedCheck = true;
	
	@Override
	protected void onResume() {
		super.onResume();
//		checkUpdate();
		if(isNeedCheck){
			checkPermissions(needPermissions);
		}
	}






	
	/**
	 * 
	 * @since 2.5.0
	 *
	 */
	private void checkPermissions(String... permissions) {
		List<String> needRequestPermissonList = findDeniedPermissions(permissions);
		if (null != needRequestPermissonList
				&& needRequestPermissonList.size() > 0) {
			ActivityCompat.requestPermissions(this,
					needRequestPermissonList.toArray(
							new String[needRequestPermissonList.size()]),
					PERMISSON_REQUESTCODE);
		}
	}

	/**
	 * 获取权限集中需要申请权限的列表
	 * 
	 * @param permissions
	 * @return
	 * @since 2.5.0
	 *
	 */
	private List<String> findDeniedPermissions(String[] permissions) {
		List<String> needRequestPermissonList = new ArrayList<String>();
		for (String perm : permissions) {
			if (ContextCompat.checkSelfPermission(this,
					perm) != PackageManager.PERMISSION_GRANTED
					|| ActivityCompat.shouldShowRequestPermissionRationale(
							this, perm)) {
				needRequestPermissonList.add(perm);
			} 
		}
		return needRequestPermissonList;
	}

	/**
	 * 检测是否说有的权限都已经授权
	 * @param grantResults
	 * @return
	 * @since 2.5.0
	 *
	 */
	private boolean verifyPermissions(int[] grantResults) {
		for (int result : grantResults) {
			if (result != PackageManager.PERMISSION_GRANTED) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] paramArrayOfInt) {
		if (requestCode == PERMISSON_REQUESTCODE) {
			if (!verifyPermissions(paramArrayOfInt)) {
				showMissingPermissionDialog();
				isNeedCheck = false;
			}
		}
	}

	private AlertDialog alertDialog;
	/**
	 * 显示提示信息
	 * 
	 * @since 2.5.0
	 *
	 */
	private void showMissingPermissionDialog() {
		final AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle(R.string.notifyTitle);
		builder.setMessage(R.string.notifyMsg);

		// 拒绝, 退出应用
		builder.setNegativeButton(R.string.cancel,
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
//						finish();
						if (alertDialog!=null){
							alertDialog.dismiss();
						}
					}
				});

		builder.setPositiveButton(R.string.setting,
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						startAppSettings();
					}
				});

		builder.setCancelable(true);

		alertDialog = builder.show();

	}

	/**
	 *  启动应用的设置
	 * 
	 * @since 2.5.0
	 *
	 */
	private void startAppSettings() {
		Intent intent = new Intent(
				Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
		intent.setData(Uri.parse("package:" + getPackageName()));
		startActivity(intent);
	}
	
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		if(keyCode == KeyEvent.KEYCODE_BACK){
//			this.finish();
//			return true;
//		}
//		return super.onKeyDown(keyCode, event);
//	}
		
}
