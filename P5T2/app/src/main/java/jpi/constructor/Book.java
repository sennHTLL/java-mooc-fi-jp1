package jpi.constructor;

public class Book {
    private String title;
    private int publishYear;

    public Book(String title, int publishYear) {
        this.title = title;
        this.publishYear = publishYear;
    }

    // getters
    public String getTitle() { return this.title; }
    public int getPublishYear() { return this.publishYear; }

    public boolean equals(Object compared) {
        if (this == compared) { return true; }
        if (!(compared instanceof Book)) { return false; }

        Book comparedBook = (Book) compared;

        if (this.title.equals(comparedBook.title) &&
            this.publishYear == comparedBook.publishYear) { 
            return true; 
        }

        return false;
    }

    @Override
    public String toString() {
        return this.title + ", publish year: " + this.publishYear;
    }
}
