package com.TTN.jpql;

import com.TTN.jpql.JPQLandNative.repositoryofJPQLandNative.EmployeeRepo;
import com.TTN.jpql.JPQLandNative.repositoryofJPQLandNative.NativeEmployee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
class JpqlApplicationTests {




	@Autowired
	EmployeeRepo employeeRepo;


	@Test
	void contextLoads() {
	}


	//Display the first name, last name of all employees having salary greater
	// than average salary ordered in ascending by their age and in descending by their salary.
	@Test
	public void testFindAllEmployeesWithAverageSalary() {

		List<Object[]> part = employeeRepo.findFirstLastName();
		for (Object[] obj : part) {
			//for first column
			System.out.print(obj[0] + " ");
			//for second column as it returns in list form
			System.out.println(obj[1] + " ");
		}
	}

	//Update salary of all employees by
	// a salary passed as a parameter whose existing salary is less than the average salary.
	    @Test
		@Transactional
		@Rollback(value = false)
		public void testUpdateSalary()
	   {
		   Optional<Integer> avgSalary =employeeRepo.avgSalary();
		   if(avgSalary.isPresent()){
			   employeeRepo.updateSalary(500,avgSalary.get());
			 //  System.out.println("average salary:" + avgSalary.get());
		   }
		}
    //Delete all employees with minimum salary.
	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteMinSalary()
	{
		//storing min value from method minSal
		int min=employeeRepo.minSal();
		employeeRepo.deleteMin(min);


		}
	@Autowired
	NativeEmployee nativeEmployee;


//Display the id, first name, age of all employees where last name ends with "singh"

	//finding employees whose last name ends with singh
	@Test
	public void testFindAllEmployeesBylastNameNQ() {
		List<Object[]> part = nativeEmployee.findAllEmployeesBylastName();
		for (Object[] obj : part) {
			//displaying
			System.out.print(obj[0] + " ");//id
			System.out.print(obj[1] + " ");//name
			System.out.print(obj[2] + " ");//age
		}
		System.out.println();
	}


	//Delete all employees with age greater than 45(Should be passed as a parameter)
	@Test
	@Transactional
	@Rollback(false)
	public void deleteNQ()
	{
		int age=22;
		nativeEmployee.delete(age);

	}
}












