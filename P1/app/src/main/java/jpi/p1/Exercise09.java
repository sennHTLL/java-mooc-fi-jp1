package jpi.p1;

import java.util.Scanner;

public class Exercise09 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 9 === ");
        System.out.println(" == String equaling == ");

        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        if (string.equals("a string")) {
            System.out.println("You read correctly");
        } else {
            System.out.println("Missed the mark");
        }

        System.out.println("Input two string: ");
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Strings same");
        } else {
            System.out.println("Strings different");
        }

        if (first.equals(string)) System.out.println("Clever!");
        if (second.equals(string)) System.out.println("Sneaky!");
    } 
}
