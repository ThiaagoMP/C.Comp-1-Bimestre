package br.com.thiaago;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Cachorro Quente", 4.00));
        productList.add(new Product(2, "X-Salada", 4.50));
        productList.add(new Product(3, "X-Bacon", 5.00));
        productList.add(new Product(4, "Torrada Simples", 2.00));
        productList.add(new Product(5, "Refrigerante", 1.50));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        double number = scanner.nextDouble();

        Optional<Product> optionalProduct = productList.stream().filter(product -> product.getId() == number).findFirst();

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            System.out.println("ID: " + product.getId());
            System.out.println("Descriçao: " + product.getDescription());
            System.out.println("Preço: " + product.getPrice());

        } else System.out.println("ID invalido!");
    }

}

class Product {

    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
