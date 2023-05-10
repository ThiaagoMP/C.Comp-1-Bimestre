package br.com.thiaago;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite A");
        double a = scanner.nextDouble();

        System.out.println("Digite B");
        double b = scanner.nextDouble();

        System.out.println("Digite C");
        double c = scanner.nextDouble();

        double rectangleTriangleArea = (a * c) / 2;
        double circleArea = pi * Math.pow(c, 2);
        double trapezeArea = (a + b) / 2 * c;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.println("TRIANGULO " + rectangleTriangleArea);
        System.out.println("CIRCULO " + circleArea);
        System.out.println("TRAPEZIO " + trapezeArea);
        System.out.println("QUADRADO " + squareArea);
        System.out.println("RETANGULO " + rectangleArea);

    }


}
