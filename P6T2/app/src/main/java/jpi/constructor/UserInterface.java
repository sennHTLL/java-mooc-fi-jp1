package jpi.constructor;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(Scanner scanner, WordSet wordSet) {
        this.scanner = scanner;
        this.wordSet = wordSet;
    }

    public void start() {

        while (true) {
            IO.print("input something: ");
            String userInput = scanner.nextLine();

            if (this.wordSet.contains(userInput)) {
                break;
            }

            this.wordSet.add(userInput);
        }

        IO.println("you inputed same word twice");
        IO.println(this.wordSet.palindromes() + " of the words were palindromes");
    }
}
