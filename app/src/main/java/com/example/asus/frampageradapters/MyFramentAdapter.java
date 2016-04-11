package com.example.asus.frampageradapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Asus on 2016/4/11.
 */
public class MyFramentAdapter extends FragmentPagerAdapter {
    private List<Fragment> mList;
    public MyFramentAdapter(FragmentManager fm, List<Fragment> mList) {
        super(fm);
        this.mList = mList;
    }
   public MyFramentAdapter(FragmentManager fm){
       super(fm);
   }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
