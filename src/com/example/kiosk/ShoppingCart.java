package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<ShoppingCart> shoppingCartlist = new ArrayList<>();
    private  String name;
    private  int count;
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

     public void addShoppingCart(ShoppingCart menu) {
        this.shoppingCartlist.add(menu);
     }

     public List<ShoppingCart> getShoppingCart() {
         return this.shoppingCartlist;
     }

    public void clearShoppingCart() {
        this.shoppingCartlist.clear();
    }

    @Override
    public String toString(){
        return String.format("%s| W %.1f | %d", this.name, this.price, this.count);
    }
}
