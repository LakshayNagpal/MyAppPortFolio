package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast_display(View view){
        String toa = ((Button) view).getText().toString();
        Toast.makeText(MainActivity.this, "This Button will launch my " + toa , Toast.LENGTH_SHORT).show();
        return;
    }

}
