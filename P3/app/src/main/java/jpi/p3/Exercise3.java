package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 3 === ");
        System.out.println(" == Iterating over a list == ");

        // stringIterates(scanner);
        integerIterates(scanner);
    }

    public static void stringIterates(Scanner scanner) {
        ArrayList<String> teacherList = new ArrayList<>();
        System.out.println("Enter names:");

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput == "") break;
            teacherList.add(userInput);
        }
        System.out.println("In total: " + teacherList.size());

        for (int i = 0; i < teacherList.size(); i++) {
            System.out.println(teacherList.get(i));
        }
    }

    public static void integerIterates(Scanner scanner) {
        ArrayList<Integer> numberList = new ArrayList<>();
        System.out.println("Enter numbers (0 for exit):");

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0) break;
            numberList.add(userInput);
        }
        System.out.println("In total: " + numberList.size());

        // =?= why index = numberList.size() - 1 =?= and not just numberList.size()
        // is it because while list contains (0-1-2-3) -- int i contain (1-2-3-4)
        // and when we take i it takes index 4, but list don't have value by index 4
        // that's why i greater than or equal to zero, cause the first value of list is 0
        // just theory, need to recheck
        for (int i = numberList.size() - 1; i >= 0; i--) {
            int numberGets = numberList.get(i);
            System.out.println(numberGets);
        }

    }
}
