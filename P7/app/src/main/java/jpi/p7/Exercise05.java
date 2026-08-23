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

        ArrayList<Recipe> recipes = new ArrayList<>();
        readFile(recipes, filePath);

        IO.println("===== COMMANDS =====");
        IO.println("list - list the recipes");
        IO.println("find name - searches recipes by name");
        IO.println("find cooking time - searches recipes by cooking time");
        IO.println("find ingredient - searches recipes by ingredient");
        IO.println("stop - stops the program");

        while (true) {
            IO.print("\nEnter teh command: ");
            String userInput = scanner.nextLine();

            if (userInput.equals("stop")) {
                break;
            }

            if (userInput.equals("list")) {
                IO.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    IO.println(recipes.get(i).getTitleAndTime());
                }
            }

            if (userInput.equals("find name")) {
                IO.print("Searched word: ");
                String usSearchedWord = scanner.nextLine();

                IO.println("\nRecipes:");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getTitle().contains(usSearchedWord)) {
                        IO.println(recipes.get(i).getTitleAndTime());
                    }
                }
            }

            if (userInput.equals("find cooking time")) {
                IO.print("Max cooking time: ");
                int usMaxTime = Integer.valueOf(scanner.nextLine());

                IO.println("\nRecipes");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getTime() <= usMaxTime) {
                        IO.println(recipes.get(i).getTitleAndTime());
                    }
                }
            }

            if (userInput.equals("find ingredient")) {
                IO.print("Ingredient: ");
                String usIngredient = scanner.nextLine();

                IO.println("\nRecipes");
                for (int i = 0; i < recipes.size(); i++) {
                    if (recipes.get(i).getIngredients().contains(usIngredient)) {
                        IO.println(recipes.get(i).getTitleAndTime());
                    }
                }
            }
        }

        scanner.close();
    }

    public static void readFile(ArrayList<Recipe> recipes, String filePath) {
        String mode = "BLANK";

        String title = "";
        int time = 0;
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(filePath))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (mode.equals("BLANK")) {
                    title = line;
                    mode = "TITLE";
                } else if (mode.equals("TITLE")) {
                    time = Integer.valueOf(line);
                    mode = "TIME";
                } else if (mode.equals("TIME")) {
                    if (line.isBlank()) {
                        mode = "BLANK";
                        recipes.add(new Recipe(title, time, ingredients));
                        ingredients = new ArrayList<>();
                    } else {
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
    }
}
