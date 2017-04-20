package com.example.djj.retrofitdemos.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.djj.retrofitdemos.R;


/**
 * desc: CountHeaderViewHolder
 * author: dj
 * date: 2017/4/19 9:22
 */

public class CountHeaderViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public CountHeaderViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.tv_time);
    }

    public void render(String text) {
        textView.setText(text);
    }
}
