package jpi.p1;

import java.util.Scanner;

public class Exercise06 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 6 === ");
        System.out.println(" == Days to second == ");

        System.out.print("How many days would you like to convert to seconds ");
        int day = Integer.valueOf(scanner.nextLine());

        int dayHours = day * 24;
        int dayMinutes = dayHours * 60;
        int daySecond = dayMinutes * 60;

        System.out.println(daySecond);
    }
}

