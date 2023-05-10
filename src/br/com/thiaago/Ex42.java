package br.com.thiaago;

import java.util.Scanner;

public class Ex42 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterPair = 0;
        for (int i = 0; i < 6; i++) {
            double number = scanner.nextDouble();
            if (number >= 0)
                counterPair++;

        }
        System.out.println(counterPair);
    }

}
