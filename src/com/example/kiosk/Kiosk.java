package com.example.kiosk;

import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();
    private Scanner sc = new Scanner(System.in);
    private boolean flag = true;

    public void start() {
        while (flag) {
            menu.showParentMenuCategory();
            System.out.print("메뉴를 선택해주세요 : ");
            int chooseParentMenu = sc.nextInt();
            switch (chooseParentMenu) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                }
                case 1 -> {
                    menu = new Menu("Burgers");
                    System.out.println("선택한 메인메뉴 :  1. "+ menu.getCategory());
                }
                case 2 -> {
                    menu = new Menu("Drinks");
                    System.out.println("선택한 메인메뉴 :  2. "+ menu.getCategory());
                }
                case 3 -> {
                    menu = new Menu("Desserts");
                    System.out.println("선택한 메인메뉴 :  3. "+ menu.getCategory());
                }
                default -> System.out.println("메뉴에 있는 숫자만 써주세요");
            }
            if (chooseParentMenu==0) {
                break;
            }
            System.out.println();
            System.out.println("[ "+ menu.getCategory()+ "MENU"+ " ]");
            menu.showChildMenuCategory();
            System.out.println("0. 되돌아가기      | 되돌아가기");
            System.out.print("메뉴를 선택해주세요 : ");
            int chooseChildMenu = sc.nextInt();
            if (chooseChildMenu == 0) {
                System.out.println("되돌아갑니다");
            }else {
                System.out.println("선택한 " + menu.getCategory() + "메뉴 :  1. " + menu.getMenuItems().get(0).getName() + "  | W " + menu.getMenuItems().get(0).getprice() + " | " + menu.getMenuItems().get(0).getexplanation());
            }

            switch (chooseChildMenu) {
                case 0 -> System.out.println("되돌아갑니다");
                case 1 -> System.out.println("선택한 " + menu.getCategory() + "메뉴 :  1. " + menu.getMenuItems().get(0).getName() + "  | W " + menu.getMenuItems().get(0).getprice() + " | " + menu.getMenuItems().get(0).getexplanation());
                case 2 -> System.out.println("선택한 "+ menu.getCategory() + "메뉴 :  2. " + menu.getMenuItems().get(1).getName() + "  | W " + menu.getMenuItems().get(1).getprice() + " | " + menu.getMenuItems().get(1).getexplanation());
                case 3 -> System.out.println("선택한 " + menu.getCategory() + "메뉴 :  3. " + menu.getMenuItems().get(2).getName() + "  | W " + menu.getMenuItems().get(2).getprice() + " | " + menu.getMenuItems().get(2).getexplanation());
                case 4 -> System.out.println("선택한 " + menu.getCategory() + "메뉴 :  4. " + menu.getMenuItems().get(3).getName() + "  | W " + menu.getMenuItems().get(3).getprice() + " | " + menu.getMenuItems().get(3).getexplanation());
                default -> System.out.println("메뉴에 있는 숫자만 써주세요");
            }
        }
    }
}
