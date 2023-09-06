import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        ArrayList<String> itens = new ArrayList<String>();  

        int escolhaInicio, quantidade, id = 1;
        String nome;

        System.out.println("Sistema de estoque");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Cadastar novo produto");
        System.out.println("2 - Registrar entrada");
        System.out.println("3 - Registrar saída");
        System.out.println("4 - Verificar saldo");
        escolhaInicio = scan.nextInt();

        switch (escolhaInicio){
            case 1:
            
                System.out.println("Digite o nome do produto: ");
                nome = scan.next();
                itens.add(nome);

                System.out.println("Digite a quantidade inicial: ");
                quantidade = scan.nextInt();

                itens.add("ID: " + id);
                id++;

                System.out.println("O id desse item é: " + (id - 1));
                break;

        }

    }
}