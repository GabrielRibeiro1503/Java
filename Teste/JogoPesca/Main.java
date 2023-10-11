import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int escolha1 = 1;

        System.out.println("Bem vindo bla bla bla");
        System.out.println("Digite seu nome para iniciar: ");
        nome = scan.next();

        Player player = new Player(nome);

        System.out.println("Ok "+nome+", vamos começar!");
        System.out.println("*Contar uma história*");
        
        while(escolha1 >= 1 && escolha1 <= 4){
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ir para o mar | 2 - Ver loja | 3 - Ver mochila | 4 - Ver informações");
            escolha1 = scan.nextInt();

            switch(escolha1){
                case 1:
                    player.mar();
                break;
                case 2:
                    player.loja();
                break; 
                case 3:
                    player.mochila();
                break;
                case 4:
                    player.info();
                break;
                default: 
                    System.out.println("Opção inválida");
            }
        }    
        scan.close();
    }
}