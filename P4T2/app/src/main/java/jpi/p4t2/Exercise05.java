package jpi.p4t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructors.Book;

public class Exercise05 {

    public static void run() {
        IO.println("=== EXERCISE 5 ===");
        IO.println("[oop] · object in a list");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        IO.println("Enter book information (name, pages, publication year) divided by comma");
        IO.println("E.G. Book,100,2006");
        
        while (true) {
            IO.print("Enter: ");
            String bookInfo = scanner.nextLine();
            if (bookInfo.isEmpty()) break;

            String[] bookParts = bookInfo.split(",");

            String bookName = bookParts[0];
            int bookPages = Integer.valueOf(bookParts[1]);
            int bookPublicYear = Integer.valueOf(bookParts[2]);

            books.add(new Book(bookName, bookPages, bookPublicYear));
        }

        printBookInfo(books, scanner);
    }

    public static void printBookInfo(ArrayList<Book> list, Scanner scanner) {
        IO.print("What information will be printed? ");
        String info = scanner.nextLine();

        if (info.equals("everything")) {
            for (Book book : list) IO.println(book);
        } else if (info.equals("name")) {
            for (Book book : list) IO.println(book.getName());
        } else if (info.equals("page")) {
            for (Book book : list) IO.println(book.getPages());
        } else if (info.equals("year")) {
            for (Book book : list) IO.println(book.getPublicYear());
        }
    }
}
