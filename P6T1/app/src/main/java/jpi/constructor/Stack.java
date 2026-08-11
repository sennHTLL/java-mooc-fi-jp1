package jpi.constructor;

import java.util.ArrayList;

public class Stack {

  ArrayList<String> list;

  public Stack() {
    this.list = new ArrayList<>();
  }

  public boolean isEmpty() {
    boolean bool = this.list.isEmpty();
    return bool;
  }

  public void add(String value) {
    this.list.add(value);
  }

  public String take() {
    return this.list.removeLast();
  }

  public ArrayList<String> values() {
    return this.list;
  }
}
