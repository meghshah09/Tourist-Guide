package com.journaldev.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

/**
 * Created by Shubham on 12/1/2017.
 */

public class Fullscreen2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter1 imageAdapter = new ImageAdapter1(this);

        ImageView imageView = findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

      //  CustomPagerAdapter mCustomPagerAdapter = new CustomPagerAdapter(this);
        //ViewPager mViewPager = (ViewPager) findViewById(R.id.full_image_view);
    }

}