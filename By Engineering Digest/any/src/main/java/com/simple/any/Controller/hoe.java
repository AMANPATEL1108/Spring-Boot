package com.simple.any.Controller;

import com.simple.any.entity.home;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/home")
public class hoe {

    private static Map<Long,home> newnoe=new HashMap<>();


    @GetMapping("/show")
    public List<home> getall(){
    return  new ArrayList<>(newnoe.values());
    }


    @PostMapping("/add")
    public home  add(@RequestBody home home){
        return newnoe.put(home.getId(),home);

    }


    @GetMapping("/id/{myId}")
    public home getperson(@PathVariable Long myId){
        return newnoe.get(myId);

    }


    @DeleteMapping("/id/{myId}")
    public  String delete(@PathVariable Long myId){
         newnoe.remove(myId);
        return "Deleted";

    }

    @PutMapping("/id/{id}")
    public home  update(@PathVariable Long id,@RequestBody home myEntry){
        return newnoe.put(id,myEntry);
    }


}
