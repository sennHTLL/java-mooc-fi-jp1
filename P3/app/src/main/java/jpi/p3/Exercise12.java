package jpi.p3;

import java.util.ArrayList;

public class Exercise12 {
    public static void run() {
        System.out.println(" === EXERCISE 12 === ");
        System.out.println(" == RF - RL == ");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        
        System.out.println(numbers);
        removeFirst(numbers);
        System.out.println(numbers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);
    }

    public static void removeFirst(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) return;
        numbers.remove(0);
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) return;
        strings.remove(strings.size() - 1);
    }
}
