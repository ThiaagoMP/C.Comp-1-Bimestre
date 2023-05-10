package br.com.thiaago;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        //A = π . R 2

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.println("Digite o raio do circulo:");
        double radius = scanner.nextDouble();

        double a = pi * Math.pow(radius, 2);

        System.out.println("A=" + a);
    }

}
