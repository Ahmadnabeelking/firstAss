package com.example.firstass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstass.result.Student;
import com.google.gson.Gson;

public class MainActivity5 extends AppCompatActivity {
    TextView B,result,thanky;
    EditText name;
    Button save;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        B = findViewById(R.id.B);
        result = findViewById(R.id.result);
        name = findViewById(R.id.name);
        save = findViewById(R.id.save);
        thanky = findViewById(R.id.thank);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String student_name = name.getText().toString();
                Student student = new Student(student_name);
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(MainActivity5.this);
                SharedPreferences.Editor editor = prefs.edit();
                Gson gson = new Gson();
                String student_String = gson.toJson(student);
                editor.putString("", student_String);
                editor.commit();
                Toast.makeText(MainActivity5.this, "الاسم " + student_String,Toast.LENGTH_SHORT).show();
                thanky.setVisibility(View.VISIBLE);
            }
        });



    }
}