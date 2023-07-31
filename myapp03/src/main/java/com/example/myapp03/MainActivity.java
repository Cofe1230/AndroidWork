package com.example.myapp03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult,txtResult;
    String txtNum1, txtNum2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        btnMod = findViewById(R.id.btnMod);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtResult = findViewById(R.id.textResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int su1 = Integer.parseInt(num1.getText().toString());
//                int su2 = Integer.parseInt(num2.getText().toString());
//                int sum= su1+su2;

//                textResult.setText(sum+"");

                txtNum1 = num1.getText().toString();
                txtNum2 = num2.getText().toString();
                try{
                    if(txtNum1.trim().equals("") || txtNum2.trim().equals("")){
                        Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT).show();
                        return;
                    }
                    result = Double.parseDouble(txtNum1) + Double.parseDouble(txtNum2);
                    txtResult.setText(result.toString());
                    
                }catch (NumberFormatException e){
                    txtResult.setText("입력오류");
                }
                
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1 = num1.getText().toString();
                txtNum2 = num2.getText().toString();

                if(txtNum1.trim().equals("") || txtNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(txtNum1) - Double.parseDouble(txtNum2);
                txtResult.setText(result.toString());
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1 = num1.getText().toString();
                txtNum2 = num2.getText().toString();

                if(txtNum1.trim().equals("") || txtNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(txtNum1) * Double.parseDouble(txtNum2);
                txtResult.setText(result.toString());
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1 = num1.getText().toString();
                txtNum2 = num2.getText().toString();

                if(txtNum1.trim().equals("") || txtNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(txtNum1) / Double.parseDouble(txtNum2);
                txtResult.setText(result.toString());
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNum1 = num1.getText().toString();
                txtNum2 = num2.getText().toString();
                
                if(txtNum1.trim().equals("") || txtNum2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력 값이 비었습니다",Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(txtNum1) % Double.parseDouble(txtNum2);
                txtResult.setText("나머지 "+result.toString());
            }
        });
    }
}