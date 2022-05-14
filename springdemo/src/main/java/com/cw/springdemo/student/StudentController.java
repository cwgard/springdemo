package com.cw.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(1L, "Charlie", "cwgardner@gmail.com", LocalDate.of(1990, 2, 5), 32)
        );
    }
}
