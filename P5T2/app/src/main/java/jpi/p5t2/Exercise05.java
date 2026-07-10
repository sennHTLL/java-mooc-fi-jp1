package jpi.p5t2;

import jpi.constructor.Song;

public class Exercise05 {
    public static void run() {
        IO.println("=== [xercise] · 5 ===");

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) IO.println("Songs are equal");
        if (jackSparrow.equals("Another song")) IO.println("Strange");
    }
}
