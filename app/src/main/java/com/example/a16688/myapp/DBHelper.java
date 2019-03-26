package com.example.a16688.myapp;

import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBHelper extends SQLiteOpenHelper {



    String A=null;
    public static final String CREATE_BOOK="create table Book("
            +"id integer primary key autoincrement,"
            +"tex text)";
    public static final int version1=1;
    private Context mContext;
    public  DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, name, null, version1);
        mContext=context;

    }
    public  void onCreate(SQLiteDatabase db)
    {
        db.execSQL(CREATE_BOOK);
        Toast.makeText(mContext,"create successed",Toast.LENGTH_LONG).show();
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Toast.makeText(mContext,"upgrade successed",Toast.LENGTH_LONG).show();
    }
}
