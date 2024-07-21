package com.newpro.service;

import com.newpro.entity.User;
import com.newpro.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

 @Autowired
private UserRepository userRepository;

public User savedetail(User user){
return  userRepository.save(user);
}
}
