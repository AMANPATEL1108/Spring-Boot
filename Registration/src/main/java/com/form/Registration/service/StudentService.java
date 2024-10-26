package com.form.Registration.service;

import com.form.Registration.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

public Student create(Student student);

}
