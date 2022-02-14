package com.example.springdatajpa.dao;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class JdbcDao {

    public void testConnect() throws SQLException{

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/repo_demo",
                                "root", "liuguixin111")) {

            boolean isValid = conn.isValid(0);
            System.out.println("Do we have a valid db connection? = " + isValid);

            PreparedStatement statement = conn.prepareStatement("insert into users (firstName, lastName) values " +
                    "(?, ?)");
            statement.setString(1, "John");
            statement.setString(2, "Rambo");

            int insertedRows = statement.executeUpdate();

            System.out.println("I just inserted " + insertedRows + " users");
        }

    }




}
