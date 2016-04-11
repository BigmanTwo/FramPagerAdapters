package com.example.asus.frampageradapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Asus on 2016/4/11.
 */
public class FramentThree extends Fragment{
    private ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_style,null);
        imageView= (ImageView) view.findViewById(R.id.image_totle);
        imageView.setImageResource(R.mipmap.water);
        return view;
    }
}
