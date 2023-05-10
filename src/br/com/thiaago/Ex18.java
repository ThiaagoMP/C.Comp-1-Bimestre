package br.com.thiaago;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int number = scanner.nextInt();

        int numberDividedHundred = number / 100;
        int numberRestHundred = number % 100;

        int numberDividedFifty = numberRestHundred / 50;
        int numberRestFifty = numberRestHundred % 50;

        int numberDividedTwenty = numberRestFifty / 20;
        int numberRestTwenty = numberRestFifty % 20;

        int numberDividedTen = numberRestTwenty / 10;
        int numberRestTen = numberRestTwenty % 10;

        int numberDividedFive = numberRestTen / 5;
        int numberRestFive = numberRestTen % 5;

        int numberDividedTwo = numberRestFive / 2;
        int numberRestTwo = numberRestFive % 2;

        int numberDividedOne = numberRestTwo / 1;

        System.out.println("Cedulas 100: " + numberDividedHundred);
        System.out.println("Cedulas 50: " + numberDividedFifty);
        System.out.println("Cedulas 20: " + numberDividedTwenty);
        System.out.println("Cedulas 10: " + numberDividedTen);
        System.out.println("Cedulas 5: " + numberDividedFive);
        System.out.println("Cedulas 2: " + numberDividedTwo);
        System.out.println("Cedulas 1: " + numberDividedOne);
    }

}
