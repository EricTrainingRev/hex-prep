package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.dao.PersonDao;
import com.example.exceptions.PersonNotFound;
import com.example.exceptions.NameTooLong;
import com.example.exceptions.PersonCreationFailed;
import com.example.model.Person;

public class PersonServiceImp implements PersonService {

    public PersonDao personDao;

    public PersonServiceImp(PersonDao personDao){
        this.personDao = personDao;
    }

    @Override
    public Person createPerson(Person person) {
        boolean correctNameLength = person.getName().length() <= 30;
        if (correctNameLength){
            Optional<Person> possiblePerson =  personDao.createPerson(person);
            if (possiblePerson.isPresent()){
                return possiblePerson.get();
            } else {
                throw new PersonCreationFailed("Failed to create Person, please try again");
            }
        } else {
            throw new NameTooLong("Name of " + person.getName() + " is too long");
        }

    }

    @Override
    public Person getPerson(int personIdentifier) {
        Optional<Person> possiblePerson = personDao.selectPerson(personIdentifier);
        if(possiblePerson.isPresent()){
            return possiblePerson.get();
        } else {
            throw new PersonNotFound("No one with ID of " + personIdentifier + " found");
        }
    }

    @Override
    public List<Person> getAllPersons() {
        return personDao.selectAllPeople();
    }
    
}
