package com.TTN.jpql.joinedStrategy;

import com.TTN.jpql.joinedStrategy.entity.NonVegBurger;
import com.TTN.jpql.joinedStrategy.entity.VegBurger;
import com.TTN.jpql.joinedStrategy.repository.JoinedStrategyRepo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JoinedStrategyInheritanceTest {


    @Autowired
    JoinedStrategyRepo joinedStrategyRepo;


    @Test
    public void contextLoads() {
    }
    //Implement and demonstrate Joined strategy.

    //inserting into vegburger table
@Test
    public void createVegBurger()
    {
        VegBurger vegBurger=new VegBurger();
        vegBurger.setId(10);
        vegBurger.setType("Veg Burger");
        vegBurger.setVegBurgerId(1244);

        //saving
        joinedStrategyRepo.save(vegBurger);
    }
    //inserting in nonvegburger table
    @Test
    public void createNonVegBurger()
    {
        NonVegBurger nonVegBurger=new NonVegBurger();
        nonVegBurger.setId(17);
        nonVegBurger.setType("Non Veg Burger");
        nonVegBurger.setNonVegBurgerId(124);

        //saving
        joinedStrategyRepo.save(nonVegBurger);
    }

}
