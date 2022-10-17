package com.ttn.assignment.que4;

import org.springframework.stereotype.Component;

@Component
public class FordImpl implements Car{
    @Override
    public void carName() {
        System.out.println(" Ford");
    }
}
