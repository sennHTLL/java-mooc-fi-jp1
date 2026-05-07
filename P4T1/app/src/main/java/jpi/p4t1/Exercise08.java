package jpi.p4t1;

import jpi.constructors.Gauge;

public class Exercise08 {
    public static void run() {
        IO.println("=== EXERCISE 08 ===");
        IO.println("[oop] · gauge");

        Gauge g = new Gauge();

        while(!g.full()) {
            IO.println("Not full! Value: " + g.getValue());
            g.increase();
        }

        IO.println("Full! Value: " + g.getValue());
        g.decrease();
        IO.println("Not full! Value: " + g.getValue());
    }
}
