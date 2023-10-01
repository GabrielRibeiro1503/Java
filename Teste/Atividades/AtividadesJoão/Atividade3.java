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
        horarioFinal = scanner.next();

        partes = horarioFinal.split(":");

        horaFinal = Integer.parseInt(partes[0].trim());
        minutoFinal = Integer.parseInt(partes[1].trim());
        segundoFinal = Integer.parseInt(partes[2].trim());

        W = diaFinal - diaInicio;
        X = horaFinal - horaInicio;
        Y = minutoFinal - minutoInicio;
        Z = segundoFinal - segundoInicio;

        if (Z < 0) {
            Y--;
            Z += 60;
        }
        if (Y < 0) {
            X--;
            Y += 60;
        }
        if (X < 0) {
            W--;
            X += 24;
        }

        System.out.println(W+"dia(s)");
        System.out.println(X+"hora(s)");
        System.out.println(Y+"minuto(s)");
        System.out.println(Z+"segundo(s)");

    }
}

