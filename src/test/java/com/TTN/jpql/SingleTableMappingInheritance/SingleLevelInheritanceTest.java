package com.TTN.jpql.SingleTableMappingInheritance;

import com.TTN.jpql.SingleTableMappingInheritance.entity.Java;
import com.TTN.jpql.SingleTableMappingInheritance.repository.InheritanceRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SingleLevelInheritanceTest {



    @Autowired
    InheritanceRepo inheritanceRepo;

    //Implement and demonstrate Single Table strategy


    //inserting values in java  table
    @Test
    public void createJava() {
        Java j=new Java();
        j.setId(18);
        j.setJavaid(12345);

        //saving
        inheritanceRepo.save(j);
    }


}
