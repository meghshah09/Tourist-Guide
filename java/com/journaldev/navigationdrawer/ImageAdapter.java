package com.journaldev.navigationdrawer;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.hma,R.drawable.hmb,R.drawable.hmc,R.drawable.hme,R.drawable.hmf,R.drawable.hmg,R.drawable.hmh,
            R.drawable.hmi,R.drawable.hmj/*,R.drawable.hmk,R.drawable.hml,R.drawable.hmm,R.drawable.hmn,R.drawable.hmo,R.drawable.hmp,R.drawable.hmq,
            R.drawable.hms,R.drawable.hmv,R.drawable.hmw*/


    };

    // Constructor
    public ImageAdapter(Context c){
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