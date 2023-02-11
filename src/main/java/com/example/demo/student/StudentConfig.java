package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maryam = new Student(
                    "Maryam",
                    "maryam@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY, 5)
            );

            Student amin = new Student(
                    "Amin",
                    "Amin@gmail.com",
                    LocalDate.of(1995, Month.FEBRUARY, 9)
            );

            repository.saveAll(
                    List.of(maryam,amin)
            );
        };
    }

}
