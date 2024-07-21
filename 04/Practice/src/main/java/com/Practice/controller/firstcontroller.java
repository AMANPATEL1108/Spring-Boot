package com.Practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class firstcontroller {

    @GetMapping("/index")
    public String index() {
        return "index"; // This maps to src/main/resources/templates/index.html
    }


    @GetMapping("/home")
public String home(){
        return "home";
    }

    @GetMapping("/home/logout")
    public String logout(){
        return "logout";
    }

}
