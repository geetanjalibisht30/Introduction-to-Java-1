package com.ttn.assignment.que4;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Main.class);
        CarType objs = app.getBean(CarType.class);
        objs.print();
    }
}



