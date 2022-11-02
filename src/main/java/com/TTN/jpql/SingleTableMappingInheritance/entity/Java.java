package com.TTN.jpql.SingleTableMappingInheritance.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


//
@Entity
@DiscriminatorValue("j")
/*DiscrimntorValue
Discriminator is commonly used in SINGLE_TABLE
 inheritance because you need a column to identify the type of the record.
 */

public class Java  extends Project{


    private int javaid;



    public int getJavaid() {
        return javaid;
    }

    public void setJavaid(int javaid) {
        this.javaid = javaid;
    }
}
