package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise7 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 7 === ");
        System.out.println(" == Index of searching number == ");

        ArrayList<Integer> numberList = new ArrayList<>();
        inputInList(scanner, numberList);

        System.out.print("What number you search in list: ");
        int userSearch = Integer.valueOf(scanner.nextLine());

        searchIndexOf(numberList, userSearch);
    }

    public static void inputInList(Scanner scanner, ArrayList<Integer> list){
        System.out.println("Enter numbers (-1 for exit):");
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            list.add(userInput);
        }
    }

    public static void searchIndexOf(ArrayList<Integer> list, int searchValue) {
        // int numValue = 0;
        // int numIndex = 0;
        ArrayList<Integer> indexList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            // System.out.println("Before condition check index: " + i);
            // System.out.println("Before condition check value: " + list.get(i));
            if (list.get(i) == searchValue) {
                // numIndex = i;
                indexList.add(i);
            }
            // System.out.println("After condition check index: " + numIndex);
            // System.out.println("After condition check value: " + numValue);
        }

        for(int j = 0; j < indexList.size(); j++) {
            System.out.println(searchValue + " is at index " + indexList.get(j));
        }
    }
}
