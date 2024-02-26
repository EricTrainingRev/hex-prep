package com.example;

import com.example.examples.Adult;
import com.example.examples.Child;
import com.example.examples.HumanActions;

public class Main {
    public static void main(String[] args) {
        Child mike = new Child();
        mike.name = "Mike";
        mike.setSocialSecurityNumber();

        Adult billy = new Adult();
        billy.name = "Billy";
        billy.setSocialSecurityNumber();

        System.out.println(mike);
        System.out.println(mike.getSocialSecurityNumber());
        mike.cry();
        mike.move();

        System.out.println(billy);
        System.out.println(billy.getSocialSecurityNumber());
        billy.comfortChild();
        billy.move();

        System.out.println(Adult.myValue);
        billy.sayHello();
        mike.sayHello();

        HumanActions.staticMethod();

        System.out.println(10/0);
    }
}