package com.TTN.jpql.JPQLandNative.repositoryofJPQLandNative;

import com.TTN.jpql.JPQLandNative.entityOfJPQLandNative.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//creating the repository of Employee entity
public interface EmployeeRepo extends CrudRepository<Employee,Integer> {

    //empId, empFirstName, empLastName, empSalary, empAge.


    //JPQl
    //Display the first name,
    // last name of all employees having salary greater than average salary ordered in ascending by their age and in descending by their salary.
  @Query(value = "select firstName, lastName from Employee where salary >( select avg(salary) from Employee) order by age ASC, salary DESC  ")
  List<Object[]>  findFirstLastName();

// Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
@Modifying
@Query( value = "UPDATE Employee SET salary = :empSalary  where salary < :avgSalary")
void updateSalary(@Param("empSalary") int empSalary ,@Param("avgSalary") int avgSalary);

 //Delete all employees with minimum salary.
@Modifying
@Query("delete Employee where salary=:minSalary")
void deleteMin(@Param("minSalary")int minSalary);
//calculating average
@Query(value="select avg(salary) from Employee ")
Optional<Integer> avgSalary();

//calculating min salary
@Query("select min(salary) from Employee")
int minSal();


}