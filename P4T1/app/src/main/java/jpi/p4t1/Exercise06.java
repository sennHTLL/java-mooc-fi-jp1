package jpi.p4t1;

import jpi.constructors.Teacher;

public class Exercise06 {
    public static void run() {
        IO.println("=== EXERCISE 06 ===");
        IO.println("[oop] · ???");

        Teacher teacherOne = new Teacher(10);
        Teacher teacherTwo = new Teacher(5);
        Teacher teacherThree = new Teacher(8);

        double[] teachers = {
            teacherOne.grade(),
            teacherTwo.grade(),
            teacherThree.grade()
        };

        double sum = 0;
        
        for (int i = 0; i < teachers.length; i++) {
            sum += teachers[i];
        }

        double average = (sum / teachers.length);
        String formatted = String.format("%.2f", average);

        IO.println("Grading average: " + formatted);
    }
}
