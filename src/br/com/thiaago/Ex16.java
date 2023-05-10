package br.com.thiaago;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        double velocityCarOne = 60;
        double velocityCarTwo = 90;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia que o carro x percorreu");
        double distance = scanner.nextDouble();

        double timeCarOne = distance / velocityCarOne;
        double timeCarTwo = distance / velocityCarTwo;

        System.out.println("Tempo do carro x " + timeCarOne);
        System.out.println("Tempo do carro y " + timeCarTwo);
    }

}
