package br.com.thiaago;

import java.util.Date;
import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Horas que começou");
        int hoursStarted = scanner.nextInt();

        System.out.println("Horas que terminou");
        int hoursEnded = scanner.nextInt();

        if (hoursStarted > hoursEnded) {
            System.out.println("O jogo durou: " + ((24 - hoursStarted) + hoursEnded));
        } else if (hoursEnded > hoursStarted)
            System.out.println("O jogo durou: " + (hoursEnded - hoursStarted));
        else if (hoursStarted == hoursEnded)
            System.out.println("O jogo durou 24 horas");
    }
}
