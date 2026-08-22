package jpi.p5t1;

import jpi.constructor.HealthStation;
import jpi.constructor.Person;

public class Exercise06 {
    public static void run() {
        IO.println("=== Exercise 06 ===");

        HealthStation childrenHospital = new HealthStation();

        Person zhan = new Person("Zhan", 12, 30, 140);
        Person artem = new Person("Artem", 15, 45, 165);

        IO.println(zhan.getName() + " weight: " + childrenHospital.weight(zhan) + " kilos");
        IO.println(artem.getName() + " weight: " + childrenHospital.weight(artem) + " kilos");
        IO.println("weighings performed: " + childrenHospital.weighings());
        IO.println();

        int limit = 0;
        while (limit < 5) {
            childrenHospital.feed(zhan);
            limit++;
        }

        IO.println(zhan.getName() + " weight: " + childrenHospital.weight(zhan) + " kilos");
        IO.println("weighings performed: " + childrenHospital.weighings());
    }
}
