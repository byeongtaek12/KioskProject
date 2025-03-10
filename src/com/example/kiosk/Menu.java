package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private final List<MenuItem> menuItems = new ArrayList<>();

    public Menu() {

    }

    public Menu(String category) {
        this.category=category;
        switch (this.category) {
            case "Burgers" -> {
                menuItems.add(new MenuItem("ShackBurger ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            case "Drinks" -> {
                menuItems.add(new MenuItem("Water ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            case "Desserts" -> {
                menuItems.add(new MenuItem("CheeseCake ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
                menuItems.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
            }
            default -> System.out.println("카테고리에 있는 것만 선택해주세요");
        }
    }
    public void showParentMenuCategory() {
        System.out.println();
        System.out.println("[ MAIN MENU ] \n 1. Burgers \n 2. Drinks \n 3. Desserts \n 0. 종료      | 종료");
    }

    public void showChildMenuCategory() {
        int i = menuItems.size()-1;
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItems.size()-i +". " + menuItem.getName() + "  | W " + menuItem.getprice() + " | " + menuItem.getexplanation());
            i--;
        }
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public String getCategory() {
        return this.category;
    }
}
