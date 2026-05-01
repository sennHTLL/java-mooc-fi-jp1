package jpi.p3;

import java.util.ArrayList;

public class Exercise11 {
    public static void run() {
        System.out.println(" === EXERCISE 11 === ");
        System.out.println(" == Print in range == ");

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(3);
        numberList.add(2);
        numberList.add(6);
        numberList.add(-1);
        numberList.add(5);
        numberList.add(1);

        System.out.println("Numbers in range [0, 5]");
        printNumInRange(numberList, 0, 5);

        System.out.println("Numbers in range [-5, 2]");
        printNumInRange(numberList, -5, 2);
    }

    public static void printNumInRange(ArrayList<Integer> list, int start, int end) {
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) >= start && list.get(i) <= end) {
                System.out.println(list.get(i));
            }
        }
    }
}
