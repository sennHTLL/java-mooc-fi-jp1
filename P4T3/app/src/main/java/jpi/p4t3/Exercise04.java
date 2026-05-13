package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise04 {

    public static void run() {
        IO.println("=== EXERCISE 4 ===");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        readingFile(scanner, nameList);
        searchingAndCheckingFile(scanner, nameList);
    }

    public static void searchingAndCheckingFile(Scanner scanner, ArrayList<String> list) {
        IO.print("Search for: ");
        String usSearch = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (usSearch.equals(list.get(i))) found = true;
        }

        if (found) {
            IO.println("Found");
        } else {
            IO.println("Not found");
        }
    }

    public static void readingFile(Scanner scanner, ArrayList<String> list) {
        String path = "app/src/main/resources/files/";
        String usPath = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(path + usPath))) {
            while (reader.hasNextLine()) list.add(reader.nextLine());
        } catch (Exception e) {
            IO.println("Reading file " + e.getMessage() + " failed");
        }
    }
} 
