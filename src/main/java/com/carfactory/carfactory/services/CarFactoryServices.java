package com.carfactory.carfactory.services;

import com.carfactory.carfactory.impl.CarFactory;
import com.carfactory.carfactory.interfaces.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarFactoryServices {

    @Autowired
    private CarFactory carFactory;

    public String getCarType(String carType) {
        Car car = carFactory.getCar(carType);
        return car.getType();
    }

}
