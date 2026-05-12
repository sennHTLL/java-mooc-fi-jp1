package jpi.constructors;

public class Book{

    private String name;
    private int numOfPages;
    private int publicationYear;

    public Book(String name, int pages, int pubYear) {
        this.name = name;
        this.numOfPages = pages;
        this.publicationYear = pubYear;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return numOfPages;
    }

    public int getPublicYear() {
        return publicationYear;
    }

    public String toString() {
        return name + ", " + numOfPages + " pages, published at " + publicationYear + " year";
    }
}
