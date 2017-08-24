package com.example.anadministrator.monthlast;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by 张祺钒
 * on2017/8/24.
 */

public class Dao {
    public void insert(SQLiteDatabase db,String tableName,String columnsName1,String columnsValue, String columnsName2,String columnsValue2){
        ContentValues values=new ContentValues();
        values.put(columnsName1,columnsValue);
        values.put(columnsName2,columnsValue2);
        db.insert(tableName,null,values);
    }
}
