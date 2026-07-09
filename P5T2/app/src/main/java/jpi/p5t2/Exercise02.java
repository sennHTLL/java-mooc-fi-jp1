package jpi.p5t2;

import jpi.constructor.PaymentCard;
import jpi.constructor.PaymentTerminal;

public class Exercise02 {
    public static void run() {
        IO.println("=== [xercise] · 2 ===");

        PaymentTerminal unicafeZebra = new PaymentTerminal();
        IO.println(unicafeZebra);

        PaymentCard sensCard = new PaymentCard(2);
        IO.println(sensCard);

        boolean wasSuccessful = unicafeZebra.eatHeartily(sensCard);
        IO.println("there was enough money: " + wasSuccessful);

        unicafeZebra.addMoneyToCard(sensCard, 100);

        wasSuccessful = unicafeZebra.eatHeartily(sensCard);
        IO.println("there was enough money: " + wasSuccessful);
        
        IO.println(sensCard);

        IO.println(unicafeZebra);
    }
}
