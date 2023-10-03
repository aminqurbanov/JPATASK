package com.example.jpatask;

import com.example.jpatask.domain.Student;
import com.example.jpatask.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class JpaTaskApplication implements CommandLineRunner {
    private final StudentRepository studentRepository;


    public static void main(String[] args) {
        SpringApplication.run(JpaTaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

    //@Override
    //public void run(String... args) throws Exception {
       // Student student = Student.builder()
               // .age(20)
                //.firstName("Amin")
                //.lastName("Qurbanov")
                //.studentNumber("AA1234567")
              //  .build();
        //studentRepository.save(student);
    }

