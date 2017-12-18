package com.konsinfo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    ImageView img;
    boolean isImageFitToScreen;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bak_screen);

        sp_kurss = (Spinner)findViewById(R.id.sp_course);
        sp_gruppa = (Spinner)findViewById(R.id.sp_groups);
        img = (ImageView)findViewById(R.id.img);

        //set dropdown with data for course select
        ArrayAdapter<String> kurs_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, kurss);
        kurs_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_kurss.setAdapter(kurs_adapter);

        sp_kurss.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), "item => " + position, Toast.LENGTH_LONG).show();

                //set second dropdown's data
                switch (position)
                {
                    case 1:
                        gruppas = new ArrayList<String>();
                        gruppas.add("== Grupas ==");
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
                            public void onItemSelected(AdapterView<?> adapterView, View view, int group_id, long group_value) {
                                if ( group_id > 0 )
                                {
                                    Toast.makeText(getApplicationContext(), "group selected position => " + group_id + " id => " + group_value, Toast.LENGTH_LONG).show();
                                    ShowGraffik(group_id, 1);
                                }
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
        /*
        Intent intent = new Intent(BakScreen.this, GraffikScreen.class);
        intent.putExtra("gruppa", group);
        intent.putExtra("kurss", course);
        intent.putExtra("kategorija", "bak");
        startActivity(intent);
        */
        switch (course)
        {
            case 1:
                switch (group)
                {
                    case 1:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_1));
                        //TODO: check for resize in Constrain
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if(isImageFitToScreen) {
                                    isImageFitToScreen=false;
//                                    img.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
//                                    ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(365, 450);
//                                    params.setMargins(img.getLeft()-30, img.getTop()-30, img.getRight()+30, img.getBottom()+30);
                                    img.setLayoutParams(new ConstraintLayout.LayoutParams(365, 450));
//                                    img.setLayoutParams(params);
                                    img.setAdjustViewBounds(true);
                                }else{
                                    isImageFitToScreen=true;
//                                    img.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                                    img.setLayoutParams(new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_CONSTRAINT, ConstraintLayout.LayoutParams.MATCH_CONSTRAINT));
                                    img.setScaleType(ImageView.ScaleType.FIT_XY);
                                }
                            }
                        });
                    break;
                    case 2:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_2));
                    break;
                    case 3:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_3));
                    break;
                    case 4:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_4));
                    break;
                    case 5:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_5));
                    break;
                }
            break;
        }
    }
}
