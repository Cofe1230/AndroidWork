package com.example.myapp10_db;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.myapp10_db.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    ActivityMain3Binding binding;
    SQLiteDatabase sqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MydbHelper mydbHelper = new MydbHelper(this);
        binding.dataPicker1.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                String date = i+"."+i1+"."+i2;
                String todo = "";
                sqLiteDatabase = mydbHelper.getWritableDatabase();
                String sql="select content from myDiary where diaryDate="+date;
                Cursor cursor = sqLiteDatabase.rawQuery(sql,null);
                if(cursor.moveToNext()){
                    todo = cursor.getString(0);
                    binding.txtTodo.setText(todo);
                }
                binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                    }
                });
            }
        });

    }
    public class MydbHelper extends SQLiteOpenHelper{

        public MydbHelper(@Nullable Context context) {
            super(context, "myDB", null,1);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("create table myDiary(diaryDate char(10),content varchar(500))");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }
}