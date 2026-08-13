package jpi.constructor;

import java.util.ArrayList;

public class Room {

  private ArrayList<Person> persons;

  public Room() {
    this.persons = new ArrayList<>();
  }

  public void addPerson(Person person) {
    this.persons.add(person);
  }

  public boolean isEmpty() {
    return this.persons.isEmpty();
  }

  public Person tallest() {
    if (this.persons.isEmpty()) {
      return null;
    }

    Person tallest = this.persons.get(0);

    for (Person person : this.persons) {
      if (person.getHeight() > tallest.getHeight()) {
        tallest = person;
      }
    }

    return tallest;
  }

  public Person take() {
    if (this.persons.isEmpty()) {
      return null;
    }

    Person tallest = this.persons.get(0);

    for (Person person : this.persons) {
      if (person.getHeight() > tallest.getHeight()) {
        tallest = person;
      }
    }

    int index = this.persons.indexOf(tallest);
    this.persons.remove(index);

    return tallest;
  }

  public ArrayList<Person> getPersons() {
    return this.persons;
  }
}
