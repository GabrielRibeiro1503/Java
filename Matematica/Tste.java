import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tste{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Passo 1 - Definir p e q
        int p = 17; // tem que ser um número primo random e bem grande
        int q = 23; // tem que ser um número primo random e bem grande

        // Passo 2 - Definir o valor de n
        int n = p * q; // produto de q com p

        // Passo 3 - Encontrar o valor do Totiente de Euler (ϕ(n)) ou phy(n)
        int phy = (p - 1) * (q - 1); // calculo matemático para achar o coprimo

        // Passo 4 - Definir o valor de e
        int e = coprimo(phy); // tem que ser um número random 1 < e < ϕ(n)

        // Passo 5 - Definir o valor de d
        int d = algoritmoEuclidesEstendido(e, phy); // é o inverso multplicativo de e * d ≡ 1 (mod ϕ(n))

        // Passo 6 - Definir as chaves públicas e privadas
        System.out.println("Chave pública (e,n): ("+e+","+n+")");
        System.out.println("Chave pública (d,n): ("+d+","+n+")");

        // Passo 7 - Obter a senha numérica
        System.out.println("Digite uma senha numérica: ");
        int M = scan.nextInt();

        // Passo 8 - Encriptação e Desencriptação de senha
        int c_encriptado = encriptacao(M, e, n);
        int m_desencriptado = desencriptação(c_encriptado, d, n);

        // Mensagens - Mostra a mensagem encriptada e desencriptada
        System.out.println("Sua mensagem encriptada: "+c_encriptado);
        System.out.println("Sua mensagem desencriptada: "+m_desencriptado);

    }

    public static int algoritmoEuclidesEstendido(int e, int phy){
        // Fórmula base: e * d ≡ 1 (mod ϕ(n))
        // Aplicando o Algoritmo de Euclides Estendido na fórmula base: e * m + ϕ(n) * n = MDC(e,ϕ(n))

        int a;
        int b;
        if(phy>=e){
            a = e;
            b = phy;
        }else{
            a = phy;
            b = e;
        }
        int c = (a/b);
        int d = (a%b);

        int ma = 1;
        int mb = 0;
        int mc;

        int na = 0;
        int nb = 1;
        int nc;

        int valorfinal;

        while(d != 0){
            a = b;
            b = d;
            c = (a/b);
            d = (a%b);

            if(d == 0){
                break;
            }

            mc = ma - (mb*c);
            ma = mb;
            mb = mc;

            nc = na - (nb*c);
            na = nb;
            nb = nc;

        }

        if(nb < 0){
            valorfinal = nb + phy;
        }else{
            valorfinal = nb;
        }
        return valorfinal;
    }

    public static int coprimo(int phy){
        // Para dois números serem coprimos, ambos tem que ter somente o 1 como divisor comum.
        // Para isso, analisamos os divisores comuns dos dois, caso o número random "e" for incompatível, é feita outro sorteio.

        Random rand = new Random();

        int e = rand.nextInt(phy);
        Boolean verif = false;
        while(verif == false){
            if(divisoresComuns(e, phy) == 1 && e > 1){
                verif = true;
            }else{
                e = rand.nextInt(phy);
            }
        }
        return e;
    }

    public static List<Integer> divisores(int numero){
        // Faz a verificação dos números divisores

        List<Integer> divisores = new ArrayList<>();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        divisores.add(numero);

        return divisores;
    }

    public static int divisoresComuns(int e, int phy){
        // Faz a verificação dos números que dividem "e" e "phy" e incrementa a variável 
        // A idéia é incrementar apenas 1, significando que os dois números são coprimos

        List<Integer> divs1 = divisores(e);
        List<Integer> divs2 = divisores(phy);
        int result = 0;

        for (int num : divs1){
            if(divs2.contains(num)){
                result++;
            }

        }

        return result;
    }

    public static int encriptacao(int M, int e, int n){
        // Para obter a encriptação é feito o seguinte calculo: C = M elevado a e (mod n)

        int result = 1;

        for (int i = 0; i < e; i++){
            result = (result * M) % n;
        }

        return result;
    }

    public static int desencriptação(int c, int d, int n){
        // Para obter a desencriptação é feito o seguinte calculo: M = C elevado a d (mod n)

        int result = 1;

        for (int i = 0; i < d; i++){
            result = (result * c) % n;
        }

        return result;
    }
}