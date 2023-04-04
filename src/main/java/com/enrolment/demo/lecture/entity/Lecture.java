package com.enrolment.demo.lecture.entity;

import com.enrolment.demo.professor.entity.Professor;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Lecture {

    @Id
    @GeneratedValue
    @Column(name = "LECTURE_ID")
    private Long id;

    @Column(name = "LECTURE_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "PROFESSOR_ID")
    private Professor professor;
}
