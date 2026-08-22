package jpi.constructor;

public class Timer {
    private ClockHand seconds;
    private ClockHand mSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.mSeconds = new ClockHand(100);
    }

    public void advance() {
        this.mSeconds.advance();
        
        if (this.mSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.mSeconds;
    }
}
