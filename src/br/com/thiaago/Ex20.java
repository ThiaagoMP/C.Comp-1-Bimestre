package br.com.thiaago;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantia de dias");
        int days = scanner.nextInt();

        int years = days / 365;
        int yearsRest = days % 365;

        int mouths = yearsRest / 30;
        int mouthsRest = yearsRest % 30;

        System.out.println(years+" anos");
        System.out.println(mouths + " meses");
        System.out.println(mouthsRest + " dias");


    }

}
