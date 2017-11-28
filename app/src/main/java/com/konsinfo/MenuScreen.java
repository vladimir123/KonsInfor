package com.konsinfo;

import android.app.Activity;
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

import org.w3c.dom.Text;

/**
 * Created by vladimir on 27.11.2017.
 */

public class MenuScreen extends AppCompatActivity {

    Button btn_kons;
    Button btn_lekcii;
    private TextView mTextMessage;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MenuScreen.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
                    btn_kons.setVisibility(View.INVISIBLE);
                    btn_lekcii.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);
        //set listener on menu item click
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mTextMessage = (TextView)findViewById(R.id.textView);
        btn_kons = (Button)findViewById(R.id.btn_kons);
        btn_lekcii = (Button)findViewById(R.id.btn_lekcii);

        btn_kons.setText(R.string.btn_kons);
        btn_lekcii.setText(R.string.btn_lekcii);

        //show Konsultacijas list
        btn_kons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuScreen.this, Panel.class);
                startActivity(intent);
//                finish();
            }
        });

        //show lekcijas list
        btn_lekcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ///
            }
        });
    }
}
