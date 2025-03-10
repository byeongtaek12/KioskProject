package com.example.kiosk;

public class MenuItem {
    private String name;
    private double price;
    private String explanation;

    MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public String getName() {
        return name;
    }
    public double getprice() {
        return price;
    }
    public String getexplanation() {
        return explanation;
    }
}
