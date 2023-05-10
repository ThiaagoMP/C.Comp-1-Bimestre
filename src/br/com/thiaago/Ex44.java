package br.com.thiaago;

import java.util.Scanner;

public class Ex44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 0;
        while (counter < 6) {
            if (number % 2 != 0) {
                counter++;
                System.out.println(number);
            }
            number++;
        }
    }

}
