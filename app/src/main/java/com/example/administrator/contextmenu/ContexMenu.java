package com.example.administrator.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;

public class ContexMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView tv=new TextView(this);
        registerForContextMenu(tv);
        tv.setText("ContextMenu的载体");
        setContentView(tv);
    }
    public void onCreateContextMenu(ContextMenu menu,View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        menu.add(0,1,1,"新建");
        menu.add(0,2,2,"退出");
        super.onCreateContextMenu(menu,v,menuInfo);
    }
    public boolean onContextItemSelected(MenuItem item){
        super.onContextItemSelected(item);
        switch (item.getItemId()){
            case 1:
                break;
            case 2:
                finish();
        }
        return super.onContextItemSelected(item);
    }
}
