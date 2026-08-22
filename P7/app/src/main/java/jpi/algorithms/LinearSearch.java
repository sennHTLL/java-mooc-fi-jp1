package jpi.algorithms;

import java.util.ArrayList;

import jpi.constructor.Book;

public class LinearSearch {

    public static int linearSearch(int[] array, int searched) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searched) {
                return i;
            }
        }

        return -1;
    }

    public static int linearSearch(ArrayList<Book> array, int searched) {
        for (Book book : array) {
            if (book.getId() == searched) {
                return book.getId();
            }
        }

        return -1;
    }
}
