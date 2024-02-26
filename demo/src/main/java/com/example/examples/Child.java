package com.example.examples;

import java.util.UUID;
/*
 * Object Oriented Programming:
 *     Abstraction: you don't need to know how it works in order to use it
 *     Polyymorphism: you can change the implementation of the same methods in various classes
 *     Inheritance: attributes and behaviors can be defined in one class and passed to others
 *     Encapsulation: you can control how attributes are accessed and changed in your code
 */

public class Child extends Person implements HumanActions{
    
    public void cry(){
        System.out.println("wwaaaaaaahhhhhh!!!!!!");
    }

    @Override
    public void move() {
        System.out.println("crawl");
    }

    @Override
    public void sayHello(){
        System.out.println("hewow!");
    }

}
