package com.example.myapp06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7_output extends AppCompatActivity {
    private String name,age,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity7_output);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        age = intent.getStringExtra("age");
        phone = intent.getStringExtra("phone");

        TextView tvDisplay = findViewById(R.id.tvDisplay);
        tvDisplay.setText("이름 : " +name +" 나이 : "+age+" 전화번호 : "+phone);
        Button btnMainBack = findViewById(R.id.btnMainBack);



        btnMainBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}