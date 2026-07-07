package jpi.constructor;

public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String loc, int w) {
        this.name = name;
        this.location = loc;
        this.weight = w;
    }

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String loc) {
        this(name, loc, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
