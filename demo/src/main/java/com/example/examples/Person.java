package com.example.examples;

import java.util.UUID;

public abstract class Person {
    public String name;
    private String socialSecurityNumber;

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber() {
        this.socialSecurityNumber = UUID.randomUUID().toString();
    }

    

    
}
