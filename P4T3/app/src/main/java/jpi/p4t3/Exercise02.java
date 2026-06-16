package jpi.p4t3;

import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise02 {
    public static void run() {
        IO.println("=== EXERCISE 03 ===");
        IO.println("[file] · reading");

        Scanner scanner = new Scanner(System.in);

        IO.println("[try] · 1");
        file();
        IO.println("[try] · 2");
        data();
        IO.println("[try] · 3");
        IO.print("Input file name (e.g. file.txt): ");
        userAsks(scanner);
    }

    public static void userAsks(Scanner scanner) {
        String user = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get("app/src/main/resources/files/" + user))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                IO.println(row);
            }
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }

    public static void data() {
        try (Scanner reader = new Scanner(Paths.get("app/src/main/resources/files/data.txt"))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                IO.println(row);
            }
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }

    public static void file() {
        try (Scanner reader = new Scanner(Paths.get("app/src/main/resources/files/file.txt"))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                IO.println(row);
            }
        } catch (Exception e) {
            IO.println("Error: " + e.getMessage());
        }
    }
}
