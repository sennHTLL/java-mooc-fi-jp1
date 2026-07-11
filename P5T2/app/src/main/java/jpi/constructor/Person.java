package jpi.constructor;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate date, int w, int h) {
        this.name = name;
        this.birthday = date;
        this.weight = w;
        this.height = h;
    }

    public Person(String name, SimpleDate date) {
        this(name, date, 0, 0);
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    // getters
    public String getName() { return this.name; }
    public SimpleDate getBirthday() { return birthday; }
    public int getHeight() { return this.height; }
    public int getWeight() { return this.weight; }

    // setters
    public void setHeight(int newHeight) { this.height = newHeight; }

    public void setWeight(int newWeight) { this.weight = newWeight; }

    // other constructors and methods
    public void growWeight(int add) { this.weight += add; }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) return true;
        return false;
    }

    public boolean equals(Object compared) {
        if (this == compared) { return true; }
        if (!(compared instanceof Person)) { return false; }

        Person comparingPerson = (Person) compared;
        
        if (this.name.equals(comparingPerson.name) &&
            this.birthday.equals(comparingPerson.birthday) &&
            this.height == comparingPerson.height &&
            this.weight == comparingPerson.weight) { 
            return true; 
        }

        return false;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
