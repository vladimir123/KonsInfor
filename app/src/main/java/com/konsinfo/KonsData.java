package com.konsinfo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by vladimir on 01.05.2017.
 */

public class KonsData extends Activity {

    @SuppressLint("LongLogTag")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kons_screen);

        EditText txtView = (EditText)findViewById(R.id.editText);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);

        Log.e("KONS_DATA_EXTRA_POSITIOIN", String.valueOf(position));

        txtView.setText("Clicked => "+ position);
    }
}
