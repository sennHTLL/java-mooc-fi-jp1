package jpi.p6t1;

import jpi.constructor.Hold;
import jpi.constructor.Item;
import jpi.constructor.Suitcase;

public class Exercise08 {
  public static void run() {
    Item book = new Item("World of Warcraft: Rise of the Horde", 2);
    Item phone = new Item("Xiaomi Redmi Note 12", 1);
    Item brick = new Item("brick", 4);

    Suitcase adasCase = new Suitcase(10);
    adasCase.addItem(book);
    adasCase.addItem(phone);

    Suitcase hannahsCase = new Suitcase(10);
    hannahsCase.addItem(brick);

    Hold hold = new Hold(1000);
    hold.addSuitcase(adasCase);
    hold.addSuitcase(hannahsCase);

    IO.println(hold);
    IO.println("suitcases items: ");
    hold.printItems();
  }
}
