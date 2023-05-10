package br.com.thiaago;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a");
        int a = scanner.nextInt();

        System.out.println("Digite b");
        int b = scanner.nextInt();

        System.out.println("Digite c");
        int c = scanner.nextInt();

        System.out.println("Digite d");
        int d = scanner.nextInt();

        if (b > c && d > a && (c + d) > (a + b) && c >= 0 && d >= 0 && a % 2 == 0)
            System.out.println("Valores aceitos");
        else
            System.out.println("Valores não aceitos");

    }

}