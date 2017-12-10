package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by vladimir on 07.12.2017.
 */

public class NodarbibasScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nodarbibas_screen);

        Button btn_bak = (Button)findViewById(R.id.btn_bak);
        Button btn_ak_mag = (Button)findViewById(R.id.btn_ak_mag);
        Button btn_pro_mag = (Button)findViewById(R.id.btn_pro_mag);

        btn_bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NodarbibasScreen.this, BakScreen.class);
                startActivity(intent);
            }
        });
        btn_ak_mag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NodarbibasScreen.this, AkMagScreen.class);
                startActivity(intent);
            }
        });
        btn_pro_mag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NodarbibasScreen.this, ProMagScreen.class);
                startActivity(intent);
            }
        });
    }
}
