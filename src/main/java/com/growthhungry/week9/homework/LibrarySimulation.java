package com.growthhungry.week9.homework;

public class LibrarySimulation {
    public static void main(String[] args) {
        Library library = new Library();
        String[] bookTitles = {
                "Java Programming", "Data Structures", "Algorithms in Java",
                "Operating Systems", "Database Systems"
        };

        for (int i = 0; i < bookTitles.length; i++) {
            library.addBook(new Book(i + 1, bookTitles[i], "Author "
                    + (i + 1)));
        }

        Thread user1 = new Thread(new User(library, bookTitles), "User 1");
        Thread user2 = new Thread(new User(library, bookTitles), "User 2");
        Thread user3 = new Thread(new User(library, bookTitles), "User 3");

        user1.start();
        user2.start();
        user3.start();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        library.displayAvailableBooks();
    }
}
