package jpi.constructor;

public class Bird {

    private String name;
    private String nihon;
    private int count;

    public Bird(String name, String nihon) {
        this.name = name;
        this.nihon = nihon;
        this.count = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNihon() {
        return this.nihon;
    }

    public int getCount() {
        return this.count;
    }

    public void updCount() {
        this.count++;
    }

    public String toString() {
        return this.name + " (" + this.nihon + "): " + this.count + " observations";
    }
}
