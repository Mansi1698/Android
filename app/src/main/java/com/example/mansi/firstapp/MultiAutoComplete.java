package com.example.mansi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;

public class MultiAutoComplete extends AppCompatActivity {

    MultiAutoCompleteTextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_auto_complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,countries);
        tv = findViewById(R.id.multiAutoCompleteTextView);
        tv.setAdapter(adapter);
        tv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
    private static final String[] countries= new String[]{"Belgium", "France", "Italy", "Germany", "Spain"};
}
