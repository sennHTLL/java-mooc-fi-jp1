package jpi.p4t1;

import jpi.constructors.Multiplier;

public class Exercise10 {

    public static void run() {
        IO.println(" === EXERCISE 10 === ");
        IO.println(" [oop] · multiplier");

        Multiplier multiplyByThree = new Multiplier(3);
        Multiplier multiplyByFour = new Multiplier(4);

        IO.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));
        IO.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        IO.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        IO.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }
}
