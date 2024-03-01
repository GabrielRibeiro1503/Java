package com.javamaven;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import com.javamaven.object.Produto;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static ArrayList<Produto> estoque;
    
    

    public static void main( String[] args ){
        estoque = new ArrayList<>();
        menu();

    }

    private static void menu(){

        String resp;

        System.out.println("||==================================================||");
        System.out.println("||             -- Sistema de Estoque --             ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 1 - Cadastar Produto  || 2 - Editar Produto      ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 3 - Verificar Produto || 4 - Excluir Produto     ||");
        System.out.println("||=======================++=========================||");
        System.out.println("|| 5 - Sair              ||                         ||");
        System.out.println("||=======================++=========================||");
        resp = scan.nextLine();

        switch (resp) {
            case "1":
                cadastrar();
            break;
            case "2":
                editar();
            break;
            case "3":
                verificar();
            break;
            case "4":
                excluir();
            break;
            case "5":
                System.exit(0);
            break;
            default:
                System.out.println("Opção inválida!");
                menu();
            break;
        }

    }

    private static void cadastrar(){

        System.out.println("Nome do produto: ");
        String nome = scan.nextLine();
        System.out.println("Descrição do produto: ");
        String desc = scan.nextLine();
        System.out.println("Categoria do produto: ");
        String categ = scan.nextLine();
        System.out.println("Valor do produto: ");
        String valor = scan.nextLine();
        System.out.println("Quantidade do produto: ");
        String qtd = scan.nextLine();

        Produto produto = new Produto(nome, desc, categ, valor, qtd);
        
        estoque.add(produto);

        menu();
    }

    private static void editar() {

        System.out.print("Digite o ID do produto para editar: ");
        int respId = scan.nextInt();
        scan.nextLine();
    
        boolean acharId = false;
        for (Produto produto : estoque) {
            if (respId == produto.getId()) {
                System.out.println("Novo nome do produto: ");
                String novoNome = scan.nextLine();
                produto.setNome(novoNome);
    
                System.out.println("Nova descrição do produto: ");
                String novaDesc = scan.nextLine();
                produto.setDesc(novaDesc);
    
                System.out.println("Nova categoria do produto: ");
                String novaCateg = scan.nextLine();
                produto.setCateg(novaCateg);
    
                System.out.println("Novo valor do produto: ");
                String novoValor = scan.nextLine();
                produto.setValor(novoValor);
    
                System.out.println("Nova quantidade do produto: ");
                String novaQtd = scan.nextLine();
                produto.setQtd(novaQtd);
    
                acharId = true;
                break;
            }
        }
    
        if (acharId == false) {
            System.out.println("Esse ID não existe!");
        }
    
        menu();
    }

    private static void verificar(){

        if(estoque.size() == 0){
            System.out.println("Nenhum produto cadastrado!");
        }else{
            info();
        }
        
        menu();
    }

    private static void excluir(){
        
        System.out.print("Digite o ID do produto para desativar: ");
        int respId = scan.nextInt();
        scan.nextLine();

        Boolean acharId = false;
        for(Produto produto : estoque){
            if(respId == produto.getId()){
                estoque.remove(respId);
                System.out.println("Seu produto foi excluido!");
                acharId = true;
                break;
            }
        }

        if(acharId == false){
            System.out.println("Esse ID não existe!");
        }

        menu();

    }

    private static void info(){
    
        for(Produto produto : estoque){
            System.out.println("ID do produto: "+produto.getId());
            System.out.println("Nome do produto: "+produto.getNome());
            System.out.println("Descrição do produto: "+produto.getDesc());
            System.out.println("Categoria do produto: "+produto.getCateg());
            System.out.println("Valor do produto: "+produto.getValor());
            System.out.println("Quantidade do produto: "+produto.getQtd());
        }
    
    }

}