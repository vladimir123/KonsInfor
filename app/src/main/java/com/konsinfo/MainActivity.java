package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
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

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    //create array with teachers name
    private String[] teachers = new String[]{
            "Prof., Jānis Grabis",
            "Lekt. Mārtiņš Bonders",
            "Doc. Jans Šlihte",
            "Doc. Jānis Kampars",
            "Doc. Solvita Bērziša",
            "Prof. Jurijs Merkurjevs",
            "Prof. Gaļina Merkurjeva",
            "Asoc. profesors, Dr.sc.ing. Arnis Lektauers",
            "Lektore, Dr.sc.ing. Jeļena Pečerska",
            "Lektors, Dr.sc.ing. Vitālijs Boļšakovs",
            "Asoc. Prof.  Andrejs Romānovs",
            "Dr.sc.ing., profesore, Ludmila Aleksejeva",
            "Doc. Sergejs Paršutins",
            "Lekt.  Arnis Kiršners",
            "Lekt. Inese Poļaka",
            "Dr.sc.ing, asoc.prof. Alla Anohina-Naumeca"
    };
    private List<String> teachersList;
    private ArrayAdapter<String> adapter;
    ListView listView;

    //menu items
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(MainActivity.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                    return true;
                case R.id.navigation_about:
                    mTextMessage.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.txt_about);
                    listView.setVisibility(View.INVISIBLE);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        listView = (ListView)findViewById(R.id.teacherList); //get our ListView
        teachersList = new ArrayList<>(); //init teachers array
        Collections.addAll(teachersList, teachers); //fill teachers array
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, teachersList); //set adapter with teachers array
        listView.setAdapter(adapter); //show teachers list

        //send teacher id in list to next activity
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Log.e("KONS_INFO_ITEM_CLICKED", String.valueOf(position));

                //start new activity with teacher id
                Intent intent = new Intent(MainActivity.this, KonsData.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

}
