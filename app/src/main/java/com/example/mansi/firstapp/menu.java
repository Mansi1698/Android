package com.example.mansi.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn= findViewById(R.id.button2);
        registerForContextMenu(btn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Menu Item 1");
        menu.add(1,0,1,"Menu Item 2");
        SubMenu sb =menu.addSubMenu(2,0,2,"Menu Item 3");
        sb.add(0,1,0,"add");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==0)
        {

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
       menu.add(0,0,0,"upload");
       menu.add(0,1,1,"search");
        super.onCreateContextMenu(menu, v, menuInfo);
    }
}
