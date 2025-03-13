package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<ShoppingCartItem> shoppingCartItemlist;

    public ShoppingCart() {
        shoppingCartItemlist = new ArrayList<>();
    }

    // 장바구니 내역 보여주고 합계 계산 메서드
    public double sumPriceShowShoppingCart() {
        double sum = 0;
        for (ShoppingCartItem shoppingCartItem : shoppingCartItemlist) {
            System.out.println(shoppingCartItem.toString());
            sum += shoppingCartItem.getPrice();
        }
        return sum;
    }

    public List<ShoppingCartItem> getShoppingCartList() {
        return this.shoppingCartItemlist;
    }

    public void addShoppingCartList(ShoppingCartItem menu) {
        this.shoppingCartItemlist.add(menu);
    }

    public void clearShoppingCartList() {
        this.shoppingCartItemlist.clear();
    }



}
