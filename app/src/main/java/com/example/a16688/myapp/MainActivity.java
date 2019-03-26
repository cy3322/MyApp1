package com.example.a16688.myapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener
{
    DrawerLayout drawer;
    List<ContentModel> list;
    ListView listView;
    private String[] data={"a","cdsa","dsafsadf"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);
        Button buttonBack=(Button)findViewById(R.id.back);
        Button buttonSearch=(Button)findViewById(R.id.button_search);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        buttonBack.setOnClickListener(this);
        buttonSearch.setOnClickListener(this);
         drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
       /*View decorView = getWindow().getDecorView();
        int option = View.SYSTEM_UI_FLAG_FULLSCREEN // 全屏标记
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN // 布局全屏标记，避免退出全屏模式时内容被覆盖
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // 隐藏导航栏标记
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION // 布局隐藏导航栏标记，同理
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY // 粘性沉浸体验
                | View.SYSTEM_UI_FLAG_LAYOUT_STABLE; // 确保上述标记稳定
        decorView.setSystemUiVisibility(option);
        getWindow().setStatusBarColor(Color.TRANSPARENT);// Color.TRANSPARENT = 0 表示#00000000即透明颜色
        getWindow().setNavigationBarColor(Color.TRANSPARENT);*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.guide,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.add:{
                  Toast.makeText(this,"add clicked",Toast.LENGTH_SHORT).show();
                  break;
            }
            case R.id.remove:{
                Toast.makeText(this,"remove clicked",Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.search:{

                Toast.makeText(this,"search clicked",Toast.LENGTH_SHORT).show();
                break;
            }

        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:{
                Toast toast=Toast.makeText(this,"button1 click",Toast.LENGTH_SHORT);
                toast.show();
                Intent intent=new Intent(MainActivity.this,NewNoteActivity.class);
                startActivity(intent);
        };break;
            case R.id.button2:{
                Toast toast=Toast.makeText(this,"button2 click",Toast.LENGTH_SHORT);
                toast.show();

        };break;
            case R.id.button3:{
                Toast toast=Toast.makeText(this,"button3 click",Toast.LENGTH_SHORT);
                toast.show();drawer.openDrawer(Gravity.LEFT);
        };break;
            case R.id.button4:{
                Toast toast=Toast.makeText(this,"button4 click",Toast.LENGTH_SHORT);
                toast.show();

            };break;
            case R.id.back:{
                Toast toast=Toast.makeText(this,"back click",Toast.LENGTH_SHORT);
                toast.show();

            };break;
            case R.id.button_search:{
                Toast toast=Toast.makeText(this,"search click",Toast.LENGTH_SHORT);
                toast.show();
                Intent intent=new Intent(MainActivity.this,Search_Activity.class);
                startActivity(intent);

            };break;
        }


    }



}
