package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise05 {
    public static void run() {
        IO.println("=== EXERCISE 5 ===");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numList = new ArrayList<>();

        readingFile(scanner, numList);
        
        IO.print("Lower bound: ");
        int usLow = Integer.valueOf(scanner.nextLine());
        IO.print("Upper bound: ");
        int usUpp = Integer.valueOf(scanner.nextLine());

        searchInFileBetween(scanner, numList, usLow, usUpp);
    }

    public static void searchInFileBetween(Scanner scanner, ArrayList<String> list, int usMin, int usMax) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int get = Integer.valueOf(list.get(i));
            if (get >= usMin && get <= usMax) {
                count++;
            }
        }
        IO.println("Numbers: " + count);
    }

    public static void readingFile(Scanner scanner, ArrayList<String> list) {
        String path = "app/src/main/resources/files/";
        IO.print("File? ");
        String usFile = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(path + usFile))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }
}
