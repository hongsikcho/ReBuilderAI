package com.enrolment.demo.student.service;

import com.enrolment.demo.student.repository.StudentRepository;
import com.enrolment.demo.student.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    public Student create(String username, String email, String password) {
        Student student = new Student();
        student.setName(username);
        student.setPassword(passwordEncoder.encode(password));
        this.studentRepository.save(student);
        return student;
    }
}
