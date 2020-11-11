package com.carfactory.carfactory.impl;

import com.carfactory.carfactory.entity.Cabrio;
import com.carfactory.carfactory.entity.Hatchback;
import com.carfactory.carfactory.entity.Sedan;
import com.carfactory.carfactory.enums.CarTypeEnum;
import com.carfactory.carfactory.interfaces.AbstractCarFactory;
import com.carfactory.carfactory.interfaces.Car;
import com.carfactory.carfactory.util.CarTypeException;
import org.springframework.stereotype.Service;

@Service
public class CarFactory extends AbstractCarFactory {

    public Car getCar(String carType) {
        if(CarTypeEnum.CABRIO.getValue().equalsIgnoreCase(carType)){
            return new Cabrio();
        }else if(CarTypeEnum.SEDAN.getValue().equalsIgnoreCase(carType)){
            return new Sedan();
        }else if(CarTypeEnum.HATCHBACK.getValue().equalsIgnoreCase(carType)){
            return new Hatchback();
        }else{
            throw new CarTypeException("Car type not found");
        }
    }
}
