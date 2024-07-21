package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

@Controller
public class IndexController {

    @RequestMapping(path = "/index", method=RequestMethod.GET)
    public  String indexpage(Model model){
        model.addAttribute("paramString", "Hello java String ");
        model.addAttribute("paramInt", 123456);
        model.addAttribute("paramBoolean", true);
        return "index";
    }

    @RequestMapping(path = "/home", method=RequestMethod.GET)
    public  String homeController(Model model){

        return "home";
    }
}
