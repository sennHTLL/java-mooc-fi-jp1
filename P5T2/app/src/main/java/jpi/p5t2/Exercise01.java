package jpi.p5t2;

import jpi.constructor.PaymentCard;

public class Exercise01 {
    public static void run() {
        IO.println("=== [xercise] · 1 ===");

        PaymentCard sensCard = new PaymentCard(10);
        IO.println(sensCard);

        boolean wasSuccessful = sensCard.takeMoney(8);
        IO.println("successfully withdrew: " + wasSuccessful);
        IO.println(sensCard);
        
        wasSuccessful = sensCard.takeMoney(4);
        IO.println("successfully withdrew: " + wasSuccessful);
        IO.println(sensCard);
    }
}
