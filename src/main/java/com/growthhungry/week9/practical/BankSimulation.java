package com.growthhungry.week9.practical;

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread customer1 = new Thread(new Customer(account), "Customer 1");
        Thread customer2 = new Thread(new Customer(account), "Customer 2");
        Thread customer3 = new Thread(new Customer(account), "Customer 3");

        customer1.start();
        customer2.start();
        customer3.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Final balance: $" + account.getBalance());
    }
}
