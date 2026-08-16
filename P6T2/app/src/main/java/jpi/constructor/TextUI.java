package jpi.constructor;

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            IO.print("Command: ");
            String userInput = this.scanner.nextLine();
            if (userInput.equals("end")) {
                IO.println("Bye bye");
                break;
            } else if (userInput.equals("add")) {
                IO.print("Word: ");
                String word = this.scanner.nextLine();
                IO.print("Translation: ");
                String translation = this.scanner.nextLine();

                dictionary.add(word, translation);
            } else if (userInput.equals("search")) {
                IO.print("To be translated: ");
                String toBeTranslated = this.scanner.nextLine();
                String translate = this.dictionary.translate(toBeTranslated);

                if (translate.contains("was not found")) {
                    IO.println(translate);
                } else {
                    IO.println("Translation: " + translate);
                }
            } else {
                IO.println("Unknown command");
            }
        }
    }
}
