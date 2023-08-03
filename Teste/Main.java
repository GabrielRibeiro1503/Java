import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Calc soma = new Calc();
        Calc sub = new Calc();
        Calc divi = new Calc();
        Calc multi = new Calc();

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();
        
        System.out.println("\n1 - Soma \n"
                          +"2 - Subtração \n"
                          +"3 - Divisão \n"
                          +"4 - Multiplicação \n");
        System.out.println("Escolha uma operação: ");
        int op = scan.nextInt();
        
        switch (op){
            case 1:
                System.out.println("\nO valor da sua operação foi: " + soma.Soma(n1, n2));
                break;
            case 2:
                System.out.println("\nO valor da sua operação foi: " + sub.Sub(n1, n2));
                break;
            case 3: 
                System.out.println("\nO valor da sua operação foi: " + divi.Divi(n1, n2));
                break;
            case 4: 
                System.out.println("\nO valor da sua operação foi: " + multi.Multi(n1, n2));
                break;
            default: 
                System.out.println("\nOperação incorreta!");
                break;
        }
    }
}