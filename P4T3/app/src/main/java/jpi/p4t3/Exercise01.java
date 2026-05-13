package jpi.p4t3;

import java.util.Scanner;

public class Exercise01{
    public static void run(){
        IO.println("=== EXERCISE 1 ===");
        Scanner scanner = new Scanner(System.in);

        numOfStrings(scanner);
        cubes(scanner);
    }

    public static void cubes(Scanner scanner) {
        IO.println("[remembering] · cubes");
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) break;
            int userNum = Integer.valueOf(userInput);
            double cubed = Math.pow(userNum, 3);
            IO.println(cubed);
        }
    }

    public static void numOfStrings(Scanner scanner) {
        IO.println("[remembering] · number of strings");
        int count = 0;
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("end")) break;
            count++;
        }
        IO.println(count);
    }
}
