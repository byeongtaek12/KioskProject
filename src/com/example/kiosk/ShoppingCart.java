package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
     List<String> shoppingCart = new ArrayList<>();
     String name;
     int count;
     int price;

    public ShoppingCart() {
    }

     public void addShoppingCart(String menu) {
         this.shoppingCart.add(menu);
     }

     public List<String> getShoppingCart() {
         return this.shoppingCart;
     }

    public void removeShoppingCart() {
        this.shoppingCart.clear();
    }

}
