package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 6 === ");
        System.out.println(" == Greatest == ");

        ArrayList<Integer> numberList = new ArrayList<>();

        inputInList(scanner, numberList);
        smallest(numberList);
        greatest(numberList);
    }

    public static void inputInList(Scanner scanner, ArrayList<Integer> list) {
        System.out.println("Enter numbers (-1 for exit):");
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            list.add(userInput);
        }
    }

    // =!= using int value = list.get(0); not my idea =!=
    // i was doing just int value = 0;

    public static void smallest(ArrayList<Integer> list) {
        int minValue = list.get(0);
        for (int i = 0; i < list.size(); i++){
            // int number = list.get(i);
            // if (minValue > number) minValue = number;
            if (list.get(i) < minValue) minValue = list.get(i);
        }
        System.out.println("Smallest number in list: " + minValue);
    }

    public static void greatest(ArrayList<Integer> list) {
        int maxValue = list.get(0);
        for (int i = 0; i < list.size(); i++){
            // System.out.println("Before condition check " + list.get(i));
            if (list.get(i) > maxValue) maxValue = list.get(i);
            // System.out.println("After condition check - max value " + maxValue);
        }
        System.out.println("Greatest number in list: " + maxValue);
    }
}
