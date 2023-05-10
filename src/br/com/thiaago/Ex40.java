package br.com.thiaago;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data que começou");
        String[] dateStartedArray = scanner.next().split(":");

        System.out.println("Digite a data que terminou");
        String[] dateEndArray = scanner.next().split(":");

        Date dateStarted = new Date();
        dateStarted.setDate(Integer.parseInt(dateStartedArray[0]));
        dateStarted.setMonth(Calendar.APRIL);
        dateStarted.setYear(2000);
        dateStarted.setHours(Integer.parseInt(dateStartedArray[1]));
        dateStarted.setMinutes(Integer.parseInt(dateStartedArray[2]));
        dateStarted.setSeconds(Integer.parseInt(dateStartedArray[3]));

        Date dateEnd = new Date();
        dateEnd.setDate(Integer.parseInt(dateEndArray[0]));
        dateEnd.setMonth(Calendar.APRIL);
        dateEnd.setYear(2000);
        dateEnd.setHours(Integer.parseInt(dateEndArray[1]));
        dateEnd.setMinutes(Integer.parseInt(dateEndArray[2]));
        dateEnd.setSeconds(Integer.parseInt(dateEndArray[3]));

        Date dateDifference = new Date(dateEnd.toInstant().toEpochMilli() - dateStarted.toInstant().toEpochMilli());
        System.out.println(dateDifference.getDate());
        System.out.println(dateDifference.getHours());
        System.out.println(dateDifference.getMinutes());
        System.out.println(dateDifference.getSeconds());
    }

}
