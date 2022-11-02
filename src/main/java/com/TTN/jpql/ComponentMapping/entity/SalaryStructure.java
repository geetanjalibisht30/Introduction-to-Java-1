package com.TTN.jpql.ComponentMapping.entity;


import javax.persistence.Embeddable;

@Embeddable
//Embeddable annotation to declare that a class will be embedded by other entities.
public class SalaryStructure {

   // id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

   private int  basicSalary;
   private int bonusSalary;
   private int taxAmount;
   private int specialAllowanceSalary;

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    public int getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(int specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
