package jpi.constructors;

public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " tenge";
    }

    public void addMoney(double amount) {
        if (amount <= 0) return;

        int max = 81200;
        if (this.balance + amount >= max) {
            this.balance = max;
        } else {
            this.balance += amount;
        }
    }

    public void eatAffordably() {
        int affordably = 1500;
        if (this.balance >= affordably) this.balance -= affordably;
    }
    
    public void eatHeartily() {
        int heartily = 2500;
        if (this.balance >= heartily) this.balance -= heartily;
    }
}
