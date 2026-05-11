package jpi.p4t1;

import jpi.constructors.PaymentCard;

public class Exercise12 {
    public static void run() {
        IO.println("=== EXERCISE 12 ===");
        IO.println("[oop] · payment card");

        PaymentCard sensCard = new PaymentCard(11000);
        PaymentCard aibeksCard = new PaymentCard(16000);
        IO.println("Sen: " + sensCard);
        IO.println("Aibek: " + aibeksCard);

        sensCard.eatHeartily();
        aibeksCard.eatAffordably();
        IO.println("Sen: " + sensCard);
        IO.println("Aibek: " + aibeksCard);

        sensCard.addMoney(10500);
        aibeksCard.eatHeartily();
        IO.println("Sen: " + sensCard);
        IO.println("Aibek: " + aibeksCard);

        sensCard.eatAffordably();
        sensCard.eatAffordably();

        IO.println("Sen: " + sensCard);
        IO.println("Aibek: " + aibeksCard);

        aibeksCard.addMoney(27500);
        IO.println("Sen: " + sensCard);
        IO.println("Aibek: " + aibeksCard);
    }
}
