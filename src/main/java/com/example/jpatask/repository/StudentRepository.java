package com.example.jpatask.repository;

import com.example.jpatask.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstName(String amin);

    List<Student> findByFirstNameAndLastName(String amin, String qurbanov);
    @Query ("SELECT s FROM Student s WHERE s.firstName = ?1 AND s.lastName = ?2 ")
    List<Student> findStudentWithJPQL(String firstName, String secondName);

    @Query(nativeQuery = true, value = "SELECT * FROM our_students s where s.first_Name = ?1 and s.last_Name = ?2 ")
    List<Student> findStudentWithNativeSQL(String firstName, String lastName);
}
