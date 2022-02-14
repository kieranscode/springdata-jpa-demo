package com.example.springdatajpa;

import com.example.springdatajpa.controller.JdbcController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class SpringDataJpaApplication {

	@Autowired
	private JdbcController jdbcController;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

//	@Override
//	public void run(String... args){
//
//		try {
//			jdbcController.addNewUser();
//		} catch (SQLException exception){
//			System.out.println(exception);
//		}
//
//	}

}
