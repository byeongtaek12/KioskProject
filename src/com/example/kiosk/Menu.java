package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final String category;
    private final List<MenuItem> menuItemlist;

    public Menu(String category) {
        this.category=category;
        menuItemlist=new ArrayList<>();
        switch (this.category) {
            case "Burgers" -> {
                menuItemlist.add(new MenuItem("ShackBurger ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuItemlist.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuItemlist.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuItemlist.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            case "Drinks" -> {
                menuItemlist.add(new MenuItem("Water           ",1.0, "리얼 제로 칼로리 청정수"));
                menuItemlist.add(new MenuItem("Coke & zero Coke",2.0, "펩시 주문 안 받아요"));
                menuItemlist.add(new MenuItem("MilkShake       ",2.5, "신선한 우유가 들어간 부드러운 밀크셰이크"));
                menuItemlist.add(new MenuItem("Sprite          ",2.0, "목이 너무 따갑지만 청량감 원탑"));
            }
            case "Desserts" -> {
                menuItemlist.add(new MenuItem("CheeseCake     ",4.0, "내가 좋아해서 파는 메뉴"));
                menuItemlist.add(new MenuItem("CheeseStick    ",2.0, "치즈 2m 늘어남"));
                menuItemlist.add(new MenuItem("Ice Cream      ",2.0, "달달하이 쳐 쥑이네"));
                menuItemlist.add(new MenuItem("Chicken Nuggets",2.0, "단백질 부족하신 분 더 사드세요"));
            }
            default -> System.out.println("카테고리에 있는 것만 선택해주세요");
        }
    }

    public void showMenuCategory() {
        int i = menuItemlist.size()-1;
        for (MenuItem menuItem : menuItemlist) {
            System.out.println(menuItemlist.size()-i +". " + menuItem.toString());
            i--;
        }
    }

    public List<MenuItem> getMenuItemlist() {
        return this.menuItemlist;
    }

    public String getCategory() {
        return this.category;
    }
}
