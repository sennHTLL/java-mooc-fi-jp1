package jpi.constructor;

import java.util.ArrayList;

public class Hold {

  private ArrayList<Suitcase> suitcases;
  private int maxWeight;

  public Hold(int max) {
    this.suitcases = new ArrayList<>();
    this.maxWeight = max;
  }

  public void addSuitcase(Suitcase suitcase) {
    this.suitcases.add(suitcase);
  }

  public void printItems() {
    for (Suitcase suitcase : this.suitcases) {
      suitcase.printItems();
    }
  }

  public String toString() {
    int countSuitcase = 0;
    int suitcaseWeight = 0;

    for (Suitcase suitcase : this.suitcases) {
      countSuitcase++;
      suitcaseWeight += suitcase.totalWeight();
    }

    return countSuitcase + " suitcases (" + suitcaseWeight + " kg)";
  }
}
