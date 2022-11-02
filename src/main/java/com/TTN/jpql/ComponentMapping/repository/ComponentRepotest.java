package com.TTN.jpql.ComponentMapping.repository;

//import com.TTN.jpql.componentmapping.EmployeeCM;
import com.TTN.jpql.ComponentMapping.entity.EmployeeCM;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//creating repository

@Repository
public interface ComponentRepotest extends CrudRepository<EmployeeCM,Integer> {
}
