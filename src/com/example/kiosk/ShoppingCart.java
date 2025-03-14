package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<MenuItem> shoppingCartItems;

    public ShoppingCart() {
        shoppingCartItems = new ArrayList<>();
    }

    // 장바구니 내역 보여주고 합계 계산 메서드
    public double sumPriceShowShoppingCart() {
        double sum = 0;
//        for (MenuItem shoppingCartItem : shoppingCartItems) {
//            System.out.println(shoppingCartItem.toString());
//            sum += shoppingCartItem.getPrice();
//        }
        shoppingCartItems.forEach(item -> System.out.println(item.toString()));
        sum = shoppingCartItems.stream().mapToDouble(MenuItem::getPrice).sum();
        return sum;
    }

    public List<MenuItem> getShoppingCartItems() {
        return this.shoppingCartItems;
    }

    public void addShoppingCartItems(MenuItem menu) {
        this.shoppingCartItems.add(menu);
    }

    public void removeShoppingCartItems(int idx) {
        this.shoppingCartItems.remove(idx);
    }

    public void clearShoppingCartItems() {
        this.shoppingCartItems.clear();
    }
}