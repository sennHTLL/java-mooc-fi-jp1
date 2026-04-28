package jpi.p2;

import java.util.Scanner;

public class Exercise02 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 2 === ");
        System.out.println(" == 'For' loopies == ");

        System.out.print("Input the end of the loop: ");
        int end = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= end; i++) {
            System.out.println(i);
        }

        System.out.print("Input the start of the loop: ");
        int start = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
