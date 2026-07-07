package jpi.p5;

import jpi.constructor.Product;

public class Exercise03 {

    public static void run() {
        IO.println("=== Exercise 03 ===");
        IO.println("[oop] · constructor overloading");

        Product tapeMeasure = new Product("Tape Measure");
        Product plaster = new Product("Plaster", "");
        Product tyre = new Product("Tyre", 5);

        IO.println(tapeMeasure);
        IO.println(plaster);
        IO.println(tyre);
    }
}
