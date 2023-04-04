package com.enrolment.demo.studentandlecture;

import com.enrolment.demo.lecture.Lecture;
import com.enrolment.demo.student.entity.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentAndLecture {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private Student student;
    
    @ManyToOne
    private Lecture lecture;
}
