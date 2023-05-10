package br.com.thiaago;

import java.util.Scanner;

public class Ex39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterPositive = 0;
        int counterNegative = 0;
        for (int i = 0; i < 6; i++) {
            if (scanner.nextDouble() >= 0) counterPositive++;
            else counterNegative++;
        }
        System.out.println(counterPositive);
        System.out.println(counterNegative);
    }

}
