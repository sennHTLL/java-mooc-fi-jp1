package jpi.p7t1;

import java.util.Arrays;

import jpi.algorithms.SelectionSort;

public class Exercise01 {
    public static void run() {
        int[] numbers1 = { 6, 5, 8, 7, 11 };
        int[] numbers2 = { -1, 6, 9, 8, 12, 7 };
        int[] numbers3 = { 3, 2, 5, 4, 8 };
        int[] numbers4 = { 8, 3, 7, 9, 1, 2, 4 };

        IO.println("[smallest] · " + SelectionSort.smallest(numbers1));
        IO.println("[index of smallest] · " + SelectionSort.indexOfSmallest(numbers1));
        IO.println();

        IO.println("[index of smallest from] · " + SelectionSort.indexOfSmallestFrom(numbers2, 0));
        IO.println("[index of smallest from] · " + SelectionSort.indexOfSmallestFrom(numbers2, 1));
        IO.println("[index of smallest from] · " + SelectionSort.indexOfSmallestFrom(numbers2, 2));
        IO.println();

        IO.println(Arrays.toString(numbers3));
        SelectionSort.swap(numbers3, 1, 0);
        IO.println(Arrays.toString(numbers3));
        SelectionSort.swap(numbers3, 0, 3);
        IO.println(Arrays.toString(numbers3));
        IO.println();

        SelectionSort.sort(numbers4);
    }
}
