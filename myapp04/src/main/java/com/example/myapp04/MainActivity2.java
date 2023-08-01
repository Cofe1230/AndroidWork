package com.example.myapp04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text1, text2;
    Switch switchSt;
    RadioGroup rg;
    RadioButton rdoQ, rdoR, rdoS;
    ImageView androidImg;
    Button btnEnd, btnFirst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        switchSt = findViewById(R.id.switchSt);
        rg = findViewById(R.id.rg);
        rdoQ = findViewById(R.id.rdoQ);
        rdoR = findViewById(R.id.rdoR);
        rdoS = findViewById(R.id.rdoS);
        androidImg = findViewById(R.id.androidImg);
        btnEnd = findViewById(R.id.btnEnd);
        btnFirst = findViewById(R.id.btnFirst);

        switchSt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(switchSt.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    androidImg.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    androidImg.setVisibility(View.INVISIBLE);
                }
            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.rdoR){
                    androidImg.setImageResource(R.drawable.r11);
                }else if(i==R.id.rdoS){
                    androidImg.setImageResource(R.drawable.s12);
                }else if(i==R.id.rdoQ){
                    androidImg.setImageResource(R.drawable.q10);
                }
            }
        });
        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });


    }
}