package jpi.p5t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructor.Book;

public class Exercise07 {
    public static void run() {
        IO.println("=== [xercise] · 7 ===");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            IO.println("Book title: ");
            String usTitle = scanner.nextLine();
            if (usTitle.equals("")) { break; }

            IO.println("Book publication year: ");
            int usPublicationYear = Integer.valueOf(scanner.nextLine());

            Book usBook = new Book(usTitle, usPublicationYear);

            if (books.contains(usBook)) { 
                IO.println("The book is already in list");
            } else {
                books.add(usBook);
            }
        }

        IO.println("Books added: " + books.size());
        for (Book book : books) {
            IO.println(book);
        }
    }
}
