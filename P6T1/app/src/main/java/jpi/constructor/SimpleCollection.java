package jpi.constructor;

import java.util.ArrayList;

public class SimpleCollection {

  private String list;
  private ArrayList<String> words;

  public SimpleCollection(String list) {
    this.list = list;
    this.words = new ArrayList<>();
  }

  public void add(String w) {
    this.words.add(w);
  }

  public String toString() {
    String outputBase = "The collection " + this.list;

    if (this.words.isEmpty()) {
      return outputBase + " is empty";
    }

    String elementsInList = outputBase + " has " + this.words.size() + " element:";
    String wordsInList = "";

    for (String word : words) {
      wordsInList = wordsInList + word + "\n";
    }

    return elementsInList + "\n" + wordsInList;
  }
}
