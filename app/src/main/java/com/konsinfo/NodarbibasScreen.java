package com.konsinfo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
    }
}
