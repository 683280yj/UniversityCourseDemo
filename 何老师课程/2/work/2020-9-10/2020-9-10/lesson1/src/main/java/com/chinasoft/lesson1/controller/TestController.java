package com.chinasoft.lesson1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    private static final Logger log= LoggerFactory.getLogger(TestController.class);

    @Value("${food}")
    private String food;

    @RequestMapping("/test")
    public String test(){
        log.info("food"+food);
        return food;
    }




    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
