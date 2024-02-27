package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.model.Person;
import com.example.util.ConnectionUtility;

public class PersonDaoImp implements PersonDao {

    @Override
    public Optional<Person> createPerson(Person person) {
        try (Connection connection = ConnectionUtility.createConnection()) {
            String sql = "insert into testing.person values (default, ?, ?)";   
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                person.setPersonIdentifier(rs.getInt(1)); 
                return Optional.of(person);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public Optional<Person> selectPerson(int personId) {
        try (Connection connection = ConnectionUtility.createConnection()) {
            String sql = "select * from testing.person where person_id = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, personId);  
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                Person returnedPerson = new Person();
                returnedPerson.setPersonIdentifier(rs.getInt("person_id"));
                returnedPerson.setName(rs.getString("person_name"));
                returnedPerson.setAge(rs.getInt("person_age"));
                return Optional.of(returnedPerson);
            } else {
                return Optional.empty();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public List<Person> selectAllPeople() {
        try (Connection connection = ConnectionUtility.createConnection()) {
            String sql = "select * from testing.person";
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            List<Person> people = new ArrayList<>();
            while (rs.next()){
                Person person = new Person();
                person.setPersonIdentifier(rs.getInt("person_id"));
                person.setName(rs.getString("person_name"));
                person.setAge(rs.getInt("person_age"));
                people.add(person);

            }
            return people;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<Person>();
        }
        

    }
    
}
