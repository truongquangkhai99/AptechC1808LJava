package com.company.main;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Product> products = new ArrayList<Product>();
    private int currentIndex = -1;
    public void push(Product newProduct) {
        products.add(newProduct);
        currentIndex++;
    }
    public void pop() {
        if(currentIndex >= 0) {
            products.remove(currentIndex);
            currentIndex--;
        }
    }
    public Product getCurrentProduct() {
        return currentIndex < 0 ? null: products.get(currentIndex);
    }
}
