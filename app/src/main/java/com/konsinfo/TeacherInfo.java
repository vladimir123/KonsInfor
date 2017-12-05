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
        String katedra = intent.getStringExtra("katedra");

        Toast.makeText(getApplicationContext(), "position => "+position, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "name => "+name, Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "katedra => "+katedra, Toast.LENGTH_LONG).show();

        img = (ImageView)findViewById(R.id.img);
        txt_address = (TextView)findViewById(R.id.txtAddr);
        txt_time = (TextView)findViewById(R.id.txtTime);
        txt_email = (TextView)findViewById(R.id.txtEmail);
        txt_name = (TextView)findViewById(R.id.txtName);

        if ( katedra.equals("iti") )
        {
            switch (position)
            {
                case 0:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_grabis));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1-400A, Rīga");
                    txt_time.setText("Otrdiena: 16:00-18:00\n" +
                            "Piektdiena: 10:00-12:00\n");
                    txt_email.setText("Darba tālr.: (+371) 67089515, (+371) 67089509\n" +
                            "Fakss: (+371) 67089513\n" +
                            "E-pasts: Janis.Grabis_1@rtu.lv\n");
                break;
                case 1:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_kampars));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-406.telpa, Rīga");
                    txt_time.setText("Pirmdien: 12:30-14:05");
                    txt_email.setText("E-pasts: janis.kampars@rtu.lv\n");
                break;
                case 2:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1  - 400A , Rīga");
                    txt_time.setText("Informācija tiek aktualizēta");
                    txt_email.setText("Fakss: (+371) 67089513\n" +
                            "E-pasts: js@dsv.su.se\n");
                break;
                case 3:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1-410 , Rīga");
                    txt_time.setText("Informācija tiek aktualizēta");
                    txt_email.setText("E-pasts: Lauma.Jokste@rtu.lv");
                break;
                case 4:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-417.telpa, Rīga");
                    txt_time.setText("Pirmdiena: 11:00-12:30");
                    txt_email.setText("E-pasts: martins.bonders@rtu.lv\n" +
                            "Skype: martins.bonders.rtu\n");
                break;
                case 5:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_slihte));
                    txt_name.setText(name);
                    txt_address.setText("Kaļķu iela 1-309.telpa, Rīga");
                    txt_time.setText("(pēc iepriekšējas vienošanās)");
                    txt_email.setText("Darba tālr.: +371 67089042\n" +
                            "E-pasts: jans.slihte@rtu.lv\n");
                break;
                case 6:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.solviya_berzisa));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1-410.telpa, Rīga");
                    txt_time.setText("Trešdiena:\n" +
                            "(p.n.) 8:00-9:00\n" +
                            "(pēc iepriekšējas vienošanās)\n");
                    txt_email.setText("Fakss: (+371) 67089513\n" +
                            "E-pasts: Solvita.Berzisa@rtu.lv\n");
                break;
                case 7:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 2 – 410.telpa, Rīga");
                    txt_time.setText("Trešdiena: 10:00-12:00");
                    txt_email.setText("Fakss: (+371) 67089513\n" +
                            "E-pasts: vineta.minkevica@rtu.lv\n");
                break;
                case 8:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Kaļķu iela 1-309.telpa, Rīga");
                    txt_time.setText("(pēc iepriekšējas vienošanās)");
                    txt_email.setText("E-pasts: vladislavs.minkevics@rtu.lv");
                break;
            }
        }
        else if ( katedra.equals("mit") )
        {
            Toast.makeText(getApplicationContext(), "MIT", Toast.LENGTH_LONG).show();
        }
    }
}
