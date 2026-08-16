package jpi.p6t2;

import java.util.Scanner;

import jpi.constructor.SimpleDictionary;
import jpi.constructor.TextUI;

public class Exercise02 {
    public static void run() {
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "ichi");
        book.add("two", "san");

        IO.println("1. " + book.translate("one"));
        IO.println("2. " + book.translate("two"));
        IO.println("3. " + book.translate("three"));

        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();

        IO.println(dictionary.translate("mountain"));
    }
}
