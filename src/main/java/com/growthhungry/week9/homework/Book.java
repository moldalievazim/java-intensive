package com.growthhungry.week9.homework;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book (int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public synchronized boolean checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book checked out: " + title);
            return true;
        }
        System.out.println();
        return false;
    };

    public synchronized void returnBook() {
        isAvailable = true;
        System.out.println("Book returned: " + title);
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
