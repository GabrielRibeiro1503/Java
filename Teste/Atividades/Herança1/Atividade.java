package Herança;

import java.util.Scanner;

public class Atividade {
     
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        
        String nome;
        int blindagem;

        System.out.println("Digite o nome:");
        nome = scan.next();
        System.out.println("Digite a blindagem:");
        blindagem = scan.nextInt();

        CarroCombate carro = new CarroCombate(nome, blindagem);

        
        carro.Info();

    }
}
