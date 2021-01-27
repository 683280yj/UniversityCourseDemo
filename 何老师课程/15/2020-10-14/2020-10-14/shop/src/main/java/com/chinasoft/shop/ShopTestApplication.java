package com.chinasoft.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.chinasoft.shop.dao") //扫描的mapper
public class ShopTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopTestApplication.class,args);
    }
}
