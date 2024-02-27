package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.model.Person;

public interface PersonDao {

    Optional<Person> createPerson(Person person);

    Optional<Person> selectPerson(int personId);

    List<Person> selectAllPeople();

}
