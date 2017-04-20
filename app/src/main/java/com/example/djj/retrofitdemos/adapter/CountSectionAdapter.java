package com.example.djj.retrofitdemos.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.djj.retrofitdemos.R;
import com.truizlop.sectionedrecyclerview.SectionedRecyclerViewAdapter;

/**
 * desc: RecyclerView分段（section）显示的Adapter
 * author: dj
 * date: 2017/3/2 14:02
 */

public class CountSectionAdapter extends SectionedRecyclerViewAdapter<CountHeaderViewHolder,
        CountItemViewHolder,
        CountFooterViewHolder> {

    private Context context;

    public CountSectionAdapter(Context context) {
        this.context = context;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private OnItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    /**
     * 分几段
     * @return
     */
    @Override
    protected int getSectionCount() {
        return 6;
    }

    /**
     * 段下面有多少item
     * @param section
     * @return
     */
    @Override
    protected int getItemCountForSection(int section) {
        return section + 1;
    }

    @Override
    protected boolean hasFooterInSection(int section) {
        return false;
    }

    protected LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(context);
    }

    @Override
    protected CountHeaderViewHolder onCreateSectionHeaderViewHolder(ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.item_title, parent, false);
        return new CountHeaderViewHolder(view);
    }

    @Override
    protected CountFooterViewHolder onCreateSectionFooterViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected CountItemViewHolder onCreateItemViewHolder(ViewGroup parent, int viewType) {
        View view = getLayoutInflater().inflate(R.layout.item_list, parent, false);
        return new CountItemViewHolder(view);
    }

    @Override
    protected void onBindSectionHeaderViewHolder(CountHeaderViewHolder holder, int section) {
        holder.render((section + 9) + ":00");
    }

    @Override
    protected void onBindSectionFooterViewHolder(CountFooterViewHolder holder, int section) {

    }

    @Override
    protected void onBindItemViewHolder(CountItemViewHolder holder, int section, final int position) {
        holder.render(R.drawable.jian, "训练", "跑步，有氧训练；拳击，力量训练；起跳训练;拉伸训练");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick(v, position);
            }
        });
    }
}




