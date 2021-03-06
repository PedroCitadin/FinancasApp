package com.example.financas.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.financas.bean.Gasto;
import com.example.financas.database.DBOpenHelper;
import com.example.financas.database.model.GastoModel;


import java.util.ArrayList;
import java.util.List;

public class GastoDAO extends AbstractDAO{

    private final String[] colunas = {
            GastoModel.COLUNA_ID,
            GastoModel.COLUNA_DESCRICAO,
            GastoModel.COLUNA_VALOR,
            GastoModel.COLUNA_DATA,


    };

    public GastoDAO(final Context contexto){
        db_helper = new DBOpenHelper(contexto);
    }
    public long Insert(Gasto g){
        long linhasAfetadas;
        try{
            Open();
            ContentValues values = new ContentValues();
            values.put(GastoModel.COLUNA_DESCRICAO, g.getDescricao());
            values.put(GastoModel.COLUNA_VALOR, g.getValor());
            values.put(GastoModel.COLUNA_DATA, String.valueOf(g.getData()));


            linhasAfetadas = db.insert(GastoModel.TABELA_NOME, null, values);

        }finally {
            Close();
        }
        return linhasAfetadas;
    }
    /*public long Update(Viagem v){
        long linhasAfetadas = 0;
        try{
            Open();
            ContentValues values = new ContentValues();
            values.put(ViagemModel.COLUNA_PESSOA, v.getPessoa().getId());
            values.put(ViagemModel.COLUNA_TITULO, v.getTitulo());
            values.put(ViagemModel.COLUNA_TOT_VIAJANTES, v.getTot_viajantes());
            values.put(ViagemModel.COLUNA_DURACAO, v.getDuracao());
            values.put(ViagemModel.COLUNA_CUSTO_TOTAL, v.getCusto_total());
            values.put(ViagemModel.COLUNA_CUSTO_POR_PESSOA, v.getCusto_pessoa());
            values.put(ViagemModel.COLUNA_ENTRETENIMENTO, v.isEntretenimento());
            values.put(ViagemModel.COLUNA_REFEICOES, v.isRefeicoes());
            values.put(ViagemModel.COLUNA_GASOLINA, v.isGasolina());
            values.put(ViagemModel.COLUNA_HOSPEDAGEM, v.isHospedagem());
            values.put(ViagemModel.COLUNA_TARIFA_AEREA, v.isTarifa_aerea());

            linhasAfetadas = db.update(ViagemModel.TABELA_NOME, values, ViagemModel.COLUNA_ID+" = ?", new String[]{String.valueOf(v.getId())});
        }finally {
            Close();
        }


        return linhasAfetadas;
    }*/
    public void Delete(Gasto g){
        Open();
       db.delete(GastoModel.TABELA_NOME, GastoModel.COLUNA_ID + "=?", new String[]{String.valueOf(g.getId())});
       Close();
    }
   /* public List<Viagem> Select(Pessoa p){
        List<Viagem> v = new ArrayList<>();
        try{
            Open();
            Cursor cursor = db.query(ViagemModel.TABELA_NOME,
                    colunas,
                    ViagemModel.COLUNA_PESSOA +" = ? ", new String[]{String.valueOf(p.getId())},
                    null,
                    null,
                    null);
            cursor.moveToFirst();
            while(!cursor.isAfterLast()){
                v.add( CursorToStructure(cursor));
                cursor.moveToNext();
            }


        }finally {
            Close();
        }

        return v;
    }
    public final Viagem CursorToStructure(Cursor cursor){
        Viagem v = new Viagem();
        v.setId(cursor.getLong(0));
        v.setPessoa(new Pessoa(cursor.getInt(1)));
        v.setTitulo(cursor.getString(2));
        v.setTot_viajantes(cursor.getInt(3));
        v.setDuracao(cursor.getInt(4));
        v.setCusto_total(cursor.getFloat(5));
        v.setCusto_pessoa(cursor.getFloat(6));
        v.setEntretenimento(Viagem.converterInt(cursor.getInt(7)));
        v.setRefeicoes(Viagem.converterInt(cursor.getInt(8)));
        v.setGasolina(Viagem.converterInt(cursor.getInt(9)));
        v.setHospedagem(Viagem.converterInt(cursor.getInt(10)));
        v.setTarifa_aerea(Viagem.converterInt(cursor.getInt(11)));
        return v;

    }*/
}
