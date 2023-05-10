package br.com.thiaago;

import java.util.Scanner;

public class Ex41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterPositive = 0;
        double positivesValue = 0;
        for (int i = 0; i < 6; i++) {
            double number = scanner.nextDouble();
            if (number >= 0) {
                counterPositive++;
                positivesValue += number;
            }
        }
        System.out.println(positivesValue / counterPositive);
    }

}
