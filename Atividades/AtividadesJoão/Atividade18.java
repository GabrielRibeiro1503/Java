import java.util.Scanner;
import java.util.HashSet;

public class Atividade18{
    public static void main(String[] args){

        HashSet<Integer> dif = new HashSet<>();
        Scanner scan = new Scanner(System.in);

        int N, M;

        System.out.print("");
        N = scan.nextInt();
        System.out.print("");
        M = scan.nextInt();

        int[] X = new int[M];

        for(int i = 0; i < X.length; i++){
            System.out.print("");
            X[i] = scan.nextInt();
            if(!dif.add(X[i])){
            }else{
                N--;
            }
        }
        System.out.println(N);
    }
}