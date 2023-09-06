import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int escolhaInicio;
        String nick;
        Player jogador = null;

        System.out.println("Bem vindo ao jogo de pesca");
        System.out.println("Digite seu nick para iniciarmos: ");
        nick = scan.next();
        jogador = new Player(nick);

        System.out.println("Vamos começar"+nick);
        System.out.println("História:");
        System.out.println("Você encalhou numa ilha e seu barco quebrou, mas por sorte nessa ilha há uma população, e na vila temos um mercante de peixes bla bla bla");
        System.out.println("Seu objetivo é pescar e vender seus peixes até que você junte dinheiro para comprar um novo barco para meter o pé");
        System.out.println("O que ddeseja fazer?");
        System.out.println("1 - pescar || 2 - ver loja || 3 - ver inventario || 4 - suas informações");

        
    }
}