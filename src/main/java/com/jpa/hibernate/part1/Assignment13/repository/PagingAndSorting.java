package com.jpa.hibernate.part1.Assignment13.repository;

import com.jpa.hibernate.part1.Assignment13.EmpEntity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagingAndSorting  extends PagingAndSortingRepository<Employee,Integer>
{

}
