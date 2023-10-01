import java.util.Scanner;

public class Atividade3{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int W, X, Y, Z, diaInicio, horaInicio = 0, minutoInicio = 0, segundoInicio = 0, diaFinal, horaFinal = 0, minutoFinal = 0, segundoFinal = 0;
        String horarioInicio, horarioFinal;
        String[] partes;

        System.out.print("Dia ");
        diaInicio = scanner.nextInt();
        System.out.print("");
        horarioInicio = scanner.next();

        partes = horarioInicio.split(":");

        if (partes.length == 3) {
            horaInicio = Integer.parseInt(partes[0].trim());
            minutoInicio = Integer.parseInt(partes[1].trim());
            segundoInicio = Integer.parseInt(partes[2].trim());
        } else {
            System.out.println("Formato de hora incorreto.");
        }

        System.out.print("Dia ");
        diaFinal = scanner.nextInt();
        System.out.print("");
        horarioFinal = scanner.next();

        partes = horarioFinal.split(":");

        if (partes.length == 3) {
            horaFinal = Integer.parseInt(partes[0].trim());
            minutoFinal = Integer.parseInt(partes[1].trim());
            segundoFinal = Integer.parseInt(partes[2].trim());
        } else {
            System.out.println("Formato de hora incorreto.");
        }

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