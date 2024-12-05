package com.growthhungry.week9.practical;

import java.util.Random;

class Customer implements Runnable {
    private BankAccount account;
    private Random random = new Random();

    public Customer (BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int choice = random.nextInt(2);
            int amount = random.nextInt(1, 100);

            if (choice == 0) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }
        }
    }
}
