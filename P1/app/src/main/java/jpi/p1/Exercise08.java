package jpi.p1;

import java.util.Scanner;

public class Exercise08 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 8 ===");
        System.out.println(" == Conditionals == ");

        System.out.print("Give number: ");
        int num =  Integer.valueOf(scanner.nextLine());
        int even = num % 2;

        if (num > 0) {
            System.out.print("The number is positive ");
            if (even == 0) {
                System.out.println("and even");
            } else {
                System.out.println("and odd");
            }
        } else if (num < 0) {
            System.out.print("The number is negative ");
            if (even == 0) {
                System.out.println("and even");
            } else {
                System.out.println("and odd");
            }
        } else {
            System.out.println("The number is zero");
        }
    }
}
