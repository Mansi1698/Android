package com.example.mansi.firstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] countries;
    int[] imgs;
    public CustomAdapter(Context context,String[] countries,int[] imgs)
    {
        this.context=context;
        this.countries=countries;
        this.imgs=imgs;
    }


    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_custom_adapter,null);
        TextView tv1= v.findViewById(R.id.tv1);
        ImageView iv1 = v.findViewById(R.id.iv1);
        tv1.setText(countries[i]);
        iv1.setImageResource(imgs[i]);
        return  v;





    }
}
