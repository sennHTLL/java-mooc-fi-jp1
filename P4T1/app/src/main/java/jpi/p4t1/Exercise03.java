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
        
        // == == AGE INFO == ==
        for (int i = 0; i < 30; i++) {
            sen.growOlder();
        }

        aibek.growOlder();
        assan.growOlder();

        IO.println();

        // == == BODzY MASS == ==
        sen.setWeight(56);
        sen.setHeight(167);

        // == == PRINTS == ==
        printAgeInfo(sen);
        printAgeInfo(aibek);
        printAgeInfo(assan);

        printBodyMassIndex(sen);
    }

    public static void printBodyMassIndex(Person person) {
        IO.println(person.getName() + ", body mass index is " + person.bodyMassIndex());
    }

    public static void printAgeInfo(Person person) {
        if (person.isOfLegalAge()) {
            IO.println(person.getName() + " is of legal age");
        } else {
            IO.println(person.getName() + " is underage");
        }
    }
}
