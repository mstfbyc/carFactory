package com.carfactory.carfactory.enums;

public enum CarTypeEnum {
    SEDAN("sedan"),
    CABRIO("cabrio"),
    HATCHBACK("hatchback");

    private String value;

    public String getValue() {
        return value;
    }

    CarTypeEnum(String value) {
        this.value = value;
    }
}
