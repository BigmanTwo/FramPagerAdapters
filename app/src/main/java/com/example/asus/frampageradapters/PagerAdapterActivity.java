package com.example.asus.frampageradapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/11.
 */
public class PagerAdapterActivity extends AppCompatActivity {
    private ViewPager mViewPage;
    private List<View> mList;
    private LayoutInflater mInflater;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageradapter_layout);
        mViewPage=(ViewPager)findViewById(R.id.view_pager);
        mList=new ArrayList<>();
        mInflater=getLayoutInflater();
        mList.add(mInflater.inflate(R.layout.pager1_layout,null));
        mList.add(mInflater.inflate(R.layout.pager2_layout,null));
        mList.add(mInflater.inflate(R.layout.pager3_layout,null));
        MyPagerDapter adapter=new MyPagerDapter(mList);
        mViewPage.setAdapter(adapter);
    }
}
