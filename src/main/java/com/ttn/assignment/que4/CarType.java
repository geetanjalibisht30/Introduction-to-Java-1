package com.ttn.assignment.que4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarType {
    @Autowired
    Car car;
    public Car getCar(){
        return car;

    }
    public void setCar(Car car){
        this.car=car;
    }
    void print(){
        car.carName();
    }
}
