package com.example.kiosk;

public enum Discount {
    PERSONOFNATIONALMERIT("10%"), ARMY("5%"), STUDENT("3%"), GENERALPERSON("0%");

    private String discount;

    Discount (String discount) {
        this.discount=discount;
    }

    public String getDiscount() {
        return this.discount;

    }
}