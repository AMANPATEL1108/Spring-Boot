package com.Springpro.Springpro.Controller;


import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetail(@RequestBody Student student){
        return studentService.saveDetail(student);
    }

}
