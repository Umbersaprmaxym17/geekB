package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneBookUser {




    protected String lastName;
    protected String phoneNumber;

    public PhoneBookUser(String lastName, String phoneNumber) {
        super();
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserPhoneAddressBook{" +
                "lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
