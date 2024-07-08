package com.practice.controller;

import ch.qos.logback.core.model.Model;
import com.practice.entities.LoginData;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model){

        System.out.println("Opening Form");
//        model.addAttribute("loginData",new LoginData());
        return "form";
    }

    //handler for pprocess form
    @PostMapping("/process")
    public  String processForm(@valid @ModelAttribute("loginData") LoginData loginData, BindingResult result){
       if (result.hasErrors()){
           System.out.println(result);
           return "form";
       }

        System.out.println(loginData);
        return "success";
    }
}
