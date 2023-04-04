package com.enrolment.demo.professor.entity;

import com.enrolment.demo.lecture.entity.Lecture;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professor {

    @Id @GeneratedValue
    @Column(name = "PROFESSOR_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "professor")
    private List<Lecture> Lectures = new ArrayList();
}
