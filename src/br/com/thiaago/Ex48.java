package br.com.thiaago;

import java.util.Scanner;

public class Ex48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        boolean positive = number >= 0;
        boolean pair = number % 2 == 0;

        System.out.println((positive ? "Positivo " : "Negativo ") + (pair ? "Par" : "Impar"));
    }

}
