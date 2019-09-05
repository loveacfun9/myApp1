package com.example.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sql extends SQLiteOpenHelper {
    public sql(Context context, String string, SQLiteDatabase.CursorFactory factory, int version){
        super(context, "user.db", factory, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String creatT="create table user.db(id integer primary key autoincrement,user_name varchar(10) ,user_pwd varchar(10))";
        db.execSQL(creatT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
