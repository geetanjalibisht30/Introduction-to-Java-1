package com.TTN.jpql.joinedStrategy.entity;

import javax.persistence.*;

//3 tables will be created

@Entity
@Table(name="food")
@Inheritance(strategy = InheritanceType.JOINED)//strategy joined
//Each class has its table,
// and querying a subclass entity requires joining the tables.

public abstract class FoodType
{

    @Id
    private int id;

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
