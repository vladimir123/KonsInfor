package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vladimir on 04.12.2017.
 */

public class ITData extends AppCompatActivity {

    private TextView mTextMessage;
    ListView lvTeachers;
    //create array with teachers name
    private String[] teachers = new String[]{
            "Prof., Jānis Grabis",
            "Doc. Jānis Kampars",
            "Asoc.prof. Jānis Stirna",
            "Lekt. Lauma Jokste",
            "Lekt. Mārtiņš Bonders",
            "Doc. Jans Šlihte",
            "Doc. Solvita Bērziša",
            "Doc. Vineta Minkēviča",
            "Doc. Vladislavs Minkevičs"
    };
    private List<String> teachersList;
    private ArrayAdapter<String> adapter;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(ITData.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
//                    lv_panel.setVisibility(View.INVISIBLE);
//                    btn_others.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.it_screen);

        //set listener on menu item click
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mTextMessage = (TextView)findViewById(R.id.mTextMessage);
        mTextMessage.setVisibility(View.INVISIBLE);

        lvTeachers = (ListView)findViewById(R.id.teacherList);
        teachersList = new ArrayList<>(); //init teachers array
        Collections.addAll(teachersList, teachers); //fill teachers array
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, teachersList); //set adapter with teachers array
        lvTeachers.setAdapter(adapter); //show teachers list

        //send teacher id in list to next activity
        lvTeachers.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Log.e("KONS_INFO_ITEM_CLICKED", String.valueOf(position));

                //start new activity with teacher id
                Intent intent = new Intent(ITData.this, TeacherInfo.class);
                intent.putExtra("position", position);
                intent.putExtra("name", teachersList.get(position));
                startActivity(intent);
            }
        });
    }
}
