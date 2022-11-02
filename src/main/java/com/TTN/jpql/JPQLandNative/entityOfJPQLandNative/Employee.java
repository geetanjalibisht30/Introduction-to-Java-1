package com.TTN.jpql.JPQLandNative.entityOfJPQLandNative;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")
//creating entity
//Create an Employee entity having following fields:
// id, firstName, lastName, salary, age which maps to the table columns
public class Employee {
    public Employee(){

    }

    public Employee(int id, String firstName, String lastName, int salary, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    //empId, empFirstName, empLastName, empSalary, empAge in table
    @Id
    @Column(name="empId")
    private int id;
    //Column annotation as column name is different from table column names
    //mapping to table columns
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empLastName")
    private String lastName;
    @Column(name="empSalary")
    private int salary;
    @Column(name="empAge")
    private int age;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
