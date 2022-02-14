package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer>{
}
