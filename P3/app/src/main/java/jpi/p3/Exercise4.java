package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 4 === ");
        System.out.println(" == Last from list == ");

        ArrayList<String> nameList = new ArrayList<>();
        inputInList(scanner, nameList);
        readingFirstValueOfList(nameList);
        readingLastValueOfList(nameList);
    }

    public static void inputInList(Scanner scanner, ArrayList<String> list) {
        System.out.println("Enter names:");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput == "") break;
            list.add(userInput);
        }
    }

    public static void readingFirstValueOfList(ArrayList<String> list) {
        int first = list.size();
        while (first >= 0) {
            first--;
        }
        first += 1;
        
        System.out.println("First entered name: " + list.get(first));
    }

    public static void readingLastValueOfList(ArrayList<String> list) {
        int last = 0;
        
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        //     last++;
        //  }
        
        while (last < list.size()) {
            last++;
        }
        last -= 1;
        
        System.out.println("Last entered name: " + list.get(last));
    }
}
