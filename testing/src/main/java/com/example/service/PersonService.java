package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.model.Person;

public interface PersonService {
    
    Person createPerson(Person person);

    Person getPerson(int personIdentifier);

    List<Person> getAllPersons();

}
