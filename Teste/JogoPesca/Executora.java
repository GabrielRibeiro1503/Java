import java.util.Scanner;

public class Executora{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int escolha1 = 4, escolha2 = 4;

        System.out.println("Bem vindo bla bla bla");
        System.out.println("Digite seu nome para iniciar: ");
        nome = scan.next();

        Player p1 = new Player(nome);

        System.out.println("Ok "+nome+", vamos começar!");
        System.out.println("*Contar uma história*");

        while(escolha2 == 4 || escolha1 == 4 || escolha1 == 3){
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Ir para o mar | 2 - Ver loja | 3 - Ver mochila | 4 - Ver informações");
        escolha1 = scan.nextInt();

        switch(escolha1){
            case 1:
            escolha2=2;
            while(escolha2 == 3 || escolha2 == 2){
                System.out.println("Você chegou no mar");
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Pescar | 2 - Ver mochila | 3 - Ver informações | 4 - Voltar para a ilha");
                escolha2 = scan.nextInt();

                switch(escolha2){
                    case 1:
                        //fazer ele pescar
                    break;
                    case 2:
                        //puxar mochila
                    break;
                    case 3:
                        p1.info();
                    break;
                    case 4: 
                        System.out.println("Você chegou!");
                    break;
                }
            }
            break;
            case 2:
                //denifir a loja
            break; 
            case 3:
                //puxar mochila
            break;
            case 4:
                p1.info();
            break;
        }
        }
    }
}