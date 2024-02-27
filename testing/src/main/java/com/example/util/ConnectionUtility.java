package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    public static Connection createConnection(){
        try {
            return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/postgres", 
                "postgres", 
                "L0c@1"
                );
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }

    public static void main(String[] args) {
        System.out.println(createConnection());
    }
    
}
