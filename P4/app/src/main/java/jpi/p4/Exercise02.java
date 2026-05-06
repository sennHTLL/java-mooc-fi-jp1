package jpi.p4;

import jpi.constructors.Door;
import jpi.constructors.Product;
import jpi.constructors.Whistle;

public class Exercise02 {
    public static void run() {
        IO.println("=== EXERCISE 02 ===");
        IO.println("[oop] · consturctors n' methods");

        whistles();
        doorKnock();
        printProduct();
    }

    public static void printProduct() {
        IO.println("constructor · Product");
        Product banana = new Product("Banana", 1.1, 13);

        banana.print();

        IO.println();
    }

    public static void doorKnock() {
        IO.println("constructor · Door");

        Door alexander = new Door();

        alexander.knock();
        alexander.knock();

        IO.println();
    }

    public static void whistles() {
        IO.println("constructor · Whistle");

        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();

        IO.println();
    }
}
