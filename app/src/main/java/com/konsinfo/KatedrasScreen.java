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
 * Created by vladimir on 27.11.2017.
 */

public class KatedrasScreen extends AppCompatActivity {

    private TextView mTextMessage;
    Button btn_iti, btn_vik, btn_mik, btn_others;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(KatedrasScreen.this, MenuScreen.class);
                    startActivity(intent);
//                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
                    btn_iti.setVisibility(View.INVISIBLE);
                    btn_mik.setVisibility(View.INVISIBLE);
                    btn_vik.setVisibility(View.INVISIBLE);
                    btn_others.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.katedras_list);
        //set listener on menu item click
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mTextMessage = (TextView)findViewById(R.id.textView2);
        btn_iti = (Button)findViewById(R.id.btn_iti);
        btn_mik = (Button)findViewById(R.id.btn_mik);
        btn_vik = (Button)findViewById(R.id.btn_vik);
        btn_others = (Button)findViewById(R.id.btn_others);

        btn_iti.setText(R.string.btn_iti);
        btn_mik.setText(R.string.btn_mik);
        btn_vik.setText(R.string.btn_vik);
        btn_others.setText(R.string.btn_others);
    }

}
