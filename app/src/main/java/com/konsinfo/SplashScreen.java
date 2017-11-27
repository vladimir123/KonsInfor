package com.konsinfo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ImageView;

/**
 * Created by vladimir on 01.05.2017.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screnn);

        //set our image from drawable folder
        ImageView imageView = (ImageView)findViewById(R.id.img);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.splash_logo);
        imageView.setImageBitmap(bmp);

        try {
            //launch MainActivity from Splash after 2 sec.
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SplashScreen.this, MenuScreen.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
