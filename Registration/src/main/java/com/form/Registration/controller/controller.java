package com.form.Registration.controller;


import com.form.Registration.model.Student;
import com.form.Registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class controller {

    @Autowired
    StudentService studentService;

//    @GetMapping("login")
//    public String login(){
//        return  "login";
//    }
//
//    @GetMapping("register")
//    public String register(){
//        return  "register";
//    }
//
//    @GetMapping("login/home")
//    public String home(){
//        return  "home";
//    }

    @PostMapping("/store")
    public Student saveStudent(@RequestBody Student student){
    return  studentService.create(student);
    }
}
