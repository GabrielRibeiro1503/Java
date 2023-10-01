import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String nome;
        int C, peso;

        C = scan.nextInt();

        for(int i=0; i < C; i++){
            nome = scan.next();
            peso = scan.nextInt();

            if(nome.equals("Thor") || nome.equals("thor")){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}