package br.com.thiaago;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite x");
        double x = scanner.nextDouble();

        System.out.println("Digite y");
        double y = scanner.nextDouble();

        if(x > 0 && y > 0) System.out.println("Q1");
        else if(x > 0 && y < 0) System.out.println("Q4");
        else if(x < 0 && y > 0) System.out.println("Q2");
        else if(x < 0 && y < 0) System.out.println("Q3");
    }

}
