package com.enrolment.demo.student.controller;

import com.enrolment.demo.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class StudentController {

    private StudentService studentService;

    @RequestMapping("/student/login")
    public String showLoginPage(){
        return "login_form";
    }
}
