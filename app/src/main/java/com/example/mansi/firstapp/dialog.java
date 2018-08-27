package com.example.mansi.firstapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class dialog extends AppCompatActivity {
 Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        b1=findViewById(R.id.btn_date);
        b2= findViewById(R.id.btn_time);
        Log.d("msg","this is a debug message");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(dialog.this,"",Toast.LENGTH_SHORT ).show();
               showDialog(1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(dialog.this,"",Toast.LENGTH_SHORT ).show();
                showDialog(2);
            }
        });

    }


    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == 1) {
            DatePickerDialog dp = new DatePickerDialog(dialog.this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

                }
            }, 2018, 7, 21);


           return dp;
        }
        else
        {
            TimePickerDialog tp = new TimePickerDialog(dialog.this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {

                }
            },5,20,true);
            return tp;
        }
    }
}
