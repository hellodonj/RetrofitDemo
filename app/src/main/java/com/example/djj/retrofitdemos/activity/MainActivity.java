package com.example.djj.retrofitdemos.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.djj.retrofitdemos.R;
import com.example.djj.retrofitdemos.adapter.CountSectionAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private CountSectionAdapter mSectionAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRecyclerView.addItemDecoration(new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL));
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mSectionAdapter = new CountSectionAdapter(MainActivity.this);
        mRecyclerView.setAdapter(mSectionAdapter);
        mSectionAdapter.setOnItemClickListener(new CountSectionAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, "你点击了第" + position + "项", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
