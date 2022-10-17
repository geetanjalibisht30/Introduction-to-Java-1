package com.ttn.assignment.que6;

import org.springframework.stereotype.Component;

@Component
public class SwiftImpl implements  Car {
    @Override
    public void carName() {
        System.out.println(" Swift Car");
    }
}
