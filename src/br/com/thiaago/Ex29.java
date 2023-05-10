package br.com.thiaago;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a");
        double a = scanner.nextDouble();

        System.out.println("Digite b");
        double b = scanner.nextDouble();

        System.out.println("Digite c");
        double c = scanner.nextDouble();

        if (a + b > c || a + c > b || b + a > c || b + c > a || c + a > b || c + b > a)
            System.out.println("Perimetro: " + a + b + c);
         else System.out.println("Area: " + a * c);
    }

}
