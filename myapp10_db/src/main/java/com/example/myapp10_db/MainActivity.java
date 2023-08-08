package com.example.myapp10_db;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase sqLiteDatabase;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etDB = findViewById(R.id.etDB);
        EditText etTable = findViewById(R.id.etTable);
        textView = findViewById(R.id.textView);

        Button btnDB = findViewById(R.id.btnDB);
        Button btnTable = findViewById(R.id.btnTable);
        Button btnInsert = findViewById(R.id.btnInsert);
        Button btnSelect = findViewById(R.id.btnSelect);

        btnDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                sqLiteDatabase = openOrCreateDatabase(etDB.getText().toString(),
                        MODE_PRIVATE,null);
                output("데이터베이스 생성 : "+ etDB.getText().toString());
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                String tableName = etTable.getText().toString();
                if(sqLiteDatabase==null){
                    output("데이터베이스를 생성하세요");
                    return;
                }
                String sql = "CREATE TABLE if not exists "+tableName+"(" +
                        "id integer primary key autoincrement," +
                        "name text," +
                        "age integer," +
                        "phone text)";
                sqLiteDatabase.execSQL(sql);
                output("테이블 생성 : " +tableName);
            }
        });


    }
    private void output(String str){
        textView.append(str);
    }
}