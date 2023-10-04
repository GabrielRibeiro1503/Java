import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Estoque estoque = new Estoque(null, 0);
        int escolhaInicio = 1;

        while(escolhaInicio != 5){
            System.out.println("||==================================================||");
            System.out.println("||             -- Sistema de Estoque --             ||");
            System.out.println("||=======================++=========================||");
            System.out.println("|| 1 - Cadastar Produto  || 2 - Registrar Movimento ||");
            System.out.println("||=======================++=========================||");
            System.out.println("|| 3 - Verificar Produto || 4 - Excluir Produto     ||");
            System.out.println("||=======================++=========================||");
            System.out.println("|| 5 - Sair              ||                         ||");
            System.out.println("||=======================++=========================||");
            System.out.print("||> ");
            escolhaInicio = scan.nextInt();

            switch(escolhaInicio){
                case 1:
                    estoque.cadastrar();
                break;
                case 2:
                    estoque.registrar();
                break;
                case 3:
                    estoque.verificar();
                break;
                case 4:
                    estoque.excluir();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                    System.out.println("||==================================================||");
                    System.out.println("|| Número inválido!");
                break;
            }
        }
        scan.close();
    }
}