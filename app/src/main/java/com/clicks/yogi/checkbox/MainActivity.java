package com.clicks.yogi.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    c1 = findViewById(R.id.c1);
    c2 = findViewById(R.id.c2);
    btn = findViewById(R.id.btn);

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (c1.isChecked() && c2.isChecked()){
                Toast.makeText(MainActivity.this, "Both check...", Toast.LENGTH_SHORT).show();
            }else if (c1.isChecked()){
                Toast.makeText(MainActivity.this, "Android check...", Toast.LENGTH_SHORT).show();
            }else if (c2.isChecked()){
                Toast.makeText(MainActivity.this, "Kotlin check...", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Something went wrong...", Toast.LENGTH_SHORT).show();
            }
        }
    });

    }
}
