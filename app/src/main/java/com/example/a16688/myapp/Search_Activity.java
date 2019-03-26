package com.example.a16688.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class Search_Activity extends AppCompatActivity {
EditText edit=null;
String hinttext="Type someting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_);
        edit=(EditText)findViewById(R.id.edit);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        edit.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                EditText search=(EditText)v;
                if(hasFocus)
                {
                    search.setHint(null);
                    //Toast toast=Toast.makeText(getApplicationContext(),"ccccccc   a",Toast.LENGTH_LONG);
                    //toast.show();
                }
                else
                {
                    search.setHint(hinttext);
                }
            }
        });
    }
}
