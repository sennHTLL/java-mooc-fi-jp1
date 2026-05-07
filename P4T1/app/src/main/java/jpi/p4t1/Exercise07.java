package jpi.p4t1;

import jpi.constructors.Song;

public class Exercise07 {
    public static void run() {
        IO.println("=== EXERCISE 07 ===");
        IO.println("[oop] · songs");

        Song carryOn = new Song("Carry On", 120);
        IO.println("The song " + carryOn.name() + " has a length of " + carryOn.length() + " seconds.");
    }
}
