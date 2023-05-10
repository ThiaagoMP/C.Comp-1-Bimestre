package br.com.thiaago;

import java.util.Scanner;

public class Ex33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seu salario");
        double salary = scanner.nextDouble();

        if (salary <= 400) {
            System.out.println("Seu novo salario: " + (salary + (salary * 0.15)));
        } else if (salary > 400 && salary <= 800) {
            System.out.println("Seu novo salario: " + (salary + (salary * 0.12)));
        } else if (salary > 800 && salary <= 1200) {
            System.out.println("Seu novo salario: " + (salary + (salary * 0.10)));
        } else if (salary > 1200 && salary <= 2000) {
            System.out.println("Seu novo salario: " + (salary + (salary * 0.07)));
        } else if (salary > 2000) {
            System.out.println("Seu novo salario: " + (salary + (salary * 0.04)));
        }
    }

}
