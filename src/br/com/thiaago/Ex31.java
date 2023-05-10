package br.com.thiaago;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite x");
        double x = scanner.nextDouble();

        System.out.println("Digite y");
        double y = scanner.nextDouble();

        System.out.println("Digite z");
        double z = scanner.nextDouble();

        List<Double> numbers = Arrays.asList(x, y, z);
        Collections.sort(numbers);

        Double a = numbers.get(0);
        Double b = numbers.get(1);
        Double c = numbers.get(2);

        if (a >= b + c) System.out.println(" NAO FORMA TRIANGULO");
        else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO RETANGULO");
        else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO OBTUSANGULO");
        else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO ACUTANGULO");
        else if (a == b && b == c) System.out.println("TRIANGULO EQUILATERO");
        else if (a == b || b == c && a != b || b != c) System.out.println("TRIANGULO ISOSCELES");
    }


}
