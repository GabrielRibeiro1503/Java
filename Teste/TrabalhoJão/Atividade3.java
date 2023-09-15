import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int W, X, Y, Z, diaInicio, horaInicio, minutoInicio, segundoInicio, diaFinal, horaFinal, minutoFinal, segundoFinal;
        String horarioInicio, horarioFinal;
        String[] partes;

        System.out.print("Dia ");
        diaInicio = scanner.nextInt();
        System.out.print("Informe o horário (hh : mm : ss): ");
        horarioInicio = scanner.next();

        partes = horarioInicio.split(":");

        horaInicio = Integer.parseInt(partes[0].trim());
        minutoInicio = Integer.parseInt(partes[1].trim());
        segundoInicio = Integer.parseInt(partes[2].trim());

        System.out.print("Dia ");
        diaFinal = scanner.nextInt();
        System.out.print("Informe o horário (hh : mm : ss): ");
        horarioFinal = scanner.nextLine();

        partes = horarioFinal.split(":");

        horaFinal = Integer.parseInt(partes[0].trim());
        minutoFinal = Integer.parseInt(partes[1].trim());
        segundoFinal = Integer.parseInt(partes[2].trim());
    }
}

