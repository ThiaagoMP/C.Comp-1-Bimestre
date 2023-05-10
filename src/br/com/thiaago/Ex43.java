package br.com.thiaago;

import java.util.Scanner;

public class Ex43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterPair = 0;
        int counterPositive = 0;
        for (int i = 0; i < 5; i++) {
            double number = scanner.nextDouble();
            if (number >= 0)
                counterPositive++;
            if (number % 2 == 0) counterPair++;

        }
        System.out.println("Pares: " + counterPair);
        System.out.println("Impares: " + (5 - counterPair));
        System.out.println("Positivos: " + counterPositive);
        System.out.println("Negativos: " + (5 - counterPositive));
    }

}
