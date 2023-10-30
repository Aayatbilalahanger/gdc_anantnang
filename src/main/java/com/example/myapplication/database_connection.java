package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database_connection extends SQLiteOpenHelper {
private static final String DATABASE_NAME = "collage";
private static final int  VERSION = 1;
    public database_connection(@Nullable Context context) {
        super(context, DATABASE_NAME, null,VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String ON_CREATE_TABLE = "CREATE TABLE info(id INTEGER PRIMARY KEY AUTOINCREMENT , name TEXT , email TEXT , password TEXT,gender TEXT)";
        db.execSQL(ON_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS info");
        onCreate(db);

    }
}
