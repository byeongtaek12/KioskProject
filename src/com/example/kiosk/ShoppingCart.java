package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     private final List<String> shoppingCart = new ArrayList<>();
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

     public void addShoppingCart() {
        this.shoppingCart.add(toString());
     }

     public List<String> getShoppingCart() {
         return this.shoppingCart;
     }

    public void removeShoppingCart() {
        this.shoppingCart.clear();
    }

    @Override
    public String toString(){
        return String.format("%s | W %.1f | count : %d", this.name, this.price,this.count);
    }
}
