package br.com.thiaago;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

enum Months {
    JANUARY(1, "Janeiro"),
    FEBRUARY(2, "Fevereiro"),
    MARCH(3, "Março"),
    APRIL(4, "Abril"),
    MAY(5, "Maio"),
    JUNE(6, "Junho"),
    JULY(7, "Julho"),
    AUGUST(8, "Agosto"),
    SEPTEMBER(9, "Setembro"),
    OCTOBER(10, "Outubro"),
    NOVEMBER(11, "Novembro"),
    DECEMBER(12, "Dezembro");

    private final int numberMonth;
    private final String month;

    Months(int numberMonth, String month) {
        this.numberMonth = numberMonth;
        this.month = month;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public String getMonth() {
        return month;
    }
}

public class Ex37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mes");
        int numberMonth = scanner.nextInt();

        Optional<Months> optionalMonth = Arrays.stream(Months.values()).filter(month -> month.getNumberMonth() == numberMonth).findFirst();

        if (optionalMonth.isPresent()) System.out.println(optionalMonth.get().getMonth());
        else System.out.println("Mes nao encontrado");
    }

}
