package jpi.constructor;

public class HealthStation {

    private int counts;

    public HealthStation() {
        this.counts = 0;
    }

    public int weight(Person person) {
        return person.getWeight();
    }

    public void feed(Person person) {
        counts++;
        person.growWeight();
    }

    public int weighings() {
        return counts;
    }
}
