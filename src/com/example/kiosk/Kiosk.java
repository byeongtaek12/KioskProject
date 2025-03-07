package com.example.kiosk;

import java.util.Scanner;

public class Kiosk {
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    public void start() {
        while (flag) {
            menu.showMenuCategory();
            System.out.println();
            System.out.println("[ "+ "SHAKESHACK MENU"+ " ]");
            int i = menu.getMenuItems().size()-1;
            for (MenuItem menuItem : menu.getMenuItems()) {
                System.out.println(menu.getMenuItems().size()-i +". " + menuItem.name + "  | W " + menuItem.price + " | " + menuItem.explanation);
                i--;
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("숫자를 선택해주세요 : ");
            int chooseMenu = sc.nextInt();
            System.out.println();
            switch (chooseMenu) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                }
                case 1 -> System.out.println("선택한 메뉴 :  1. " + menu.getMenuItems().get(0).name + "  | W " + menu.getMenuItems().get(0).price + " | " + menu.getMenuItems().get(0).explanation);
                case 2 -> System.out.println("선택한 메뉴 :  2. " + menu.getMenuItems().get(1).name + "  | W " + menu.getMenuItems().get(1).price + " | " + menu.getMenuItems().get(1).explanation);
                case 3 -> System.out.println("선택한 메뉴 :  3. " + menu.getMenuItems().get(2).name + "  | W " + menu.getMenuItems().get(2).price + " | " + menu.getMenuItems().get(2).explanation);
                case 4 -> System.out.println("선택한 메뉴 :  4. " + menu.getMenuItems().get(3).name + "  | W " + menu.getMenuItems().get(3).price + " | " + menu.getMenuItems().get(3).explanation);
                default -> System.out.println("메뉴에 있는 숫자만 써주세요");
            }
        }
    }
}
