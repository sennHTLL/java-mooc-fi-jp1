package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {
    public static void run(){
        System.out.println(" === EXERCISE 2 === ");
        System.out.println(" == Understanding ArrayList index == ");
        Scanner scanner = new Scanner(System.in);

        thirdElement(scanner);
        secondPlusThird(scanner);
    }

    public static void thirdElement(Scanner scanner) {
        System.out.println("== == Third Element == ==");
        ArrayList<String> nameList = new ArrayList<>();

        System.out.println("Enter name (type nothing for exit)");
        while(true) {
            String userInput = scanner.nextLine();
            if (userInput == "") break;
            nameList.add(userInput);
        }
        System.out.println(nameList.get(2));
    } 

    public static void secondPlusThird(Scanner scanner) {
        System.out.println("== == Second + Third == ==");
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Enter number (0 for exit)");
        while(true) {
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput == 0) break;
            numList.add(userInput);
        }

        int x = numList.get(1);
        int y = numList.get(2);
        int sum = x + y;

        System.out.println("Sum of second and third: " + sum);
    }
}
