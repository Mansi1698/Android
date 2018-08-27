package com.example.mansi.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteView extends AppCompatActivity {
    String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_view);
        ArrayAdapter<String > aa = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,fruits);
        AutoCompleteTextView actv =findViewById(R.id.autoCompleteTextView2);
        actv.setThreshold(1);
        actv.setAdapter(aa);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);


    }
}
