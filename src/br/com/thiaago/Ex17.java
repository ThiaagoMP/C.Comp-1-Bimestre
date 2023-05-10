package br.com.thiaago;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int litter = 12;

        System.out.println("Digite o tempo gasto na viagem");
        int time = scanner.nextInt();

        System.out.println("Digite a velocidade media");
        int velocity = scanner.nextInt();

        int distance = time * velocity;

        System.out.println("Litros gastos: " + new DecimalFormat("#,###.000").format(distance));
    }

}
