package com.norris.believer.Utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.norris.believer.R;

/**
 * Created by admin on 2017/5/25.
 */

public class GlideUtils {
    public static void displayGlide(Context context, String url, ImageView image){
        Glide.with(context)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .placeholder(R.mipmap.placeholder)
                .error(R.mipmap.placeholder_blank)
                .into(image);
    }
}
