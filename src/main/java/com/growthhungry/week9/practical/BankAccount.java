package com.growthhungry.week9.practical;

public class BankAccount {
    private int balance = 100000;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + ". Current balance: $" + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}
