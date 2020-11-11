package com.carfactory.carfactory.entity;

import com.carfactory.carfactory.interfaces.Car;

public class Cabrio implements Car {

    private static final String CABRIO_PRODUCED = "Cabrio Car has produced";

    @Override
    public String getType() {
        return CABRIO_PRODUCED;
    }
}