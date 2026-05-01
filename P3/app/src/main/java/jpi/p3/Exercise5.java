package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 5 === ");
        System.out.println(" == Number list iterating == ");

        ArrayList<Integer> numberList = new ArrayList<>();
        inputNumberInList(scanner, numberList);
        int range = numberList.size() - 1;
        System.out.println("List size from 0 to " + range);

        System.out.print("Where from: ");
        int whereFrom = Integer.valueOf(scanner.nextLine());
        System.out.print("Where to: ");
        int whereTo = Integer.valueOf(scanner.nextLine());
        
        readingList(numberList, whereFrom, whereTo);
    }

    public static void inputNumberInList(Scanner scanner, ArrayList<Integer> list) {
        System.out.println("Enter numbers (-1 for exit):");
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == -1) break;
            list.add(userInput);
        }
    }

    public static void readingList(ArrayList<Integer> list, int start, int end){
        for(int i = start; i <= list.size(); i++){
            System.out.println(list.get(i));
            if(i == end) break;
        }
    }
}
