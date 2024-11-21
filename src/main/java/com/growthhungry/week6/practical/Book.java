package com.growthhungry.week6.practical;

class Book {
    private String author;
    private int pages;

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Author: " + author + ", Pages: " + pages;
    }

}
