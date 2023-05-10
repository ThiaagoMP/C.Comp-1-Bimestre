package br.com.thiaago;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        double sizeA = 2;
        double sizeB = 3;
        double sizeC = 5;
        double sizeSum = sizeA + sizeB + sizeC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno!");
        double a = scanner.nextDouble();

        if (verifyNote(a)) {
            System.out.println("Digite uma nota entre 0 e 10");
            return;
        }

        System.out.println("Digite a segunda nota do aluno!");
        double b = scanner.nextDouble();

        if (verifyNote(b)) {
            System.out.println("Digite uma nota entre 0 e 10");
            return;
        }

        System.out.println("Digite a terceira nota do aluno!");
        double c = scanner.nextDouble();

        if (verifyNote(c)) {
            System.out.println("Digite uma nota entre 0 e 10");
            return;
        }

        double media = ((sizeA * a) + (sizeB * b) + (sizeC * c) / sizeSum);
        System.out.println("Media: " + new DecimalFormat("#,###.0").format(media));
    }

    private static boolean verifyNote(double note) {
        return note < 0 || note > 10;
    }

}
