package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 9 === ");
        System.out.println(" == sum and average == ");

        ArrayList<Integer> numberList = new ArrayList<>();
        inputInList(scanner, numberList);
        sumAndAverage(numberList);
        inputInList(scanner, numberList);
        sumAndAverage(numberList);
    }

    public static void inputInList(Scanner scanner, ArrayList<Integer> list) {
        System.out.println("Write numbers (-1 for exit): ");
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            list.add(userInput);
        }
    }

    public static void sumAndAverage(ArrayList<Integer> list) {
        int sum = 0;
        double average = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = (double) sum / list.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
