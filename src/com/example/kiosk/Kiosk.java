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
        Menu menu = new Menu();

        while (true) {
            int chooseParentMenu;
            int chooseOrderAndMenu = 0;
            System.out.println();
            System.out.println("[ MAIN MENU" + " ]");
            for (int i = 0; i< listMenus.size(); i++) {
                System.out.println(i+1+"." + " " +listMenus.get(i).getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.println();
            System.out.print("메뉴를 선택해주세요 : ");

            try {
                chooseParentMenu = sc.nextInt();
                if (chooseParentMenu == 0) {
                    System.out.println("프로그램을 종료합니다");
                    break;
                }else {
                    menu = listMenus.get(chooseParentMenu-1);
                    System.out.println("선택한 메인메뉴 :  " + chooseParentMenu + ". "+ menu.getCategory());
                }
            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                System.out.println("메뉴에 있는 숫자만 입력해주세요");
                sc.nextLine();
                continue;
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
                    if (chooseChildMenu == 0) {
                        System.out.println("되돌아갑니다");
                    } else {
                        while (true) {
                            System.out.println("선택한 " + menu.getCategory() + "메뉴 :  " + chooseChildMenu + ". " + menu.getMenuItems().get(chooseChildMenu - 1).toString());
                            System.out.println();
                            System.out.println();
                            System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).toString());
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인        2. 취소");
                            System.out.print("번호를 선택해주세요 : ");
                            try {
                                int chooseShoppingCartMenu = sc.nextInt();
                                switch (chooseShoppingCartMenu) {
                                    case 1-> {
                                        shoppingCart.addShoppingCart(menu.getMenuItems().get(chooseChildMenu - 1).toString());
                                        System.out.println(menu.getMenuItems().get(chooseChildMenu - 1).getName() + "이 장바구니에 추가되었습니다");
                                    }
                                    case 2-> System.out.println("취소되었습니다");
                                    default -> throw new IndexOutOfBoundsException();
                                }
                            } catch (InputMismatchException | IndexOutOfBoundsException e) {
                                System.out.println("메뉴에 있는 숫자만 써주세요");
                                sc.nextLine();
                                continue;
                            }
                            break;
                        }
                    }
                }catch (InputMismatchException | IndexOutOfBoundsException e) {
                    System.out.println("메뉴에 있는 숫자만 써주세요");
                    sc.nextLine();
                    continue;
                }
                break;
            }
            if (!shoppingCart.getShoppingCart().isEmpty()) {
                int chooseOrderMenu;
                while(true) {
                    System.out.println();
                    System.out.println("[ ORDER MENU" + " ]");
                    System.out.println("4. Orders       | 장바구니를 확인 후 주문합니다.");
                    System.out.println("5. Cancel       | 진행중인 주문을 취소합니다.");
                    System.out.print("번호를 선택해주세요 : ");
                    try {
                        chooseOrderMenu = sc.nextInt();
                        switch (chooseOrderMenu) {
                            case 4 -> {
                                while (true) {
                                    System.out.println("[ Orders" + " ]");
                                    double sum = 0;
                                    for (int i = 0; i<shoppingCart.getShoppingCart().size(); i++) {
                                        String [] findPrice = shoppingCart.getShoppingCart().get(i).split("\\|");
                                        String [] findPrice1 = findPrice[1].split(" ");
                                        double findPrice2 = Double.parseDouble(findPrice1[2]);
                                        System.out.println(shoppingCart.getShoppingCart().get(i));
                                        sum += findPrice2;
                                    }
                                    System.out.println();
                                    System.out.println("[ Total" + " ]");
                                    System.out.println("W "+sum);
                                    System.out.println();
                                    System.out.println("1. 주문      2. 메뉴판");
                                    System.out.print("번호를 선택해주세요 : ");
                                    try {
                                        chooseOrderAndMenu = sc.nextInt();
                                        switch (chooseOrderAndMenu) {
                                            case 1-> {
                                                System.out.println("주문이 완료되었습니다. 금액은 W "+sum +" 입니다");
                                                shoppingCart.removeShoppingCart();
                                            }
                                            case 2-> System.out.println("메뉴판으로 되돌아갑니다");
                                            default -> throw new IndexOutOfBoundsException();
                                        }
                                    }catch (InputMismatchException | IndexOutOfBoundsException e) {
                                        System.out.println("메뉴에 있는 숫자만 써주세요");
                                        sc.nextLine();
                                        continue;
                                    }
                                    break;
                                }
                            }
                            case 5 -> System.out.println("진행중인 주문을 취소했습니다");
                            default -> throw new IndexOutOfBoundsException();
                        }
                    }catch (InputMismatchException | IndexOutOfBoundsException e) {
                        System.out.println("메뉴에 있는 숫자만 써주세요");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
            }
           if (chooseOrderAndMenu==1) {
               break;
           }
        }
    }
}
