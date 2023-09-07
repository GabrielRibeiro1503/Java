package TrabalhoFinal2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        //Código
        int escolhaInicio = 0, escolha1 = 1, escolha2, escolha3 = 1, escolha4 = 1, morrer, corrida;

        //Transporte
        int velocidadeMax;
        float qtdCombustivel;
        String combustivel;

        //Carro
        String modelo, marca, destino;
        Carro carro1 = null;
        Carro carro2 = null;
        float kmL, gps;
        
        //Bicicleta
        int tamAro, qtdMarcha, nose, hangFive, rl, pessoas;
        String amortecedor, nome;
        Bicicleta bicicleta1 = null;
        Bicicleta bicicleta2 = null;

        //Escolher o veículo
        // ======================= A ideia era fazer 4 veículos mas não deu tempo ;-;

        while(escolhaInicio != 1 && escolhaInicio != 2 && escolhaInicio != 3 && escolhaInicio != 4){
            System.out.println("||============================================||");
            System.out.println("||  !! Bem Vindo ao Role-Play de veículos !!  ||");
            System.out.println("||============================================||");
            System.out.println("||    !! Para comerçarmos escolha o seu !!    ||");
            System.out.println("||=====================||=====================||");
            System.out.println("||     1 - Carro       ||    2 - Bicicleta    ||");
            System.out.println("||=====================||=====================||");
            System.out.printf("|| R: ");
            escolhaInicio = scan.nextInt();
            if (escolhaInicio != 1 && escolhaInicio != 2 && escolhaInicio != 3 && escolhaInicio != 4){
                System.out.println("|| * Opção inválida *");
            }
        }

        switch (escolhaInicio){
            case 1:
                while (escolha1 == 1){

                    //Contrução do carro principal
                    System.out.println("||=======================================|");
                    System.out.println("|| Vamos montar as informações do carro!");
                    System.out.println("|| Informe a velocidade máxima do carro");
                    System.out.printf("|| R: ");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 150){
                        System.out.println("|| Quanta potência!!");
                    } else {
                        System.out.println("|| Me parece lento!!");
                    }

                    System.out.println("||==============================================|");
                    System.out.println("|| Digite o tipo de combustível que ele consome");
                    System.out.printf("|| R: ");
                    combustivel = scan.next();

                    System.out.println("||=====================================================|");
                    System.out.println("|| Digite a quantidade máxima de combustível no tanque");
                    System.out.printf("|| R: ");
                    qtdCombustivel = scan.nextInt();

                    System.out.println("|| Seu tanque está cheio agora!!");
                    System.out.println("||=========================|");
                    System.out.println("|| Digite a marca do carro");
                    System.out.printf("|| R: ");
                    marca = scan.next();
                    System.out.println("|| Digite o modelo do carro");
                    System.out.printf("|| R: ");
                    modelo = scan.next();
                    System.out.println("|| Um "+marca+" "+modelo+" é interessante!!");

                    carro1 = new Carro(velocidadeMax, combustivel, qtdCombustivel, marca, modelo);

                    //Primeiro painel de funcionalidade
                    System.out.println("||============================================================================||");                    
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                    System.out.println("||============================================================================||");
                    System.out.printf("|| R: ");
                    escolha1 = scan.nextInt();

                    switch(escolha1){
                        case 2:
                            carro1.entrar();
                        break;
                        case 3:
                            while(escolha1 == 3){
                                carro1.info();
                                System.out.println("||============================================================================||");                    
                                System.out.println("|| 1 - Reiniciar as informações || 2 - Entrar no Carro || 3 - Ver informações ||");
                                System.out.println("||============================================================================||");
                                System.out.printf("|| R: ");
                                escolha1 = scan.nextInt();
                            }
                            if(escolha1 == 2){
                                carro1.entrar();
                            }
                        break;
                    }
                }
                escolha1 = 1;

                //Segundo painel de funcionalidade 
                System.out.println("||================================================================================||");                    
                System.out.println("|| 1 - Criar outro carro para tirar um rachão || 2 - Sair do carro || 3 - Dirigir ||");
                System.out.println("||================================================================================||");
                System.out.printf("|| R: ");
                escolha2 = scan.nextInt();

                switch(escolha2){
                    case 1:
                        while(escolha1 == 1){

                            //Contrução do segundo carro
                            System.out.println("||==============================================|");
                            System.out.println("|| Vamos montar as informações do segundo carro!");
                            System.out.println("|| Informe a velocidade máxima do carro");
                            System.out.printf("|| R: ");
                            velocidadeMax = scan.nextInt();
                            if (velocidadeMax >= 150){
                                System.out.println("|| Quanta potência!!");
                            } else {
                                System.out.println("|| Me parece lento!!");
                            }

                            System.out.println("||==============================================|");
                            System.out.println("|| Digite o tipo de combustível que ele consome");
                            System.out.printf("|| R: ");
                            combustivel = scan.next();

                            System.out.println("||=====================================================|");
                            System.out.println("|| Digite a quantidade máxima de combustível no tanque");
                            System.out.printf("|| R: ");
                            qtdCombustivel = scan.nextInt();

                            System.out.println("|| Seu tanque está cheio agora!!");
                            System.out.println("||=========================|");
                            System.out.println("|| Digite a marca do carro");
                            System.out.printf("|| R: ");
                            marca = scan.next();
                            System.out.println("|| Digite o modelo do carro");
                            System.out.printf("|| R: ");
                            modelo = scan.next();
                            System.out.println("|| Um "+marca+" "+modelo+" é interessante!!");

                            carro2 = new Carro(velocidadeMax, combustivel, qtdCombustivel, marca, modelo);

                            //Primeiro painel de funcionalidade do segundo carro
                            System.out.println("||============================================================================||");                    
                            System.out.println("|| 1 - Reiniciar as informações || 2 - Iniciar corrida || 3 - Ver informações ||");
                            System.out.println("||============================================================================||");
                            System.out.printf("|| R: ");
                            escolha1 = scan.nextInt();

                            switch(escolha1){
                                
                                //Corrida entre os dois carros
                                case 2:              
                                    while(escolha3 == 1){
                                        carro1.corrida();

                                        System.out.println("||=============================================||");
                                        System.out.println("|| Deseja correr novamente? 1 - SIM // 2 - NÃO ||");
                                        System.out.println("||=============================================||");
                                        System.out.printf("|| R: ");
                                        escolha3 = scan.nextInt();
                                    }
                                break;
                                case 3:
                                    while(escolha1 == 3){
                                        carro2.info();
                                        System.out.println("||============================================================================||");                    
                                        System.out.println("|| 1 - Reiniciar as informações || 2 - Iniciar corrida || 3 - Ver informações ||");
                                        System.out.println("||============================================================================||");
                                        System.out.printf("|| R: ");
                                        escolha1 = scan.nextInt();
                                    }
                                    if(escolha1 == 2){
                                        while(escolha3 == 1){
                                            carro1.corrida();
                        
                                            System.out.println("||=============================================||");
                                            System.out.println("|| Deseja correr novamente? 1 - SIM // 2 - NÃO ||");
                                            System.out.println("||=============================================||");
                                            System.out.printf("|| R: ");
                                            escolha3 = scan.nextInt();
                                        }
                                    }
                                break;
                            }
                        }
                    break;
                    case 2:
                        carro1.sair();
                    break;
                    case 3:
                        while(escolha4 == 1){

                            //Dirigindo seu carro bi bi
                            System.out.println("||=========================|");
                            System.out.println("|| Informe o nome do local");
                            System.out.printf("|| R: ");
                            destino = scan.next();

                            System.out.println("||=================================================================================|");
                            System.out.println("|| Informe ao seu GPS qual a distância do local onde quer ir usando apenas números");
                            System.out.printf("|| R: ");
                            gps = scan.nextInt();

                            System.out.println("||==================================||");
                            System.out.println("|| 1 - Reiniciar GPS || 2 - Iniciar ||");
                            System.out.println("||==================================||");
                            System.out.printf("|| R: ");
                            escolha4 = scan.nextInt();

                            if(escolha4 == 2){
                                kmL = gps/13;
                                morrer = rand.nextInt(10);

                                if(morrer == 1){
                                    carro1.bater();

                                }else if(kmL <= carro1.getQtdCombustivel()){
                                    System.out.println("||==================================================|");
                                    System.out.println("|| Você chegou ao seu destino: "+destino);

                                }else if(kmL >= carro1.getQtdCombustivel()){
                                    escolha2 = 0;
                                    
                                    while(kmL > carro1.getQtdCombustivel()){
                                        escolha2 = 0;
                                        gps = (kmL - carro1.getQtdCombustivel())*13;
                                        
                                        System.out.println("||==========================================================================|");
                                        System.out.printf("|| Você já rodou bastante!! mas falta %.1f km para chegar ao destino\n", gps);
                                        System.out.println("|| Deseja abastecer o poçante? 1 - SIM // 2 - NÃO");
                                        System.out.printf("|| R: ");
                                        escolha2 = scan.nextInt();

                                        kmL = gps/13;

                                        if(escolha2 == 1){
                                            carro1.abastecer();
                                        } else {
                                            System.out.println("||===========================================|");
                                            System.out.println("|| Você morreu na estrada com fome e sede !!");
                                            break;
                                        }
                                    }
                                    if(escolha2 == 1){
                                        System.out.println("||==================================================|");
                                        System.out.println("|| Você chegou ao seu destino: "+destino);
                                    }
                                }
                                System.out.println("||===========================================||");
                                System.out.println("|| 1 - Viajar novamente || 2 - Sair do carro ||");
                                System.out.println("||===========================================||");
                                System.out.printf("|| R: ");
                                escolha4 = scan.nextInt();

                                if(escolha4 == 2){
                                    carro1.sair();
                                }
                            }
                            
                        }
                    break;
                }
            break;
            case 2:
                while (escolha1 == 1){

                    //Construção da bicicleta
                    System.out.println("||===========================================|");
                    System.out.println("|| Vamos montar as informações da bicicleta!");
                    System.out.println("|| Digite a velocidade máxima da bicicleta");
                    System.out.printf("|| R: ");
                    velocidadeMax = scan.nextInt();
                    if (velocidadeMax >= 20){
                        System.out.println("|| Você pedala em!!");
                    } else {
                        System.out.println("|| Sedentário!!");
                    }

                    combustivel = "Energia física";
                    qtdCombustivel = 0;

                    System.out.println("||=========================|");
                    System.out.println("|| Digite o tamanho do aro");
                    System.out.printf("|| R: ");
                    tamAro = scan.nextInt();

                    System.out.println("||=============================|");
                    System.out.println("|| Tem amortecedor? SIM // NÃO");
                    System.out.printf("|| R: ");
                    amortecedor = scan.next();

                    System.out.println("||=================================|");
                    System.out.println("|| Quantas marchas tem a bicicleta");
                    System.out.printf("|| R: ");
                    qtdMarcha = scan.nextInt();

                    System.out.println("||==========================|");
                    System.out.println("|| Dê um nome para sua bike");
                    System.out.printf("|| R: ");
                    nome = scan.next();

                    bicicleta1 = new Bicicleta(velocidadeMax, combustivel, qtdCombustivel, tamAro, amortecedor, qtdMarcha, nome);

                    //Primeiro painel de funcionalidade
                    System.out.println("||===============================================================================||");
                    System.out.println("|| 1 - Reiniciar as informações || 2 - Subir na Bicicleta || 3 - Ver informações ||");
                    System.out.println("||===============================================================================||");
                    System.out.printf("|| R: ");
                    escolha1 = scan.nextInt();

                    switch(escolha1){
                        case 2:
                            bicicleta1.entrar();
                        break;
                        case 3:
                            while(escolha1 == 3){
                                bicicleta1.info();
                                System.out.println("||===============================================================================||");
                                System.out.println("|| 1 - Reiniciar as informações || 2 - Subir na Bicicleta || 3 - Ver informações ||");
                                System.out.println("||===============================================================================||");
                                System.out.printf("|| R: ");
                                escolha1 = scan.nextInt();
                            }
                            if(escolha1 == 2){
                                bicicleta1.entrar();
                            }
                        break;
                    }
                }
                escolha1 = 1;

                //Segundo painel de funcionalidade 
                System.out.println("||===============================================================================||");                    
                System.out.println("|| 1 - Criar outra bike pra tirar um racha || 2 - Descer da bike || 3 - Dar grau ||");
                System.out.println("||===============================================================================||");
                System.out.printf("|| R: ");
                escolha2 = scan.nextInt();

                switch(escolha2){
                    case 1:
                        while(escolha1 == 1){

                            //Construção da segunda bicicleta
                            System.out.println("||===========================================|");
                            System.out.println("|| Vamos montar as informações da bicicleta!");
                            System.out.println("|| Digite a velocidade máxima da bicicleta");
                            System.out.printf("|| R: ");
                            velocidadeMax = scan.nextInt();
                            if (velocidadeMax >= 20){
                                System.out.println("|| Ele pedala em!!");
                            } else {
                                System.out.println("|| Sedentário!!");
                            }

                            combustivel = "Energia física";
                            qtdCombustivel = 0;

                            System.out.println("||=========================|");
                            System.out.println("|| Digite o tamanho do aro");
                            System.out.printf("|| R: ");
                            tamAro = scan.nextInt();

                            System.out.println("||=============================|");
                            System.out.println("|| Tem amortecedor? SIM // NÃO");
                            System.out.printf("|| R: ");
                            amortecedor = scan.next();

                            System.out.println("||=================================|");
                            System.out.println("|| Quantas marchas tem a bicicleta");
                            System.out.printf("|| R: ");
                            qtdMarcha = scan.nextInt();

                            System.out.println("||=============================|");
                            System.out.println("|| Dê um nome para a bike dele");
                            System.out.printf("|| R: ");
                            nome = scan.next();

                            bicicleta2 = new Bicicleta(velocidadeMax, combustivel, qtdCombustivel, tamAro, amortecedor, qtdMarcha, nome);

                            //Primeiro painel de funcionalidade da segunda bicicleta
                            System.out.println("||============================================================================||");                    
                            System.out.println("|| 1 - Reiniciar as informações || 2 - Iniciar corrida || 3 - Ver informações ||");
                            System.out.println("||============================================================================||");
                            System.out.printf("|| R: ");
                            escolha1 = scan.nextInt();

                            switch(escolha1){

                                //Corrida entre as duas bicicletas
                                case 2:              
                                    while(escolha3 == 1){
                                        bicicleta1.corrida();
                                        
                                        System.out.println("||=============================================||");
                                        System.out.println("|| Deseja correr novamente? 1 - SIM // 2 - NÃO ||");
                                        System.out.println("||=============================================||");
                                        System.out.printf("|| R: ");
                                        escolha3 = scan.nextInt();
                                    }
                                break;
                                case 3:
                                    while(escolha1 == 3){
                                        bicicleta2.info();
                                        System.out.println("||============================================================================||");                    
                                        System.out.println("|| 1 - Reiniciar as informações || 2 - Iniciar corrida || 3 - Ver informações ||");
                                        System.out.println("||============================================================================||");
                                        System.out.printf("|| R: ");
                                        escolha1 = scan.nextInt();
                                    }
                                    if(escolha1 == 2){
                                        while(escolha3 == 1){
                                            bicicleta1.corrida();
                                        
                                            System.out.println("||=============================================||");
                                            System.out.println("|| Deseja correr novamente? 1 - SIM // 2 - NÃO ||");
                                            System.out.println("||=============================================||");
                                            System.out.printf("|| R: ");
                                            escolha3 = scan.nextInt();
                                        }
                                    }
                                break;
                            }
                        }
                    break;
                    case 2:
                        bicicleta1.sair();
                    break;
                    case 3:
                        
                        //Fazer manobras
                        escolha2 = 1;
                        while(escolha2 == 1){
                            System.out.println("||=====================================||");
                            System.out.println("|| 1 - Nose || 2 - Hang-Five || 3 - RL ||");
                            System.out.println("||=====================================||");
                            System.out.printf("|| R: ");
                            escolha4 = scan.nextInt();

                            escolha3 = 1;
                            switch(escolha4){
                                case 1:
                                    while(escolha3 == 1){
                                        pessoas = rand.nextInt(30);
                                        nose = rand.nextInt(3);
                                        if(nose == 0){
                                            System.out.println("||===================|");
                                            System.out.println("|| Que nose épico !!");
                                        }else if(nose == 1){
                                            System.out.println("||==================================|");
                                            System.out.println("|| Você caiu e geral riu de você !!");
                                        }else if(nose == 2){
                                            bicicleta1.bater();
                                        }
                                        System.out.println("|| OBS: "+pessoas+" pessoas estavam torcendo para você cair!!");

                                        System.out.println("||======================================||");
                                        System.out.println("|| Fazer outro nose? 1 - SIM // 2 - NÃO ||");
                                        System.out.println("||======================================||");
                                        System.out.printf("|| R: ");
                                        escolha3 = scan.nextInt();
                                    }
                                break;
                                case 2:
                                    while(escolha3 == 1){
                                        pessoas = rand.nextInt(30);
                                        hangFive = rand.nextInt(3);
                                        if(hangFive == 0){
                                            System.out.println("||===================|");
                                            System.out.println("|| Que hang-five incrível !!");
                                        }else if(hangFive == 1){
                                            System.out.println("||==================================|");
                                            System.out.println("|| Você caiu e geral riu de você !!");
                                        }else if(hangFive == 2){
                                            bicicleta1.bater();
                                        }
                                        System.out.println("|| OBS: "+pessoas+" pessoas estavam torcendo para você cair!!");
                                        
                                        System.out.println("||===========================================||");
                                        System.out.println("|| Fazer outro hang-five? 1 - SIM // 2 - NÃO ||");
                                        System.out.println("||===========================================||");
                                        System.out.printf("|| R: ");
                                        escolha3 = scan.nextInt();
                                    }
                                break;
                                case 3:
                                    while(escolha3 == 1){
                                        pessoas = rand.nextInt(30);
                                        rl = rand.nextInt(3);
                                        if(rl == 0){
                                            System.out.println("||===================|");
                                            System.out.println("|| Que rl irado !!");
                                        }else if(rl == 1){
                                            System.out.println("||==================================|");
                                            System.out.println("|| Você caiu e geral riu de você !!");
                                        }else if(rl == 2){
                                            bicicleta1.bater();
                                        }
                                        System.out.println("|| OBS: "+pessoas+" pessoas estavam torcendo para você cair!!");
                                        
                                        System.out.println("||====================================||");
                                        System.out.println("|| Fazer outro rl? 1 - SIM // 2 - NÃO ||");
                                        System.out.println("||====================================||");
                                        System.out.printf("|| R: ");
                                        escolha3 = scan.nextInt();
                                    }
                                break;
                            }
                            System.out.println("||===============================================||");
                            System.out.println("|| 1 - Fazer mais manobras || 2 - Descer da bike ||");
                            System.out.println("||===============================================||");
                            System.out.printf("|| R: ");
                            escolha2 = scan.nextInt();
                            
                            if(escolha2 == 2){
                                bicicleta1.sair();
                            }
                        }
                    break;
                }
            break;
        }
    }
}