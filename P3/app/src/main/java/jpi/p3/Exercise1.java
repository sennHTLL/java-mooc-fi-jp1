package jpi.p3;

import java.util.ArrayList;

public class Exercise1 {
    public static void run() {
        System.out.println(" === EXERCISE 1 === ");
        System.out.println(" == ArrayList Types == ");

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("hello");
        System.out.println("String list: " + stringList.get(0));

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        System.out.println("Integer list: " + integerList.get(0));

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(4.5);
        System.out.println("Double list: " + doubleList.get(0));

        ArrayList<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        System.out.println("Boolean list: " + booleanList.get(0));
    }
}
