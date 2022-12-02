package com.example.jfs_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentConfig studentConfig;

    public List<Student> getStudents(){
        return studentConfig.students;
    }
}