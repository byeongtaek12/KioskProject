package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartService {
    private final List<ShoppingCart> shoppingCartlist;

    public ShoppingCartService() {
        shoppingCartlist= new ArrayList<>();
    }

    // TODO 카트 안에 있는 아이템의 가격 합산


    // TODO 카트에 담겨있는 아이템 출력
    public List<ShoppingCart> getShoppingCartList() {
        return this.shoppingCartlist;
    }

    // TODO 카트 비우기
    public void clearShoppingCartList() {
        this.shoppingCartlist.clear();
    }

    // TODO 카트에 아이템 추가하기
    public void addShoppingCartList(ShoppingCart menu) {
        this.shoppingCartlist.add(menu);
    }

}
