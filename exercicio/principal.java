package exercicio;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);  
        Delta delta1 = new Delta();
        Xum x1 = new Xum();
        Xdois x2 = new Xdois();

        System.out.println("Digite o valor de a: ");
        double a = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite o valor de b: ");
        double b = Double.parseDouble(entrada.nextLine());      
        System.out.println("Digite o valor de c: ");
        double c = Double.parseDouble(entrada.nextLine());

        double d = delta1.calculaDelta(a, b, c);

        System.out.println(System.lineSeparator() + "Equacao montada: " + delta1.getA() + "x² + (" + delta1.getB() + ")x + (" + delta1.getC() + ") = 0");

        System.out.println("Delta: " + d);

        double xUm = x1.calculaX1(a, b, c, d);
        System.out.println("X1: " + xUm);

        double xDois = x2.calculaX2(a, b, c, d);   
        System.out.println("X2: " + xDois);
    }
}