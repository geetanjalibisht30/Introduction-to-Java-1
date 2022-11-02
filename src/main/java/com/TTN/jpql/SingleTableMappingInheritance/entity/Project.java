package com.TTN.jpql.SingleTableMappingInheritance.entity;

import javax.persistence.*;

@Entity
@Table(name="project")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="mode",discriminatorType = DiscriminatorType.STRING)

/*
The entities from
different classes with a common ancestor are placed in a single table.
3 table will be created
Project ,DEvops,java

 */
public abstract class Project {
    @Id
    private int id;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    }



