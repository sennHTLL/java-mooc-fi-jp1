package jpi.constructors;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age += 1;
        }
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }
}
