package com.enrolment.demo.professor.entity;

import com.enrolment.demo.lecture.entity.Lecture;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professor {

    @Id @GeneratedValue
    @Column(name = "PROFESSOR_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "professor")
    @NotNull
    @Min(value = 1)
    @Max(value = 2)
    private List<Lecture> Lectures = new ArrayList();
}
