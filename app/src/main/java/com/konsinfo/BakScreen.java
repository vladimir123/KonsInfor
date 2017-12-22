package com.konsinfo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
    private String[] kurss = { "== Izveleties Kursu ==", "1.kurss", "2.kurss", "3.kurss" };
    ArrayList<String> gruppas;
    ArrayAdapter<String> gruppa_adapter;
    ImageView img;

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
//                Toast.makeText(getApplicationContext(), "item => " + position, Toast.LENGTH_LONG).show();

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
                        //show image based on dropdown
                        sp_gruppa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int group_id, long group_value) {
                                if ( group_id > 0 )
                                {
//                                    Toast.makeText(getApplicationContext(), "group selected position => " + group_id + " id => " + group_value, Toast.LENGTH_LONG).show();
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
                        gruppas.add("== Grupas ==");
                        gruppas.add("1.grupa");
                        gruppas.add("2.grupa");
                        gruppas.add("3.grupa");
                        gruppas.add("4.grupa");
                        //display data based on first drop's choice
                        gruppa_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, gruppas);
                        gruppa_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        sp_gruppa.setAdapter(gruppa_adapter);
                        //show image based on dropdown
                        sp_gruppa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int group_id, long group_value) {
                                if ( group_id > 0 )
                                {
//                                    Toast.makeText(getApplicationContext(), "group selected position => " + group_id + " id => " + group_value, Toast.LENGTH_LONG).show();
                                    ShowGraffik(group_id, 2);
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
                    break;
                    case 3:
                        gruppas = new ArrayList<String>();
                        gruppas.add("== Grupas ==");
                        gruppas.add("1.grupa");
                        gruppas.add("2.grupa");
                        gruppas.add("3.grupa");
                        gruppas.add("4.grupa");
                        //display data based on first drop's choice
                        gruppa_adapter = new ArrayAdapter<String>(BakScreen.this, android.R.layout.simple_spinner_item, gruppas);
                        gruppa_adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
                        sp_gruppa.setAdapter(gruppa_adapter);
                        //show image based on dropdown
                        sp_gruppa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                            @Override
                            public void onItemSelected(AdapterView<?> adapterView, View view, int group_id, long group_value) {
                                if ( group_id > 0 )
                                {
//                                    Toast.makeText(getApplicationContext(), "group selected position => " + group_id + " id => " + group_value, Toast.LENGTH_LONG).show();
                                    ShowGraffik(group_id, 3);
                                }
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> adapterView) {

                            }
                        });
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
        final Intent intent = new Intent(BakScreen.this, FullScreenImage.class);

        switch (course)
        {
            case 1:
                switch (group)
                {
                    case 1:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_1));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_1_1);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 2:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_2));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_1_2);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 3:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_3));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_1_3);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 4:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_4));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_1_4);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 5:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_5));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_1_5);
                                startActivity(intent);
                            }
                        });
                    break;
                }
            break;
            case 2:
                switch (group)
                {
                    case 1:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_1));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_2_1);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 2:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_2));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_2_2);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 3:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_3));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_2_3);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 4:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_4));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_2_4);
                                startActivity(intent);
                            }
                        });
                    break;
                }
            break;
            case 3:
                switch (group)
                {
                    case 1:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_1));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_3_1);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 2:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_2));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_3_2);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 3:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_3));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_3_3);
                                startActivity(intent);
                            }
                        });
                    break;
                    case 4:
                        img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_4));
                        img.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                intent.putExtra("image_name", R.drawable.b_gr_3_4);
                                startActivity(intent);
                            }
                        });
                    break;
                }
            break;
        }
    }
}
