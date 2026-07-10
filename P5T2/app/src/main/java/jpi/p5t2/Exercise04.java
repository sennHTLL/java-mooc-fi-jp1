package jpi.p5t2;

import jpi.constructor.Apartment;

public class Exercise04 {
    public static void run() {
        IO.println("=== [xercise] · 4 ===");

        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        IO.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        IO.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        IO.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        IO.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        IO.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        IO.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
