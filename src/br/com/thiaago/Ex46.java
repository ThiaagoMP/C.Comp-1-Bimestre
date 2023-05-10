package br.com.thiaago;

import java.util.Scanner;

public class Ex46 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de numeros para ler");
        int number = scanner.nextInt();

        int[] range = {10, 20};

        int counterInside = 0;
        for (int i = 0; i < number; i++) {
            if (scanner.nextInt() > range[0] && scanner.nextInt() < range[1]) counterInside++;
        }

        System.out.println(counterInside + " em");
        System.out.println(number - counterInside + " fora");
    }

}
