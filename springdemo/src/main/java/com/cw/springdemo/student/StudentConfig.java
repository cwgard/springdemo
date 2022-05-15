package com.cw.springdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student charlie = new Student(
                    1L,
                    "Charlie",
                    "charlie@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 1),
                    22
            );
            Student courtney = new Student(
                    "Courtney",
                    "courtney@email.com",
                    LocalDate.of(2000, FEBRUARY, 2),
                    22
            );

            repository.saveAll(
                    List.of(charlie, courtney)
            );
        };
    }
}
