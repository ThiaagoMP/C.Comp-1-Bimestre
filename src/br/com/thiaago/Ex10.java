package br.com.thiaago;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        for (int i = 1; i < 3; i++) {
            System.out.println("Digite o codigo do produto " + i);
            int code = scanner.nextInt();

            System.out.println("Digite a unidade do produto: " + i);
            int unit = scanner.nextInt();

            System.out.println("Digite o preço do produto: " + i);
            double price = scanner.nextDouble();

            products.add(new Product(code, unit, price));
        }

        products.forEach(product -> System.out.println("Valor a pagar: R$" + new DecimalFormat("#,###.00").format(product.getPriceTotal())));
    }

    private static class Product {

        private int code, unit;
        private double price;

        public Product(int code, int unit, double price) {
            this.code = code;
            this.unit = unit;
            this.price = price;
        }

        public double getPriceTotal() {
            return unit * price;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public int getUnit() {
            return unit;
        }

        public void setUnit(int unit) {
            this.unit = unit;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

}


