import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
       
        Scanner scan = new Scanner(System.in);

        int dia, ano, mes, totDia;

        System.out.println("Digite os dias de vida de alguém para transformá-lo em anos/meses/dias: ");
        totDia = scan.nextInt();

        ano = totDia / 365;
        mes = (totDia % 365) / 30;
        dia = (totDia % 365) % 30;

        System.out.println(ano+" ano(s), "+mes+" mes(es) e "+dia+" dia(s)");
    }
}
