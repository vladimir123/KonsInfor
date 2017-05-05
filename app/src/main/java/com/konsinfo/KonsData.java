package com.konsinfo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by vladimir on 01.05.2017.
 */

public class KonsData extends Activity {

    TextView txt_addr;
    TextView txt_time;
    TextView txt_email;

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kons_screen);

        //TODO: check for tabulation and complete info for other cases

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);

        txt_addr = (TextView)findViewById(R.id.txtAddr);
        txt_time = (TextView)findViewById(R.id.txtTime);
        txt_email = (TextView)findViewById(R.id.txtEmail);

        switch(position)
        {
            case 0:
                txt_addr.append("Sētas iela 1-400A");
                txt_time.append("Otrdiena: 16:00-18:00; Piektdiena: 10:00-12:00");
                txt_email.append("E-mail: Janis.Grabis_1@rtu.lv");
            break;
            case 1:
                txt_addr.append("Daugavgrīvas iela 2-417");
                txt_time.append("Pirmdiena: 11:00-12:30");
                txt_email.append("E-mail: martins.bonders@rtu.lv;");
            break;
            case 2:
                txt_addr.append("Kaļķu iela 1-309");
                txt_time.append("(pēc iepriekšējas vienošanās)");
                txt_email.append("E-mail: jans.slihte@rtu.lv");
            break;
            case 3:
                txt_addr.append("Daugavgrīvas iela 2-406");
                txt_time.append("Pirmdien: 12:30-14:10");
                txt_email.append("E-mail: janis.kampars@rtu.lv");
            break;
            case 4:
                txt_addr.append("S1-410");
                txt_time.append("Pirmdien: 12:00-14:00");
                txt_email.append("E-mail: solvita.berzisa@rtu.lv");
            break;
            case 5:
                txt_addr.append("Modelēšanas un imitācijas katedra - 426");
                txt_time.append("Trešdiena: (p.n.)14:00-15:00");
                txt_email.append("E-mail: Jurijs.Merkurjevs@rtu.lv");
            break;
            case 6:
                txt_addr.append("Modelēšanas un imitācijas katedra - 425");
                txt_time.append("Trešdiena: 14:30-16:00 (nepāra ned.)");
                txt_email.append("E-mail: Galina.Merkurjeva@rtu.lv");
            break;
            case 7:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-422");
                txt_time.append("Ceturtdiena: 08:15-09:15");
                txt_email.append("E-mail: arnis.lektauers@rtu.lv");
            break;
            case 8:
                txt_addr.append("Modelēšanas un imitācijas katedra - 431");
                txt_time.append("Trešdiena: 15:30-17:30");
                txt_email.append("E-mail: jelena@itl.rtu.lv");
            break;
            case 9:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-427");
                txt_time.append("Ceturtdiena: 15:30-17:00");
                txt_email.append("E-mail: vitalijs.bolsakovs@rtu.lv");
            break;
            case 10:
                txt_addr.append("Modelēšanas un imitācijas katedra - 429");
                txt_time.append("Trešdiena: 12:00-13:00 (pāra nedēļas)");
                txt_email.append("E-mail: rew@itl.rtu.lv");
            break;
            case 11:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-459");
                txt_time.append("Otrdiena: 16:00-17:00");
                txt_email.append("E-mail: ludmila.eleksejeva@rtu.lv");
            break;
            case 12:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-488");
                txt_time.append("Otrdiena: 12:00-14:00");
                txt_email.append("E-mail: sergejs.parsutins@rtu.lv");
            break;
            case 13:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-488");
                txt_time.append("Nepāra piektdienās: 16:00-17:30");
                txt_email.append("E-mail: arnis.kirsners@rtu.lv");
            break;
            case 14:
                txt_addr.append("Modelēšanas un imitācijas katedra Daugavgrīvas iela 2-465");
                txt_time.append("(Pēc iepriekšēja pieraksta); Otrdiena: 14:00-16:00; Piektdiena: 14:00-16:00");
                txt_email.append("E-mail: inese.polaka@gmail.com");
            break;
            case 15:
                txt_addr.append("Mākslīgā intelekta un sistēmu inženierijas katedra Daugavgrīvas iela 2 -545");
                txt_time.append("Ceturtdienās 10:00-12:00 (laiks iepriekš jāsaskaņo, izmantojot e-pastu)");
                txt_email.append("E-mail: alla.anohina-naumeca@rtu.lv");
            break;
        }

        txt_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of email");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of email");
                //TODO: ADD E_MAIL ADDRESS SUBSTRING
                intent.setData(Uri.parse("mailto:"+txt_email.getText())); // or just "mailto:" for blank
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
                startActivity(intent);
            }
        });

        Log.e("KONS_DATA_EXTRA_POSITIOIN", String.valueOf(position));
    }
}
