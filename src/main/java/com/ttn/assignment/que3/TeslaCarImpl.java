package com.ttn.assignment.que3;

import org.springframework.stereotype.Component;

@Component
public class TeslaCarImpl implements Car{
    @Override
    public void CarName() {
        System.out.println(" This is Tesla Car .");
    }
}
