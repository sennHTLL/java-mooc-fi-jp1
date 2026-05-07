package jpi.p4;

import jpi.constructors.Account; 

public class Exercise01 {
    public static void run() {
        IO.println("=== EXERCISE 1 ===");
        IO.println("[oop] · 1-2-3-4-5-6-7 M in my bank account");
        IO.println();
  
        Account sensKzAccount = new Account("Sen's account in Kazakhstan", 0);
        Account sensJpAccount = new Account("Sen's account in Japan", 1000.00);

        accountInitialState(sensKzAccount);
        accountInitialState(sensJpAccount);
        IO.println();

        bankTransfer(sensJpAccount, sensKzAccount);
        IO.println();

        accountEndState(sensKzAccount);
        accountEndState(sensJpAccount);
    }

    public static void bankTransfer(Account acc1, Account acc2) {
        double bridge = acc1.withdrawal(100);
        acc2.deposit(bridge);
        IO.println(bridge + " money was transfered from " + acc1.owner() + " to " + acc2.owner());
    }

    public static void accountEndState(Account account) {
        IO.println("== End state of " + account.owner());
        IO.println(account);
    }

    public static void accountInitialState(Account account) {
        IO.println("== Initial state of " + account.owner());
        IO.println(account);
    }
}
