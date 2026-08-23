package jpi.constructor;

public class GradePoint {

    private int sum;
    private int count;
    private double avg;
    private double percentage;

    public GradePoint() {
        this.sum = 0;
        this.count = 0;
        this.avg = 0;
        this.percentage = 0;
    }

    public int getSum() {
        return this.sum;
    }

    public int getCount() {
        return this.count;
    }

    public double getAvg() {
        return this.avg;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public void updSum(int num) {
        this.sum += num;
    }

    public void updCount() {
        this.count++;
    }

    public void updAvg() {
        this.avg = this.sum / this.count;
    }

    public void updPercentage(int pass, int all) {
        this.percentage = 100 * pass / all;
    }

    public String toString() {
        return "sum · " + this.sum + "\ncount · " + this.count;
    }
}
