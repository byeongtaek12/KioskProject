package com.example.kiosk;

public class ShoppingCart {
    private final String name;
    private final int count;
    private final double price;

    public ShoppingCart(String name, int count, double price) {
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

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return String.format("%s| W %.1f | %d", this.name, this.price, this.count);
    }
}
