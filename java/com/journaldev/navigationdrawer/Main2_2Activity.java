package com.journaldev.navigationdrawer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

/**
 * Created by Shubham on 12/1/2017.
 */

public class Main2_2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter2(this));

        /**
         * On Click event for Single Gridview Item
         * */
        //lambda expression Code
        //Lambda expressions let you express instances of single-method classes more compactly.
        gridView.setOnItemClickListener((parent, v, position, id) -> {

            // Sending image id to FullScreenActivity
            Intent i = new Intent(getApplicationContext(), Fullscreen3Activity.class);
            // passing array index
            i.putExtra("id", position);
            startActivity(i);
        });

    }
}
