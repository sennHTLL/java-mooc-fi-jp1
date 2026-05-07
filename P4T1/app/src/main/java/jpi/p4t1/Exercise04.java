package jpi.p4t1;

import jpi.constructors.DecreasingCounter;

public class Exercise04 {
    public static void run() {
        IO.println("=== EXERCISE 04 ===");
        IO.println("[oop] · decreasing");

        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();
        counter.decrement();
        counter.printValue();
        
        counter.reset();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();
    }
}
