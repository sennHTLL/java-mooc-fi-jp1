package jpi.constructor;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {

        int small = smallest(array);
        int indexOfSmall = indexOfSmallest(array);
        int smallest = array[indexOfSmall];

        int biggest = array[0];

        int biggestIndex = 0;
        int smallestIndex = 0;

        int startIndex = 0;

        // for (int i = 0; i < array.length; i++) {
        // if (array[i] < smallest) {
        // smallest = array[i];
        // }
        // if (array[i] > smallest) {
        // biggest = array[i];
        // biggestIndex = i;
        // IO.println("[biggest] · " + biggest + " [biggest index] · " + biggestIndex);
        // }
        // if (array[i] < smallest) {
        // smallest = array[i];
        // smallestIndex = i;
        // IO.println("[smallest] · " + smallest + " [smallest index] · " +
        // smallestIndex);
        // }
        // IO.println("I will swap · " + smallestIndex + " && " + biggestIndex);
        // swap(array, smallestIndex, biggestIndex);
        // IO.println();
        // }

        IO.println(small + " · index " + indexOfSmall + " · " + smallest);
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int smallest(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int indexOfSmallest(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int min = array[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                index = i;
            }
        }

        return index;
    }
}
