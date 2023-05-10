package br.com.thiaago;

import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario");
        double salary = scanner.nextDouble();

        double percent = 0.0;
        if (salary > 2000 && salary <= 3000)
            percent = 0.08;
        else if (salary > 3000 && salary <= 4500)
            percent = 0.18;
        else if (salary > 4500)
            percent = 0.28;

        if (percent == 0)
            System.out.println("Isento");
        else
            System.out.println("R$" + salary * percent);
    }

}
