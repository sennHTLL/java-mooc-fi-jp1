package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise08 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 8 === ");
        System.out.println(" == Index of smallest value on list == ");

        ArrayList<Integer> numberList = new ArrayList<>();
        inputInList(scanner, numberList);
        indexOfSmallest(numberList);
    }

    public static void inputInList(Scanner scanner, ArrayList<Integer> list) {
        System.out.println("Enter numbers (-1 for exit):");
        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            list.add(userInput);
        }
    }

    public static void indexOfSmallest(ArrayList<Integer> list) {
        int minValue = list.get(0);
        ArrayList<Integer> minIndexList = new ArrayList<>();
        minIndexList.add(0); // added by AI

        // int i = 1 was added by AI, mine was int i = 0
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i);
                minIndexList = new ArrayList<>(); // added by AI
                minIndexList.add(i);
            } 
            // this else if was added by AI
            else if (list.get(i) == minValue) {
                minIndexList.add(i);
            }
        }
        
        System.out.println("Smallest number: " + minValue);
        for (int j = 0; j < minIndexList.size(); j++) {
            // i wrote just "..." + j
            System.out.println("Fount at index: " + minIndexList.get(j));
        }
    }

    // MY VERSION
    // public static void indexOfSmallest(ArrayList<Integer> list) {
    //     int minValue = list.get(0);
    //     int minIndex = 0;
    //     ArrayList<Integer> minIndexList = new ArrayList<>();
    //
    //     for (int i = 0; i < list.size(); i++) {
    //         // System.out.println("BCCI: " + i);
    //         // System.out.println("BCCV: " + list.get(i));
    //         // i forgot that minIndex and minIndexList.add need to be inside if also
    //         if (list.get(i) < minValue) {
    //             minValue = list.get(i);
    //             minIndex = i; 
    //             minIndexList.add(minIndex);
    //         } 
    //         // System.out.println("ACCI: " + minIndex);
    //         // System.out.println("ACCV: " + minValue);
    //     }
    //     
    //     System.out.println("Smallest number: " + minValue);
    //     System.out.println(minIndexList.size());
    //     for (int j = 0; j < minIndexList.size(); j++) {
    //         System.out.println("Fount at index: " + minIndexList.get(j));
    //     }
    // }
}
