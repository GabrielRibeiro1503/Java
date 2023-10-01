import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int A1, A2, A3, tempo;

        A1 = scan.nextInt();
        A2 = scan.nextInt();
        A3 = scan.nextInt();

        if(A1 <= 1000 && A2 <= 1000 && A3 <= 1000){
            tempo = (A1 + A3)*2;
            System.out.println(tempo);
        }
    }
}