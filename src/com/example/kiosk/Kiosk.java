package com.example.kiosk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kiosk {
    private Menu menu = new Menu();
    private Scanner sc = new Scanner(System.in);
    private boolean flag = true;

    public void start() {
        while (flag) {
            menu.showParentMenuCategory();
            System.out.print("메뉴를 선택해주세요 : ");
            int chooseParentMenu;
            try {
                chooseParentMenu = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("올바르지 않은 입력입니다");
                sc.nextLine();
                continue;
            }
            switch (chooseParentMenu) {
                case 0 -> {
                    System.out.println("프로그램을 종료합니다");
                    flag = false;
                }
                case 1 -> System.out.println("선택한 메인메뉴 :  1. "+ menu.getCategory());
                case 2 -> System.out.println("선택한 메인메뉴 :  2. "+ menu.getCategory());
                case 3 -> System.out.println("선택한 메인메뉴 :  3. "+ menu.getCategory());
                default -> {
                    System.out.println("메뉴에 있는 숫자만 써주세요");
                    continue;
                }
            }

            if (chooseParentMenu==0) {
                break;
            }
            while (true) {
                System.out.println();
                System.out.println("[ " + menu.getCategory() + "MENU" + " ]");
                menu.showChildMenuCategory();
                System.out.println("0. 되돌아가기      | 되돌아가기");
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
