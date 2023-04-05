package com.enrolment.demo.student.repository;

import com.enrolment.demo.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findById(Long Id);

    Optional<Student> findByEmail(String name);

}
