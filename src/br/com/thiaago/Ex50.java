package br.com.thiaago;

import java.util.Scanner;

public class Ex50 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }

}
