package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast_display(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
        return;
    }

    public void toast_display1(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Scores App", Toast.LENGTH_SHORT).show();
        return;
    }

    public void toast_display2(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Library App", Toast.LENGTH_SHORT).show();
        return;
    }

    public void toast_display3(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
        return;
    }

    public void toast_display4(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Bacon Reader App", Toast.LENGTH_SHORT).show();
        return;
    }

    public void toast_display5(View view){
        Toast.makeText(MainActivity.this, "This Button will launch my Capstone Project App", Toast.LENGTH_SHORT).show();
        return;
    }
}
