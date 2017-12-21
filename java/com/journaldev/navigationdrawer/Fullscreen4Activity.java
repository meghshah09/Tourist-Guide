package com.journaldev.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Shubham on 12/2/2017.
 */

public class Fullscreen4Activity extends Activity {


    public void onCreate(Bundle savedInstance) {

        super.onCreate(savedInstance);
        setContentView(R.layout.full_image);

        Intent i = getIntent();
        int position = i.getExtras().getInt("id");

        ImageAdapter3 imageAdapter = new ImageAdapter3(this);

        ImageView imageView = findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);




    }
}
