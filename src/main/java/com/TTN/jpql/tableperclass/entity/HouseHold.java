package com.TTN.jpql.tableperclass.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//household table in database

@Entity
@Table(name="household")
public class HouseHold extends Product{
    @Id
    private int id;
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
