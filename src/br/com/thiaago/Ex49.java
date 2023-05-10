package br.com.thiaago;

import java.util.Scanner;

public class Ex49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < 10000; i++) {
            if (i % number == 2) System.out.println(i);
        }
    }

}
