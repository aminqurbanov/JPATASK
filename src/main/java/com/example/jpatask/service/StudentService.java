package com.example.jpatask.service;

import com.example.jpatask.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    @PostConstruct
    public void listByQueryMethod(){
        studentRepository.findByFirstName("Amin")
                .stream()
                .forEach(System.out::println);
        studentRepository.findByFirstNameAndLastName("Amin","Qurbanov")
                .stream()
                .forEach(System.out::println);
    }
    @PostConstruct
    public void jpql() {
        studentRepository.findStudentWithJPQL("Amin", "Qurbanov")
                .stream()
                .forEach(System.out::println);
    }

    @PostConstruct
    public void sql() {
        studentRepository.findStudentWithNativeSQL("Elgun", "Bratdi")
                .stream()
                .forEach(System.out::println);

    }

}

