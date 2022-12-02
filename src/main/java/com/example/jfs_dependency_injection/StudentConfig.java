
package com.example.jfs_dependency_injection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    List<Student> students = new ArrayList<>();

    Student student1 = new Student(1L, "student 1", "student1@gmail.com", LocalDate.of(1998, Month.AUGUST, 25));

    Student student2 = new Student(1L, "student 2", "student2@gmail.com", LocalDate.of(1998, Month.JANUARY, 29));

    @Bean
    public void addStudents(){
        students.addAll(List.of(student1, student2));
    }
}
