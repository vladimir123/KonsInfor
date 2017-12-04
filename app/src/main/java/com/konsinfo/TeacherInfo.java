package com.konsinfo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vladimir on 04.12.2017.
 */

public class TeacherInfo extends AppCompatActivity {

    ImageView img;
    TextView txt_address, txt_email, txt_time, txt_name;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_info);

        //get info from prev. activity which teacher was selected
        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);
        String name = intent.getStringExtra("name");

//        Toast.makeText(getApplicationContext(), "position => "+position, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplicationContext(), "name => "+name, Toast.LENGTH_LONG).show();

        img = (ImageView)findViewById(R.id.img);
        txt_address = (TextView)findViewById(R.id.txtAddr);
        txt_time = (TextView)findViewById(R.id.txtTime);
        txt_email = (TextView)findViewById(R.id.txtEmail);
        txt_name = (TextView)findViewById(R.id.txtName);

        switch(position)
        {
            case 0:
                img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_grabis));
                txt_name.setText(name);
                txt_address.setText("Sētas iela 1-400A, Rīga");
                txt_time.setText("Otrdiena: 16:00-18:00\n" +
                        "Piektdiena: 10:00-12:00\n");
                txt_email.setText("Kontaktinformācija\n" +
                        "Darba tālr.: (+371) 67089515, (+371) 67089509\n" +
                        "Fakss: (+371) 67089513\n" +
                        "E-pasts: Janis.Grabis_1@rtu.lv\n");
            break;
        }
    }
}
