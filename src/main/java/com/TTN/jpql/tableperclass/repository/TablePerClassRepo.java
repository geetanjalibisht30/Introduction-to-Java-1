package com.TTN.jpql.tableperclass.repository;

import com.TTN.jpql.tableperclass.entity.Product;
import org.springframework.data.repository.CrudRepository;


//repository
public interface TablePerClassRepo extends CrudRepository<Product,Integer> {


}
