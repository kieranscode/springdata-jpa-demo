package com.example.springdatajpa.controller;

import com.example.springdatajpa.dao.JdbcDao;
import com.example.springdatajpa.dao.UserRepository;
import com.example.springdatajpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(path="/demo")
public class JdbcController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public User addNewUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping(path="/get")
    public Iterable<User> getAllUser(){
        return userRepository.findAll();
    }

}
