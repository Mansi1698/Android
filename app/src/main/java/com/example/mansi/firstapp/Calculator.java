package com.example.mansi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btn_one,btn_two,btn_three,btn_four,btn_five,btn_six,btn_seven,btn_eight,btn_nine,btn_zero,btn_equal,btn_backspace;
    Button btn_subtract,btn_multiply,btn_divide,btn_addition,btn_c;
    int operator1,op;
    float num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
      tv=findViewById(R.id.editText);
      btn_addition= findViewById(R.id.btn_addition);
      btn_backspace= findViewById(R.id.btn_backspace);
      btn_c=findViewById(R.id.btn_c);
      btn_multiply=findViewById(R.id.btn_multiply);
      btn_subtract= findViewById(R.id.btn_subtract);
      btn_divide = findViewById(R.id.btn_divide);
      btn_one= findViewById(R.id.btn_one);
      btn_two= findViewById(R.id.btn_two);
      btn_three= findViewById(R.id.btn_three);
      btn_four= findViewById(R.id.btn_four);
      btn_five= findViewById(R.id.btn_five);
      btn_six= findViewById(R.id.btn_six);
      btn_seven= findViewById(R.id.btn_seven);
      btn_eight= findViewById(R.id.btn_eight);
      btn_nine= findViewById(R.id.btn_nine);
      btn_zero= findViewById(R.id.btn_zero);
      btn_equal= findViewById(R.id.btn_equal);

      btn_equal.setOnClickListener(this);
      btn_one.setOnClickListener(this);
      btn_two.setOnClickListener(this);
      btn_three.setOnClickListener(this);
      btn_four.setOnClickListener(this);
      btn_five.setOnClickListener(this);
      btn_six.setOnClickListener(this);
      btn_seven.setOnClickListener(this);
      btn_eight.setOnClickListener(this);
      btn_nine.setOnClickListener(this);
      btn_zero.setOnClickListener(this);
      btn_multiply.setOnClickListener(this);
      btn_divide.setOnClickListener(this);
      btn_addition.setOnClickListener(this);
      btn_subtract.setOnClickListener(this);
      btn_backspace.setOnClickListener(this);
      btn_c.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
            if(view.getId()==R.id.btn_one)
            {
                tv.append("1");
            }
            if(view.getId()==R.id.btn_two)
            {
                tv.append("2");
            }
            if(view.getId()==R.id.btn_three)
            {
                tv.append("3");
            }
            if(view.getId()==R.id.btn_four)
            {
                tv.append("4");
            }
            if(view.getId()==R.id.btn_five)
            {
                tv.append("5");
            }
             if(view.getId()==R.id.btn_six)
             {
                tv.append("6");
             }
             if(view.getId()==R.id.btn_seven)
            {
                tv.append("6");
            }
            if(view.getId()==R.id.btn_eight)
            {
                tv.append("8");
            }
             if(view.getId()==R.id.btn_nine)
            {
                tv.append("9");
            }
            if(view.getId()==R.id.btn_zero)
            {
                tv.append("0");
            }

            if(view.getId()==R.id.btn_addition)
            {
                operator1=Integer.parseInt(tv.getText().toString());
                op='+';
                tv.setText(null);
            }
            if(view.getId()==R.id.btn_subtract)
            {
                operator1= Integer.parseInt(tv.getText().toString());
                op='-';
                tv.setText(null);

            }
        if(view.getId()==R.id.btn_multiply)
        {
            operator1= Integer.parseInt(tv.getText().toString());
            op='*';
            tv.setText(null);

        }
        if(view.getId()==R.id.btn_divide)
        {
            operator1= Integer.parseInt(tv.getText().toString());
            op='/';
            tv.setText(null);

        }
        if(view.getId()==R.id.btn_equal)
        {
            if(view.getId()==R.id.btn_addition){


            }
        }
        }

}
