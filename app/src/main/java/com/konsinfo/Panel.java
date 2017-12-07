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
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by vladimir on 28.11.2017.
 */

public class Panel extends AppCompatActivity {

    private TextView mTextMessage;
    LinearLayout lv_panel;
    Button btn_others, btn_it, btn_mit;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(Panel.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
                    lv_panel.setVisibility(View.INVISIBLE);
                    btn_others.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel);
        //set listener on menu item click
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        lv_panel = (LinearLayout)findViewById(R.id.linearLayout);
        mTextMessage = (TextView)findViewById(R.id.mTextMessage);

        btn_others = (Button)findViewById(R.id.btn_others);
        btn_it = (Button)findViewById(R.id.btn_vik);
        btn_mit = (Button)findViewById(R.id.btn_mik);

        //set IT click
        btn_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Panel.this, ITData.class);
                intent.putExtra("katedra", "iti");
                startActivity(intent);
            }
        });
        //set MIT click
        btn_mit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Panel.this, ITData.class);
                intent.putExtra("katedra", "mit");
                startActivity(intent);
            }
        });
        //set OTHERS click
        btn_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Panel.this, ITData.class);
                intent.putExtra("katedra", "other");
                startActivity(intent);
            }
        });
    }
}
