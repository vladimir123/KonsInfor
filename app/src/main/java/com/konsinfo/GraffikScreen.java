package com.konsinfo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by vladimir on 10.12.2017.
 */

public class GraffikScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graffik_screen);

        Intent intent = getIntent();
        String kategorija = intent.getStringExtra("kategorija");
        String kurss = intent.getStringExtra("kurss");
        String gruppa = intent.getStringExtra("gruppa");

        ImageView img = (ImageView)findViewById(R.id.img_graffik);

        switch(kategorija)
        {
            case "bak":
                switch(kurss)
                {
                    case "1":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_1));
                            break;
                            case "2":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_2));
                            break;
                            case "3":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_3));
                            break;
                            case "4":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_4));
                            break;
                            case "5":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_1_5));
                            break;
                        }
                    break;
                    case "2":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_1));
                            break;
                            case "2":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_2));
                            break;
                            case "3":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_3));
                            break;
                            case "4":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_2_4));
                            break;
                        }
                    break;
                    case "3":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_1));
                            break;
                            case "2":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_2));
                            break;
                            case "3":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_3));
                            break;
                            case "4":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.b_gr_3_4));
                            break;
                        }
                    break;
                }
            break;
            case "aka_mag":
                switch(kurss)
                {
                    case "1":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.am_gr_1_1));
                            break;
                        }
                    break;
                    case "2":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.am_gr_2_1));
                                break;
                        }
                    break;
                }
            break;
            case "pro_mag":
                switch(kurss)
                {
                    case "1":
                        switch(gruppa)
                        {
                            case "1":
                                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.prm_gr_1_1));
                            break;
                        }
                    break;
                }
            break;
        }
    }
}
