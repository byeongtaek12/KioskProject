package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     private final List<String> shoppingCartlist = new ArrayList<>();
     private  String name;
     private int count;
     private  double price;

    public ShoppingCart() {

    }

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

     public void addShoppingCart(String menu) {
        this.shoppingCartlist.add(menu);
     }

     public List<String> getShoppingCart() {
         return this.shoppingCartlist;
     }

    public void clearShoppingCart() {
        this.shoppingCartlist.clear();
    }
}
