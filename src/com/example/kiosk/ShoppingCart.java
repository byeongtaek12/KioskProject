package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<ShoppingCartItem> shoppingCartItemlist;

    public ShoppingCart() {
        shoppingCartItemlist = new ArrayList<>();
    }

    // TODO 카트 안에 있는 아이템의 가격 합산
    public double sumPriceShowShoppingCart() {
        double sum = 0;
        for (ShoppingCartItem shoppingCartItem : shoppingCartItemlist) {
            System.out.println(shoppingCartItem.toString());
            sum += shoppingCartItem.getPrice();
        }
        return sum;
    }

    // TODO 카트에 담겨있는 아이템 출력
    public List<ShoppingCartItem> getShoppingCartList() {
        return this.shoppingCartItemlist;
    }

    // TODO 카트 비우기
    public void clearShoppingCartList() {
        this.shoppingCartItemlist.clear();
    }

    // TODO 카트에 아이템 추가하기
    public void addShoppingCartList(ShoppingCartItem menu) {
        this.shoppingCartItemlist.add(menu);
    }

}
