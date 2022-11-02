package com.TTN.relationship.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable//@Embeddable annotation to declare that a class will be embedded by other entities.
public class Address {



    private int streetNumber;
    private String location;
    private String State;


    public int getStreetNumber()
    {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber)
    {
        this.streetNumber = streetNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
