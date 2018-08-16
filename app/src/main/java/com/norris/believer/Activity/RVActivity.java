package com.norris.believer.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.norris.believer.Adapter.CommonRecyAdapter;
import com.norris.believer.Base.BaseActivity;
import com.norris.believer.Base.ItemDragListener;
import com.norris.believer.Base.MyItemTouchHelperListener;
import com.norris.believer.R;
import com.zhy.adapter.recyclerview.base.ViewHolder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;



public class RVActivity extends BaseActivity implements ItemDragListener, MyItemTouchHelperListener.ItemMoveListener {

    @Bind(R.id.recyclerView)
    RecyclerView recyclerView;
    ItemTouchHelper itemTouchHelper ;

    ItemDragListener itemDragListener;
    CommonRecyAdapter<String> commonRecyAdapter;
    List<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_helper);
        ButterKnife.bind(this);
        initView();
        initData();
        initViewOper();
    }

    public void initView() {
        strings = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            strings.add("item---"+i);
        }
        MyItemTouchHelperListener myItem  = new MyItemTouchHelperListener(this);
        itemTouchHelper = new ItemTouchHelper(myItem);
        itemTouchHelper.attachToRecyclerView(recyclerView);
        recyclerView.setHasFixedSize(true);
         itemDragListener = this ;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ((SimpleItemAnimator) recyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        recyclerView.setAdapter(commonRecyAdapter = new CommonRecyAdapter<String>(this,R.layout.item_touch_helper,strings) {
            @Override
            protected void convert(final ViewHolder holder, String s, int position) {
                holder.setText(R.id.textView,s);
                ImageView pull = holder.getView(R.id.iconPull);
                pull.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
itemDragListener.onStartDrag(holder);
                        return false;
                    }
                });

            }

        });
    }

    public void initData() {

    }

    public void initViewOper() {

    }


    @Override
    public void onStartDrag(ViewHolder holder) {
        itemTouchHelper.startDrag(holder);
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(strings,fromPosition,toPosition);
        commonRecyAdapter.notifyItemMoved(fromPosition,toPosition);
        return true;
    }

    @Override
    public boolean onItemRemove(int fromPosition) {
        strings.remove(fromPosition);
        commonRecyAdapter.notifyItemRemoved(fromPosition);
        return true;
    }
}
