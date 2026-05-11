package jpi.p4t1;

import java.util.Scanner;

import jpi.constructors.Statistics;

public class Exercise11 {
    public static void run() {
        IO.println("=== EXERCISE 11 ===");
        IO.println("[oop] · counts");

        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        int userInput = 0;
        int evenSum = 0;
        int oddSum = 0;

        while (true) {
            userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            if (userInput % 2 == 0) evenSum += userInput;
            if (userInput % 2 != 0) oddSum += userInput;
            statistics.addNumber(userInput);
        }


        IO.println("Count: " + statistics.getCount());
        IO.println("Sum: " + statistics.sum());
        IO.println("Sum of even: " + evenSum);
        IO.println("Sum of odd: " + oddSum);
        IO.println("Average: " + statistics.average());

    }
}
