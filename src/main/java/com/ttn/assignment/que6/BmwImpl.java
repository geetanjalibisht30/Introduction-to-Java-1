package com.ttn.assignment.que6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BmwImpl implements Car{
    @Override
    public void carName() {
        System.out.println("This is BMW.");
    }
}
