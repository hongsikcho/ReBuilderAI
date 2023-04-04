package com.enrolment.demo.student.service;

import com.enrolment.demo.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;
}