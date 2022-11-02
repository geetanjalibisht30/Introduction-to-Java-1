package com.TTN.jpql.ComponentMapping.entity;

import javax.persistence.*;


//Implement and demonstrate Embedded mapping using employee table having
// following fields: id, firstName,
// lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.
//creating entity named EmployeeCM
@Entity
@Table(name = "employeecm") //as table name is different
public class EmployeeCM {

    @Id//primary key
    private int id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    private int age;

    //component mapping
    @Embedded
   // @Embedded is used to embed a type into another entity. that in salarystructure
    //embedding
    //normalization type
    private SalaryStructure salaryStructure;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SalaryStructure getSalaryStructure() {
        return salaryStructure;
    }

    public void setSalaryStructure(SalaryStructure salaryStructure) {
        this.salaryStructure = salaryStructure;
    }
}
