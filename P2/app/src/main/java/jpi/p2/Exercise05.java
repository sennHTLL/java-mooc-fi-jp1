package jpi.p2;

import java.util.Scanner;

public class Exercise05 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 5 === ");
        System.out.println(" == Factorial == ");

        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
