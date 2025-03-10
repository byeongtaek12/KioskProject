package com.example.kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();
    private final List<Menu> listMenus = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private boolean flag = true;

    public void start() {
        listMenus.add(new Menu("Burgers"));
        listMenus.add(new Menu("Drinks"));
        listMenus.add(new Menu("Desserts"));
        while (flag) {
            System.out.println();
            System.out.println("[ MAIN MENU" + " ]");
            for (int i = 0; i< listMenus.size(); i++) {
                System.out.println(i+1+"." + " " +listMenus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();
            System.out.print("메뉴를 선택해주세요 : ");
            int chooseParentMenu;
            try {
                chooseParentMenu = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("올바르지 않은 입력입니다");
                sc.nextLine();
                continue;
            }
            if (chooseParentMenu ==0 ) {
                System.out.println("프로그램을 종료합니다");
                flag = false;
            }else if (chooseParentMenu > 0 && chooseParentMenu < 4) {
                menu = listMenus.get(chooseParentMenu-1);
                System.out.println("선택한 메인메뉴 :  " + chooseParentMenu + ". "+ menu.getCategory());
            }else {
                System.out.println("메뉴에 있는 숫자만 써주세요");
                continue;
            }

            if (chooseParentMenu==0) {
                break;
            }
            while (true) {
                System.out.println();
                System.out.println("[ " + menu.getCategory() + "MENU" + " ]");
                menu.showMenuCategory();
                System.out.println("0. 되돌아가기      | 되돌아가기");
                System.out.println();
                System.out.print("메뉴를 선택해주세요 : ");
                int chooseChildMenu;
                try {
                    chooseChildMenu = sc.nextInt();
                }catch (InputMismatchException e) {
                    System.out.println("올바르지 않은 입력입니다");
                    sc.nextLine();
                    continue;
                }

                if (chooseChildMenu == 0) {
                    System.out.println("되돌아갑니다");
                } else if (chooseChildMenu > 0 && chooseChildMenu < 5) {
                    System.out.println("선택한 " + menu.getCategory() + "메뉴 :  " + chooseChildMenu + ". " + menu.getMenuItems().get(chooseChildMenu - 1).getName() + "  | W " + menu.getMenuItems().get(chooseChildMenu - 1).getPrice() + " | " + menu.getMenuItems().get(chooseChildMenu - 1).getExplanation());
                } else {
                    System.out.println("메뉴에 있는 숫자만 써주세요");
                    continue;
                }
                break;
            }
        }
    }
}
