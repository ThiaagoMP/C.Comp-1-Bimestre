package br.com.thiaago;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

enum Cities {

    BRASILIA(61, "Brasilia"),
    SALVADOR(71, "Salvador"),
    SAO_PAULO(11, "Sao Paulo"),
    RIO(21, "Rio de Janeiro"),
    JUIZ_DE_FORA(32, "Juiz de Fora"),
    CAMPINAS(19, "Campinas"),
    VITORIA(27, "Vitoria"),
    BH(31, "Belo Horizonte");

    private final int ddd;
    private final String city;

    Cities(int ddd, String city) {
        this.ddd = ddd;
        this.city = city;
    }

    public int getDdd() {
        return ddd;
    }

    public String getCity() {
        return city;
    }

}


public class Ex35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ddd");
        int ddd = scanner.nextInt();

        Optional<Cities> optionalCity = Arrays.stream(Cities.values()).filter(cities -> cities.getDdd() == ddd).findFirst();

        if (optionalCity.isPresent()) System.out.println(optionalCity.get().getCity());
        else System.out.println("Cidade nao encontrada");
    }

}
