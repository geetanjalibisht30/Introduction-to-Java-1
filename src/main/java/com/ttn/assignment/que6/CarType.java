package com.ttn.assignment.que6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarType {
    @Autowired
    Car car;
    public CarType(Car car){
        this.car=car;

    }
    void Print(){
        car.carName();
    }


}
