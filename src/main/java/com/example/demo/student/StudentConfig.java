package com.example.demo.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Maria = new Student(
                    "Maria", 24,
                    LocalDate.of(2000, Month.APRIL, 5),
                    "maria@gmail.com");
            Student Ana = new Student(
                    "Ana", 22,
                    LocalDate.of(2002, Month.JANUARY, 12),
                    "ana@gmail.com");
            repository.saveAll(List.of(Maria, Ana));
        };
    }
}
