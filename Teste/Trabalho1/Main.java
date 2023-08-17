package Trabalho1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Código
        int escolha;

        //Transporte
        int velocidade_max, qtd_combustivel;
        String combustivel;

        //Carro
        String modelo, marca;
        int decisaoCarro = 1;

        //Bicicleta
        int tam_aro, qtd_marcha;
        String amortecedor;

        //Avião
        String companhia, porte;
        int qtd_pessoas;

        //Navio
        String tamanho, bote_sv;
        int durabilidade;

        System.out.println("||======================================================||");
        System.out.println("||       !! Bem Vindo ao Role-Play de veículos !!       ||");
        System.out.println("||======================================================||");
        System.out.println("||         !! Para comerçarmos escolha o seu !!         ||");
        System.out.println("||======================================================||");
        System.out.println("|| 1 - Carro || 2 - Bicicleta || 3 - Avião || 4 - Navio ||");
        System.out.println("||======================================================||");
        System.out.println();
        escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                while (decisaoCarro == 1){
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do carro!");
                    System.out.println("Informe a velocidade máxima do carro:");
                    velocidade_max = scan.nextInt();
                    if (velocidade_max >= 150){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("=============================================");
                    System.out.println("Digite o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("====================================================");
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtd_combustivel = scan.nextInt();
                    System.out.println("Seu tanque está cheio agora!!");
                    System.out.println("========================");
                    System.out.println("Digite a marca do carro:");
                    marca = scan.next();
                    System.out.println("Digite o modelo do carro:");
                    modelo = scan.next();
                    System.out.println("Um "+marca+" "+modelo+" é interessante!!");
                    Carro carro = new Carro(velocidade_max, combustivel, qtd_combustivel, marca, modelo);
                    System.out.println("||============================================================================||");                    
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.println();
                    decisaoCarro = scan.nextInt();
                    carro.info();
                }
            break;
            case 2:
                while (decisaoCarro == 1){
                    System.out.println("=========================================");
                    System.out.println("Vamos montar as informações da bicicleta!");
                    System.out.println("Digite a velocidade máxima da bicicleta:");
                    velocidade_max = scan.nextInt();
                    if (velocidade_max >= 20){
                        System.out.println("Você pedala em!!");
                    } else {
                        System.out.println("Sedentário!!");
                    }
                    combustivel = "Energia física";
                    qtd_combustivel = 0;
                    System.out.println("========================");
                    System.out.println("Digite o tamanho do aro");
                    tam_aro = scan.nextInt();
                    System.out.println("===========================");
                    System.out.println("Tem amortecedor? Sim || Não");
                    amortecedor = scan.next();
                    System.out.println("================================");
                    System.out.println("Quantas marchas tem a bicicleta:");
                    qtd_marcha = scan.nextInt();
                    Bicicleta bicicleta = new Bicicleta(velocidade_max, combustivel, qtd_combustivel, tam_aro, amortecedor, qtd_marcha);
                    System.out.println("||===============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Subir na Bicicleta || 3 - Ver informações ||");
                    System.out.println("||===============================================================================||");
                    System.out.println();
                    decisaoCarro = scan.nextInt();
                }
            break;
            case 3:
                while (decisaoCarro == 1){
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do avião!");
                    System.out.println("Digite a velocidade máxima do avião:");
                    velocidade_max = scan.nextInt();
                    if (velocidade_max >= 850){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("==============================================");
                    System.out.println("Informe o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("====================================================");
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtd_combustivel = scan.nextInt();
                    System.out.println("Seu tanque está cheio agora!!");
                    System.out.println("=============================");
                    System.out.println("Informe a companhia do avião:");
                    companhia = scan.next();
                    System.out.println("===========================");
                    System.out.println("Informe o tamanho do avião:");
                    porte = scan.next();
                    System.out.println("========================================");
                    System.out.println("Digite a quantidade de pessoas no avião:");
                    qtd_pessoas = scan.nextInt();
                    if (qtd_pessoas >= 50){
                        System.out.println("Quanta gente!!");
                    } else {
                        System.out.println("Está meio vazio!!");
                    }
                    Aviao aviao = new Aviao(velocidade_max, combustivel, qtd_combustivel, companhia, porte, qtd_pessoas);
                    System.out.println("||============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Avião || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.println();
                    decisaoCarro = scan.nextInt();
                }
            break;
            case 4:
                while (decisaoCarro == 1){
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do navio!");
                    System.out.println("Digite a velocidade máxima do navio:");
                    velocidade_max = scan.nextInt();
                    if (velocidade_max >= 45){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("==============================================");
                    System.out.println("Informe o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtd_combustivel = scan.nextInt();
                    System.out.println("Seu tanque está cheio agora!!");
                    System.out.println("===========================");
                    System.out.println("Informe o tamanho do navio:");
                    tamanho = scan.next();
                    System.out.println("===========================");
                    System.out.println("Tem bote salva vidas? Sim || Não");
                    bote_sv = scan.next();
                    if (bote_sv == "Sim"){
                        System.out.println("É bom prezar a segurança!!");
                    } else if (bote_sv == "Não"){
                        System.out.println("Que perigoso!!");
                    }
                    System.out.println("======================================");
                    System.out.println("Digite um valor para sua durabilidade:");
                    durabilidade = scan.nextInt();
                    Navio navio = new Navio(velocidade_max, combustivel, qtd_combustivel, tamanho, bote_sv, durabilidade);
                    System.out.println("||============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Navio || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.println();
                    decisaoCarro = scan.nextInt();
                }
            break;
        }
    }
}