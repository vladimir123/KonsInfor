package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by vladimir on 10.12.2017.
 */

public class AkMagScreen extends AppCompatActivity {

    TextView gr_1_1, gr_2_1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ak_mag_screen);

        gr_1_1 = (TextView)findViewById(R.id.gr_1_1);
        gr_2_1 = (TextView)findViewById(R.id.gr_2_1);

        //click on group course
        gr_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("1", "1");
            }
        });
        gr_2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("1", "2");
            }
        });
    }

    //function for display nodarbibas grafik
    private void ShowGraffik(String group, String course)
    {
        Intent intent = new Intent(AkMagScreen.this, GraffikScreen.class);
        intent.putExtra("gruppa", group);
        intent.putExtra("kurss", course);
        intent.putExtra("kategorija", "aka_mag");
        startActivity(intent);
    }
}
