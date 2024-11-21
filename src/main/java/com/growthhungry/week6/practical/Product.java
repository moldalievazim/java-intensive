package com.growthhungry.week6.practical;

class Product<T> {
    private String name;
    private double price;
    private T details;

    public Product(String name, double price, T details){
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public T getDetails(){
        return details;
    }

    public void display() {
        System.out.println("Name: " + name + ", Price: $" + price);
        System.out.println("Details: " + details.toString());
    }
}
