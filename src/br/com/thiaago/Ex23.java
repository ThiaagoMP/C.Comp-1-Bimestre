package br.com.thiaago;

import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a");
        double a = scanner.nextDouble();

        System.out.println("Digite b");
        double b = scanner.nextDouble();

        System.out.println("Digite c");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double xOne = (-b + Math.sqrt(delta)) / 2 * a;
        double xTwo = (-b - Math.sqrt(delta)) / 2 * a;

        System.out.println("X1: " + xOne);
        System.out.println("X2: " + xTwo);


    }

}
