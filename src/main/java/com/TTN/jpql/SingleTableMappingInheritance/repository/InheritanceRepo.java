package com.TTN.jpql.SingleTableMappingInheritance.repository;

import com.TTN.jpql.SingleTableMappingInheritance.entity.Project;
import org.springframework.data.repository.CrudRepository;


//repository creation
public interface InheritanceRepo extends CrudRepository<Project,Integer> {

}
