package com.journaldev.navigationdrawer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class Main2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        /**
         * On Click event for Single Gridview Item
         * */
        //lambda expression Code
        //Lambda expressions let you express instances of single-method classes more compactly.
        gridView.setOnItemClickListener((parent,v, position,id)->{

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullscreenActivity.class);
        // passing array index
        i.putExtra("id", position);
        startActivity(i);
    });

        //Normal Java code
        /*
        gridView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // Sending image id to FullScreenActivity
                Intent i = new Intent(getApplicationContext(), FullscreenActivity.class);
                // passing array index
                i.putExtra("id", position);
                startActivity(i);
            }
        }); */
    }
}