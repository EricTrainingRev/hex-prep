package com.example.dao;

public class PersonNotFound extends RuntimeException{
    public PersonNotFound(String message){
        super(message);
    }
    
}
