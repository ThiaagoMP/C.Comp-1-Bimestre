package br.com.thiaago;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o km");
        double km = scanner.nextDouble();

        System.out.println("Digite os litros");
        double litter = scanner.nextDouble();

        System.out.println(km/litter + "km/l");
    }

}
