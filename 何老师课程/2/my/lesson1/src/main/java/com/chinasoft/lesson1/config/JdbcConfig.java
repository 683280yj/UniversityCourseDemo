package com.chinasoft.lesson1.config;

import com.chinasoft.lesson1.demain.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//配置文件类
@Configuration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "person")
    public User getData(){
        User u=new User();
        return u;
    }
}
