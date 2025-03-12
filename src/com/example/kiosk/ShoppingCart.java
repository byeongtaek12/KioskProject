package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     private final List<String> shoppingCartlist = new ArrayList<>();
     private final String name;
     private int count;
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

    public void setCount() {
        this.count++;
    }

    public double getPrice() {
        return this.price;
    }

     public void addShoppingCart() {
        this.shoppingCartlist.add(toString());
     }

     public List<String> getShoppingCart() {
         return this.shoppingCartlist;
     }

    public void clearShoppingCart() {
        this.shoppingCartlist.clear();
    }

    public void removeShoppingCart(int j) {
        this.shoppingCartlist.remove(j);
    }

    @Override
    public String toString(){
        return String.format("%s | W %.1f | count : %d", this.name, this.price,this.count);
    }
}
