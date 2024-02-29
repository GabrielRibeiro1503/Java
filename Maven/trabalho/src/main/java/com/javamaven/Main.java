package com.javamaven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javamaven.object.Produto;
import com.javamaven.service.ProdutoService;

public class Main 
{
    public static void main( String[] args )
    {
        List<Produto> estoque =  new ArrayList<Produto>();
        Scanner scan = new Scanner(System.in);
        
        String nome;
        String desc;
        String categ;
        String valor;
        String qtd;
        String resp;

        System.out.println("||==================================================||");
        System.out.println("||             -- Sistema de Estoque --             ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 1 - Cadastar Produto  || 2 - Registrar Movimento ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 3 - Verificar Produto || 4 - Excluir Produto     ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 5 - Sair              ||                         ||");
        System.out.println("||=======================++=========================||");
        resp = scan.next();
        
    }

}