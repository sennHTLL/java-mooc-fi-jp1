package jpi.algorithms;

import java.util.ArrayList;

import jpi.constructor.Book;

public class BinarySearch {

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int middle = (end + start) / 2;

            if (books.get(middle).getId() == searchedId) {
                return middle;
            }

            if (books.get(middle).getId() < searchedId) {
                start = middle + 1;
            }

            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }

        return -1;
    }
}
