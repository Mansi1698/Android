package com.example.mansi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {
    ListView lv;
    //String countries[]={"India","PAKISTAN","China","Japan"};
    String countries[];
    int imgs[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv=findViewById(R.id.lv);
        countries=getResources().getStringArray(R.array.country);
        imgs= new int[]{android.R.drawable.btn_star,android.R.drawable.btn_star,android.R.drawable.btn_star};
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1,countries);
        lv.setAdapter(aa);

//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(ListViewActivity.this, countries[i], Toast.LENGTH_SHORT).show();
//            }
//        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,countries[i],Toast.LENGTH_SHORT).show();
            }
        });
//        CustomAdapter ca = new CustomAdapter(this,countries,imgs);
//        lv.setAdapter(ca);
    }
}
