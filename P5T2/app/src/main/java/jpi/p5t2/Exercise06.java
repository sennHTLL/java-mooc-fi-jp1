package jpi.p5t2;

import jpi.constructor.Person;
import jpi.constructor.SimpleDate;

public class Exercise06 {
    public static void run() {
        IO.println("=== [xercise] · 6 ===");

        SimpleDate date1 = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person sen = new Person("Sen", date1, 62, 9);
        Person ann = new Person("Ann", date2, 65, 8);
        Person senDifferent = new Person("Sen", date1, 62, 10);
        
        // SEN || SEN
        if (sen.equals(sen)) {
            IO.println("1. Is this quite correct?");
        } else { IO.println("1. No"); }

        // SEN || ANN
        if (sen.equals(ann)) {
            IO.println("2. Is this quite correct?");
        } else { IO.println("2. No"); }

        // SEN || DIFF SEN
        if (sen.equals(senDifferent)) {
            IO.println("3. Is this quite correct?");
        } else { IO.println("3. No"); }
    }
}
