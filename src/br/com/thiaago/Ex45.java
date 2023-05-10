package br.com.thiaago;

import java.util.Scanner;

public class Ex45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int sum = 0;
        for (int i = firstNumber; i < secondNumber; i++) {
            if (i % 2 != 0) sum += i;
        }
        System.out.println(sum);
    }


}
