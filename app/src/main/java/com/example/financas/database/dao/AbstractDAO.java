package com.example.financas.database.dao;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.financas.database.DBOpenHelper;
import com.example.financas.database.DBOpenHelper;

public abstract class AbstractDAO {
    protected SQLiteDatabase db;
    protected DBOpenHelper db_helper;

    protected final void Open() throws SQLException{
        db = db_helper.getWritableDatabase();

    }
    protected final void Close() throws SQLException{
        db_helper.close();
    }
}
