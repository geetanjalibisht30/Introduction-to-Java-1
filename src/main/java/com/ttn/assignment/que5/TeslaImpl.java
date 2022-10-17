package com.ttn.assignment.que5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TeslaImpl implements  Car {
    @Override
    public void carName() {
        System.out.println(" This is Tesla . ");
    }
}
