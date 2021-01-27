package com.chinasoft.lesson1.config;

import com.chinasoft.lesson1.domain.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这个类是一个配置文件
public class jdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "person")
    public User getData(){
        User u=new User();
        return u;
    }

}
