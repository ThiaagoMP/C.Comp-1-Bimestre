package br.com.thiaago;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double noteOne = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double noteTwo = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        double noteThree = scanner.nextDouble();

        System.out.println("Digite a quarta nota");
        double noteFor = scanner.nextDouble();

        double sizeOne = 2;
        double sizeTwo = 3;
        double sizeThree = 4;
        double sizeFor = 1;

        double sumSizes = sizeOne + sizeTwo + sizeThree + sizeFor;

        double noteTotal = ((noteOne * sizeOne) + (noteTwo * sizeTwo) + (noteThree * sizeThree) + (noteFor * sizeFor)) / sumSizes;

        System.out.println("Nota: " + noteTotal);

        if (noteTotal >= 7)
            System.out.println("Aprovado");
        else if (noteTotal < 5)
            System.out.println("Reprovado");
        else if (noteTotal >= 5 && noteTotal < 7)
            System.out.println("Exame");

    }

}
