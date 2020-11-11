package com.carfactory.carfactory.entity;

import com.carfactory.carfactory.interfaces.Car;

public class Hatchback implements Car {

    private static final String HATCHBACK_PRODUCED = "Hatchback Car has produced";

    @Override
    public String getType() {
        return HATCHBACK_PRODUCED;
    }
}
