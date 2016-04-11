package com.example.asus.frampageradapters;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Asus on 2016/4/11.
 */
public class MyPagerDapter extends PagerAdapter {
        private List<View> mPagers;

    public MyPagerDapter(List<View> mPagers) {
        this.mPagers = mPagers;
    }

    @Override
    public int getCount() {
        return mPagers.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mPagers.get(position));
        return mPagers.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView(mPagers.get(position));
    }
}
