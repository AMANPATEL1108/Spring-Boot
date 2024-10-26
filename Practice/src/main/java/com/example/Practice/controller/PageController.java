package com.example.Practice.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {


    @PostMapping("/index")
    public ModelAndView home(@RequestParam("value1") String value1,
                             @RequestParam("value2") String value2,
                             @RequestParam("value3") String value3, Model model){



        //1----Using Model
 //        System.out.println("Received value: " + value1);
//        model.addAttribute("value1", value1);
//        model.addAttribute("value2", value2);
//        model.addAttribute("value3", value3);
//        return "index";

        //2------------Using ModelAnd View
//        Map<String,String> map=new HashMap<String,String>();
//        map.put("value1",value1);
//        map.put("value2",value1);
//        map.put("value3",value1);
//        return new ModelAndView("index",map);


        //3----------Using ModeAnd View Creating object
        ModelAndView mv=new ModelAndView();
        mv.addObject("value1",value1);
        mv.addObject("value2",value2);
        mv.addObject("value3",value3);


        return  mv;
   }

    @RequestMapping("/home")
    public String index(){
        return "home";
    }




}
