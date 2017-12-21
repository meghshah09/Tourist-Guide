package com.journaldev.navigationdrawer;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

class CustomPagerAdapter extends PagerAdapter {
    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.tma,R.drawable.tmb,R.drawable.tmc,R.drawable.tme,R.drawable.tmd,R.drawable.tmf,R.drawable.tmg,R.drawable.tmh,
            R.drawable.tmi,R.drawable.tmj,R.drawable.tmk,R.drawable.tml,R.drawable.tmm,R.drawable.tmn,R.drawable.tmo,R.drawable.tmp,R.drawable.tmq,
            R.drawable.tmr,R.drawable.tms,R.drawable.tmt


    };

    Context mContext;
    LayoutInflater mLayoutInflater;

    public CustomPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.full_image, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(mThumbIds[position]);

        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
