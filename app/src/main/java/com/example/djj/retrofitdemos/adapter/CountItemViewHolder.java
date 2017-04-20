package com.example.djj.retrofitdemos.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.djj.retrofitdemos.R;

/**
 * desc: CountItemViewHolder
 * author: dj
 * date: 2017/4/19 9:22
 */

public class CountItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView icon;
    public TextView title;
    public TextView desc;

    public CountItemViewHolder(View itemView) {
        super(itemView);
        //由于itemView是item的布局文件，我们需要的是里面的textView，因此利用itemView.findViewById获
        //取里面的textView实例，后面通过onBindViewHolder方法能直接填充数据到每一个textView了
        icon = (ImageView) itemView.findViewById(R.id.item_image);
        title = (TextView) itemView.findViewById(R.id.item_title);
        desc = (TextView) itemView.findViewById(R.id.item_desc);
    }

    public void render(int pic, String text, String text1) {
        icon.setImageResource(pic);
        title.setText(text);
        desc.setText(text1);
    }
}