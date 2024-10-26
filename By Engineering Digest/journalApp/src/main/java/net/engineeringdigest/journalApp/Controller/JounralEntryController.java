package net.engineeringdigest.journalApp.Controller;


import net.engineeringdigest.journalApp.entity.JounralEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/jounral")
public class JounralEntryController {


    private Map<Long,JounralEntry> jounralEntries=new HashMap<>();


    @GetMapping
    public List<JounralEntry> getAll(){
        return new ArrayList<>(jounralEntries.values());
    }

    @PostMapping
    public  boolean createEntry(@RequestBody JounralEntry myEntry){
        jounralEntries.put(myEntry.getId(),myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JounralEntry  getJounralById(@PathVariable Long myId){
       return jounralEntries.get(myId);
    }
    @DeleteMapping("/id/{myId}")
    public JounralEntry  deleteJounralById(@PathVariable Long myId){
        return jounralEntries.remove(myId);
    }

    @PutMapping("id/{id}")
    public  JounralEntry updateJounralById(@PathVariable Long id,@RequestBody JounralEntry myEntry){
       return jounralEntries.put(id,myEntry);
    }

}
