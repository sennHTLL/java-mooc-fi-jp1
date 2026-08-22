package jpi.constructor;

public class Book {

    private String title;
    private int id;

    public Book(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return this.id + ". " + this.title;
    }
}
