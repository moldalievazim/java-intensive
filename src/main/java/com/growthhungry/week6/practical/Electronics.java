package com.growthhungry.week6.practical;

class Electronics {
    private String brand;
    private int warranty; //in months

    public Electronics(String brand, int warranty) {
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Warranty: " + warranty;
    }
}
