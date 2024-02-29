package com.javamaven.service;

import java.util.List;
import java.util.Scanner;

import com.javamaven.object.Produto;

public class ProdutoService {

    public static Produto cadastrarProduto(String nome, String desc, String categ, String valor, String qtd){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nome do produto: ");
        nome = scan.next();

        System.out.println("Descrição do produto: ");
        desc = scan.next();

        System.out.println("Categoria do produto: ");
        categ = scan.next();

        System.out.println("Valor do produto: ");
        valor = scan.next();

        System.out.println("Quantidade do produto: ");
        qtd = scan.next();

        return new Produto(nome, desc, categ, valor, qtd);
    }

    public static Produto editarProduto(List<Produto> lista){
        
        return new Produto();
    }

    public static Produto excluirProduto(){

    }

}
