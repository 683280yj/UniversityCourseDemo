package com.chinasoft.exam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.chinasoft.exam.dao")
public class SsmTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmTestApplication.class,args);
    }
}
