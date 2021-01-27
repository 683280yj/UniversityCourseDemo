package com.chinasoft.lesson1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @Value("${food}")
    private String food;

    @RequestMapping("/test")
    public String test(){
        return food;
    }
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food = food;
    }
}
