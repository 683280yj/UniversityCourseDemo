package com.chinasoft.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
@SpringBootApplication
@MapperScan("com.chinasoft.service.mapper")
public class ChinaServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChinaServiceProviderApplication.class, args);
    }
}
