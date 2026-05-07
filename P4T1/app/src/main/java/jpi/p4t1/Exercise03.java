package jpi.p4t1;

import jpi.constructors.Person;

public class Exercise03 {
    public static void run() {
        IO.println("=== EXERCISE 03 ===");
        IO.println("[oop] · persons");

        Person sen = new Person("Sen");
        Person aibek = new Person("Aibek");
        Person assan = new Person("Assan");

        IO.println(sen);
        IO.println(aibek);
        IO.println(assan);
        
        for (int i = 0; i < 30; i++) {
            sen.growOlder();
        }

        aibek.growOlder();
        assan.growOlder();

        IO.println();

        printPerson(sen);
        printPerson(aibek);
        printPerson(assan);
    }

    public static void printPerson(Person person) {
        if (person.isOfLegalAge()) {
            IO.println(person.getName() + " is of legal age");
        } else {
            IO.println(person.getName() + " is underage");
        }
    }
}
