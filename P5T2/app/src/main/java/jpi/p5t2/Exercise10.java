package jpi.p5t2;

import jpi.constructor.Money;

public class Exercise10 {
    public static void run() {
        IO.println("=== [xercise] · 10 ===");

        Money a = new Money(10, 20);
        Money b = new Money(5, 50);
        Money c = new Money(5, 0);
        
        //testPlus(a, b);
        // testLess(a, b, c);
        testMinus(a, b);
    }

    public static void testMinus(Money a, Money b) {
        Money c = a.minus(b);

        IO.println(a);
        IO.println(b);
        IO.println(c);

        c = c.minus(a);
        
        IO.println(a);
        IO.println(b);
        IO.println(c);
    }

    public static void testLess(Money a, Money b, Money c) {
        IO.println(a.lessThan(b));
        IO.println(b.lessThan(c));
    }

    public static void testPlus(Money a, Money b) {
        Money c = a.plus(b);

        IO.println(a);
        IO.println(b);
        IO.println(c);

        a = a.plus(c);

        IO.println(a);
        IO.println(b);
        IO.println(c);
    }
}
