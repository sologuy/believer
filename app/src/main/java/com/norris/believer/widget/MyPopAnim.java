package com.norris.believer.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;

import com.norris.believer.R;


public class MyPopAnim extends PopupWindow {
	
	private Context mContext;
	private View view;
	
	
	
    public View getView() {
		return view;
	}



	public void setView(View view) {
		this.view = view;
	}



	public MyPopAnim(Context mContext, int resouceId, View.OnClickListener itemsOnClick) {
	
	    this.view = LayoutInflater.from(mContext).inflate(resouceId, null);
	    
	    // 设置外部可点击 
	    this.setOutsideTouchable(true); 
	    // mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框 
	    this.view.setOnTouchListener(new View.OnTouchListener() {
	  
	      public boolean onTouch(View v, MotionEvent event) {
	  
	        int height = view.findViewById(R.id.pop_layout).getTop();
	  
	        int y = (int) event.getY(); 
	        if (event.getAction() == MotionEvent.ACTION_UP) {
	          if (y < height) { 
	            dismiss();
	          } 
	        } 
	        return true; 
	      } 
	    }); 
	    
	  
	    /* 设置弹出窗口特征 */
	    // 设置视图 
	    this.setContentView(this.view); 
	    // 设置弹出窗体的宽和高 
	    
	    this.setWidth(LayoutParams.FILL_PARENT);
        this.setHeight(LayoutParams.WRAP_CONTENT);
	  
        this.setFocusable(true);  
        this.setAnimationStyle(R.style.AnimBottom);  
        ColorDrawable dw = new ColorDrawable(0xb0000000);
        
        this.setBackgroundDrawable(dw);  
	    this.setAnimationStyle(R.style.AnimBottom); 
	    
	    
		  
	} 
}
