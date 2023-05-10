package br.com.thiaago;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        // (4/3) * pi * R 3

        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da esfera");
        double radius = scanner.nextDouble();

        System.out.println("VOLUME = " + (4/3) * pi * (Math.pow(radius,3)));
    }

}
