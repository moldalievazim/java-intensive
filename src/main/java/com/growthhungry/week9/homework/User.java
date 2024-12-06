package com.growthhungry.week9.homework;

import java.util.Random;

public class User implements Runnable {
    private Library library;
    private String[] bookTitles;
    private Random random = new Random();

    public User (Library library, String[] bookTitles) {
        this.library = library;
        this.bookTitles = bookTitles;
    }

    @Override
    public void run() {
//        int choice = random.nextInt(3);
        for (int i = 0; i < 5; i++) {
            String title = bookTitles[random.nextInt(bookTitles.length)];
            Book book = library.getBookByTitle(title);

            if (book != null) {
                int action = random.nextInt(2); // 0 for checkout, 1 for return
                if (action == 0) {
                    book.checkOut();
                } else {
                    book.returnBook();
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted.");
            }
        }

    }
}
