package jpi.p7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructor.Recipe;

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

        ArrayList<Recipe> recipes = new ArrayList<>();

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
                        recipes.add(new Recipe(title, time, ingredients));
                        ingredients = new ArrayList<>();
                    } else {
                        IO.println("ingredients · " + line);
                        ingredients.add(line);
                    }
                }
            }
            recipes.add(new Recipe(title, time, ingredients));
        } catch (FileNotFoundException e) {
            IO.println("[exception · " + e);
        } catch (IOException e) {
            IO.println("[exception] · " + e);
        }

        IO.println("===== TAZ'DINGO =====");
        IO.println(recipes.get(0).getTitle());
        IO.println(recipes.get(1).getTitle());
        IO.println(recipes.get(2).getTitle());
        IO.println(recipes.get(0).getTime());
        IO.println(recipes.get(1).getTime());
        IO.println(recipes.get(2).getTime());
        IO.println(recipes.get(0).getIngredients());
        IO.println(recipes.get(1).getIngredients());
        IO.println(recipes.get(2).getIngredients());
    }
}
