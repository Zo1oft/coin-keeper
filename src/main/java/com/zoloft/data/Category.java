package com.zoloft.data;

import java.util.Arrays;

public enum Category {
    SHOP("магазины"),
    FUEL("АЗС"),
    BAR("Бары"),
    FLOWER("Цветы");

    private final String description;

    Category(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Category findCategory(String description) {
        return Arrays.stream(values())
                .filter(category -> category.getDescription().equals(description))
                .findFirst()
                .orElseThrow();
    }
}
