package com.example.firstass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView B,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        B = findViewById(R.id.B);
        result = findViewById(R.id.result);

    }
}