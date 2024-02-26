package com.example.examples;

public class Adult extends Person implements HumanActions{

    public void comfortChild(){
        System.out.println("It will be ok Mike.");
    }

    @Override
    public void move(){
        System.out.println("walk");
    }
    
}
