package Calculadora;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero res = new Numero();

        System.out.printf("%nDigite o valor 1: ");
        num1.setValor(scan.nextInt());
        System.out.printf("%nDigite o valor 2: ");
        num2.setValor(scan.nextInt());
        res.setValor(num1.getValor() + num2.getValor());
        System.out.printf("A soma de %f com %f é igual a %f", num1.getValor(), num2.getValor(), res.getValor());
    }
}
