package com.javamaven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.javamaven.object.Produto;

public class ProdutoTest {

    private static final String correctName = "Laranja";
    private static final String correctDesc = "Uma fruta laranja";
    private static final String correctCateg = "Fruta";
    private static final String correctValor = "20,90";
    private static final String correctQtd = "200";


    @Test
    public void correctProduct(){
        Produto produto = new Produto(correctName, correctDesc, correctCateg, correctValor, correctQtd);
        Assertions.assertTrue(produto.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"65065", "laranja3435", "laranja??", "a", ""})
    public void incorrectName(String nome){
        Produto produto = new Produto(nome, correctDesc, correctCateg, correctValor, correctQtd);
        Assertions.assertFalse(produto.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"65065", "iasd3249", "desc??", "asd", ""})
    public void incorrectDesc(String desc){
        Produto produto = new Produto(correctName, desc, correctCateg, correctValor, correctQtd);
        Assertions.assertFalse(produto.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"65065", "frutaq43243435", "fruta!", "a", ""})
    public void incorrectCateg(String categ){
        Produto produto = new Produto(correctName, correctDesc, categ, correctValor, correctQtd);
        Assertions.assertFalse(produto.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"vinte e oito", "vinte e 5", "435!", ""})
    public void incorrectValor(String valor){
        Produto produto = new Produto(correctName, correctDesc, correctCateg, valor, correctQtd);
        Assertions.assertFalse(produto.isValid());
    }

    @ParameterizedTest
    @ValueSource(strings = {"vinte e seis", "trinta e 5", "225!", "23.5"})
    public void incorrectQtd(String qtd){
        Produto produto = new Produto(correctName, correctDesc, correctCateg, correctValor, qtd);
        Assertions.assertFalse(produto.isValid());
    }

}