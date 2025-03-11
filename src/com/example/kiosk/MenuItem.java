package com.example.kiosk;

public class MenuItem {
    private final String name;
    private final double price;
    private final String explanation;

    MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getExplanation() {
        return explanation;
    }

    @Override
    public String toString() {
        return String.format("%s| W %.1f | %s", this.name, this.price,this.explanation);
    }
}
