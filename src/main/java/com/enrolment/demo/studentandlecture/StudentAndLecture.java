package com.enrolment.demo.studentandlecture;

import com.enrolment.demo.lecture.entity.Lecture;
import com.enrolment.demo.student.entity.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class StudentAndLecture {

    @Id @GeneratedValue
    private long id;

    @ManyToOne
    private Student student;
    
    @ManyToOne
    @Min(value = 6)
    @Max(value = 15)
    private Lecture lecture;
}
