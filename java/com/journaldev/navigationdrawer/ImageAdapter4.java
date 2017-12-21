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

public class ImageAdapter4 extends BaseAdapter {

    private Context mContext;

    public Integer[] mThumbsId ={
            R.drawable.gpa,R.drawable.gpb,R.drawable.gpc,R.drawable.gpd,R.drawable.gpe,R.drawable.gpf,R.drawable.gpg,R.drawable.gph

    };

    public ImageAdapter4(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return mThumbsId.length;
    }

    @Override
    public Object getItem(int i) {
        return mThumbsId[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbsId[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200,200));
        imageView.setPadding(10, 10, 10,10);
        return imageView;
    }
}
