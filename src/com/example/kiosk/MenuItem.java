package com.example.kiosk;

public class MenuItem {
    private final String name;
    private  double price;
    private final String explanation;
    private int count;

    MenuItem(String name, double price, String explanation) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
    }
    MenuItem(String name, double price, String explanation, int count) {
        this.name = name;
        this.price = price;
        this.explanation = explanation;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price+=this.price;
    }

    public String getExplanation() {
        return explanation;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount() {
        this.count++;
    }

    @Override
    public String toString() {
        if (this.count == 0) {
            return String.format("%s| W %.1f | %s", this.name, this.price,this.explanation);
        }
        return String.format("%s| W %.1f | %s x %d", this.name, this.price,this.explanation,this.count);
    }
}