package com.example.exceptions;

public class PersonCreationFailed extends RuntimeException {
    public PersonCreationFailed(String message){
        super(message);
    }
    
}
