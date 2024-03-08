package com.javamaven;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    public static void main( String[] args ){

        menu();

    }

    public static void menu(){

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
                Funcionalidades.cadastrar();
                menu();
            break;
            case "2":
                Funcionalidades.editar();
                menu();
            break;
            case "3":
                Funcionalidades.verificar();
                menu();
            break;
            case "4":
                Funcionalidades.excluir();
                menu();
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

}