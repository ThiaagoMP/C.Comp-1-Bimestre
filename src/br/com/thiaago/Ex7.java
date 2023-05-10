package br.com.thiaago;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        // (A * B - C * D)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a");
        double a = scanner.nextDouble();

        System.out.println("Digite a");
        double b = scanner.nextDouble();

        System.out.println("Digite a");
        double c = scanner.nextDouble();

        System.out.println("Digite a");
        double d = scanner.nextDouble();

        double result = (a * b) - (c * d);

        System.out.println("Resultado: " + result);
    }

}
