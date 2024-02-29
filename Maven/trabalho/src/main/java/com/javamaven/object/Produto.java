package com.javamaven.object;

public class Produto {

    private String nome;
    private String desc;
    private String categ;
    private String valor;
    private String qtd;

    public Produto(){

    }

    public Produto(String nome, String desc, String categ, String valor, String qtd){
        this.nome = nome;
        this.desc = desc;
        this.categ = categ;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public String getValor() {
        return valor;
    }
    
    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public String getQtd() {
        return qtd;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
