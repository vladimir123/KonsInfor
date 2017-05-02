package com.konsinfo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
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
                txt_addr.append("\tSētas iela 1-400A");
                txt_time.append("\tOtrdiena: 16:00-18:00\r\nPiektdiena: 10:00-12:00");
                txt_email.append("\tJanis.Grabis_1@rtu.lv");
            break;
        }

        Log.e("KONS_DATA_EXTRA_POSITIOIN", String.valueOf(position));
    }
}
