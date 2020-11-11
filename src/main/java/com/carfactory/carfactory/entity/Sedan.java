package com.carfactory.carfactory.entity;

import com.carfactory.carfactory.interfaces.Car;

public class Sedan implements Car {
    private static final String SEDAN_PRODUCED = "Sedan Car has produced";

    @Override
    public String getType() {
        return SEDAN_PRODUCED;
    }
}