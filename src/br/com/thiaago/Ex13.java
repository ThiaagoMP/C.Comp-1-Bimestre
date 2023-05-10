package br.com.thiaago;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A");
        double a = scanner.nextDouble();

        System.out.println("Digite B");
        double b = scanner.nextDouble();

        System.out.println("Digite C");
        double c = scanner.nextDouble();

        double max = (a + b + Math.abs(a - b)) / 2;
        System.out.println(max + " eh maior");
    }

}
