package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger ",6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack  ",8.9, " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger   ",5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("[ "+ "SHAKESHACK MENU"+ " ]");
            int i = menuItems.size()-1;
            for (MenuItem menuItem : menuItems) {
                System.out.println(menuItems.size()-i +". " + menuItem.name + "  | W " + menuItem.price + " | " + menuItem.explanation);
                i--;
            }
            System.out.println("0. 종료      | 종료");
            System.out.println("숫자를 선택해주세요");
            int chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                }
                case 1 -> System.out.println("ShackBurger를 선택하셨습니다");
                case 2 -> System.out.println("SmokeShack를 선택하셨습니다");
                case 3 -> System.out.println("Cheeseburger를 선택하셨습니다");
                case 4 -> System.out.println("Hamburger를 선택하셨습니다");
                default -> System.out.println("메뉴에 있는 숫자만 써주세요");
            }
        }
    }
}