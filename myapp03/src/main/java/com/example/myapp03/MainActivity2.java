package com.example.myapp03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText edit1;
    Button btnToast, btnHomepage;
    RadioGroup rg;
    ImageView ivAndroid;
    RadioButton rdoOreo,rdoPie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edit1 = findViewById(R.id.edit1);
        btnToast = findViewById(R.id.btnToast);
        btnHomepage = findViewById(R.id.btnHomepage);
        rg = findViewById(R.id.rg);
        ivAndroid = findViewById(R.id.ivAndroid);
        rdoOreo = findViewById(R.id.rdoOreo);
        rdoPie = findViewById(R.id.rdoPie);


        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),edit1.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = edit1.getText().toString();
                Intent intenCall = new Intent(Intent.ACTION_VIEW, Uri.parse(s));

                startActivity(intenCall);
            }
        });
        /*rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.rdoOreo){
                    ivAndroid.setVisibility(View.VISIBLE);
                }
                else{
                    ivAndroid.setVisibility(View.INVISIBLE);
                }
            }
        });*/
        rdoOreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivAndroid.setImageResource(R.drawable.q);
            }
        });
        rdoPie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivAndroid.setImageResource(R.drawable.r);
            }
        });

    }
}