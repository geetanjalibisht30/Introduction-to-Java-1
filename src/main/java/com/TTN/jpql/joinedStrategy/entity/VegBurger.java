package com.TTN.jpql.joinedStrategy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


//vegburger table
@Entity
@Table(name="vegburger")
@PrimaryKeyJoinColumn(name="id")
public class VegBurger extends FoodType {

@Column(name="vegburgerid")
private int VegBurgerId;

    public int getVegBurgerId() {
        return VegBurgerId;
    }

    public void setVegBurgerId(int vegBurgerId) {
        VegBurgerId = vegBurgerId;
    }
}
