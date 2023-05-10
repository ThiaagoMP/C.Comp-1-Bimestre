package br.com.thiaago;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo em segundos:");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = seconds / 60;
        int secondsRest = seconds % 60;

        System.out.println(hours + "::" + minutes + "::" + secondsRest);
    }

}
