package com.example.kiosk;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("Burgers");

        Kiosk kiosk = new Kiosk();
        kiosk.start();
    }
}