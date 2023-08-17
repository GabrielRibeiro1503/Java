package Trabalho1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int escolha, velocidade_max, qtd_combustivel;
        String combustivel, marca, modelo;

        System.out.println("Qual seu veículo: ");
        System.out.println("1 - Carro, 2 - Bicicleta, 3 - Avião");
        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Vamos montar as informações do carro!");
                System.out.println("Digite a velocidade máxima do carro: ");
                velocidade_max = scan.nextInt();
                System.out.println("Digite o tipo de combustível que ele consome: ");
                combustivel = scan.next();
                System.out.println("Digite a quantidade máxima combustível no tanque: ");
                qtd_combustivel = scan.nextInt();
                System.out.println("Digite a marca do carro: ");
                marca = scan.next();
                System.out.println("Digite o modelo do carro: ");
                modelo = scan.next();
                Carro carro = new Carro(velocidade_max, combustivel, qtd_combustivel, marca, modelo);
            break;
            case 2:
                System.out.println("Vamos montar as informações do carro!");
                System.out.println("Digite a velocidade máxima do carro: ");
                velocidade_max = scan.nextInt();
                System.out.println("Digite o tipo de combustível que ele consome: ");
                combustivel = scan.next();
                System.out.println("Digite a quantidade máxima combustível no tanque: ");
                qtd_combustivel = scan.nextInt();
                System.out.println("Digite a marca do carro: ");
                marca = scan.next();
                System.out.println("Digite o modelo do carro: ");
                modelo = scan.next();
                Moto moto = new Moto(velocidade_max, combustivel, qtd_combustivel, tam_aro, amortecedor, qtd_marcha)
    }
}
