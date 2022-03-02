package com.example.financas.database.model;

public class GastoModel {
    public static final String
            TABELA_NOME = "tb_gasto";

    public static final String
            COLUNA_ID = "_id",
            COLUNA_DESCRICAO = "descricao",
            COLUNA_VALOR = "valor",
            COLUNA_DATA = "data"
            ;



    public static final String CREATE_TABLE = "create table " + TABELA_NOME +"("
            +COLUNA_ID+" integer primary key autoincrement, "
            +COLUNA_DESCRICAO+" text not null, "
            +COLUNA_VALOR+" float not null, "
            +COLUNA_DATA+" date not null, "
           ;

    public static final String DROP_TABLE = "drop table if exists "+TABELA_NOME;
}
