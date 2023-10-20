import java.io.Console;
import java.util.Scanner;

public class Ex1{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int min = 0, hr = 0;

        System.out.println("Digite a os minutos para transformar em horas: ");
        min = scan.nextInt();

        while(min >= 60){
            hr++;
            min = min % 60;
        }

        System.out.println(hr+"horas e "+min+"minutos");
    }
}