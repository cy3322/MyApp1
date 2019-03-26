package com.example.a16688.myapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class DB  {
    private DBHelper dbHelper;
    SQLiteDatabase db;
    public DB(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        this.dbHelper = new DBHelper(context,name,null,1);
        SQLiteDatabase db=dbHelper.getWritableDatabase();
        //Toast toast=Toast.makeText(context,"make" +
              //  " successfully",Toast.LENGTH_SHORT);
    }
    public void insert(Context context,String s)
    {
        ContentValues values=new ContentValues();
        values.put("tex",s);

        db.insert("Book",null,values);
        values.clear();
        //Toast toast=Toast.makeText(context,"insert successfully",Toast.LENGTH_SHORT);
    }
    public  void delete(Context context,int id)
    {

       db.delete("Book","id=?",new String[]{String.valueOf(id)});
       // Toast toast=Toast.makeText(context,"delete successfully",Toast.LENGTH_SHORT);
    }
    public void update(Context context,int id,String s)
    {
        ContentValues values=new ContentValues();
        values.put("tex",s);
        db.update("Book",values,"id=?",new String[]{s});
      //  Toast toast=Toast.makeText(context,"update successfully",Toast.LENGTH_SHORT);
    }
    public Cursor query()
    {
Cursor cursor=db.query("Book",null,null,null,null,null,null);
return cursor;
    }
}
