package com.enrolment.demo.user;

import lombok.Getter;

@Getter
public enum UserRole {
    STUDENT("STUDENT");
    private String value;
    UserRole(String value){
        this.value = value;
    }
}
