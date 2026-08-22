package jpi.constructor;

public class Counter {
    
    private int number;

    public Counter (int startValue) {
        this.number = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.number;
    }
    
    public void increase() {
        this.number++;
    }
    public void decrease() {
        this.number--;
    }

    public void increase(int increaseBy) {
        this.number += increaseBy;
    }
    
    public void decrease(int decreaseBy) {
        this.number -= decreaseBy;
    }
}
