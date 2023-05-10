package br.com.thiaago;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite x1");
        double x1 = scanner.nextDouble();

        System.out.println("Digite x2");
        double x2 = scanner.nextDouble();

        System.out.println("Digite y1");
        double y1 = scanner.nextDouble();

        System.out.println("Digite y2");
        double y2 = scanner.nextDouble();

        double xPow = Math.pow((x2 - x1), 2);
        double yPow = Math.pow((y2 - y1), 2);

        double distance = Math.sqrt(xPow + yPow);

        System.out.println("Distancia " + distance);

    }

}
