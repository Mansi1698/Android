package com.example.mansi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class EmployeeDetails extends AppCompatActivity {
    Button b1;
    EditText e1;
    CheckBox ch1,ch2;
    RadioGroup rg_gender;
    String str_rg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_details);

        b1 = findViewById(R.id.btn_submit);
        e1= findViewById(R.id.et1);
        ch1=findViewById(R.id.cb_travelling);
        ch2= findViewById(R.id.cb_reading);
        rg_gender= findViewById(R.id.radiogroup);
        str_rg="FEMALE";

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeeDetails.this,Calculator.class);
                i.putExtra("empname",e1.getText().toString());
                i.putExtra("gender",str_rg);
                String hobbies[]= new String[2];
                if(ch1.isChecked())
                {
                    hobbies[0]=ch1.getText().toString();
                }
                else if(ch2.isChecked())
                {
                    hobbies[1]=ch2.getText().toString();
                }
                i.putExtra("hobbies",hobbies);
                startActivity(i);

            }
        });
        rg_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i==R.id.rb_female)
                    str_rg="FEMALE";
                else
                    str_rg="MALE";
            }
        });
    }
}
