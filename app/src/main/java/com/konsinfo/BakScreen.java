package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by vladimir on 08.12.2017.
 */

public class BakScreen extends AppCompatActivity {

    TextView gr_1_1, gr_1_2, gr_1_3, gr_1_4, gr_1_5, gr_2_1, gr_2_2, gr_2_3, gr_2_4, gr_3_1, gr_3_2, gr_3_3, gr_3_4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bak_screen);

        gr_1_1 = (TextView)findViewById(R.id.gr_1_1);
        gr_1_2 = (TextView)findViewById(R.id.gr_1_2);
        gr_1_3 = (TextView)findViewById(R.id.gr_1_3);
        gr_1_4 = (TextView)findViewById(R.id.gr_1_4);
        gr_1_5 = (TextView)findViewById(R.id.gr_1_5);

        gr_2_1 = (TextView)findViewById(R.id.gr_2_1);
        gr_2_2 = (TextView)findViewById(R.id.gr_2_2);
        gr_2_3 = (TextView)findViewById(R.id.gr_2_3);
        gr_2_4 = (TextView)findViewById(R.id.gr_2_4);

        gr_3_1 = (TextView)findViewById(R.id.gr_3_1);
        gr_3_2 = (TextView)findViewById(R.id.gr_3_2);
        gr_3_3 = (TextView)findViewById(R.id.gr_3_3);
        gr_3_4 = (TextView)findViewById(R.id.gr_3_4);


        gr_1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("1", "1");
            }
        });
        gr_1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("2", "1");
            }
        });
        gr_1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("3", "1");
            }
        });
        gr_1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("4", "1");
            }
        });
        gr_1_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowGraffik("5", "1");
            }
        });

    }

    private void ShowGraffik(String group, String course)
    {
        Intent intent = new Intent(BakScreen.this, GraffikScreen.class);
        intent.putExtra("gruppa", group);
        intent.putExtra("kurss", course);
        intent.putExtra("kategorija", "bak");
        startActivity(intent);
    }
}
