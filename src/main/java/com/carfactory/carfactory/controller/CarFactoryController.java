package com.carfactory.carfactory.controller;

import com.carfactory.carfactory.services.CarFactoryServices;
import com.carfactory.carfactory.util.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("singleton")
public class CarFactoryController {

    @Autowired
    private CarFactoryServices carFactoryServices;

    @GetMapping( value = "/getCarType/{carType}")
    public BaseResponse<String> getCarType(@PathVariable(value = "carType") String carType) {

        return new BaseResponse<>(carFactoryServices.getCarType(carType));
    }
}
