package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class first{

@RequestMapping("/")
    public  int sum(){
        int a=10;
        int b=20;
        return  a+b;
    }


    @RequestMapping("/name")
    @ResponseBody
    public ArrayList<String> name(){
        ArrayList<String> name=new ArrayList<>();
        name.add("AMAN");
        name.add("Patel");


        name.remove(1);

        System.out.println(name);
        return  name;


    }

}
