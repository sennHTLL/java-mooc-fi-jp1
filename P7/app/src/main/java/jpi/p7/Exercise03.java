package jpi.p7;

import java.util.ArrayList;

import jpi.algorithms.BinarySearch;
import jpi.algorithms.LinearSearch;
import jpi.constructor.Book;

public class Exercise03 {
    public static void run() {
        ArrayList<Book> books = new ArrayList<>();
        addBook(books);

        int linearSearchedId = LinearSearch.linearSearch(books, 4);
        IO.println("===== [linear search] =====");
        IO.println(linearSearchedId + ". " + books.get(linearSearchedId).getTitle());

        IO.println("===== [binary search] =====");
        int binarySearchedId = BinarySearch.binarySearch(books, 5);
        if (binarySearchedId == -1) {
            IO.println("NOTHING");
        } else {
            IO.println(binarySearchedId + ". " + books.get(binarySearchedId).getTitle());
        }
    }

    public static void addBook(ArrayList<Book> books) {
        Book book1 = new Book("BOOK 1", 0);
        Book book2 = new Book("BOOK 2", 1);
        Book book3 = new Book("BOOK 3", 2);
        Book book4 = new Book("BOOK 4", 3);
        Book book5 = new Book("BOOK 5", 4);
        Book book6 = new Book("BOOK 6", 7);
        Book book7 = new Book("BOOK 7", 8);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
    }
}
