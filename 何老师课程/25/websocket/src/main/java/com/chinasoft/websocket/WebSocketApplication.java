package com.chinasoft.websocket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@MapperScan("com.chinasoft.ssm.dao")
public class WebSocketApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebSocketApplication.class, args);
    }
}
