package com.example.dao;

import com.example.model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Optional;

public class PersonDaoTest {

    public static Person selectPerson;
    public static Person negativePerson;
    public PersonDao personDao;

    // this testDataSetup method will execute once before all tests are run
    @BeforeClass
    public static void testDataSetup(){
        // this Person data exists in my database specifically for my select test
        selectPerson = new Person("select person", 0);
        selectPerson.setPersonIdentifier(2);
        negativePerson = new Person("This name is way too long, will not fit in person table", 0);
        negativePerson.setPersonIdentifier(-1);
    }

    // this setup method will execute before each of our tests
    @Before
    public void setup(){
        personDao = new PersonDaoImp();
    }

    // positive test: given correct input, get expected correct output
    @Test
    public void selectPersonPositive(){
        Optional<Person> possiblePerson = personDao.selectPerson(selectPerson.getPersonIdentifier());
        Assert.assertEquals(selectPerson,possiblePerson.get());
    }

    // negative test: given incorrect input, get expected output for incorrect data
    @Test
    public void selectPersonNegative(){
        Optional<Person> shouldNotHaveAPerson = personDao.selectPerson(negativePerson.getPersonIdentifier());
        Assert.assertFalse(shouldNotHaveAPerson.isPresent());
    }

}
