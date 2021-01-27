package com.chinasoft.lesson1.controller;

import com.chinasoft.lesson1.config.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test2Controller {
    @Autowired
    private JdbcConfig jdbc;
    @RequestMapping("/test2")
    public String test3(){
        return jdbc.getData().getUsername()+"<br>"+jdbc.getData().getAge();
    }
}
