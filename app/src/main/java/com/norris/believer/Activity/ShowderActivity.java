package com.norris.believer.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;
import com.norris.believer.view.ShadowDrawableWrapper;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ShowderActivity extends BaseActivity {

    @Bind(R.id.imageBack)
    ImageView imageBack;
    @Bind(R.id.tvHeaderTitler)
    TextView tvHeaderTitler;
    @Bind(R.id.relativeLayoutHeader)
    RelativeLayout relativeLayoutHeader;
    @Bind(R.id.imgShowder0)
    ImageView imgShowder0;
    @Bind(R.id.imgShowder1)
    ImageView imgShowder1;
    @Bind(R.id.imgShowder2)
    ImageView imgShowder2;
    @Bind(R.id.imgShowder3)
    ImageView imgShowder3;
    private String url = "http://wx.laohoulundao.com/uploads/20171212/20171212174435.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showder);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {
        Glide
                .with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .centerCrop()
                .thumbnail(0.2f)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        ShadowDrawableWrapper shadowDrawableWrapper =
                                new ShadowDrawableWrapper(act, resource, 13, 20, 20);
                        imgShowder0.setBackground(shadowDrawableWrapper);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        imgShowder0.setImageResource(R.mipmap.placeholder_logo);
                    }
                });
        Glide
                .with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .centerCrop()
                .thumbnail(0.2f)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        ShadowDrawableWrapper shadowDrawableWrapper =
                                new ShadowDrawableWrapper(act, resource, 13, 20, 20);
                        imgShowder1.setBackground(shadowDrawableWrapper);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        imgShowder1.setImageResource(R.mipmap.placeholder_logo);
                    }
                });
        Glide
                .with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .centerCrop()
                .thumbnail(0.2f)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        ShadowDrawableWrapper shadowDrawableWrapper =
                                new ShadowDrawableWrapper(act, resource, 13, 20, 20);
                        imgShowder2.setBackground(shadowDrawableWrapper);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        imgShowder2.setImageResource(R.mipmap.placeholder_logo);
                    }
                });
        Glide
                .with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .centerCrop()
                .thumbnail(0.2f)
                .into(new SimpleTarget<GlideDrawable>() {
                    @Override
                    public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
                        ShadowDrawableWrapper shadowDrawableWrapper =
                                new ShadowDrawableWrapper(act, resource, 13, 20, 20);
                        imgShowder3.setBackground(shadowDrawableWrapper);
                    }

                    @Override
                    public void onLoadFailed(Exception e, Drawable errorDrawable) {
                        super.onLoadFailed(e, errorDrawable);
                        imgShowder3.setImageResource(R.mipmap.placeholder_logo);
                    }
                });
    }

    public void initData() {

    }

    public void initViewOper() {

    }


    @OnClick(R.id.imageBack)
    public void onViewClicked() {
    }
}
