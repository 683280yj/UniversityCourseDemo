package com.chinasoft.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chinasoft.web.dao")
public class ShopTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopTestApplication.class,args);
    }
}
