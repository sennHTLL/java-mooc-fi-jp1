package jpi.p6t1;

import jpi.constructor.Person;
import jpi.constructor.Room;

public class Exercise07 {
  public static void run() {
    Room room = new Room();
    IO.println("Empty? " + room.isEmpty());

    room.addPerson(new Person("Lea", 183));
    room.addPerson(new Person("Kenya", 182));
    room.addPerson(new Person("Juli", 186));
    room.addPerson(new Person("Nina", 172));
    room.addPerson(new Person("Terhi", 185));
    IO.println("Empty? " + room.isEmpty());

    IO.println("");
    printPersons(room);

    IO.println("");
    while (!room.isEmpty()) {
      IO.println(room.take());
    }
  }

  public static void printPersons(Room room) {
    for (Person person : room.getPersons()) {
      IO.println(person);
    }
  }
}
