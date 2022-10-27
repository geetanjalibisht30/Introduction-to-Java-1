package com.jpa.hibernate.part1.Assignment13.repository;

import com.jpa.hibernate.part1.Assignment13.EmpEntity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
    //enabling paging and sorting by extending the class


        //paging and sorting custom on the basis of age
//(8) Create and use finder to find Employee by Name
     List<Employee> findByName(String  name );
//age between 28 to 32
       List<Employee> findByAgeBetween(int age1, int age2);

        //(9) Create and use finder to find Employees starting with A character
       List<Employee> findByNameLike(String name);


}
