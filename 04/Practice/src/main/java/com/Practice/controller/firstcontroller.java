package com.Practice.controller;

import com.Practice.entity.HomeEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/home")
@RestController
public class firstcontroller {

    public  static Map<Long, HomeEntity> homeentuty=new HashMap<>();


    @GetMapping("/getall")
    public List<HomeEntity> getall(){
        return new ArrayList<>(homeentuty.values());
    }

    @PostMapping("/add")
    public HomeEntity add(@RequestBody HomeEntity home){
        return homeentuty.put(home.getId(), home);
    }

    @GetMapping("/id/{myId}")
    public  HomeEntity show(@PathVariable Long myId){
        return homeentuty.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public  HomeEntity delete(@PathVariable Long myId){
        return homeentuty.remove(myId);
    }

    @PutMapping("/id/{myId}")
    public  HomeEntity update(@PathVariable Long myId,@RequestBody HomeEntity home){
        return homeentuty.put(myId, home);
    }



//    @GetMapping("/index")
//    public String index() {
//        return "index"; // This maps to src/main/resources/templates/index.html
//    }
//
//
//    @GetMapping("/home")
//public String home(){
//        return "home";
//    }
//
//    @GetMapping("/home/logout")
//    public String logout(){
//        return "logout";
//    }

}
