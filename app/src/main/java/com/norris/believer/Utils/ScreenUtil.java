package com.norris.believer.Utils;

import android.content.Context;
import android.view.WindowManager;

public class ScreenUtil {
	private static final ScreenUtil instance = new ScreenUtil();
	private Context mContext;
	private ScreenUtil(){
		
	}

	public static ScreenUtil getInstance(){
		return instance;
	}
	
	public int getWindowWidth(Context context){
		WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		return wm.getDefaultDisplay().getWidth();
	}
	
	public int getWindowHeight(Context context){
		WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
		return wm.getDefaultDisplay().getHeight();
	}
	
	public float getWHScale(Context context){
		int width = getWindowWidth(context);
		int height = getWindowHeight(context);
		
		return (float)width/(float)height;
	}
	
	public int getStatusBarHeight(Context context) {
		int result = 0;
		int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
		if (resourceId > 0) {
			result = context.getResources().getDimensionPixelSize(resourceId);
		}
		return result;
	}
	
	public int getOrientation(Context context){
		return context.getResources().getConfiguration().orientation;
	}
}
