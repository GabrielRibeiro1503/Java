import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x = 0;
        while(x!=-900){
        System.out.println("");
        x = scan.nextInt();

        System.out.println(x%26);
        }
    }

}