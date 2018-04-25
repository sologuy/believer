package com.norris.believer.Base;


import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


/**
 * 此fragment已经经过了特俗处理,请不要重写onCreateView方法
 *
 * @author wyj
 *
 */
public abstract class BaseV4Fragment extends Fragment {

	private static final String tag = "Reading4";



	/**
	 * 获取文本框中的内容 因为EditText和button都是textView的子类,因此两种都可以传入
	 *
	 * @param et
	 * @return
	 */
	public String gettvText(TextView et) {
		return et.getText().toString().trim();
	}

	/**
	 * 打印信息
	 *
	 * @param text
	 */
	public void logi(String text) {
		Log.i(tag, text);
	}

	/**
	 * 打印错误信息
	 *
	 * @param text
	 */
	public void loge(String text) {
		Log.e(tag, "-->>"+text);
	}

	/**
	 * 弹出吐司 3秒钟
	 *
	 * @param text
	 */
	public void toast(String text) {

		Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
	}
	public void toastL(String text) {

		Toast.makeText(getActivity(), text, Toast.LENGTH_LONG).show();
	}

	/**
	 * 弹出吐司 3秒钟
	 *
	 *    弹出的图片内容
	 */
	public void toast(int resId) {
		Toast t = new Toast(getActivity());
		ImageView imag = new ImageView(getActivity());
		imag.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		imag.setImageResource(resId);
		t.setView(imag);
		t.setGravity(Gravity.CENTER, 0, 0);
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

	public View findViewById(int id) {
		// TODO Auto-generated method stub
		return getView().findViewById(id);
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

}
