package jpi.p4t2;

import java.util.ArrayList;

import jpi.constructors.Person;

public class Exercise01 {

    public static void run() {
        IO.println("=== EXERCISE 1 ===");
        IO.println("[oop] · objects in list");

        ArrayList<Person> persons = new ArrayList<>();

        Person sen =  new Person("Sen", 57, 167);
        for (int i = 1; i <= 20; i++) {
            sen.growOlder();
        }
        IO.println("Classic creation: " + sen);

        persons.add(sen);
        persons.add(new Person("Aibek", 76, 170));
        persons.add(new Person("Assan", 67, 179));

        for (Person person : persons) {
            IO.println(person);
        }
    }
}
