package com.jpa.test.dao;

import com.jpa.test.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Userrepository extends CrudRepository<User,Integer> {

 public List<User> findByName(String name);

 public List<User> findbyNameAndcity(String name,String city);

}
