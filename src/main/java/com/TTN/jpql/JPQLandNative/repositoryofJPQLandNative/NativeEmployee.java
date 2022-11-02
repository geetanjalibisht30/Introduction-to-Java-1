package com.TTN.jpql.JPQLandNative.repositoryofJPQLandNative;

import com.TTN.jpql.JPQLandNative.entityOfJPQLandNative.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NativeEmployee extends CrudRepository<Employee,Integer> {


    //Display the id, first name, age of all employees where last name ends with "singh"
    @Query(value=" select empId, empFirstName,empAge from employee where empLastName like \"%singh\"" ,nativeQuery = true)
    List<Object[]> findAllEmployeesBylastName();



    //Delete all employees with age greater than 45(Should be passed as a parameter)
    @Modifying
    @Query(value = "delete from employee where empAge > :ageUse" ,nativeQuery = true)
    void delete(@Param("ageUse")int ageUse);


    //Implement and demonstrate Single Table strategy



}
