package com.TTN.Assignment10.Que2_Que10;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class Employee {
    private int id;

    @Size(min=3)
    private String name ;

    @Min(25)
    private int age ;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
