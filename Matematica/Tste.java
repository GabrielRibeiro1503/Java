import java.util.Random;
import java.util.Scanner;

public class Tste{
    public static void main(String[] args){
       
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int n; // produto de q com p
        int p = 10333; // tem que ser um número primo random
        int q = 1031; // tem que ser um número primo random
        int totiente; // calculo matemático para achar o primocomum de um número
        int e; // tem que ser um número random 1 < e < ϕ(n)
        int d; // é o inverso multplicativo de "e" módulo ϕ(n)

        // Calculos iniciais:
        n = p * q;
        totiente = (p - 1) * (q - 1);

        // Chave Pública "e":
        e = rand.nextInt(totiente) + 1;

        // Chave Privada "d":
        algoritmoEuclidesEstendido(e, totiente);

        // Testes:
        System.out.println(totiente);
        System.out.println(e);
    }

    public static void algoritmoEuclidesEstendido(int e, int totiente){
        // Versão original do cálculo =   e * d ≡ 1 (mod ϕ(n))
        // Transformamos esse cálculo em =   d ≡ e-¹ (mod ϕ(n))
        totiente = 43;
        e = 17;

        int a = totiente;
        int b = e;
        int c = (a/b);
        int d = (a%b);

        while(d > 1){
            a = b;
            b = d;
            c = (a/b);
            d = (a%b);
            System.out.println(a+" = "+b+" x "+c+" + "+d);
        }

        
        
    }
}