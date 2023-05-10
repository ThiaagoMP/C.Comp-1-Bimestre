package br.com.thiaago;

import java.util.Scanner;

public class Ex47 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.println(i + "^2: " + Math.pow(i, 2));
        }
    }

}
