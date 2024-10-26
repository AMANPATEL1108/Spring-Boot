package com.form.Registration.service.Impl;

import com.form.Registration.model.Student;
import com.form.Registration.repository.StudentRepository;
import com.form.Registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public Student create(Student student){
        return studentRepository.save(student);
    }
}
