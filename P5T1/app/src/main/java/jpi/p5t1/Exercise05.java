package jpi.p5t1;

import jpi.constructor.AmusementParkRide;
import jpi.constructor.Person;

public class Exercise05 {

    public static void run() {
        IO.println("=== Exercise 05 ===");
        waterTrack();
    }

    public static void waterTrack() {
        Person sen = new Person("Sen J");
        sen.setWeight(85);
        sen.setHeight(180);

        Person bek = new Person("Bek N");
        bek.setWeight(40);
        bek.setHeight(140);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 145);

        if (waterTrack.allowToRide(sen)) {
            IO.println(sen.getName() + " may enter the ride");
        } else {
            IO.println(sen.getName() + " may not enter the ride");
        }

        if (waterTrack.allowToRide(bek)) {
            IO.println(bek.getName() + " may enter the ride");
        } else {
            IO.println(bek.getName() + " may not enter the ride");
        }

        IO.println(waterTrack);
    }

    public static void checkIn() {
        Person sen = new Person("Sen J");
        IO.println(sen);

        Person bek = sen;
        sen.growOlder();
        bek.growOlder();
        bek.growOlder();
        IO.println(sen);

        bek = new Person("Sen J");
        IO.println(bek);
        IO.println(sen);
    }
}
