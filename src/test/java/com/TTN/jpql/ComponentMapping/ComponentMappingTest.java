package com.TTN.jpql.ComponentMapping;

//import com.TTN.jpql.componentmapping.EmployeeCM;
//import com.TTN.jpql.componentmapping.SalaryStructure;
//import com.TTN.jpql.repository.ComponentmappingRepo;

import com.TTN.jpql.ComponentMapping.entity.EmployeeCM;
import com.TTN.jpql.ComponentMapping.entity.SalaryStructure;
import com.TTN.jpql.ComponentMapping.repository.ComponentRepotest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ComponentMappingTest {

    @Autowired
    ComponentRepotest componentmappingRepo;


    @Test
    public void contextLoads() {
    }


// id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

    //inserting into the table
  @Test
    public void testComponentMapping()
    {
        EmployeeCM employeeCM =new EmployeeCM();
        employeeCM.setId(7);
        employeeCM.setFirstName("Geetanjali");
        employeeCM.setLastName("Bisht");
        employeeCM.setAge(23);

        SalaryStructure salaryStructure=new SalaryStructure();
        salaryStructure.setBasicSalary(200);
        salaryStructure.setBonusSalary(231);
        salaryStructure.setTaxAmount(200);
        salaryStructure.setSpecialAllowanceSalary(44);

        employeeCM.setSalaryStructure(salaryStructure);
       //saving it
        componentmappingRepo.save(employeeCM);
    }


}
