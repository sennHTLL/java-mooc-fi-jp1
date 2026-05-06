package jpi.constructors;

public class Account {

    private String owner;
    private double balance;

    // this is Constructor
    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public double withdrawal(double amount) {
        this.balance = this.balance - amount;
        return amount;
    }

    public double balance() {
        return this.balance;
    }

    public String owner() {
        return this.owner;
    }

    @Override
    public String toString() {
        return this.owner + " balance: " + this.balance;
    }
}
