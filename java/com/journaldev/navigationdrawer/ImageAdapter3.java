package com.journaldev.navigationdrawer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Shubham on 12/2/2017.
 */

public class ImageAdapter3 extends BaseAdapter {

    private Context mContext;


    public Integer[] mThumbIds = {
            R.drawable.maa,R.drawable.mab,R.drawable.mac,R.drawable.mad,R.drawable.mae,R.drawable.mag,R.drawable.mah
    };

    public ImageAdapter3(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbIds[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200,200));
        imageView.setPadding(10, 10, 10,10);
        return imageView;
    }
}
