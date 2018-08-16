package com.norris.believer.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.norris.believer.R;

import java.util.List;

public class MainRecyAdapter extends RecyclerView.Adapter<MainRecyAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }
    Context context;
    List<String> strings;
    OnItemClickListener onItemClickListener;

    public MainRecyAdapter(Context context, List<String> strings) {
        this.context = context;
        this.strings = strings;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_main_recy_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.fruitName.setText(strings.get(position));
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onItemClick(v,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView fruitName;

        public ViewHolder(View view) {
            super(view);
            cardView = (CardView) view;
            fruitName = (TextView) view.findViewById(R.id.tvItemName);
        }
    }
}
