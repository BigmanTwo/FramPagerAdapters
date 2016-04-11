package com.example.asus.frampageradapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/11.
 */
public class FramentAdapterActivity extends AppCompatActivity implements View.OnClickListener{
    private FramentOne framentOne;
    private FramentTwo framentTwo;
    private FramentThree framentThree;
    private ViewPager viewPager;
    private List<Fragment> fragmentList;

    private Button mButton1,mButton2,mButton3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framentpager_layout);

       viewPager=(ViewPager)findViewById(R.id.fragment_pager);
        fragmentList=new ArrayList<>();
        framentOne=new FramentOne();
        framentTwo=new FramentTwo();
        framentThree=new FramentThree();
        fragmentList.add(framentOne);
        fragmentList.add(framentTwo);
        fragmentList.add(framentThree);
        MyFramentAdapter framentAdapter=new MyFramentAdapter(getSupportFragmentManager(),fragmentList);
        viewPager.setAdapter(framentAdapter);
        mButton1=(Button)findViewById(R.id.but_flower);
        mButton1.setOnClickListener(this);
        mButton2=(Button)findViewById(R.id.but_butterfly);
        mButton2.setOnClickListener(this);
        mButton3=(Button)findViewById(R.id.but_water);
        mButton3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.but_flower:
                viewPager.setCurrentItem(0);
                break;
            case R.id.but_butterfly:
                viewPager.setCurrentItem(1);
                break;
            case R.id.but_water:
                viewPager.setCurrentItem(2);
                break;
        }
    }
}
