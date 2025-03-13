package com.example.kiosk;

public class ShoppingCartItem {
    private final String name;
    private int count;
    private double price;

    public ShoppingCartItem(String name, int count, double price) {
        this.name=name;
        this.count=count;
        this.price=price;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount() {
        this.count++;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice() {
        this.price+=this.price;
    }

    @Override
    public String toString(){
        return String.format("%s| W %.1f | + %d", this.name, this.price, this.count);
    }
}