package br.com.thiaago;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite x");
        int x = scanner.nextInt();

        System.out.println("Digite y");
        int y = scanner.nextInt();

        if(x % y == 0 || y % x == 0) System.out.println("Sao multiplos");
        else System.out.println("Nao sao multiplos");
    }

}
