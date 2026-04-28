package jpi.p2;

import java.util.Scanner;

public class Exercise03 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 3 === ");
        System.out.println(" == From where to where == ");

        System.out.print("Where to? ");
        int wTo = Integer.valueOf(scanner.nextLine());
        System.out.print("Where form? ");
        int wFrom = Integer.valueOf(scanner.nextLine());

        if (wTo < wFrom) System.out.println("3RR0R");

        for (int i = wFrom; i <= wTo; i++) {
            System.out.println(i);
        }
    }
}
