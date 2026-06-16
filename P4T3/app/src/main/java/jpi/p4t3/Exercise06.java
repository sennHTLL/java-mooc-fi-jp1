package jpi.p4t3;

import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise06 {
    public static void run() {
        IO.println("=== EXERCISE 6 ===");

        String file = "app/src/main/resources/files/csv-f.txt";

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                IO.println("Name: " + name + ", Age: " + age);
            }
        } catch (Exception e) { IO.println("Error: " + e.getMessage()); }
    }
}
