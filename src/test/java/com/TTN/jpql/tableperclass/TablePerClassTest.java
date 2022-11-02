package com.TTN.jpql.tableperclass;

import com.TTN.jpql.tableperclass.repository.TablePerClassRepo;
import com.TTN.jpql.tableperclass.entity.HouseHold;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class TablePerClassTest {

    @Autowired
    TablePerClassRepo tablePerClassRepo;


    @Test
    public void contextLoads() {
    }


    //table per class
    //household table insertion

    @Test
    public void testTablePerClass()
    {
        HouseHold houseHold=new HouseHold();
        houseHold.setId(100);
        houseHold.setAmount(919);

        tablePerClassRepo.save(houseHold);

    }
}
