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
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    // other constructors and methods
    public void growWeight() {
        this.weight += 1;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
