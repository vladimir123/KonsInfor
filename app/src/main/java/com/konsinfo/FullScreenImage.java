package com.konsinfo;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by vladimir on 22.12.2017.
 */

public class FullScreenImage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image_screen);

        ImageView img = (ImageView)findViewById(R.id.imageView);

        Bundle extras = getIntent().getExtras();
        int res = extras.getInt("image_name");

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FullScreenImage.this.finish();
            }
        });

        img.setImageResource(res);
    }
}
