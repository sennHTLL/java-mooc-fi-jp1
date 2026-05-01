package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise10 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 10 === ");
        System.out.println(" == On the list? == ");

        ArrayList<String> nameList = new ArrayList<>();
        inputInList(scanner, nameList);
        searchFor(scanner, nameList);
    }

    public static void inputInList(Scanner scanner, ArrayList<String> list) {
        System.out.println("Enter names (enter enter for exit):");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput == "") break;
            list.add(userInput);
        }
    }

    public static void searchFor(Scanner scanner, ArrayList<String> list) {
        System.out.print("Search for? ");
        String userInput = scanner.nextLine();

        if (list.contains(userInput)){
            System.out.println(userInput + " was found!");
        } else {
            System.out.println(userInput + " was not found!");
        }
    }
}
