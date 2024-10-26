package com.example.demo.controller;

import com.example.demo.entity.personentity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/main")
@RestController
public class first{

    public static  Map<Long, personentity> obj1=new HashMap<>();


    @RequestMapping("/showall")
    public List<personentity> getAll(){
        return new ArrayList<>(obj1.values());
    }

    @PostMapping("/add")
    public personentity add(@RequestBody personentity abc){
        return obj1.put(abc.getId(),abc);
    }

    @GetMapping("/id/{myId}")
    public personentity getPerson(@PathVariable Long myId){
        return obj1.get(myId);
    }

    @DeleteMapping("deleted/{myId}")
    public personentity delete(@PathVariable Long myId){
        return obj1.remove(myId);
    }

    @PutMapping("/update/{myId}")
    public personentity update(@PathVariable Long myId,@RequestBody personentity abc){
        return obj1.put(myId, abc);
    }


//@RequestMapping("/")
//    public  int sum(){
//        int a=10;
//        int b=20;
//        return  a+b;
//    }


//    @RequestMapping("/name")
//    @ResponseBody
//    public ArrayList<String> name(){
//        ArrayList<String> name=new ArrayList<>();
//        name.add("AMAN");
//        name.add("Patel");
//
//
//        name.remove(1);
//
//        System.out.println(name);
//        return  name;
//
//
//    }

}
