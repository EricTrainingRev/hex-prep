package com.example.exceptions;

public class CustomCheckedException extends Exception {
    public CustomCheckedException(String message){
        // super is how we pass our message to the parent constructor
        super(message);
    }
    
}
