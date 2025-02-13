package com.chinasoft.ssm.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
@Configuration
public class jdbcConfig {

    @Bean
    @ConfigurationProperties(prefix ="jdbc")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
