package com.TTN.jpql.tableperclass.entity;


import javax.persistence.*;

@Entity
@Table(name="product")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//Tableperclass
/*
In table-per-class strategy, for each sub entity class a separate table
 is generated. Unlike joined strategy, no separate table is generated for parent
 */

public abstract class Product {

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
