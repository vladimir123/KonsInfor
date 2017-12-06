package com.konsinfo;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by vladimir on 04.12.2017.
 */

public class TeacherInfo extends AppCompatActivity {

    ImageView img, img_map;
    TextView txt_address, txt_email, txt_time, txt_name;
    Button btn_email;
    String addr;

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
        btn_email = (Button)findViewById(R.id.btn_email);
        img_map = (ImageView)findViewById(R.id.img_spot);

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

                    addr = "Sētas iela 1";
                break;
                case 1:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_kampars));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-406.telpa, Rīga");
                    txt_time.setText("Pirmdien: 12:30-14:05");
                    txt_email.setText("E-pasts: janis.kampars@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 2:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1  - 400A , Rīga");
                    txt_time.setText("Informācija tiek aktualizēta");
                    txt_email.setText("Fakss: (+371) 67089513\n" +
                            "E-pasts: js@dsv.su.se\n");

                    addr = "Sētas iela 1";
                break;
                case 3:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 1-410 , Rīga");
                    txt_time.setText("Informācija tiek aktualizēta");
                    txt_email.setText("E-pasts: Lauma.Jokste@rtu.lv");

                    addr = "Sētas iela 1";
                break;
                case 4:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-417.telpa, Rīga");
                    txt_time.setText("Pirmdiena: 11:00-12:30");
                    txt_email.setText("E-pasts: martins.bonders@rtu.lv\n" +
                            "Skype: martins.bonders.rtu\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 5:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.janis_slihte));
                    txt_name.setText(name);
                    txt_address.setText("Kaļķu iela 1-309.telpa, Rīga");
                    txt_time.setText("(pēc iepriekšējas vienošanās)");
                    txt_email.setText("Darba tālr.: +371 67089042\n" +
                            "E-pasts: jans.slihte@rtu.lv\n");

                    addr = "Kaļķu iela 1";
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

                    addr = "Sētas iela 1";
                break;
                case 7:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Sētas iela 2 – 410.telpa, Rīga");
                    txt_time.setText("Trešdiena: 10:00-12:00");
                    txt_email.setText("Fakss: (+371) 67089513\n" +
                            "E-pasts: vineta.minkevica@rtu.lv\n");

                    addr = "Sētas iela 2";
                break;
                case 8:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Kaļķu iela 1-309.telpa, Rīga");
                    txt_time.setText("(pēc iepriekšējas vienošanās)");
                    txt_email.setText("E-pasts: vladislavs.minkevics@rtu.lv");

                    addr = "Kaļķu iela 1";
                break;
            }
        }
        else if ( katedra.equals("mit") )
        {
            Toast.makeText(getApplicationContext(), "MIT", Toast.LENGTH_LONG).show();

            switch(position)
            {
                case 0:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.andrejs_romanovs));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-429, Rīga");
                    txt_time.setText("Pirmdiena: (p.n.) 10:00-12:00");
                    txt_email.setText("E-pasts: rew@itl.rtu.lv");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 1:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arnis_lektauers));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-422, Rīga");
                    txt_time.setText("Piektdiena: 8:30-9:30");
                    txt_email.setText("E-pasts: arnis@itl.rtu.lv");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 2:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.arnis_kirsners));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-488, Rīga");
                    txt_time.setText("Piektdiena: 16:30-17:30");
                    txt_email.setText("Darba tālr.: (+371) 67089530\n" +
                            "Fakss: (+371) 67089678\n" +
                            "E-pasts: arnis.kirsners@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 3:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-434.telpa, Rīga");
                    txt_time.setText("Otrdiena: 16:00-18:00 (pēc iepriekšēja pieraksta)");
                    txt_email.setText("E-pasts: egils.ginters@rtu.lv");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 4:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.galina_merkurjeva));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-425.telpa, Rīga");
                    txt_time.setText("Otrdiena:\n" +
                            "16:30-18:05\n" +
                            "(nepāra ned.)\n");
                    txt_email.setText("Darba tālr.: (+371)  67089514\n" +
                            "Fakss: (+371)  67089513\n" +
                            "E-pasts: Galina.Merkurjeva@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 5:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.inese_polaka));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-460.telpa, Rīga");
                    txt_time.setText("Otrdiena: 12:00-14:00\n" +
                            "Piektdiena: 14:00-16:00\n");
                    txt_email.setText("Darba tālr.: (+371) 67089530\n" +
                            "Fakss: (+371) 67089678\n" +
                            "E-pasts: inese.polaka@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 6:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.jurijs_merkurjevs));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-426.telpa, Rīga");
                    txt_time.setText("Trešdiena:\n" +
                            "(p.n.)14:00-15:00\n");
                    txt_email.setText("Darba tālr.: (+371) 67089514\n" +
                            "Fakss: (+371) 67089513  \t\n" +
                            "E-pasts: Jurijs.Merkurjevs@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 7:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.jelena_pecerska));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-431.telpa, Rīga");
                    txt_time.setText("Trešdiena: 16:30-17:30");
                    txt_email.setText("E-pasts: jelena@itl.rtu.lv");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 8:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.jurijs_cizovs));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-460.telpa, Rīga");
                    txt_time.setText("Ceturtdiena: 16:00–18:00");
                    txt_email.setText("Darba tel.: (+371) 67089530\n" +
                            "Fakss: (+371) 67089678\n" +
                            "E-pasts: jurijs.cizovs@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 9:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.ludmila_aleksejeva));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-459.telpa, Rīga");
                    txt_time.setText("Otrdiena: (n.n.) 15:00-17:00 \n" +
                            "(p.n.) 16:00-17:00\n");
                    txt_email.setText("Darba tel.: (+371) 67089589\n" +
                            "Fakss: (+371) 67089678\n" +
                            "E-pasts: ludmila.eleksejeva@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 10:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.sergejs_parsutins));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-488, Rīga");
                    txt_time.setText("Piektdiena: 16:00-17:30");
                    txt_email.setText("Darba tel.: (+371) 67089530\n" +
                            "Fakss: (+371) 67089678\n" +
                            "E-pasts: sergejs.parsutins@rtu.lv\n");

                    addr = "Daugavgrīvas iela 2";
                break;
                case 11:
                    img.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.unknown));
                    txt_name.setText(name);
                    txt_address.setText("Daugavgrīvas iela 2-427.telpa, Rīga");
                    txt_time.setText("Piektdiena: 12:30-14:00");
                    txt_email.setText("E-pasts: vitalijs.bolsakovs@rtu.lv");

                    addr = "Daugavgrīvas iela 2";
                break;
            }
        }

        //send e-mail
        btn_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "email => "+txt_email.getText(), Toast.LENGTH_LONG).show();
                //get e_mail from contacts
                String[] contacts = txt_email.getText().toString().split("E-pasts:");
                String e_mail = contacts[1].trim();

                //send e_mail
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_SUBJECT, "Konsultācija"); //email subject
                intent.putExtra(Intent.EXTRA_TEXT, ""); //e-mail body
                intent.setData(Uri.parse("mailto:"+e_mail)); // or just "mailto:" for blank

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent); //start new intent

            }
        });

        //open map
        img_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("http://maps.google.co.in/maps?q=" + addr);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
            }
        });
    }
}
