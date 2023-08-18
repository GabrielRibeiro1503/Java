package Trabalho1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Código
        int escolhaInicio = 1, escolha1 = 1, escolha2;

        //Transporte
        int velocidadeMax, qtdCombustivel;
        String combustivel;

        //Carro
        String modelo, marca;
        Carro carro1 = null;
        
        //Bicicleta
        int tamAro, qtdMarcha;
        String amortecedor;

        //Avião
        String companhia, porte;
        int qtdPessoas;

        //Navio
        String tamanho, bote_sv;
        int durabilidade;

        while(escolhaInicio ){
            System.out.println("||======================================================||");
            System.out.println("||       !! Bem Vindo ao Role-Play de veículos !!       ||");
            System.out.println("||======================================================||");
            System.out.println("||         !! Para comerçarmos escolha o seu !!         ||");
            System.out.println("||======================================================||");
            System.out.println("|| 1 - Carro || 2 - Bicicleta || 3 - Avião || 4 - Navio ||");
            System.out.println("||======================================================||");
            escolhaInicio = scan.nextInt();
        }
        switch (escolhaInicio){

            case 1:

                while (escolha1 == 1){

                    //Contrução do carro
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do carro!");
                    System.out.println("Informe a velocidade máxima do carro:");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 150){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("=============================================");
                    System.out.println("Digite o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("====================================================");
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtdCombustivel = scan.nextInt();
                    System.out.println("Seu tanque está cheio agora!!");
                    System.out.println("========================");
                    System.out.println("Digite a marca do carro:");
                    marca = scan.next();
                    System.out.println("Digite o modelo do carro:");
                    modelo = scan.next();
                    System.out.println("Um "+marca+" "+modelo+" é interessante!!");
                    carro1 = new Carro(velocidadeMax, combustivel, qtdCombustivel, marca, modelo);

                    //Primeiro painel de funcionalidade
                    System.out.println("||============================================================================||");                    
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    escolha1 = scan.nextInt();

                    switch(escolha1){
                        case 2:
                            carro1.entrar();
                        break;
                        case 3:
                            while(escolha1 == 3){
                                carro1.info();
                                //Primeiro painel de funcionalidade
                                System.out.println("||============================================================================||");                    
                                System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                                System.out.println("||============================================================================||");
                                escolha1 = scan.nextInt();
                            }
                            if(escolha1 == 2){
                                carro1.entrar();
                            }
                        break;
                    }
                }

                
                //Segundo painel de funcionalidade
                System.out.println("||================================================================================||");                    
                System.out.println("|| 1 - Criar outro carro para tirar um rachão || 2 - Sair do carro || 3 - Dirigir ||");
                System.out.println("||================================================================================||");
                escolha2 = scan.nextInt();

                switch(escolha2){
                    case 1:

                            //Contrução do segundo carro
                            System.out.println("=====================================");
                            System.out.println("Vamos montar as informações do carro!");
                            System.out.println("Informe a velocidade máxima do carro:");
                            velocidadeMax = scan.nextInt();
                            if (velocidadeMax >= 150){
                                System.out.println("Quanta potência!!");
                            } else {
                                System.out.println("Me parece lento!!");
                            }
                            System.out.println("=============================================");
                            System.out.println("Digite o tipo de combustível que ele consome:");
                            combustivel = scan.next();
                            System.out.println("====================================================");
                            System.out.println("Digite a quantidade máxima de combustível no tanque:");
                            qtdCombustivel = scan.nextInt();
                            System.out.println("Seu tanque está cheio agora!!");
                            System.out.println("========================");
                            System.out.println("Digite a marca do carro:");
                            marca = scan.next();
                            System.out.println("Digite o modelo do carro:");
                            modelo = scan.next();
                            System.out.println("Um "+marca+" "+modelo+" é interessante!!");
                            Carro carro2 = new Carro(velocidadeMax, combustivel, qtdCombustivel, marca, modelo);
        
                            carro1.info();
                            carro2.info();

                            //Primeiro painel de funcionalidade
                            System.out.println("||============================================================================||");                    
                            System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                            System.out.println("||============================================================================||");
                            System.out.println();
                            escolha1 = scan.nextInt();
                        
                    break;
                }
                
            break;
            case 2:
                while (escolha1 == 1){
                    System.out.println("=========================================");
                    System.out.println("Vamos montar as informações da bicicleta!");
                    System.out.println("Digite a velocidade máxima da bicicleta:");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 20){
                        System.out.println("Você pedala em!!");
                    } else {
                        System.out.println("Sedentário!!");
                    }
                    combustivel = "Energia física";
                    qtdCombustivel = 0;
                    System.out.println("========================");
                    System.out.println("Digite o tamanho do aro");
                    tamAro = scan.nextInt();
                    System.out.println("===========================");
                    System.out.println("Tem amortecedor? Sim || Não");
                    amortecedor = scan.next();
                    System.out.println("================================");
                    System.out.println("Quantas marchas tem a bicicleta:");
                    qtdMarcha = scan.nextInt();
                    Bicicleta bicicleta = new Bicicleta(velocidadeMax, combustivel, qtdCombustivel, tamAro, amortecedor, qtdMarcha);
                    System.out.println("||===============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Subir na Bicicleta || 3 - Ver informações ||");
                    System.out.println("||===============================================================================||");
                    System.out.println();
                    escolha1 = scan.nextInt();
                }
            break;
            case 3:
                while (escolha1 == 1){
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do avião!");
                    System.out.println("Digite a velocidade máxima do avião:");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 850){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("==============================================");
                    System.out.println("Informe o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("====================================================");
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtdCombustivel = scan.nextInt();
                    System.out.println("Seu tanque está cheio agora!!");
                    System.out.println("=============================");
                    System.out.println("Informe a companhia do avião:");
                    companhia = scan.next();
                    System.out.println("===========================");
                    System.out.println("Informe o tamanho do avião:");
                    porte = scan.next();
                    System.out.println("========================================");
                    System.out.println("Digite a quantidade de pessoas no avião:");
                    qtdPessoas = scan.nextInt();
                    if (qtdPessoas >= 50){
                        System.out.println("Quanta gente!!");
                    } else {
                        System.out.println("Está meio vazio!!");
                    }
                    Aviao aviao = new Aviao(velocidadeMax, combustivel, qtdCombustivel, companhia, porte, qtdPessoas);
                    System.out.println("||============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Avião || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.println();
                    escolha1 = scan.nextInt();
                }
            break;
            case 4:
                while (escolha1 == 1){
                    System.out.println("=====================================");
                    System.out.println("Vamos montar as informações do navio!");
                    System.out.println("Digite a velocidade máxima do navio:");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 45){
                        System.out.println("Quanta potência!!");
                    } else {
                        System.out.println("Me parece lento!!");
                    }
                    System.out.println("==============================================");
                    System.out.println("Informe o tipo de combustível que ele consome:");
                    combustivel = scan.next();
                    System.out.println("Digite a quantidade máxima de combustível no tanque:");
                    qtdCombustivel = scan.nextInt();
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
                    Navio navio = new Navio(velocidadeMax, combustivel, qtdCombustivel, tamanho, bote_sv, durabilidade);
                    System.out.println("||============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Navio || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.println();
                    escolha1 = scan.nextInt();
                }
            break;
        }
    }
}