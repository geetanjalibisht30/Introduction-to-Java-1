package com.TTN.jpql.SingleTableMappingInheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("d")
/*
Discriminator is commonly used in SINGLE_TABLE
inheritance because you need a column to identify the type of the record.
 */
public class DevOps  extends  Project{


    private int devopsid;

    public int getDevopsid() {
        return devopsid;
    }

    public void setDevopsid(int devopsid) {
        this.devopsid = devopsid;
    }
}
