import java.util.Scanner;

public class Matematica{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String vallog1, vallog2;
        int conectivo, loop=1;

        while (loop == 1){
            System.out.println("Utilize 'V' ou 'F' a seguir: ");
            System.out.println("Defina o valor lógico de A: ");
            vallog1 = scan.next();
            System.out.println("Defina o valor lógico de B: ");
            vallog2 = scan.next();
            
            System.out.printf("%n1  ^  Conjunção  ^  1%n");
            System.out.println("2  V  Disjunção  V  2");
            System.out.println("3 ->  Conjunção  -> 3");
            System.out.println("Digite o número do conectivo: ");
            conectivo = scan.nextInt();
            System.out.println();
            
            switch (conectivo){
                case 1: 
                    if (vallog1.equals("V") && vallog2.equals("V")){
                        System.out.println("O resultado é:");
                        System.out.println("| A | B | A ^ B |");
                        System.out.printf("| %s | %s |   V   |%n",vallog1, vallog2);
                    } else {
                        System.out.println("O resultado é:");
                        System.out.printf("| %s | %s |   F   |%n",vallog1, vallog2);
                    }
                break;
                case 2:
                    if (vallog1.equals("F") && vallog2.equals("F")){
                        System.out.println("O resultado é:");
                        System.out.println("| A | B | A V B |");
                        System.out.printf("| %s | %s |   F   |%n",vallog1, vallog2);
                    } else {
                        System.out.println("O resultado é:");
                        System.out.println("| A | B | A V B |");
                        System.out.printf("| %s | %s |   V   |%n",vallog1, vallog2);
                    }
                break;
                case 3:
                    if (vallog1.equals("V") && vallog2.equals("F")){
                        System.out.println("O resultado é:");
                        System.out.println("| A | B | A --> B |");
                        System.out.printf("| %s | %s |    F    |%n",vallog1, vallog2);
                    } else {
                        System.out.println("O resultado é:");
                        System.out.println("| A | B | A --> B |");
                        System.out.printf("| %s | %s |    V    |%n",vallog1, vallog2);
                    } 
                break; 
                default: 
                    System.out.println("Opção inválida!"); 
            }
            System.out.printf("%nDeseja continuar : 1 - SIM | 2 - NÃO%n");
            loop = scan.nextInt();
        }    
    }
}