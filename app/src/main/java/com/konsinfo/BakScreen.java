package com.konsinfo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vladimir on 08.12.2017.
 */

public class BakScreen extends AppCompatActivity {

    Spinner sp_kurss, sp_gruppa;
    private String[] kurss = { "=== Izveleties Kursu ===", "1.kurss", "2.kurss", "3.kurss" };
    ArrayList<String> gruppas;
    ArrayAdapter<String> gruppa_adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bak_screen);

        sp_kurss = (Spinner)findViewById(R.id.sp_course);
        sp_gruppa = (Spinner)findViewById(R.id.sp_groups);

        //set dropdown with data for course select
        ArrayAdapter<String> kurs_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, kurss);
        kurs_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kurss.setAdapter(kurs_adapter);

        sp_kurss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "item => "+position, Toast.LENGTH_LONG).show();

                //set second dropdown's data
                switch(position)
                {
                    case 1:
                        gruppas = new ArrayList<String>();
                        gruppas.add("1.grupa");
                        gruppas.add("2.grupa");
                        gruppas.add("3.grupa");
                        gruppas.add("4.grupa");
                        gruppas.add("5.grupa");
                        //display data based on first drop's choice
                        gruppa_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, gruppas);
                        gruppa_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        sp_gruppa.setAdapter(gruppa_adapter);
                        sp_gruppa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                                Toast.makeText(getApplicationContext(), "group selected position => "+position+" id => "+id, Toast.LENGTH_LONG).show();

//                                ShowGraffik((int) id, 1);
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                    break;
                    case 2:
                        gruppas = new ArrayList<String>();
                        gruppas.add("1.grupa");
                        gruppas.add("2.grupa");
                        gruppas.add("3.grupa");
                        gruppas.add("4.grupa");
                        //display data based on first drop's choice
                        gruppa_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, gruppas);
                        gruppa_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        sp_gruppa.setAdapter(gruppa_adapter);
                    break;
                    case 3:
                        gruppas = new ArrayList<String>();
                        gruppas.add("1.grupa");
                        gruppas.add("2.grupa");
                        gruppas.add("3.grupa");
                        gruppas.add("4.grupa");
                        //display data based on first drop's choice
                        gruppa_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, gruppas);
                        gruppa_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        sp_gruppa.setAdapter(gruppa_adapter);
                    break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    //function for display nodarbibas grafik
    private void ShowGraffik(int group, int course)
    {
        Intent intent = new Intent(BakScreen.this, GraffikScreen.class);
        intent.putExtra("gruppa", group);
        intent.putExtra("kurss", course);
        intent.putExtra("kategorija", "bak");
        startActivity(intent);
    }
}
