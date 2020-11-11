package com.carfactory.carfactory.interfaces;

public abstract class AbstractCarFactory {
    protected abstract Car getCar(String carType);
}