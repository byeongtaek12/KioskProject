package com.example.kiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private final Scanner sc = new Scanner(System.in);
    private final ShoppingCart shoppingCart = new ShoppingCart();
    private final List<Menu> Menulist = new ArrayList<>();
    private Menu menu;
    private int chooseChildMenu;

    public Kiosk () {
        Menulist.add(new Menu("Burgers"));
        Menulist.add(new Menu("Drinks"));
        Menulist.add(new Menu("Desserts"));
    }

    public void start() {
        while (true) {
            System.out.println();

            // 메인 메뉴 시작
            System.out.println("[ MAIN MENU" + " ]");
            for (int i = 0; i< Menulist.size(); i++) {
                System.out.println(i+1+"." + " " +Menulist.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();
            int chooseParentMenu = io("메뉴를 선택해주세요 : ",0,3);
            if (chooseParentMenu == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                menu = Menulist.get(chooseParentMenu - 1);
                System.out.println("선택한 메인메뉴 :  " + chooseParentMenu + ". " + menu.getCategory());
            }
            System.out.println();

            // 부 메뉴 시작
            System.out.println("[ " + menu.getCategory() + "MENU" + " ]");
            menu.showMenuCategory();
            System.out.println("0. 되돌아가기      | 되돌아가기");
            System.out.println();
            chooseChildMenu = io("메뉴를 선택해주세요 : ",0,4);
            if (chooseChildMenu == 0) {
                System.out.println("되돌아갑니다");
                continue;
            } else {
                System.out.println("선택한 " + menu.getCategory() + "메뉴 :  " + chooseChildMenu + ". " + menu.getMenuItems().get(chooseChildMenu - 1).toString());
                System.out.println();
                System.out.println();
                shoppingCartAddCancel();
            }
            int s = shoppingCartOrderCancel();
            if (s==1) {break;}
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

    // 장바구니 추가 및 취소 기능 메서드
    private void shoppingCartAddCancel() {
        System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).toString());
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        int chooseShoppingCartMenu = io("번호를 선택해주세요 : ", 1, 2);
        if (chooseShoppingCartMenu == 1) {
            ShoppingCart shoppingCartTemp = new ShoppingCart(
                    menu.getMenuItems().get(chooseChildMenu - 1).getName(),
                    1,
                    menu.getMenuItems().get(chooseChildMenu - 1).getPrice()
            );
            shoppingCart.addShoppingCart(shoppingCartTemp);
            System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).getName() + "이 장바구니에 추가되었습니다");
        } else {
            System.out.println("취소되었습니다");
        }
    }

    // 장바구니에 담긴 음식 주문 및 취소 기능 메서드
    private int shoppingCartOrderCancel() {
        if (!shoppingCart.getShoppingCart().isEmpty()) {
            System.out.println();
            System.out.println("[ ORDER MENU" + " ]");
            System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.\n5. Cancel       | 진행중인 주문을 취소합니다.");
            int chooseOrderMenu = io("메뉴를 선택해주세요 : ", 4, 5);
            if (chooseOrderMenu == 4) {
                System.out.println("[ Orders" + " ]");
                double sum = sumPriceShowShoppingCart();
                System.out.println();
                System.out.println("[ Total" + " ]");
                System.out.println("W " + sum);
                System.out.println();
                System.out.println("1. 주문      2. 메뉴판");
                int chooseOrderAndMenu = io("번호를 선택해주세요 : ", 1, 2);
                if (chooseOrderAndMenu == 1) {
                    System.out.println("주문이 완료되었습니다. 금액은 W " + sum + " 입니다");
                    shoppingCart.clearShoppingCart();
                } else {
                    System.out.println("메뉴판으로 되돌아갑니다");
                }
                return chooseOrderAndMenu;
            } else {
                System.out.println("진행중인 주문을 취소했습니다");
            }
        }
        return 0;
    }

    // price 합계 계산 및 장바구니에 담긴 음식 출력 메서드
    private double sumPriceShowShoppingCart() {
        double sum = 0;
        for (int i = 0; i < shoppingCart.getShoppingCart().size(); i++) {
            System.out.println(shoppingCart.getShoppingCart().get(i).toString());
            sum += shoppingCart.getShoppingCart().get(i).getPrice();
        }
        return sum;
    }
}
