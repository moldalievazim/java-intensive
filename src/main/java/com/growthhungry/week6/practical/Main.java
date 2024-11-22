package com.growthhungry.week6.practical;

public class Main {
    public static void main(String[] args) {
        // Creating a book
        Book book1 = new Book("Artur", 300);
        Product<Book> product1 = new Product<>("Artur's life", 15.99, book1);

        Book book2 = new Book("David", 330);
        Product<Book> product4 = new Product<>("David's wife", 17.99, book2);

        // Creating an electronic item
        Electronics electronics1 = new Electronics("Apple", 12);
        Product<Electronics> product2 = new Product<>("iPhone 16", 999, electronics1);

        // Creating a clothing item
        Clothes clothes1 = new Clothes("M", "Cotton");
        Product<Clothes> product3 = new Product<>("T-Shirt", 15.99, clothes1);

        // Creating Inventory for each product type
        Inventory<Book> bookInventory = new Inventory<>();
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Clothes> clothesInventory = new Inventory<>();

        // adding created products to inventories
        bookInventory.addProduct(product1);
        electronicsInventory.addProduct(product2);
        clothesInventory.addProduct(product3);

        // displaying all inventories
        System.out.println("Book inventory:");
        bookInventory.displayInventory();

        System.out.println("\nElectronics inventory:");
        electronicsInventory.displayInventory();

        System.out.println("\nClothes inventory:");
        clothesInventory.displayInventory();

                    // displaying all inventories using the wildcard method
//        System.out.println("\nDisplaying All Products Using Wildcards:");
//        Inventory.displayAll(bookInventory);
//        Inventory.displayAll(electronicsInventory);
//        Inventory.displayAll(clothesInventory);
    }
}
