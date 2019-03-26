package com.example.a16688.myapp;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class NewNoteActivity extends AppCompatActivity implements View.OnClickListener{
    DBHelper database=new DBHelper(this,"BookStore.db",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // Button buttonBack=(Button)findViewById(R.id.back);

       // buttonBack.setOnClickListener(this);
        Button B1=(Button)findViewById(R.id.B1);
        B1.setOnClickListener(this);
        Button B2=(Button)findViewById(R.id.B2);
        B2.setOnClickListener(this);
        Button B3=(Button)findViewById(R.id.B3);
        B3.setOnClickListener(this);
        Button B4=(Button)findViewById(R.id.B4);
        B4.setOnClickListener(this);
       // DB db=new DB(this,"BookStore.db",null,1);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.back:{
                Toast toast=Toast.makeText(this,"New note button back click",Toast.LENGTH_SHORT);
                toast.show();

            };break;
            case R.id.B1:{
                Toast toast=Toast.makeText(this,"New note button B1  click",Toast.LENGTH_SHORT);
                toast.show();
                //DB db=new DB(this,"BookStore.db",null,1);
                Toast toast1=Toast.makeText(this,"New note button B11  click",Toast.LENGTH_SHORT);
                toast1.show();
               // db.insert(this,"asdfsadfadsfsad");

                //////////////////////////插入操作
                SQLiteDatabase db=database.getWritableDatabase();
                ContentValues values =new ContentValues();
                values.put("tex","111111111");
                db.insert("Book",null,values);
                values.clear();
                values.put("tex","22222222222");
                db.insert("Book",null,values);

            };break;
            case R.id.B2:{
                //Toast toast=Toast.makeText(this,"New note button B2 click",Toast.LENGTH_SHORT);
                //toast.show();
                //db.delete("Book","id=?",new String[]{String.valueOf(id)});
              //Toast toast=Toast.makeText(context,"delete successfully",Toast.LENGTH_SHORT);
                /////////////////////////删除操作
                SQLiteDatabase db=database.getWritableDatabase();
                int id=1;
                db.delete("Book","id=?",new String[]{String.valueOf(id)});
                Toast toast=Toast.makeText(this,"delete successfully",Toast.LENGTH_SHORT);
             // ContentValues values =new ContentValues();
              //  values.put("tex","33333333333");
              //  db.insert("Book",null,values);
              //  values.clear();
                 //values.put("id","2");
               // values.put("tex","444444444444");
              //  db.insert("Book",null,values);

            };break;
            case R.id.B3:{
                Toast toast=Toast.makeText(this,"New note button B3 click",Toast.LENGTH_SHORT);
                toast.show();
                SQLiteDatabase db=database.getWritableDatabase();
                ContentValues values =new ContentValues();
                String s="new data";
                values.put("tex",s);
                db.update("Book",values,"id=?",new String[]{"2"});
                //values.put("tex","5555555555");
               // db.insert("Book",null,values);
               // values.clear();
                // values.put("id","2");
               // values.put("text","666666666666");
               // db.insert("Book",null,values);
            };break;
            case R.id.B4:{
                Toast toast=Toast.makeText(this,"New note button B3 click",Toast.LENGTH_SHORT);
                toast.show();
                SQLiteDatabase db=database.getWritableDatabase();
                Cursor cursor=db.query("Book",null,null,null,null,null,null);
                if(cursor.moveToFirst())
                {
                    do{
                        int id=cursor.getInt(cursor.getColumnIndex("id"));
                        String s=cursor.getString(cursor.getColumnIndex("tex"));
                        Log.d("NewNoteActivity","ID "+id);
                        Log.d("NewNoteActivity","tex "+s);
                    }while(cursor.moveToNext());
                }
                cursor.close();
               //ContentValues values =new ContentValues();
                //values.put("tex","5555555555");
               // db.insert("Book",null,values);
               // values.clear();
                // values.put("id","2");
                // values.put("text","666666666666");
                // db.insert("Book",null,values);
            };break;

        }
    }
}
