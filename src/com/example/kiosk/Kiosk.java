package com.example.kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final ShoppingCart shoppingCart = new ShoppingCart();
    private final List<Menu> listMenus = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public Kiosk () {
        listMenus.add(new Menu("Burgers"));
        listMenus.add(new Menu("Drinks"));
        listMenus.add(new Menu("Desserts"));
    }

    public void start() {
        Menu menu;
        while (true) {
            System.out.println();

            // 메인 메뉴 시작
            System.out.println("[ MAIN MENU" + " ]");
            for (int i = 0; i< listMenus.size(); i++) {
                System.out.println(i+1+"." + " " +listMenus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();
            int chooseParentMenu = io("메뉴를 선택해주세요 : ",0,3);
            if (chooseParentMenu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {

                menu = listMenus.get(chooseParentMenu - 1);
                System.out.println("선택한 메인메뉴 :  " + chooseParentMenu + ". " + menu.getCategory());
            }
            System.out.println();

            // 부 메뉴 시작
            System.out.println("[ " + menu.getCategory() + "MENU" + " ]");
            menu.showMenuCategory();
            System.out.println("0. 되돌아가기      | 되돌아가기");
            System.out.println();
            int chooseChildMenu = io("메뉴를 선택해주세요 : ",0,4);
            if (chooseChildMenu == 0) {
                System.out.println("되돌아갑니다");
                continue;
            } else {
                System.out.println("선택한 " + menu.getCategory() + "메뉴 :  " + chooseChildMenu + ". " + menu.getMenuItems().get(chooseChildMenu - 1).toString());
                System.out.println();
                System.out.println();

                // 장바구니 추가 및 취소 기능
                System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).toString());
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인        2. 취소");
                int chooseShoppingCartMenu = io("번호를 선택해주세요 : ", 1, 2);
                if (chooseShoppingCartMenu == 1) {
                    shoppingCart.addShoppingCart(menu.getMenuItems().get(chooseChildMenu - 1).toString());
                    System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).getName() + "이 장바구니에 추가되었습니다");
                } else {
                    System.out.println("취소되었습니다");
                }
            }

            // 카트 주문 및 취소 기능
            if (!shoppingCart.getShoppingCart().isEmpty()) {
                int chooseOrderMenu;
                System.out.println();
                System.out.println("[ ORDER MENU" + " ]");
                System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.\n 5. Cancel       | 진행중인 주문을 취소합니다.");
                chooseOrderMenu = io("메뉴를 선택해주세요 : ", 4, 5);
                if (chooseOrderMenu == 4) {
                    System.out.println("[ Orders" + " ]");
                    double sum = 0;
                    for (int i = 0; i < shoppingCart.getShoppingCart().size(); i++) {
                        String[] findPrice = shoppingCart.getShoppingCart().get(i).split("\\|");
                        String[] findPrice1 = findPrice[1].split(" ");
                        double findPrice2 = Double.parseDouble(findPrice1[2]);
                        System.out.println(shoppingCart.getShoppingCart().get(i));
                        sum += findPrice2;
                    }
                    System.out.println();
                    System.out.println("[ Total" + " ]");
                    System.out.println("W " + sum);
                    System.out.println();
                    System.out.println("1. 주문      2. 메뉴판");
                    int chooseOrderAndMenu = io("번호를 선택해주세요 : ", 1, 2);
                    if (chooseOrderAndMenu == 1) {
                        System.out.println("주문이 완료되었습니다. 금액은 W " + sum + " 입니다");
                        shoppingCart.removeShoppingCart();
                        break;
                    } else {
                        System.out.println("메뉴판으로 되돌아갑니다");
                    }
                } else {
                    System.out.println("진행중인 주문을 취소했습니다");
                }
            }
        }
    }

    // 입출력 및 예외처리 메서드
    private int io(String choose, int min,int max) {
        while (true) {
            try {
                while (true) {
                    System.out.print(choose);
                    int input = sc.nextInt();
                    if (input>=min && input<=max) {
                        return input;
                    }else {
                        System.out.println("메뉴의 숫자에서만 골라주세요");
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("숫자만 써주세요");
                sc.nextLine();
            }
        }
    }
}
