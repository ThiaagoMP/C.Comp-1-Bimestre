package br.com.thiaago;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario");
        int number = scanner.nextInt();

        System.out.println("Digite o numero de horas trabalhadas");
        int hours = scanner.nextInt();

        System.out.println("Digite o valor da hora do funcionario");
        double valueHour = scanner.nextDouble();

        System.out.println(number);
        System.out.println("U$ " + new DecimalFormat("#,###.00").format(hours * valueHour));

    }

}
