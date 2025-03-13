package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<ShoppingCartItem> shoppingCartItems;

    public ShoppingCart() {
        shoppingCartItems = new ArrayList<>();
    }

    // 장바구니 내역 보여주고 합계 계산 메서드
    public double sumPriceShowShoppingCart() {
        double sum = 0;
        for (ShoppingCartItem shoppingCartItem : shoppingCartItems) {
            System.out.println(shoppingCartItem.toString());
            sum += shoppingCartItem.getPrice();
        }
        return sum;
    }

    public List<ShoppingCartItem> getShoppingCartItems() {
        return this.shoppingCartItems;
    }

    public void addShoppingCartItems(ShoppingCartItem menu) {
        this.shoppingCartItems.add(menu);
    }

    public void clearShoppingCartItems() {
        this.shoppingCartItems.clear();
    }
}
