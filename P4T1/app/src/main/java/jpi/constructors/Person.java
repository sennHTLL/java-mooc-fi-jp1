package jpi.constructors;

public class Person {

    private String name;
    private int age;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
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
}
