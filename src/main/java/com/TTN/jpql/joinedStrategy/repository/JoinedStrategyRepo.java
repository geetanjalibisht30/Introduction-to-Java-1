package com.TTN.jpql.joinedStrategy.repository;

import com.TTN.jpql.joinedStrategy.entity.FoodType;
import org.springframework.data.repository.CrudRepository;


//creating repository
public interface JoinedStrategyRepo extends CrudRepository<FoodType,Integer> {
}
