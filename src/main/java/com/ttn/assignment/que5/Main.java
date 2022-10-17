package com.ttn.assignment.que5;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext obj = new AnnotationConfigApplicationContext(Main.class);
        CarType obj1 = obj.getBean(CarType.class);
        obj1.Print();

    }
}
