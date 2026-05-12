package jpi.constructors;

public class Person{

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String outName, int outWeight, int outHeight) {
        this.name = outName;
        this.age = 0;
        this.weight = outWeight;
        this.height = outHeight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age += 1;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }
}
