package jpi.constructor;

import java.util.ArrayList;

public class Suitcase {

  private ArrayList<Item> items;
  private int maxWeight;
  private int totalWeight;

  public Suitcase(int max) {
    this.items = new ArrayList<>();
    this.maxWeight = max;
  }

  public void printItems() {
    for (Item item : this.items) {
      IO.println(item);
    }
  }

  public int totalWeight() {
    return totalWeight;
  }

  public Item heaviestItem() {
    Item heavy = this.items.get(0);

    for (Item item : this.items) {
      if (item.getWeight() > heavy.getWeight()) {
        heavy = item;
      }
    }

    return heavy;
  }

  public void addItem(Item item) {
    this.totalWeight += item.getWeight();
    // IO.println("tracking " + this.trackingWeight);

    if (this.totalWeight > this.maxWeight) {
      // IO.println("STOP");
    } else {
      this.items.add(item);
    }
  }

  public String toString() {
    int countItem = 0;
    int countWeight = 0;

    for (Item item : items) {
      countItem++;
      countWeight += item.getWeight();
    }

    String printWeightTotal = " (" + countWeight + " kg)";

    if (countItem == 0) {
      return "no items" + printWeightTotal;
    }

    if (countItem == 1) {
      return "1 item" + printWeightTotal;
    }

    return countItem + " items (" + countWeight + " kg)";
  }
}
