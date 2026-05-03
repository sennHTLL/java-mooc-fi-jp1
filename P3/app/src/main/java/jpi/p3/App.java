package jpi.p3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
       // Exercise01.run();
       // Exercise02.run();
       // Exercise03.run();
       // Exercise04.run();
       // Exercise05.run();
       // Exercise06.run();
       // Exercise07.run();
       // Exercise08.run();
       // Exercise09.run();
       // Exercise10.run(); 
       // Exercise11.run();
       Exercise12.run();
    }

    public static void forEachLoop() {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Lisa");

        for (String teacher: teachers) {
            System.out.println(teacher);
        }

        /* same for this:
         * for (int i = 0; i < teachers.size(); i++) {
         *      String teacher = teachers.get(i);
         *      System.out.println(teacher);
         * }
        */
        
    }

    public static void removeMethod() {
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        stringList.add("Fourth");

        stringList.remove(1);           // remove by index
        stringList.remove("First");     // remove given value
        
        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.add(15);
        integerList.add(18);
        integerList.add(21);
        integerList.add(24);

        integerList.remove(2);                      // remove by index
        integerList.remove(Integer.valueOf(15));    // remove exact value
    }
}
