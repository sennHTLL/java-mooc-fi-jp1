package jpi.p1;

// IMPORTS
import java.util.Scanner;

// CODE
public class Exercise03 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 3 === ");
        System.out.println(" == Reading Inputs == ");

        System.out.print("Write a message: ");
        String message = scanner.nextLine();
        System.out.println("Your message: " + message);
    }
}
