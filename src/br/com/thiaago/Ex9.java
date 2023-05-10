package br.com.thiaago;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario");
        String name = scanner.next();

        System.out.println("Digite o salario fixo");
        double salary = scanner.nextDouble();

        System.out.println("Digite o valor total de vendas do vendedor");
        double value = scanner.nextDouble();

        double valueTotal = salary + (value * 0.15);

        System.out.println(name);
        System.out.println("R$ " + new DecimalFormat("#,###.00").format(valueTotal));
    }

}
