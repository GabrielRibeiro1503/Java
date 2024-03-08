package com.javamaven;

import java.util.ArrayList;
import java.util.Scanner;

import com.javamaven.object.Produto;

public class Funcionalidades {

    ArrayList<Produto> produto = new ArrayList<Produto>();
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<Produto> estoque = new ArrayList<Produto>();

    public static void cadastrar(){

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

    }

    public static void editar() {

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
    
    }

    public static void verificar(){

        if(estoque.size() == 0){
            System.out.println("Nenhum produto cadastrado!");
        }else{
            info();
        }
      
    }

    public static void excluir(){
        
        System.out.print("Digite o ID do produto para excluir: ");
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

    }

    public static void info(){
    
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