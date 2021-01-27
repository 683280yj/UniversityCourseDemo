package com.chinasoft.lesson1.controller;

import com.chinasoft.lesson1.config.jdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Test2Controller {
    @Autowired
    private jdbcConfig jdbc;

    @RequestMapping("/test2")
    public String test2(){
        return jdbc.getData().getUsername()+jdbc.getData().getAge();
    }
}
