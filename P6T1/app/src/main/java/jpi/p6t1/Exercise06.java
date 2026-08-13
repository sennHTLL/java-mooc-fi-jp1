package jpi.p6t1;

import jpi.constructor.Gift;
import jpi.constructor.Package;

public class Exercise06 {
  public static void run() {
    IO.println("[ho ho ho]\n");
    Package pack = new Package();

    Gift bookHarryPotterPS = new Gift("Harry Poter and Philosopher's stone", 2);
    Gift book = new Gift("some book", 1);

    pack.addGift(bookHarryPotterPS);
    pack.addGift(book);

    pack.totalWeight();
  }
}
