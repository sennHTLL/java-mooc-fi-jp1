package jpi.p1;

import java.util.Scanner;

public class Exercise07 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 7 === ");
        System.out.println(" == Calculations ==");

        // === Inputs
        System.out.print("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        // === Calculations
        int sum = first + second;
        int diff = first - second;
        int product = first * second;
        double quotient = (double) first / second;

        // === Outputs
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
