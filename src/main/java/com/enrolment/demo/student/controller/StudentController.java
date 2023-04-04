package com.enrolment.demo.student.controller;

import com.enrolment.demo.JwtTokenProvider;
import com.enrolment.demo.student.entity.Student;
import com.enrolment.demo.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class StudentController {
    private final JwtTokenProvider jwtTokenProvider;
    private final StudentRepository studentRepository;


    @PostMapping("/student/login")
    public String login(@RequestBody Map<String, String> user) {
        Student member = studentRepository.findByName(user.get("name"))
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 아이디 입니다."));
        System.out.println("============"+member.getPassword());
        if (!(user.get("password").equals(member.getPassword()))) {
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        return jwtTokenProvider.createToken(member.getUsername(), member.getRoles());
    }

    @PostMapping("/apply")
    public Map userResponseTest() {
        Map<String, String> result = new HashMap<>();
        result.put("result","user ok");
        return result;
    }

}
