package com.chinasoft.lesson1.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@ConfigurationProperties(prefix = "person")
public class Test1Controller {
    private String username;
    private int age;

    @RequestMapping("/test1")
    public String test1(){
        return "username:"+username+"<br>"+"age:"+age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
