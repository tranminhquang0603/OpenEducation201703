package com.example.quang1996.android_06_event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Bat su kien trong java
    //1. Khai bao bien

    private Button mButtonTouchMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2. Anh xa no voi file layout

        mButtonTouchMe = (Button) findViewById(R.id.button_touch_me);

        //3.Bat su kien cho button)
        mButtonTouchMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"click", Toast.LENGTH_SHORT);
    }
}
