package com.example.examples;

/*
 * Interfaces are like contracts: any class that implements the interface "Agrees" to make use of and/or
 * define the behaviors of the interface
 */
public interface HumanActions {

    // same as providing public static final int myValue = 10;
    // public: can be accessed anywhere
    // static: must be referenced via the class, not object
    // final: value can't be changed after it is defined
    int myValue = 10;

    // public abstract void move()
    void move();

    // interface methods can be given default implementations
    public default void sayHello(){
        System.out.println("hello!");
    }

    public static void staticMethod(){
        System.out.println("this must be referenced by the Interface");
    }
    
}
