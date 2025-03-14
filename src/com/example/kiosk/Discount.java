package com.example.kiosk;

public enum Discount {
    PERSONOFNATIONALMERIT("10%","국가유공자"), ARMY("5%","군인"), STUDENT("3%","학생"), GENERALPERSON("0%","일반인");

    private final String discount;
    private final String type;

    Discount (String discount, String type) {
        this.discount=discount;
        this.type=type;
    }

    public String getDiscount() {
        return this.discount;
    }

    public String getType() {
        return this.type;
    }
}