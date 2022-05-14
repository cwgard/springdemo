package com.cw.springdemo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Component
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Charlie",
                        "cwgardner@gmail.com",
                        LocalDate.of(1990, 2, 5),
                        32)
        );
    }
}
