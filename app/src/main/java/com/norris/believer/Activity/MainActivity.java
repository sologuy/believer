package com.norris.believer.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Base.BaseActivity;
import com.norris.believer.R;
import com.norris.believer.view.FullLinearLayoutManager;
import com.zhy.adapter.recyclerview.MultiItemTypeAdapter;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;


public class MainActivity extends BaseActivity {
    private static final String TAG = "SettingActivity";
    @Bind(R.id.imgPhoto)
    ImageView imgPhoto;
    @Bind(R.id.recycler)
    RecyclerView recycler;
    @Bind(R.id.swipeLayout)
    SwipeRefreshLayout swipeLayout;

    private List<String> itemNames = new ArrayList<>();
    private CommonRecyAdapter<String> commonAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    private void initView() {
        Glide
                .with(this)
                .load(R.mipmap.init_bg)
                .bitmapTransform(new BlurTransformation(this,80))
                .into(imgPhoto);
        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeLayout.setRefreshing(false);
            }
        });
        swipeLayout.setNestedScrollingEnabled(true);
        swipeLayout.setColorSchemeColors(Color.parseColor("#cc0c7b4a"));

    }

    private void initData() {
        itemNames.add("0花束散开直播1");//Demo 地址  http://blog.csdn.net/z240336124/article/details/50772061
        itemNames.add("1Emoji表情测试");//Demo 地址  https://github.com/rockerhieu/emojicon
        itemNames.add("2长图显示");//Demo 地址  https://github.com/davemorrissey/subsampling-scale-image-view
        itemNames.add("3简单折叠");//Demo 地址  http://blog.csdn.net/zheng_jiao/article/details/76186637
        itemNames.add("4折叠-头部是个人信息");//Demo 地址  https://github.com/stayinxing/CoordinatorLayout
        itemNames.add("5折叠-头部是列表");//Demo 地址
        itemNames.add("6折叠-实战");//Demo 地址
        itemNames.add("7Android阴影实现");//Demo 地址 https://segmentfault.com/a/1190000011809297
        itemNames.add("8自定义View");//Demo 地址 https://segmentfault.com/a/1190000011809297
        itemNames.add("9星级评分");//Demo 地址 https://segmentfault.com/a/1190000011809297
        itemNames.add("10通知和Rxjava");//Demo 地址 https://segmentfault.com/a/1190000011809297
    }

    private void initViewOper() {
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new FullLinearLayoutManager(this) );
        ((SimpleItemAnimator) recycler.getItemAnimator()).setSupportsChangeAnimations(false);

        recycler.setAdapter(commonAdapter = new CommonRecyAdapter<String>
                (this, R.layout.activity_main_recy_item, itemNames) {
            @Override
            protected void convert(ViewHolder holder, String s, int position) {
                holder.setText(R.id.tvItemName, s);
            }
        });

        commonAdapter.setOnItemClickListener(new MultiItemTypeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, RecyclerView.ViewHolder holder, int position) {
                switch (position){
                    case 0:
                        startAct(FlowerActivity.class);
                        break;
                    case 1:
                        startAct(EmojiActivity.class);
                        break;
                    case 2:
                        startAct(LongImgeActivity.class);
                        break;
                    case 3:
                        startAct(AppBarActivity.class);
                        break;
                    case 4:
                        startAct(AppBarActivity1.class);
                        break;
                    case 5:
                        startAct(AppBarActivity2.class);
                        break;
                    case 6:
                        startAct(AppBarActivity3.class);
                        break;
                    case 7:
                        startAct(ShowderActivity.class);
                        break;
                    case 8:
                        startAct(MyViewActivity.class);
                        break;
                    case 9:
                        startAct(StarActivity.class);
                        break;
                    case 10:
                        startAct(NotifyActivity.class);
                        break;
                }
            }

            @Override
            public boolean onItemLongClick(View view, RecyclerView.ViewHolder holder, int position) {
                return false;
            }
        });
    }

}
