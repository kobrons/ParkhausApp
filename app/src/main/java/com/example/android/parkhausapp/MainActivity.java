package com.example.android.parkhausapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1.0f);

        for (int i = 8; i>=0; i--){
            TextView stageViewFull = new TextView(this);
            TextView stageViewHalf = new TextView(this);
            if (i>0)
                stageViewFull.setText("" + i);
            else
                stageViewFull.setText("");
            stageViewHalf.setText(i + ".5");
            stageViewFull.setBackgroundResource(R.color.colorPrimary);
            stageViewFull.setPadding(25, 25, 25, 25);


            //-- Casten der Views --//
            stageViewFull.setLayoutParams(params);
            stageViewHalf.setLayoutParams(params);
            rootViewFull.addView(stageViewFull);
            rootViewHalf.addView(stageViewHalf);
        }

    }
}
