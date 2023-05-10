package br.com.thiaago;

import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPhase = scanner.next();

        if (firstPhase.equalsIgnoreCase("vertebrado")) executeVertebrate(scanner);
        else if (firstPhase.equalsIgnoreCase("invertebrado")) executeInvertebrate(scanner);
    }

    private static void executeVertebrate(Scanner scanner) {
        String secondPhase = scanner.next();
        String thirdPhase = scanner.next();

        if (secondPhase.equalsIgnoreCase("ave")) {
            if (thirdPhase.equalsIgnoreCase("carnivoro"))
                System.out.println("aguia");
            else if (thirdPhase.equalsIgnoreCase("onivoro"))
                System.out.println("pomba");
            else printError();
        } else if (secondPhase.equalsIgnoreCase("mamifero")) {
            if (thirdPhase.equalsIgnoreCase("onivoro"))
                System.out.println("homem");
            else if (thirdPhase.equalsIgnoreCase("herbivoro"))
                System.out.println("vaca");
            else printError();
        } else printError();
    }

    private static void executeInvertebrate(Scanner scanner) {
        String secondPhase = scanner.next();
        String thirdPhase = scanner.next();

        if (secondPhase.equalsIgnoreCase("inseto")) {
            if (thirdPhase.equalsIgnoreCase("hematofago"))
                System.out.println("pulga");
            else if (thirdPhase.equalsIgnoreCase("herbivoro"))
                System.out.println("lagarta");
            else printError();
        } else if (secondPhase.equalsIgnoreCase("anelideo")) {
            if (thirdPhase.equalsIgnoreCase("hematofago"))
                System.out.println("sanguessuga");
            else if (thirdPhase.equalsIgnoreCase("onivoro"))
                System.out.println("minhoca");
            else printError();
        } else printError();
    }

    private static void printError() {
        System.out.println("Entradas invalidas!");
    }

}

