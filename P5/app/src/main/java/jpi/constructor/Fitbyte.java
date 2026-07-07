package jpi.constructor;

public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int rHR) {
        this.age = age;
        this.restingHeartRate = rHR;
    }

    public double targetMaxHeartRate() {
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (targetMaxHeartRate() - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate; 
    }
}
