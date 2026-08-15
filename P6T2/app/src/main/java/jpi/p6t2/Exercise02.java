package jpi.p6t2;

import jpi.constructor.SimpleDictionary;

public class Exercise02 {
    public static void run() {
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "ichi");
        book.add("two", "san");

        IO.println("1. " + book.translate("one"));
        IO.println("2. " + book.translate("two"));
        IO.println("3. " + book.translate("three"));
    }
}
