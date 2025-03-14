package com.example.kiosk;

import com.sun.jdi.LongValue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Menu {
    private final String category;
    private final List<MenuItem> menuItems;

    public Menu(String category) {
        this.category=category;
        menuItems=new ArrayList<>();
        switch (this.category) {
            case "Burgers" -> {
                menuItems.add(new MenuItem("ShackBurger ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            case "Drinks" -> {
                menuItems.add(new MenuItem("Water           ",1.0, "리얼 제로 칼로리 청정수"));
                menuItems.add(new MenuItem("Coke & zero Coke",2.0, "펩시 주문 안 받아요"));
                menuItems.add(new MenuItem("MilkShake       ",2.5, "신선한 우유가 들어간 부드러운 밀크셰이크"));
                menuItems.add(new MenuItem("Sprite          ",2.0, "목이 너무 따갑지만 청량감 원탑"));
            }
            case "Desserts" -> {
                menuItems.add(new MenuItem("CheeseCake     ",4.0, "내가 좋아해서 파는 메뉴"));
                menuItems.add(new MenuItem("CheeseStick    ",2.0, "치즈 2m 늘어남"));
                menuItems.add(new MenuItem("Ice Cream      ",2.0, "달달하이 쳐 쥑이네"));
                menuItems.add(new MenuItem("Chicken Nuggets",2.0, "단백질 부족하신 분 더 사드세요"));
            }
            default -> System.out.println("카테고리에 있는 것만 선택해주세요");
        }
    }

    public void showMenuCategory() {
//        int i = menuItems.size()-1;
//        for (MenuItem menuItem : menuItems) {
//            System.out.println(menuItems.size()-i +". " + menuItem.toString());
//            i--;
//        }
        int menuNumber = IntStream.range(1,menuItems.size())
                .findFirst()
                .orElse(0);
        menuItems.forEach(menuItem -> System.out.println(menuNumber+". "+menuItem.toString()));
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public String getCategory() {
        return this.category;
    }
}