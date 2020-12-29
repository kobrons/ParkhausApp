package com.example.android.parkhausapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout rootViewFull = (LinearLayout) findViewById(R.id.LayoutFullNumbers);
        LinearLayout rootViewHalf = (LinearLayout) findViewById(R.id.LayoutHalfNumbers);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int displayHeight = displayMetrics.heightPixels - 600 ;
        int displayWidth = displayMetrics.widthPixels;

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);

        for (int i = 8; i>=0; i--){
            //-- Erstellen d. Textviews --//
            TextView stageViewFull = new TextView(this);
            TextView stageViewHalf = new TextView(this);

            if (i>0)
                stageViewFull.setText("" + i);
            else
                stageViewFull.setText("E");
            stageViewHalf.setText(i + ".5");

            //-- Hintergrundfarben --//
            stageViewFull.setBackgroundResource(R.color.colorPrimary);
            stageViewHalf.setBackgroundResource(R.color.colorAccent);

            //-- Padding --//
            //stageViewFull.setPadding(50, 40, 50, 40);
            //stageViewHalf.setPadding(50, 40, 50, 40);
            stageViewFull.setPadding((displayWidth/4)-10 ,(displayHeight/18)-10, (displayWidth/4)-10, (displayHeight/18)-10);
            stageViewHalf.setPadding((displayWidth/4)-10 ,(displayHeight/18)-10, (displayWidth/4)-10, (displayHeight/18)-10);

            //-- Margin --//
            params.setMargins(10, 10, 10, 0);



            //-- Casten der Views --//
            stageViewFull.setLayoutParams(params);
            stageViewHalf.setLayoutParams(params);
            rootViewFull.addView(stageViewFull);
            rootViewHalf.addView(stageViewHalf);
        }

    }
}
