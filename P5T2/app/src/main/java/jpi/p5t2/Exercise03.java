package jpi.p5t2;

import jpi.constructor.Person;

public class Exercise03 {
    public static void run() {
        IO.println("=== [xercise] · 3 ===");

        Person sen   = new Person("Sen",    30, 5, 2006);
        Person aibek = new Person("Aibek",  19, 6, 2007);
        Person rose  = new Person("Rose",   8,  8, 2005);
        Person lana  = new Person("Lana",   26, 4, 2006);
        Person aru   = new Person("Aru",    31, 5, 2006);

        IO.println(sen.getName() + " is older than " + aibek.getName() + ": " + sen.olderThan(aibek));
        IO.println(sen.getName() + " is older than " + rose.getName() + ": " + sen.olderThan(rose));
        IO.println(sen.getName() + " is older than " + lana.getName() + ": " + sen.olderThan(lana));
        IO.println(sen.getName() + " is older than " + aru.getName() + ": " + sen.olderThan(aru));
    }
}
