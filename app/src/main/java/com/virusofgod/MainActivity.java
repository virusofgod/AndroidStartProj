package com.virusofgod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setText("Привет Андройд!");
        textView.setTextSize(22);
        setContentView(textView);

    }
}