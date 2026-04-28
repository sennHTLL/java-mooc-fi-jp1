package jpi.p2;

import java.util.Scanner;

public class Exercise06 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 6 === ");
        System.out.println(" == Methods == ");

        System.out.print("How many times? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= userInput; i++) {
            System.out.print(i + ". ");
            printText();
        }
    }

    public static void printText() {
        System.out.println("Bocchi zee Rock");
    }
}
