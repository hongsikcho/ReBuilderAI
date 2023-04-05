package com.enrolment.demo.student.controller;

import com.enrolment.demo.JwtTokenProvider;
import com.enrolment.demo.student.entity.Student;
import com.enrolment.demo.student.entity.StudentDto;
import com.enrolment.demo.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class StudentLoginController {
    private final JwtTokenProvider jwtTokenProvider;
    private final StudentRepository studentRepository;

    @PostMapping("/student/login")
    public String login(StudentDto studentDto) {
        Student member = studentRepository.findByEmail(studentDto.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 email 입니다."));
        if (!(studentDto.getPassword().equals(member.getPassword()))) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        String token = jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }


    @PostMapping("/apply")
    public Map userResponseTest() {
        Map<String, String> result = new HashMap<>();
        result.put("result","user ok");
        return result;
    }
}
