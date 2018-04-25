package com.norris.believer.Activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.blankj.utilcode.util.ScreenUtils;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class LongImgeActivity extends BaseActivity {

    private static final String TAG = "LongImgeActivity";
    @Bind(R.id.imageView)
    SubsamplingScaleImageView imageView;
    @Bind(R.id.recylerview)
    RecyclerView recylerview;

    private CommonRecyAdapter<String> commonRecyAdapter;
    private List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_image);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    public void initView() {

//        imageView.setMinimumScaleType(SCALE_TYPE_CUSTOM);
//        imageView.setMinScale(getFitWidthScale());
//        imageView.setImage(ImageSource.resource(R.mipmap.imglearnroom));
        stringList = new ArrayList<>();
        stringList.add("1");
        recylerview.setLayoutManager(new LinearLayoutManager(this));
        recylerview.setAdapter(commonRecyAdapter = new CommonRecyAdapter<String>(this, R.layout.long_image_list_item, stringList) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {
                holder.setImageResource(R.id.image, R.mipmap.imgsharemind);
                LinearLayout linearLayout = holder.getView(R.id.longimage_item_layout);
                initViewOper(linearLayout);
            }
        });
    }

    public void initData() {

        // 显示处理好的Bitmap图片
//        imageView.setImageBitmap(bitmap);
    }

    public void initViewOper(LinearLayout l) {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.imgsharemind);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Log.e(TAG, "width " + width); //200px
        Log.e(TAG, "height " + height); //200px
//                        imageBookBar.setImageDrawable(resource);
        int mWidth = ScreenUtils.getScreenWidth();
        int mHeight = mWidth * height / width;
        loge("mWidth==" + mWidth);
        loge("mHeight==" + mHeight);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (mWidth, mHeight);
        l.setLayoutParams(layoutParams);
    }

    private float getFitWidthScale() {
        float viewWidth = ScreenUtils.getScreenWidth();
        return viewWidth / getImageWidth();
    }

    private float getImageWidth() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.mipmap.imgsharemind);
        return options.outWidth;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (imageView != null) {
            imageView.recycle();
        }
    }
}
