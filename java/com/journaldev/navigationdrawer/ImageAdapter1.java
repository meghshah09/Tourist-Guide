package com.journaldev.navigationdrawer;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter1 extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.tma,R.drawable.tmb,R.drawable.tmc,R.drawable.tme,R.drawable.tmd,R.drawable.tmf,R.drawable.tmg,R.drawable.tmh,
            R.drawable.tmi,R.drawable.tmj,R.drawable.tmk,R.drawable.tml,R.drawable.tmm,R.drawable.tmn,R.drawable.tmo,R.drawable.tmp,R.drawable.tmq,
            R.drawable.tmr,R.drawable.tms,R.drawable.tmt


    };

    // Constructor
    public ImageAdapter1(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200,200));
        imageView.setPadding(10, 10, 10,10);
        return imageView;
    }

}