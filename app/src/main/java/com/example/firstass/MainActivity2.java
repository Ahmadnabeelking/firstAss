package com.example.firstass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstass.result.result;
import com.example.firstass.result.resultDa;

public class MainActivity2 extends AppCompatActivity {
   RadioButton one,two,three;
    TextView text,qestion;
    LinearLayout image;
    Button btn,btn12;
    resultDa result = new resultDa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        one= findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        text = findViewById(R.id.exp);
        image = findViewById(R.id.image);
        btn = findViewById(R.id.btn);
        btn12 = findViewById(R.id.go);
        qestion = findViewById(R.id.question);

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btn.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity2.this, "الاجابة صحيحة", Toast.LENGTH_SHORT).show();
                    }
                });
                one.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity2.this, "الاجابة خاطئة", Toast.LENGTH_SHORT).show();
                        btn.setVisibility(View.VISIBLE);
                        image.setVisibility(View.VISIBLE);
                        text.setVisibility(View.VISIBLE);
                    }
                });
                three.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity2.this, "الاجابة خاطئة", Toast.LENGTH_SHORT).show();
                        btn.setVisibility(View.VISIBLE);
                        image.setVisibility(View.VISIBLE);
                        text.setVisibility(View.VISIBLE);
                    }
                });

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                 startActivity(i);
            }
        });

    }
}