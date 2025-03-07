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
            System.out.println();
            System.out.println("[ "+ "SHAKESHACK MENU"+ " ]");
            int i = menuItems.size()-1;
            for (MenuItem menuItem : menuItems) {
                System.out.println(menuItems.size()-i +". " + menuItem.name + "  | W " + menuItem.price + " | " + menuItem.explanation);
                i--;
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("숫자를 선택해주세요 : ");
            int chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                }
                case 1 -> System.out.println("선택한 메뉴 :  1. " + menuItems.get(0).name + "  | W " + menuItems.get(0).price + " | " + menuItems.get(0).explanation);
                case 2 -> System.out.println("선택한 메뉴 :  2. " + menuItems.get(1).name + "  | W " + menuItems.get(1).price + " | " + menuItems.get(1).explanation);
                case 3 -> System.out.println("선택한 메뉴 :  3. " + menuItems.get(2).name + "  | W " + menuItems.get(2).price + " | " + menuItems.get(2).explanation);
                case 4 -> System.out.println("선택한 메뉴 :  4. " + menuItems.get(3).name + "  | W " + menuItems.get(3).price + " | " + menuItems.get(3).explanation);
                default -> System.out.println("메뉴에 있는 숫자만 써주세요");
            }
        }

    }
}