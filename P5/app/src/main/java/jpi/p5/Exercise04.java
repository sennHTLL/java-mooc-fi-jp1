package jpi.p5;

import jpi.constructor.Counter;

public class Exercise04 {

    public static void run() {
        IO.println("=== Exercise 04 ===");
        
        Counter value = new Counter(4);
        IO.println(value.value());
        value.increase();
        IO.println(value.value());

        value.increase(5);
        IO.println(value.value());
        value.decrease(6);
        IO.println(value.value());
    }
}
