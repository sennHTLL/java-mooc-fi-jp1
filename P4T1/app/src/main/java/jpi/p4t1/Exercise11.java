package jpi.p4t1;

import jpi.constructors.Statistics;

public class Exercise11 {
    public static void run() {
        IO.println("=== EXERCISE 11 ===");
        IO.println("[oop] · counts");

        Statistics statistics = new Statistics();

        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);

        IO.println("Count: " + statistics.getCount());
        IO.println("Sum: " + statistics.sum());
        IO.println("Average: " + statistics.average());

    }
}
