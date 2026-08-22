package jpi.p5t1;

import jpi.constructor.Book;
import jpi.constructor.Cube;
import jpi.constructor.Fitbyte;

public class Exercise02 {

    public static void run() {
        IO.println("=== Exercise 02 ===");

        Book book = new Book("Antonina Crane", "Sholokh. Haunted Groves", 540);
        IO.println(book);

        Cube cube = new Cube(4);
        IO.println(cube.volume());
        IO.println(cube);

        Fitbyte assistant = new Fitbyte(9, 50);
        double percentage = 0.75;
        while (percentage < 1) {
            double target = assistant.targetHeartRate(percentage);
            String output = String.format("Target %.0f%% of maximum: %.1f", (percentage * 100), target);
            IO.println(output);
            percentage += 0.1;
        }
    }
}
