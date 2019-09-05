package com.example.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.beautifulflower.register;

public class helper {
    sql s;
    public  helper(Context context){
        s = new sql(context,"user.db",null,1);
    }
    public boolean log(String name,String pwd){
        SQLiteDatabase sdb = s.getReadableDatabase();
        String sq="select * from user where username=? and password=?";
        Cursor cursor = sdb.rawQuery(sq,new String[]{name,pwd});
        if(cursor.moveToFirst() == true){
            cursor.close();
            return true;
        }
        return false;
    }//登录
    public boolean reg(register user){
        SQLiteDatabase sdb = s.getReadableDatabase();
        String re = "insert into user(username,password) values(?,?,?,?)";
        Object obj[]={user.getUsername(),user.getPassword()};
        sdb.execSQL(re);
        return true;
    }
}
