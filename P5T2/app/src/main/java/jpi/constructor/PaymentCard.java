package jpi.constructor;

public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        if (this.balance >= amount) { 
            this.balance -= amount;
            return true; 
        } 
        else { return false; }
    } 

    public String toString() {
        return "The card has a balance of " + this.balance + " tenge";
    }
}
