package org.ttn.RestSpringBoot.staticAndDynamicfiltering;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


//methods

//managed by spring and it is autowired in Employee resource
@Component
public class ServiceSD {


    //list
    private static List<UserDetails> userDetailsList = new ArrayList<>();


    //setting up values of Employee bean
    static {
        userDetailsList.add(new UserDetails("Gunjan", 22, "3rewr"));
        userDetailsList.add(new UserDetails("Muskan", 39, "3sjd"));
        userDetailsList.add(new UserDetails("Aman", 24, "abcd23"));
        userDetailsList.add(new UserDetails("Riya", 23, "rwrewjw2"));



    }


}
