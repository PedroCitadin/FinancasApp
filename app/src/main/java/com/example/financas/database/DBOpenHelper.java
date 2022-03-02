package com.example.financas.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.financas.database.model.GastoModel;


public class DBOpenHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NOME = "bancoviagens.db";
    public static final int DATABASE_VERSAO = 1;
    public DBOpenHelper(final Context contexto){
        super(contexto, DATABASE_NOME, null, DATABASE_VERSAO);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(GastoModel.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(GastoModel.DROP_TABLE);
        db.execSQL(GastoModel.CREATE_TABLE);

    }
}
