package jpi.p4t1;

import jpi.constructors.Debt;

public class Exercise05 {
    public static void run() {
        IO.println("=== EXERCISE 05 ===");
        IO.println("[oop] · debt");

        Debt mortgage = new Debt(120000.0, 1.20);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        for (int years = 0; years < 20; years++) {
            mortgage.waitOneYear();
        }

        mortgage.printBalance();
    }
}
