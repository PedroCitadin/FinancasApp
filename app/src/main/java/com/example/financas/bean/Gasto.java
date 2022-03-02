package com.example.financas.bean;

import java.util.Date;

public class Gasto {
    private int Id;
    private String descricao;
    private Float valor;
    private Date data;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Gasto() {
    }

    public Gasto(String descricao, Float valor, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
}
