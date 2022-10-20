package com.TTN.Assignment10.Que1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Main {
    @RequestMapping(method = RequestMethod.GET, path = "/spring-boot")


    public String springboot(){
        return  "Welcome To Spring Boot";

    }
}
