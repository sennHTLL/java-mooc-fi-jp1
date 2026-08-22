package jpi.p7;

import jpi.algorithms.LinearSearch;

public class Exercise02 {
    public static void run() {
        int[] array = { 5, 3, 9, 4, 6, 5, 8, 9, 2 };
        int searched = 4;

        IO.println(LinearSearch.linearSearch(array, searched));
    }
}
