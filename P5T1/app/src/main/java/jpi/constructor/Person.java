package jpi.constructor;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age, int w, int h) {
        this.name = name;
        this.age = age;
        this.weight = w;
        this.height = h;
    }

    public Person(String name) {
        this(name, 0, 0, 0);
    }

    // getters
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public int getHeight() { return this.height; }
    public int getWeight() { return this.weight; }

    // setters
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    // other constructors and methods
    public void growOlder() {
        this.age += 1;
    }

    public void growWeight() {
        this.weight += 1;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    @Override
    public String toString() {
        return this.name + " age " + this.age + " years";
    }
}
