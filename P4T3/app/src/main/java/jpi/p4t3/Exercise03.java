package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03{
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> guestList = new ArrayList<>();

        readingFile(scanner, guestList);
        IO.println("Enter names, an empty line quits");
        searchingInFile(scanner, guestList);
    }

    public static void searchingInFile(Scanner scanner, ArrayList<String> list) {
        while (true) {
            String usGuess = scanner.nextLine();
            if (usGuess.isEmpty()) break;

            boolean found = false;
            for (int i = 0; i < list.size(); i++) {
                if (usGuess.equals(list.get(i))) {
                    found = true;
                    break;
                }
            }

            if (found) {
                IO.println("Name on the list");
            } else {
                IO.println("Name not on the list");
            }
        }
    }

    public static void readingFile(Scanner scanner, ArrayList<String> list) {
        String path = "app/src/main/resources/files/";
        IO.print("Enter file name: ");
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
