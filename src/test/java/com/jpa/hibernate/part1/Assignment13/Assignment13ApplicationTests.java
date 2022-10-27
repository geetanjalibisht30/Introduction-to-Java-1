package com.jpa.hibernate.part1.Assignment13;

import com.jpa.hibernate.part1.Assignment13.EmpEntity.Employee;
import com.jpa.hibernate.part1.Assignment13.repository.EmployeeRepository;
import com.jpa.hibernate.part1.Assignment13.repository.PagingAndSorting;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class Assignment13ApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;



	@Test
	void contextLoads() {
	}


	@Test
	public void testCreate()
	{
		Employee employee=new Employee();
		employee.setName("Geetanjali");
		employee.setId(101);
		employee.setAge(23);
		employee.setLocation("Delhi");

		Employee employee1=new Employee();
		employee1.setName("Muskan");
		employee1.setId(102);
		employee1.setAge(26);
		employee1.setLocation("Noida");

		Employee employee2=new Employee();
		employee2.setName("Aman");
		employee2.setId(103);
		employee2.setAge(28);
		employee2.setLocation("Ranikhet");


		//saving to db
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);


	}
	@Test
	public void testUpdate(){

		Employee employee=employeeRepository.findById(101).get();
		employee.setName("Gunjan");
		employeeRepository.save(employee);

	}
	@Test
	public void testDelete(){

		//employeeRepository.deleteAll();
	employeeRepository.deleteById(102);
	}
	@Test
	public void testRead(){
		Employee employee=  employeeRepository.findById(101).get();
		System.out.println("Age of emp who's id is 101" + employee.getAge());
	}
	@Test
	public void testCount(){

		System.out.println(employeeRepository.count());
	}


	@Autowired
	PagingAndSorting pagingAndSorting;

	@Test
	public void testPagingAndSorting()
	{
		Pageable pageable =
				PageRequest.of(0,1, Sort.by("age"));
		pagingAndSorting.findAll(pageable).forEach(p-> System.out.println(p.getAge()));

	}
	//employee whose name Geetanjali and getting its location
	@Test
	public void findByName(){
		List<Employee> employees = employeeRepository.findByName("Geetanjali");
		employees.forEach(e -> System.out.println(e.getLocation()));
	}
	//finding employee whose age is between 28 and 32
	@Test
	public void findByAgeBetween(){
		List<Employee> employees = employeeRepository.findByAgeBetween(28,32);
		employees.forEach(e -> System.out.println(e.getLocation()));
	}

	@Test
	public void findByNameLike(){
		List<Employee> employees = employeeRepository.findByNameLike("A%");
		employees.forEach(e -> System.out.println(e.getName()));
	}
}
