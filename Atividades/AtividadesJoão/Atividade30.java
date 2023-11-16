import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N, G;
        N = scan.nextInt();
        double Pmin = Double.MAX_VALUE, P, Pkg;

        for (int i = 0; i < N; i++) {
            P = scan.nextDouble();
            G = scan.nextInt();
            Pkg = (P / G) * 1000;

            if (Pkg < Pmin) {
                Pmin = Pkg;
            }
        }
        System.out.printf("%.2f",Pmin);
    }
}