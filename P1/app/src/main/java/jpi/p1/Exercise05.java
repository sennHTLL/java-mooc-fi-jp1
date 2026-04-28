package jpi.p1;

// IMPORTS
import java.util.Scanner;

// CODE
public class Exercise05 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 5 === ");
        System.out.println(" == Reading different types ==");

        System.out.print("Write text: ");
        String text = scanner.nextLine();
        System.out.println(text);

        System.out.print("Write number: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println(number);
        
        System.out.print("Write double number: ");
        double doubleNum = Double.valueOf(scanner.nextLine());
        System.out.println(doubleNum);

        System.out.println("Write a boolean: ");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        System.out.println(bool);
    }
}
