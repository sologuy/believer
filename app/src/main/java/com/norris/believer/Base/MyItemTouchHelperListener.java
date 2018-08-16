package com.norris.believer.Base;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.norris.believer.R;

public class MyItemTouchHelperListener extends ItemTouchHelper.Callback {


    ItemMoveListener itemMoveListener;

    public MyItemTouchHelperListener(ItemMoveListener itemMoveListener) {
        this.itemMoveListener = itemMoveListener;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlags = ItemTouchHelper.UP|ItemTouchHelper.DOWN;
        int swipeFlags = ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT;
        int flags = makeMovementFlags(dragFlags,swipeFlags);
        return flags;
    }
    @Override
    public boolean isLongPressDragEnabled() {
//        return super.isLongPressDragEnabled();
        return true;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return  itemMoveListener.onItemMove(viewHolder.getAdapterPosition(),target.getAdapterPosition());
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        itemMoveListener.onItemRemove(viewHolder.getAdapterPosition());
    }

    @Override
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
        if (actionState==ItemTouchHelper.ACTION_STATE_SWIPE){
            float value = 1 - Math.abs(dX)/viewHolder.itemView.getWidth();
            viewHolder.itemView.setScaleY(value);
            viewHolder.itemView.setAlpha(value);
        }
    }

    @Override
    public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if (actionState!=ItemTouchHelper.ACTION_STATE_IDLE){
            viewHolder.itemView.setBackgroundColor(
                    viewHolder.itemView.getContext().getResources().getColor(R.color.gray));
        }
    }

    @Override
    public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        viewHolder.itemView.setBackgroundColor(viewHolder.itemView.getContext().getResources().getColor(R.color.white));
        viewHolder.itemView.setScaleY(1);
        viewHolder.itemView.setAlpha(1);
    }

    public interface ItemMoveListener{
        boolean onItemMove(int fromPosition,int toPosition);
        boolean onItemRemove(int fromPosition);
    }
}
