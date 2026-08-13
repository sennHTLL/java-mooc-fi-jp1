package jpi.constructor;

import java.util.ArrayList;

public class Package {

  private ArrayList<Gift> gifts;

  public Package() {
    this.gifts = new ArrayList<>();
  }

  public void addGift(Gift gift) {
    this.gifts.add(gift);
  }

  public void totalWeight() {
    int totla = 0;
    // yes i did this on purpose, i wrote "totla" instead "total" and what?

    for (Gift gift : gifts) {
      totla += gift.getWeight();
    }

    IO.println("[totla w] · " + totla);
  }
}
