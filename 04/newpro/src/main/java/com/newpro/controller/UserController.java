package com.newpro.controller;

import com.newpro.entity.User;
import com.newpro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/postdata")
    public User sendDetail(@RequestBody User user){
        return  userService.savedetail(user);
    }


}
