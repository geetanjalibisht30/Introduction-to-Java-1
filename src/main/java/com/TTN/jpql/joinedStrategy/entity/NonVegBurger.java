package com.TTN.jpql.joinedStrategy.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

//nonveg burger table entity class
@Entity
@Table(name="nonvegburger")
@PrimaryKeyJoinColumn(name="id")
public class NonVegBurger extends FoodType
{
    @Column(name="nonvegburgerid")
  private int NonVegBurgerId;

    public int getNonVegBurgerId() {
        return NonVegBurgerId;
    }

    public void setNonVegBurgerId(int nonVegBurgerId) {
        NonVegBurgerId = nonVegBurgerId;
    }
}

