import java.util.Scanner;


// Juntar Desativar e Ativar em uma só opção e substituir por Exluir.
// Juntar Entrada e Saída em uma só opção.
// Corrigir erros de input no Estoque.
// Adicionar estética e padronização no output.
// Modelar sistema de Estado de Funcionamento (on || off) para o item.


public class Main {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int escolhaInicio = 1;
        Estoque estoque = new Estoque(null, 0, null);

        while(escolhaInicio >= 1 && escolhaInicio <= 5){
            System.out.println("Sistema de estoque");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Cadastar novo produto");
            System.out.println("2 - Registrar entrada");
            System.out.println("3 - Registrar saída");
            System.out.println("4 - Verificar saldo");
            System.out.println("5 - Excluir produto");
            System.out.println("6 - Sair");
            escolhaInicio = scan.nextInt();

            switch(escolhaInicio){
                case 1:
                    estoque.cadastrar();
                break;
                case 2:
                    estoque.add();
                break;
                case 3:
                    estoque.retirar();
                break;
                case 4:
                    estoque.verificar();
                break;
                case 5:

                break;
            }
        }

        if(escolhaInicio != 6){
            System.out.println("Número inválido!");
        }

        scan.close();
    }
}