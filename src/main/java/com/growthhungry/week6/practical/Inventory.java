package com.growthhungry.week6.practical;

import java.util.ArrayList;
import java.util.List;

class Inventory<T>{
    private List<Product<T>> productList = new ArrayList<>();

    public void addProduct(Product<T> product) {
        productList.add(product);
    }

    public void removeProduct(Product<T> product) {
        productList.remove(product);
    }

    public void displayInventory() {
        for (Product<T> product : productList) {
            product.display();
        }
    }

}
