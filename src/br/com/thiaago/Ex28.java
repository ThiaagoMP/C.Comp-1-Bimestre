package br.com.thiaago;

import java.util.*;

public class Ex28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numberOne = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int numberTwo = scanner.nextInt();

        System.out.println("Digite o terceiro numero");
        int numberThree = scanner.nextInt();

        List<Integer> numbers = Arrays.asList(numberOne, numberTwo, numberThree);
        Collections.sort(numbers);

        numbers.forEach(number -> System.out.println(number));
    }

}
