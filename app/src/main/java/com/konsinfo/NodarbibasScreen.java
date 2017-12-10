package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by vladimir on 07.12.2017.
 */

public class NodarbibasScreen extends AppCompatActivity {

    private TextView mTextMessage;
    Button btn_bak, btn_ak_mag, btn_pro_mag;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(NodarbibasScreen.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
                    btn_bak.setVisibility(View.INVISIBLE);
                    btn_ak_mag.setVisibility(View.INVISIBLE);
                    btn_pro_mag.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nodarbibas_screen);

        //set listener on menu item click
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mTextMessage = (TextView)findViewById(R.id.txt_about);

        btn_bak = (Button)findViewById(R.id.btn_bak);
        btn_ak_mag = (Button)findViewById(R.id.btn_ak_mag);
        btn_pro_mag = (Button)findViewById(R.id.btn_pro_mag);

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
