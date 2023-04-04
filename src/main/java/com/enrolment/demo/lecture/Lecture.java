package com.enrolment.demo.lecture;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lecture {

    @Id
    @GeneratedValue
    @Column(name = "LECTURE_ID")
    private Long id;

    @Column(name = "LECTURE_NAME")
    private String name;
}
