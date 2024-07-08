package com.practice.controller;

import org.springframework.boot.Banner;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class MyController {


    @RequestMapping(value ="/about",method = RequestMethod.GET)
public  String about(Model model){
    System.out.println("Inside about header");


    model.addAttribute("name","AMAN PATEL");
    model.addAttribute("currentDate",new Date().toLocaleString());

    return  "about";
}

@GetMapping("/condition")
public String conditionHandler(Model m){
    System.out.println("condition handler executed");
    m.addAttribute("isActive",true);
    m.addAttribute("gender","F");

    List<Integer> list=List.of(233,43,53,6456,64);
    m.addAttribute("mylist ",list);
    return  "condition";
}

//handlefr for including fregment
@GetMapping("/service")
    public String serviceshandler(Model m){
        return "service";
    }
    @GetMapping("/newabout")
    public  String newAbout(){
        return "aboutnew";
    }
}
