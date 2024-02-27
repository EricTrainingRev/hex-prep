package com.example.service;

import com.example.dao.PersonDao;
import com.example.exceptions.NameTooLong;
import com.example.exceptions.PersonCreationFailed;
import com.example.model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

public class PersonServiceTest {
    public static Person negativePerson;

    public static Person neagativePersonCreationFailed;
    public static Person positivePersonInput;

    public static Person positivePersonOutput;

    public PersonDao personDao;

    public PersonService personService;

    @BeforeClass
    public static void testDataSetup(){
        negativePerson = new Person("This name is way too long, will not fit in person table", 0);
        neagativePersonCreationFailed = new Person("name is valid", 40);
        positivePersonInput = new Person("valid name", 30);
        positivePersonOutput = new Person("valid name", 30);
        positivePersonOutput.setPersonIdentifier(1);
    }

    @Before
    public void setup(){
        // when working with mock objects it is considered best practice to reset your mocks between tests
        // in order to avoid data pollution ruining your test results

        // By creating a mock of the personDao we can control how its methods respond during our tests
        // which allows us to specifically test the features of the Service methods without something
        // going wrong in the personDao implementation and ruining our Service tests
        personDao = Mockito.mock(PersonDao.class);
        personService = new PersonServiceImp(personDao);
    }

    @Test
    public void createPersonPositive(){
        // this tells the personDao to return our Output person when the Input person is provided to the
        // createPerson personDao method
        Mockito.when(personDao.createPerson(positivePersonInput)).thenReturn(Optional.of(positivePersonOutput));
        Person possiblePerson = personService.createPerson(positivePersonInput);
        Assert.assertEquals(positivePersonOutput, possiblePerson);
    }

    // in this test we want the NameTooLong exception to be thrown, so our test will fail if it is not
    @Test
    public void createPersonNegativeNameTooLong(){
        Assert.assertThrows(NameTooLong.class, ()-> personService.createPerson(negativePerson));
    }

    // alternative to using a lambda for testing for exceptions
    @Test
    public void createPersonNegativePersonCreationFailed(){
        Mockito.when(personDao.createPerson(neagativePersonCreationFailed)).thenReturn(Optional.empty());
        try{
            personService.createPerson(neagativePersonCreationFailed);
            Assert.fail();
        } catch(PersonCreationFailed e){
            Assert.assertEquals("Failed to create Person, please try again", e.getMessage());
        }
    }

}
