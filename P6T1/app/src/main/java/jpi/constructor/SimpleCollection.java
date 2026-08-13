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

  public String longest() {
    if (words.isEmpty()) {
      return null;
    }

    String word = words.get(0);
    String same = words.get(0);
    String printIfSame = "";

    for (String w : words) {
      if (w.length() > word.length()) {
        word = w;
      }

      if (w.length() == word.length()) {
        if (w.equals(word)) {
          printIfSame = "";
        } else {
          same = w;
          printIfSame = " and " + same;
        }
      }
    }

    return "longest " + word + printIfSame;
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
