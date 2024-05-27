import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // Calcular o fatorial de um número.
    public static int fatorial(int fat) {
        System.out.println(fat);
        if (fat == 0) {
            return 1;
        }
        return fat * fatorial(fat - 1);
    }

    // Imprimir uma sequência de números (por exemplo, 1, 2, 3, ..., n) na ordem inversa.
    public static int inverso(List<Integer> numeros, boolean reverso){
            if(numeros.size() == 0){
                return 0;
            }
            else if(!reverso){
                Collections.reverse(numeros);
                reverso = true;
            }
            System.out.println(numeros.get(0));
            numeros.remove(0);
            return inverso(numeros, reverso);
    }

    // Verificar se um número é par ou ímpar usando recursividade.
    public static int imparpar(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return imparpar(num - 2);
    }

    // Calcular o Máximo Divisor Comum (MDC) de dois números.
    public static int mdc(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else if (num1 == 0) {
            return num2;
        } else if (num1 > num2) {
            return mdc(num1 - num2, num2);
        }
        return mdc(num1, num2 - num1);
    }

    // Implementar a sequência de Fibonacci.
    public static int fibonacci(int repete){
        if(repete < 2){
            return 1;
        }
        return fibonacci(repete-1) + fibonacci(repete-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        System.out.println("Escreva um número para calcular o fatorial: ");
        int fat = scan.nextInt();
        System.out.println(fatorial(fat));
        */

        /*
        Boolean reverso = false;
        List<Integer> lista = new ArrayList<>();
        System.out.println("Escreva quantos números quer colocar na lista: ");
        int qtd = scan.nextInt();
        while (qtd > 0) {
            System.out.print("Digite um numero: ");
            int num = scan.nextInt();
            lista.add(num);
            qtd--;
        }
        System.out.println(inverso(lista, reverso));
        */

        /*
        System.out.println(("Escreva um número: "));
        int parimpar = scan.nextInt();
        if(imparpar(parimpar) == 0){
        System.out.println("Esse número é par!");
        }else{
        System.out.println("Esse número é impar!");
        }
        */

        /*
        System.out.println("Escreva um número: ");
        int num1 = scan.nextInt();
        System.out.println("Escreva outro número: ");
        int num2 = scan.nextInt();
        System.out.println(mdc(num1, num2));
        */

        /*
        System.out.println("Escreva a quantidade de vezes que irá executar o Fibonacci: ");
        int repete = scan.nextInt();
        System.out.println(fibonacci(repete));
        */

    }
}