package jpi.constructors;

public class TelevisionPrograms {

    private String name;
    private int duration;

    public TelevisionPrograms(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("Cowboy Bebop");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String toString() {
        return name + ", " + duration + " minutes";
    }
}
