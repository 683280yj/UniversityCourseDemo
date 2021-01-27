package com.chinasoft.work.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Value("${school}")
    private String school;

    @RequestMapping("/test")
    public String test(){
        return school;
    }
    public String getschool(){
        return school;
    }
    public void setschool(String school){
        this.school = school;
    }
}