package jpi.p7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise05 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String filePath = "app/src/main/resources/recipes.txt";

        IO.println("===== COMMANDS =====");
        IO.println("list - list the recipes");
        IO.println("stop - stops the program");

        // IO.print("Enter teh command: ");
        // String userInput = scanner.nextLine();

        String mode = "BLANK";
        String title = "";
        String time = "";
        ArrayList<String> ingredients = new ArrayList<>();

        IO.println("===== FILE DATA =====");
        try (Scanner reader = new Scanner(Paths.get(filePath))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (mode.equals("BLANK")) {
                    IO.println("title · " + line);
                    title = line;
                    mode = "TITLE";
                } else if (mode.equals("TITLE")) {
                    IO.println("time · " + line);
                    time = line;
                    mode = "TIME";
                } else if (mode.equals("TIME")) {
                    if (line.isBlank()) {
                        mode = "BLANK";
                    } else {
                        IO.println("ingredients · " + line);
                        ingredients.add(line);
                    }
                }
            }

            IO.println("===== OVERALL =====");
            IO.println(title);
            IO.println(time);
            for (String ingredient : ingredients) {
                IO.println(ingredient);
            }
        } catch (FileNotFoundException e) {
            IO.println("[exception · " + e);
        } catch (IOException e) {
            IO.println("[exception] · " + e);
        }
    }
}
